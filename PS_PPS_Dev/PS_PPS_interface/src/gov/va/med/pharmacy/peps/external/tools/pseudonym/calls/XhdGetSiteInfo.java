/**
 * Source file created in 2006 by Southwest Research Institute
 */


package gov.va.med.pharmacy.peps.external.tools.pseudonym.calls;


import gov.va.med.pharmacy.peps.external.tools.pseudonym.PseudonymException;
import gov.va.med.pharmacy.peps.external.tools.pseudonym.vistalink.Request;
import gov.va.med.pharmacy.peps.external.tools.pseudonym.vistalink.Response;


/**
 * XhdGetSiteInfo
 */
public class XhdGetSiteInfo extends AbstractCall {

    /**
     * default no-arg constructor
     */
    public XhdGetSiteInfo() {
        super();
    }

    /**
     * gets the response for the XhdGetSiteInfo call.
     * @param call the request
     * @return the response
     * @throws PseudonymException PseudonymException
     * 
     * @see gov.va.med.pharmacy.external.pseudonym.calls.Call#getResponse(
     *      gov.va.med.pharmacy.external.pseudonym.vistalink.Request)
     */
    public Response getResponse(Request call) throws PseudonymException {
        return new Response(call, processTemplate(this), "gov.va.med.foundations.rpc.response", "rpcResponse.xsd");
    }
}
