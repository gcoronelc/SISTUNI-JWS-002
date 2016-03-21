package pe.egcc.domain;

import java.util.Date;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

/**
 *
 * @author Gustavo Coronel
 */
@XmlRootElement(name = "movimiento")
@XmlType(propOrder = {"nro", "fecha", "tipo", "importe"})
public class Movimiento {

  private int nro;
  private Date fecha;
  private String tipo;
  private double importe;

  public Movimiento() {
  }

  public Movimiento(int nro, Date fecha, String tipo, double importe) {
    this.nro = nro;
    this.fecha = fecha;
    this.tipo = tipo;
    this.importe = importe;
  }

  public int getNro() {
    return nro;
  }

  @XmlElement
  public void setNro(int nro) {
    this.nro = nro;
  }

  public Date getFecha() {
    return fecha;
  }

  @XmlElement
  public void setFecha(Date fecha) {
    this.fecha = fecha;
  }

  public String getTipo() {
    return tipo;
  }

  @XmlElement
  public void setTipo(String tipo) {
    this.tipo = tipo;
  }

  public double getImporte() {
    return importe;
  }

  @XmlElement
  public void setImporte(double importe) {
    this.importe = importe;
  }

}
