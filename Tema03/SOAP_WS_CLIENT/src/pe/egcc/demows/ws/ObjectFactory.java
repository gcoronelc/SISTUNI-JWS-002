
package pe.egcc.demows.ws;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the pe.egcc.demows.ws package. 
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

    private final static QName _SumarResponse_QNAME = new QName("http://ws.demows.egcc.pe/", "sumarResponse");
    private final static QName _Sumar_QNAME = new QName("http://ws.demows.egcc.pe/", "sumar");
    private final static QName _TraerLibros_QNAME = new QName("http://ws.demows.egcc.pe/", "traerLibros");
    private final static QName _TraerLibrosResponse_QNAME = new QName("http://ws.demows.egcc.pe/", "traerLibrosResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: pe.egcc.demows.ws
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link SumarResponse }
     * 
     */
    public SumarResponse createSumarResponse() {
        return new SumarResponse();
    }

    /**
     * Create an instance of {@link Sumar }
     * 
     */
    public Sumar createSumar() {
        return new Sumar();
    }

    /**
     * Create an instance of {@link TraerLibros }
     * 
     */
    public TraerLibros createTraerLibros() {
        return new TraerLibros();
    }

    /**
     * Create an instance of {@link TraerLibrosResponse }
     * 
     */
    public TraerLibrosResponse createTraerLibrosResponse() {
        return new TraerLibrosResponse();
    }

    /**
     * Create an instance of {@link Libro }
     * 
     */
    public Libro createLibro() {
        return new Libro();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SumarResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.demows.egcc.pe/", name = "sumarResponse")
    public JAXBElement<SumarResponse> createSumarResponse(SumarResponse value) {
        return new JAXBElement<SumarResponse>(_SumarResponse_QNAME, SumarResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Sumar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.demows.egcc.pe/", name = "sumar")
    public JAXBElement<Sumar> createSumar(Sumar value) {
        return new JAXBElement<Sumar>(_Sumar_QNAME, Sumar.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TraerLibros }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.demows.egcc.pe/", name = "traerLibros")
    public JAXBElement<TraerLibros> createTraerLibros(TraerLibros value) {
        return new JAXBElement<TraerLibros>(_TraerLibros_QNAME, TraerLibros.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TraerLibrosResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.demows.egcc.pe/", name = "traerLibrosResponse")
    public JAXBElement<TraerLibrosResponse> createTraerLibrosResponse(TraerLibrosResponse value) {
        return new JAXBElement<TraerLibrosResponse>(_TraerLibrosResponse_QNAME, TraerLibrosResponse.class, null, value);
    }

}
