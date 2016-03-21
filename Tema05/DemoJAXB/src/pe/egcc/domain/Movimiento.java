package pe.egcc.domain;

import java.util.Date;

/**
 *
 * @author Gustavo Coronel
 */
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

  public void setNro(int nro) {
    this.nro = nro;
  }

  public Date getFecha() {
    return fecha;
  }

  public void setFecha(Date fecha) {
    this.fecha = fecha;
  }

  public String getTipo() {
    return tipo;
  }

  public void setTipo(String tipo) {
    this.tipo = tipo;
  }

  public double getImporte() {
    return importe;
  }

  public void setImporte(double importe) {
    this.importe = importe;
  }
  

}
