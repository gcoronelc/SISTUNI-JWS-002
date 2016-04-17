
package pe.egcc.wsclient;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the pe.egcc.wsclient package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _DollarToSolResponse_QNAME = new QName("http://ws.egcc.pe/", "dollarToSolResponse");
    private final static QName _EuroToSol_QNAME = new QName("http://ws.egcc.pe/", "euroToSol");
    private final static QName _SolToDollar_QNAME = new QName("http://ws.egcc.pe/", "solToDollar");
    private final static QName _SolToEuroResponse_QNAME = new QName("http://ws.egcc.pe/", "solToEuroResponse");
    private final static QName _DollarToEuroResponse_QNAME = new QName("http://ws.egcc.pe/", "dollarToEuroResponse");
    private final static QName _DollarToEuro_QNAME = new QName("http://ws.egcc.pe/", "dollarToEuro");
    private final static QName _SolToDollarResponse_QNAME = new QName("http://ws.egcc.pe/", "solToDollarResponse");
    private final static QName _EuroToDollar_QNAME = new QName("http://ws.egcc.pe/", "euroToDollar");
    private final static QName _EuroToDollarResponse_QNAME = new QName("http://ws.egcc.pe/", "euroToDollarResponse");
    private final static QName _SolToEuro_QNAME = new QName("http://ws.egcc.pe/", "solToEuro");
    private final static QName _DollarToSol_QNAME = new QName("http://ws.egcc.pe/", "dollarToSol");
    private final static QName _EuroToSolResponse_QNAME = new QName("http://ws.egcc.pe/", "euroToSolResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: pe.egcc.wsclient
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link DollarToEuro }
     * 
     */
    public DollarToEuro createDollarToEuro() {
        return new DollarToEuro();
    }

    /**
     * Create an instance of {@link SolToDollarResponse }
     * 
     */
    public SolToDollarResponse createSolToDollarResponse() {
        return new SolToDollarResponse();
    }

    /**
     * Create an instance of {@link DollarToEuroResponse }
     * 
     */
    public DollarToEuroResponse createDollarToEuroResponse() {
        return new DollarToEuroResponse();
    }

    /**
     * Create an instance of {@link SolToEuroResponse }
     * 
     */
    public SolToEuroResponse createSolToEuroResponse() {
        return new SolToEuroResponse();
    }

    /**
     * Create an instance of {@link EuroToSol }
     * 
     */
    public EuroToSol createEuroToSol() {
        return new EuroToSol();
    }

    /**
     * Create an instance of {@link SolToDollar }
     * 
     */
    public SolToDollar createSolToDollar() {
        return new SolToDollar();
    }

    /**
     * Create an instance of {@link DollarToSolResponse }
     * 
     */
    public DollarToSolResponse createDollarToSolResponse() {
        return new DollarToSolResponse();
    }

    /**
     * Create an instance of {@link EuroToSolResponse }
     * 
     */
    public EuroToSolResponse createEuroToSolResponse() {
        return new EuroToSolResponse();
    }

    /**
     * Create an instance of {@link DollarToSol }
     * 
     */
    public DollarToSol createDollarToSol() {
        return new DollarToSol();
    }

    /**
     * Create an instance of {@link SolToEuro }
     * 
     */
    public SolToEuro createSolToEuro() {
        return new SolToEuro();
    }

    /**
     * Create an instance of {@link EuroToDollarResponse }
     * 
     */
    public EuroToDollarResponse createEuroToDollarResponse() {
        return new EuroToDollarResponse();
    }

    /**
     * Create an instance of {@link EuroToDollar }
     * 
     */
    public EuroToDollar createEuroToDollar() {
        return new EuroToDollar();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DollarToSolResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.egcc.pe/", name = "dollarToSolResponse")
    public JAXBElement<DollarToSolResponse> createDollarToSolResponse(DollarToSolResponse value) {
        return new JAXBElement<DollarToSolResponse>(_DollarToSolResponse_QNAME, DollarToSolResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EuroToSol }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.egcc.pe/", name = "euroToSol")
    public JAXBElement<EuroToSol> createEuroToSol(EuroToSol value) {
        return new JAXBElement<EuroToSol>(_EuroToSol_QNAME, EuroToSol.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SolToDollar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.egcc.pe/", name = "solToDollar")
    public JAXBElement<SolToDollar> createSolToDollar(SolToDollar value) {
        return new JAXBElement<SolToDollar>(_SolToDollar_QNAME, SolToDollar.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SolToEuroResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.egcc.pe/", name = "solToEuroResponse")
    public JAXBElement<SolToEuroResponse> createSolToEuroResponse(SolToEuroResponse value) {
        return new JAXBElement<SolToEuroResponse>(_SolToEuroResponse_QNAME, SolToEuroResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DollarToEuroResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.egcc.pe/", name = "dollarToEuroResponse")
    public JAXBElement<DollarToEuroResponse> createDollarToEuroResponse(DollarToEuroResponse value) {
        return new JAXBElement<DollarToEuroResponse>(_DollarToEuroResponse_QNAME, DollarToEuroResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DollarToEuro }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.egcc.pe/", name = "dollarToEuro")
    public JAXBElement<DollarToEuro> createDollarToEuro(DollarToEuro value) {
        return new JAXBElement<DollarToEuro>(_DollarToEuro_QNAME, DollarToEuro.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SolToDollarResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.egcc.pe/", name = "solToDollarResponse")
    public JAXBElement<SolToDollarResponse> createSolToDollarResponse(SolToDollarResponse value) {
        return new JAXBElement<SolToDollarResponse>(_SolToDollarResponse_QNAME, SolToDollarResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EuroToDollar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.egcc.pe/", name = "euroToDollar")
    public JAXBElement<EuroToDollar> createEuroToDollar(EuroToDollar value) {
        return new JAXBElement<EuroToDollar>(_EuroToDollar_QNAME, EuroToDollar.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EuroToDollarResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.egcc.pe/", name = "euroToDollarResponse")
    public JAXBElement<EuroToDollarResponse> createEuroToDollarResponse(EuroToDollarResponse value) {
        return new JAXBElement<EuroToDollarResponse>(_EuroToDollarResponse_QNAME, EuroToDollarResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SolToEuro }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.egcc.pe/", name = "solToEuro")
    public JAXBElement<SolToEuro> createSolToEuro(SolToEuro value) {
        return new JAXBElement<SolToEuro>(_SolToEuro_QNAME, SolToEuro.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DollarToSol }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.egcc.pe/", name = "dollarToSol")
    public JAXBElement<DollarToSol> createDollarToSol(DollarToSol value) {
        return new JAXBElement<DollarToSol>(_DollarToSol_QNAME, DollarToSol.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EuroToSolResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.egcc.pe/", name = "euroToSolResponse")
    public JAXBElement<EuroToSolResponse> createEuroToSolResponse(EuroToSolResponse value) {
        return new JAXBElement<EuroToSolResponse>(_EuroToSolResponse_QNAME, EuroToSolResponse.class, null, value);
    }

}
