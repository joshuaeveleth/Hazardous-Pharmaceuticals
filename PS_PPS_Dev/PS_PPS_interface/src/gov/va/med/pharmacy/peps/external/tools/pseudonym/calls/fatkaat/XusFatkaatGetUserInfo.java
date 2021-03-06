/**
 * Source file created in 2006 by Southwest Research Institute
 */


package gov.va.med.pharmacy.peps.external.tools.pseudonym.calls.fatkaat;


import gov.va.med.pharmacy.peps.external.tools.pseudonym.PseudonymException;
import gov.va.med.pharmacy.peps.external.tools.pseudonym.calls.AbstractCall;
import gov.va.med.pharmacy.peps.external.tools.pseudonym.calls.fatkaat.usermanagement.User;
import gov.va.med.pharmacy.peps.external.tools.pseudonym.calls.fatkaat.usermanagement.UserLogon;
import gov.va.med.pharmacy.peps.external.tools.pseudonym.vistalink.Request;
import gov.va.med.pharmacy.peps.external.tools.pseudonym.vistalink.Response;


/**
 * Loaded by pseodonyM server if needed to generate response.  Generates a response object using a Velocity Template File. 
 * Specifically this class is called during the authentication process. 
 */
public class XusFatkaatGetUserInfo extends AbstractCall {

    /**
     * default no-arg constructor
     */
    public XusFatkaatGetUserInfo() {
        super();
    }

    /**
     * This method generates a Response object and set's the attribute values of the Response object. 
     * In addition, a template file is used to simplify maintainability. 
     * 
     * @param call client request
     * @return Response object 
     * @throws PseudonymException If an exception occurred while attempting to get the response string for this call
     * 
     * @see gov.va.med.pharmacy.external.pseudonym.calls.Call
     * #getResponse(gov.va.med.pharmacy.external.pseudonym.vistalink.Request)
     */
    public Response getResponse(Request call) throws PseudonymException {
        if (UserLogon.instance().isAuthenticatedUserSet()) {
            User currentUser = UserLogon.instance().getAuthenticatedUser();

            return new Response(call, processTemplate(this, "-" + currentUser.getUserName()));
        } else {
            return new Response(call, processTemplate(this, INVALID));
        }

    }

}
