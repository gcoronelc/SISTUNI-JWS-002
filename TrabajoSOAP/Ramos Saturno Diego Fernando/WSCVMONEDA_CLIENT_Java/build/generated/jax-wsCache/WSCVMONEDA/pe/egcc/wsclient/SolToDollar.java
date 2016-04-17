
package pe.egcc.wsclient;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para solToDollar complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="solToDollar">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="arg0" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "solToDollar", propOrder = {
    "arg0"
})
public class SolToDollar {

    protected double arg0;

    /**
     * Obtiene el valor de la propiedad arg0.
     * 
     */
    public double getArg0() {
        return arg0;
    }

    /**
     * Define el valor de la propiedad arg0.
     * 
     */
    public void setArg0(double value) {
        this.arg0 = value;
    }

}
