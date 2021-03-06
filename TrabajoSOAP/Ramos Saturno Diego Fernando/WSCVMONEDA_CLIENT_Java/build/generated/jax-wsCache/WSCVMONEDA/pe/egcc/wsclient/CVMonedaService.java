
package pe.egcc.wsclient;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.6-1b01 
 * Generated source version: 2.2
 * 
 */
@WebService(name = "CVMonedaService", targetNamespace = "http://ws.egcc.pe/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface CVMonedaService {


    /**
     * 
     * @param arg0
     * @return
     *     returns double
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "dollarToEuro", targetNamespace = "http://ws.egcc.pe/", className = "pe.egcc.wsclient.DollarToEuro")
    @ResponseWrapper(localName = "dollarToEuroResponse", targetNamespace = "http://ws.egcc.pe/", className = "pe.egcc.wsclient.DollarToEuroResponse")
    @Action(input = "http://ws.egcc.pe/CVMonedaService/dollarToEuroRequest", output = "http://ws.egcc.pe/CVMonedaService/dollarToEuroResponse")
    public double dollarToEuro(
        @WebParam(name = "arg0", targetNamespace = "")
        double arg0);

    /**
     * 
     * @param arg0
     * @return
     *     returns double
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "dollarToSol", targetNamespace = "http://ws.egcc.pe/", className = "pe.egcc.wsclient.DollarToSol")
    @ResponseWrapper(localName = "dollarToSolResponse", targetNamespace = "http://ws.egcc.pe/", className = "pe.egcc.wsclient.DollarToSolResponse")
    @Action(input = "http://ws.egcc.pe/CVMonedaService/dollarToSolRequest", output = "http://ws.egcc.pe/CVMonedaService/dollarToSolResponse")
    public double dollarToSol(
        @WebParam(name = "arg0", targetNamespace = "")
        double arg0);

    /**
     * 
     * @param arg0
     * @return
     *     returns double
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "solToDollar", targetNamespace = "http://ws.egcc.pe/", className = "pe.egcc.wsclient.SolToDollar")
    @ResponseWrapper(localName = "solToDollarResponse", targetNamespace = "http://ws.egcc.pe/", className = "pe.egcc.wsclient.SolToDollarResponse")
    @Action(input = "http://ws.egcc.pe/CVMonedaService/solToDollarRequest", output = "http://ws.egcc.pe/CVMonedaService/solToDollarResponse")
    public double solToDollar(
        @WebParam(name = "arg0", targetNamespace = "")
        double arg0);

    /**
     * 
     * @param arg0
     * @return
     *     returns double
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "euroToDollar", targetNamespace = "http://ws.egcc.pe/", className = "pe.egcc.wsclient.EuroToDollar")
    @ResponseWrapper(localName = "euroToDollarResponse", targetNamespace = "http://ws.egcc.pe/", className = "pe.egcc.wsclient.EuroToDollarResponse")
    @Action(input = "http://ws.egcc.pe/CVMonedaService/euroToDollarRequest", output = "http://ws.egcc.pe/CVMonedaService/euroToDollarResponse")
    public double euroToDollar(
        @WebParam(name = "arg0", targetNamespace = "")
        double arg0);

    /**
     * 
     * @param arg0
     * @return
     *     returns double
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "solToEuro", targetNamespace = "http://ws.egcc.pe/", className = "pe.egcc.wsclient.SolToEuro")
    @ResponseWrapper(localName = "solToEuroResponse", targetNamespace = "http://ws.egcc.pe/", className = "pe.egcc.wsclient.SolToEuroResponse")
    @Action(input = "http://ws.egcc.pe/CVMonedaService/solToEuroRequest", output = "http://ws.egcc.pe/CVMonedaService/solToEuroResponse")
    public double solToEuro(
        @WebParam(name = "arg0", targetNamespace = "")
        double arg0);

    /**
     * 
     * @param arg0
     * @return
     *     returns double
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "euroToSol", targetNamespace = "http://ws.egcc.pe/", className = "pe.egcc.wsclient.EuroToSol")
    @ResponseWrapper(localName = "euroToSolResponse", targetNamespace = "http://ws.egcc.pe/", className = "pe.egcc.wsclient.EuroToSolResponse")
    @Action(input = "http://ws.egcc.pe/CVMonedaService/euroToSolRequest", output = "http://ws.egcc.pe/CVMonedaService/euroToSolResponse")
    public double euroToSol(
        @WebParam(name = "arg0", targetNamespace = "")
        double arg0);

}
