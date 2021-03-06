
package com.competitionservice._135045.competition;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.10-b140803.1500
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "CompetitionService", targetNamespace = "http://www.competitionservice.com/135045/competition", wsdlLocation = "file:/Users/taaniel/Dropbox/5.semester/Veebiteenused/CompetitionWebService/src/conf/xml-resources/web-services/CompetitionWebService/wsdl/CompetitionService.wsdl")
public class CompetitionService
    extends Service
{

    private final static URL COMPETITIONSERVICE_WSDL_LOCATION;
    private final static WebServiceException COMPETITIONSERVICE_EXCEPTION;
    private final static QName COMPETITIONSERVICE_QNAME = new QName("http://www.competitionservice.com/135045/competition", "CompetitionService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("file:/Users/taaniel/Dropbox/5.semester/Veebiteenused/CompetitionWebService/src/conf/xml-resources/web-services/CompetitionWebService/wsdl/CompetitionService.wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        COMPETITIONSERVICE_WSDL_LOCATION = url;
        COMPETITIONSERVICE_EXCEPTION = e;
    }

    public CompetitionService() {
        super(__getWsdlLocation(), COMPETITIONSERVICE_QNAME);
    }

    public CompetitionService(WebServiceFeature... features) {
        super(__getWsdlLocation(), COMPETITIONSERVICE_QNAME, features);
    }

    public CompetitionService(URL wsdlLocation) {
        super(wsdlLocation, COMPETITIONSERVICE_QNAME);
    }

    public CompetitionService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, COMPETITIONSERVICE_QNAME, features);
    }

    public CompetitionService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public CompetitionService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns CompetitionPortType
     */
    @WebEndpoint(name = "CompetitionPort")
    public CompetitionPortType getCompetitionPort() {
        return super.getPort(new QName("http://www.competitionservice.com/135045/competition", "CompetitionPort"), CompetitionPortType.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns CompetitionPortType
     */
    @WebEndpoint(name = "CompetitionPort")
    public CompetitionPortType getCompetitionPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://www.competitionservice.com/135045/competition", "CompetitionPort"), CompetitionPortType.class, features);
    }

    private static URL __getWsdlLocation() {
        if (COMPETITIONSERVICE_EXCEPTION!= null) {
            throw COMPETITIONSERVICE_EXCEPTION;
        }
        return COMPETITIONSERVICE_WSDL_LOCATION;
    }

}
