
package pe.egcc.wsclient;

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
 * JAX-WS RI 2.2.6-1b01 
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "WSCVMONEDA", targetNamespace = "http://ws.egcc.pe/", wsdlLocation = "http://localhost:8080/WS_CVMONEDA/WSCVMONEDA?wsdl")
public class WSCVMONEDA
    extends Service
{

    private final static URL WSCVMONEDA_WSDL_LOCATION;
    private final static WebServiceException WSCVMONEDA_EXCEPTION;
    private final static QName WSCVMONEDA_QNAME = new QName("http://ws.egcc.pe/", "WSCVMONEDA");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://localhost:8080/WS_CVMONEDA/WSCVMONEDA?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        WSCVMONEDA_WSDL_LOCATION = url;
        WSCVMONEDA_EXCEPTION = e;
    }

    public WSCVMONEDA() {
        super(__getWsdlLocation(), WSCVMONEDA_QNAME);
    }

    public WSCVMONEDA(WebServiceFeature... features) {
        super(__getWsdlLocation(), WSCVMONEDA_QNAME, features);
    }

    public WSCVMONEDA(URL wsdlLocation) {
        super(wsdlLocation, WSCVMONEDA_QNAME);
    }

    public WSCVMONEDA(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, WSCVMONEDA_QNAME, features);
    }

    public WSCVMONEDA(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public WSCVMONEDA(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns CVMonedaService
     */
    @WebEndpoint(name = "CVMonedaServicePort")
    public CVMonedaService getCVMonedaServicePort() {
        return super.getPort(new QName("http://ws.egcc.pe/", "CVMonedaServicePort"), CVMonedaService.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns CVMonedaService
     */
    @WebEndpoint(name = "CVMonedaServicePort")
    public CVMonedaService getCVMonedaServicePort(WebServiceFeature... features) {
        return super.getPort(new QName("http://ws.egcc.pe/", "CVMonedaServicePort"), CVMonedaService.class, features);
    }

    private static URL __getWsdlLocation() {
        if (WSCVMONEDA_EXCEPTION!= null) {
            throw WSCVMONEDA_EXCEPTION;
        }
        return WSCVMONEDA_WSDL_LOCATION;
    }

}
