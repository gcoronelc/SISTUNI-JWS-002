
package pe.egcc.demows.ws;

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
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "LibrosWSService", targetNamespace = "http://ws.demows.egcc.pe/", wsdlLocation = "http://localhost:8082/librosws?wsdl")
public class LibrosWSService
    extends Service
{

    private final static URL LIBROSWSSERVICE_WSDL_LOCATION;
    private final static WebServiceException LIBROSWSSERVICE_EXCEPTION;
    private final static QName LIBROSWSSERVICE_QNAME = new QName("http://ws.demows.egcc.pe/", "LibrosWSService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://localhost:8082/librosws?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        LIBROSWSSERVICE_WSDL_LOCATION = url;
        LIBROSWSSERVICE_EXCEPTION = e;
    }

    public LibrosWSService() {
        super(__getWsdlLocation(), LIBROSWSSERVICE_QNAME);
    }

    public LibrosWSService(WebServiceFeature... features) {
        super(__getWsdlLocation(), LIBROSWSSERVICE_QNAME, features);
    }

    public LibrosWSService(URL wsdlLocation) {
        super(wsdlLocation, LIBROSWSSERVICE_QNAME);
    }

    public LibrosWSService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, LIBROSWSSERVICE_QNAME, features);
    }

    public LibrosWSService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public LibrosWSService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns LibrosWS
     */
    @WebEndpoint(name = "LibrosWSPort")
    public LibrosWS getLibrosWSPort() {
        return super.getPort(new QName("http://ws.demows.egcc.pe/", "LibrosWSPort"), LibrosWS.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns LibrosWS
     */
    @WebEndpoint(name = "LibrosWSPort")
    public LibrosWS getLibrosWSPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://ws.demows.egcc.pe/", "LibrosWSPort"), LibrosWS.class, features);
    }

    private static URL __getWsdlLocation() {
        if (LIBROSWSSERVICE_EXCEPTION!= null) {
            throw LIBROSWSSERVICE_EXCEPTION;
        }
        return LIBROSWSSERVICE_WSDL_LOCATION;
    }

}
