/**
 * Source file created in 2008 by Southwest Research Institute
 */


package gov.va.med.pharmacy.peps.external.common.preencapsulation.utility.update.ndf.test;


import java.math.BigInteger;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Map;

import org.apache.log4j.Logger;

import gov.va.med.pharmacy.peps.common.utility.PPSConstants;
import gov.va.med.pharmacy.peps.common.utility.test.generator.GenericNameGenerator;
import gov.va.med.pharmacy.peps.common.vo.FieldKey;
import gov.va.med.pharmacy.peps.common.vo.GenericNameVo;
import gov.va.med.pharmacy.peps.common.vo.diff.Difference;
import gov.va.med.pharmacy.peps.external.common.preencapsulation.outbound.document.NdfDomainDocument;
import gov.va.med.pharmacy.peps.external.common.preencapsulation.utility.update.domain.NdfDomainConverter;
import gov.va.med.pharmacy.peps.external.common.vo.DomainItem;
import gov.va.med.pharmacy.peps.external.common.vo.outbound.common.ItemAction;
import gov.va.med.pharmacy.peps.external.common.vo.outbound.domain.ndf.NdfDomain;

import junit.framework.TestCase;


/**
 * Tests corresponding converter.
 */
public class VaGenericFileConverterTest extends TestCase {

    private static final Logger LOG = org.apache.log4j.Logger.getLogger(VaGenericFileConverterTest.class);
    private Map<FieldKey, Difference> differences;
    private GenericNameVo genericNameVo;

    /**
     * Sets up tests.
     * 
     * @throws Exception exception
     * 
     * @see junit.framework.TestCase#setUp()
     */
    protected void setUp() throws Exception {
        differences = new HashMap<FieldKey, Difference>();
        genericNameVo = new GenericNameGenerator().getRandom();
    }

    /**
     * Tests add functionality.
     */
    public void testAdd() {

        NdfDomain ndfDomain = NdfDomainConverter.toNdfDomain(new DomainItem[] {new DomainItem(genericNameVo, ItemAction.ADD,
            differences)});

        ndfDomain.setPepsIdNumber(BigInteger.valueOf(PPSConstants.I123456789));

        LOG.debug(NdfDomainDocument.instance().marshal(ndfDomain));

        assertEquals("GENERIC NAME incorrect.", genericNameVo.getValue(), NdfDomainDocument.instance().unmarshal(
            NdfDomainDocument.instance().marshal(ndfDomain)).getVaGenericFile().get(0).getName().getValue());

    }

    /**
     * Tests modify functionality.
     */
    public void testModify() {

        String newName = "New GENERIC NAME";

        differences.put(FieldKey.GENERIC_NAME, new Difference(FieldKey.NAME, genericNameVo.getValue(), newName));
        genericNameVo.setValue(newName);

        NdfDomain ndfDomain = NdfDomainConverter.toNdfDomain(new DomainItem[] {new DomainItem(genericNameVo,
            ItemAction.MODIFY, differences)});

        ndfDomain.setPepsIdNumber(BigInteger.valueOf(PPSConstants.I123456789));

        LOG.debug(NdfDomainDocument.instance().marshal(ndfDomain));

        assertEquals("NAME incorrect.", genericNameVo.getValue(), NdfDomainDocument.instance().unmarshal(
            NdfDomainDocument.instance().marshal(ndfDomain)).getVaGenericFile().get(0).getName().getValue());

    }

    /**
     * Tests inactivate functionality.
     */
    public void testInactivate() {

        Calendar calendar = Calendar.getInstance();
        calendar.set(PPSConstants.I2008, Calendar.JANUARY, 1);

        genericNameVo.setInactivationDate(calendar.getTime());
        differences.put(FieldKey.INACTIVATION_DATE, new Difference(FieldKey.INACTIVATION_DATE, null, calendar.getTime()));

        NdfDomain ndfDomain = NdfDomainConverter.toNdfDomain(new DomainItem[] {new DomainItem(genericNameVo,
            ItemAction.INACTIVATE, differences)});

        ndfDomain.setPepsIdNumber(BigInteger.valueOf(PPSConstants.I123456789));

        LOG.debug(NdfDomainDocument.instance().marshal(ndfDomain));

        assertEquals("INACTIVATION DATE incorrect.", "01-01-2008", NdfDomainDocument.instance().unmarshal(
            NdfDomainDocument.instance().marshal(ndfDomain)).getVaGenericFile().get(0).getInactivationDate().getValue()
            .getValue());

    }
}
