/**
 * Source file created in 2006 by Southwest Research Institute
 */


package gov.va.med.pharmacy.peps.domain.common.dao;


import gov.va.med.pharmacy.peps.domain.common.model.EplCmopIdGeneratorDo;


/**
 * This class provides a set of operation that may be performed on all the classes that inherit from this class. This
 * interface should never be used directly, but it will be inherited by all DAOs. It provides abstract methods to access and
 * modify the EplIntendedUseDao.
 * 
 */
public interface EplCmopIdGeneratorDao extends DataAccessObject<EplCmopIdGeneratorDo, String> {

}
