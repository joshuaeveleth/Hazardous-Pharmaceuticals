/**
 * Source file created in 2008 by Southwest Research Institute
 */


package gov.va.med.pharmacy.peps.service.common.search.test.integration;


import java.util.ArrayList;
import java.util.List;

import gov.va.med.pharmacy.peps.common.vo.EntityType;
import gov.va.med.pharmacy.peps.common.vo.FieldKey;
import gov.va.med.pharmacy.peps.common.vo.ManagedItemVo;
import gov.va.med.pharmacy.peps.common.vo.OrderableItemVo;
import gov.va.med.pharmacy.peps.common.vo.RequestItemStatus;
import gov.va.med.pharmacy.peps.common.vo.SearchCriteriaVo;
import gov.va.med.pharmacy.peps.common.vo.SearchDomain;
import gov.va.med.pharmacy.peps.common.vo.SearchTermVo;
import gov.va.med.pharmacy.peps.common.vo.SearchType;


/**
 * Tests the search orderable item by name
 */
public class OrderableItemNameSearchTest extends OrderableItemSearchTestCase {

    private static final String OI_FP = "oi_name.firstPart";
    
    /**
     * Constructor
     * 
     * @param name String
     */
    public OrderableItemNameSearchTest(String name) {
        super(name);
    }

    /**
     * Sets up test fixtures for the OrderableItemNameSearchTest.
     *
     * 
     * @see gov.va.med.pharmacy.peps.service.common.search.test.integration.ProductSearchTestCase#setUp()
     */
    public void setUp() {
        super.setUp();
        
        getSearchCriteria().setSearchDomain(SearchDomain.ADVANCED);

    }

    /**
     * Tests the begins with functionality
     * 
     * @throws Exception Exception
     * 
     * @see gov.va.med.pharmacy.peps.service.common.search.test.integration.ManagedItemSearchTestCase#testBeginsWith()
     */
    public void testBeginsWith() throws Exception {

        String testValue = getTermFixture().getString(OI_FP);
        SearchCriteriaVo testVo = getSearchCriteria();
       
        
        List<SearchTermVo> terms = new ArrayList<SearchTermVo>();
        terms.add(new SearchTermVo(EntityType.ORDERABLE_ITEM, FieldKey.OI_NAME, testValue, SearchType.BEGINS_WITH));
        testVo.setSearchTerms(terms);
        
        List<RequestItemStatus> status = new ArrayList<RequestItemStatus>();
        status.add(RequestItemStatus.PENDING);
        testVo.setRequestStatus(status);
        
        List<ManagedItemVo> results = getManagedItemService().search(testVo);
       
        if (results.size() == 0) {
            fail("No results found.");
        }

        for (ManagedItemVo orderableItemVo : results) {

            assertTrue("should be true.", ((OrderableItemVo) orderableItemVo).getOiName().startsWith(
                getTermFixture().getString(OI_FP)));
        }

    }

    /**
     * Tests the contains search for the OrderableItemNameSearchTest.
     * 
     * @throws Exception Exception
     * 
     * @see gov.va.med.pharmacy.peps.service.common.search.test.integration.ManagedItemSearchTestCase#testContains()
     */
    public void testContains() throws Exception {
        String mid = "oi_name.middlePart";
        String testValue = getTermFixture().getString(mid);
       
        SearchCriteriaVo testVo = getSearchCriteria();  
        List<SearchTermVo> terms = new ArrayList<SearchTermVo>();
        terms.add(new SearchTermVo(EntityType.ORDERABLE_ITEM, FieldKey.OI_NAME, testValue, SearchType.CONTAINS));
        testVo.setSearchTerms(terms);
        
        List<ManagedItemVo> results = getManagedItemService().search(testVo);

        if (results.size() == 0) {
            fail("No results found!");
        }

        for (ManagedItemVo orderableItemVo : results) {

            assertTrue("should be true!", ((OrderableItemVo) orderableItemVo).getOiName().contains(
                getTermFixture().getString(mid)));
        }

    }

   
    /**
     * Tests the is Exactly search
     * 
     * @throws Exception Exception
     * 
     * @see gov.va.med.pharmacy.peps.service.common.test.integration.search.ManagedItemSearchTestCase#testIsExactly()
     */
    public void testIsExactly() throws Exception {

        String oiName = "oi_name";
        String testValue = getTermFixture().getString(oiName);
        SearchCriteriaVo testVo = getSearchCriteria();
        List<SearchTermVo> terms = new ArrayList<SearchTermVo>();
        terms.add(new SearchTermVo(EntityType.ORDERABLE_ITEM, FieldKey.OI_NAME, testValue, SearchType.EQUALS));
        testVo.setSearchTerms(terms);
        
        List<ManagedItemVo> results = getManagedItemService().search(testVo);
     
        if (results.size() == 0) {
            fail("No results found");
        }

        for (ManagedItemVo orderableItemVo : results) {

            assertTrue("should be true", ((OrderableItemVo) orderableItemVo).getOiName().equals(
                getTermFixture().getString(oiName)));
        }
    }

}
