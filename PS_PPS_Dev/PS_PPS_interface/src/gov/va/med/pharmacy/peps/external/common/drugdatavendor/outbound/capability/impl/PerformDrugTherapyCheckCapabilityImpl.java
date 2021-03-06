/**
 * Source file created in 2006 by Southwest Research Institute
 */


package gov.va.med.pharmacy.peps.external.common.drugdatavendor.outbound.capability.impl;


import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Map;

import gov.va.med.pharmacy.peps.common.exception.InterfaceException;
import gov.va.med.pharmacy.peps.external.common.drugdatavendor.outbound.capability.PerformDrugTherapyCheckCapability;
import gov.va.med.pharmacy.peps.external.common.drugdatavendor.outbound.utility.MessageConversionUtility;
import gov.va.med.pharmacy.peps.external.common.drugdatavendor.outbound.utility.StringUtility;
import gov.va.med.pharmacy.peps.external.common.vo.ordercheck.DrugCheckMessageVo;
import gov.va.med.pharmacy.peps.external.common.vo.ordercheck.DrugCheckResultsVo;
import gov.va.med.pharmacy.peps.external.common.vo.ordercheck.DrugCheckVo;
import gov.va.med.pharmacy.peps.external.common.vo.ordercheck.DrugTherapyCheckResultVo;

import firstdatabank.database.FDBSQLException;
import firstdatabank.dif.DTScreenResult;
import firstdatabank.dif.DTScreenResults;
import firstdatabank.dif.FDBAllowanceSource;
import firstdatabank.dif.FDBDuplicateAllowance;
import firstdatabank.dif.ScreenDrugs;
import firstdatabank.dif.Screening;


/**
 * Perform duplicate therapy check
 */
public class PerformDrugTherapyCheckCapabilityImpl implements PerformDrugTherapyCheckCapability {
    private Screening screening;

    /**
     * Empty constructor
     */
    public PerformDrugTherapyCheckCapabilityImpl() {
        super();
    }

    /**
     * Perform duplicate therapy check in the PerformDrugTherapyCheckCapabilityImpl.
     * 
     * @param screenDrugs FDB ScreenDrugs used as input to therapy check call
     * @param drugMap Map of the combined String of IEN and order number to DrugCheckVo. The combined String of IEN and order
     *            number is stored in the FDB ScreenDrug's custom ID attribute.
     * @param prospectiveOnly boolean true if check should only be done on prospective drugs
     * @param duplicateAllowance boolean true if check should allow for duplicates
     * @param customTables boolean true if customized tables to be used in the check
     * @return DrugCheckResultsVo response from FDB with Collection of DrugTherapyCheckResultVo
     */
    public DrugCheckResultsVo<DrugTherapyCheckResultVo> performDrugTherapyCheck(ScreenDrugs screenDrugs,
                                                                                Map<String, DrugCheckVo> drugMap,
                                                                                boolean prospectiveOnly,
                                                                                boolean duplicateAllowance,
                                                                                boolean customTables) {
        FDBDuplicateAllowance dupAllow = FDBDuplicateAllowance.fdbDADoNotUse;
        String category = "";

        if (duplicateAllowance) {
            dupAllow = FDBDuplicateAllowance.fdbDAFDBOnly;

            if (customTables) {
                dupAllow = FDBDuplicateAllowance.fdbDACustomWithFDBDefault;
            }
        }

        if (customTables) {
            category = DrugCheckVo.VA_CUSTOM_CATEGORY;
        }

        try {
            DTScreenResults fdbResults = screening.DTScreen(screenDrugs, prospectiveOnly, dupAllow, customTables, category);

            return convertResults(fdbResults, screenDrugs, drugMap);
        } catch (IOException e) {
            throw new InterfaceException(e, InterfaceException.INTERFACE_ERROR, InterfaceException.DRUG_DATA_VENDOR);
        } catch (FDBSQLException e) {
            throw new InterfaceException(e, InterfaceException.INTERFACE_ERROR, InterfaceException.DRUG_DATA_VENDOR);
        }

    }

    /**
     * Convert from the results received into Collection of value objects
     * 
     * @param screenResults results from FDB
     * @param screenDrugs FDB ScreenDrugs used as input to dose check call
     * @param drugMap Map of the combined String of IEN and order number to DrugCheckVo. The combined String of IEN and order
     *            number is stored in the FDB ScreenDrug's custom ID attribute.
     * @return DrugCheckResultsVO results converted from Drug Data Vendor containing DrugTherapyCheckResultVO for checks
     * @throws IOException if error reading properties file
     */
    private DrugCheckResultsVo<DrugTherapyCheckResultVo> convertResults(DTScreenResults screenResults,
                                                                        ScreenDrugs screenDrugs,
                                                                        Map<String, DrugCheckVo> drugMap) throws IOException {

        DrugCheckResultsVo<DrugTherapyCheckResultVo> vo = new DrugCheckResultsVo<DrugTherapyCheckResultVo>();

        Collection<DrugCheckMessageVo> messages = MessageConversionUtility.toDrugCheckMessages(screenResults
            .getMessages(), drugMap, screenDrugs);
        vo.setMessages(messages);
        vo.setChecks(new ArrayList<DrugTherapyCheckResultVo>());

        for (int i = 0; i < screenResults.count(); i++) {
            DTScreenResult result = screenResults.item(i);

            DrugTherapyCheckResultVo check = new DrugTherapyCheckResultVo();

            check.setDuplicateClass(StringUtility.nullToEmptyString(result.getClassDescription()));

            if (FDBAllowanceSource.fdbASCustom.equals(result.getAllowanceSource())) {
                check.setAllowance(result.getCustomAllowance());
            } else {
                check.setAllowance(result.getAllowance());
            }

            check.setDrugs(new ArrayList<DrugCheckVo>());

            for (int j = 0; j < result.getDrugItems().count(); j++) {
                DrugCheckVo drug = drugMap.get(screenDrugs.get(result.getDrugItems().item(j).getDrugIndex()).getCustomID());
                check.getDrugs().add(drug);
            }

            check.setShortText(StringUtility.nullToEmptyString(result.getScreenMessage()));

            vo.getChecks().add(check);
        }

        return vo;
    }

    /**
     * setScreening
     * @param screening screening property
     */
    public void setScreening(Screening screening) {
        this.screening = screening;
    }
}
