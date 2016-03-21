package pe.egcc.domain;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

/**
 *
 * @author Gustavo Coronel
 */
@XmlRootElement(name = "movimientos")
@XmlType(propOrder = {"cuenta", "saldo", "movs"})
public class Movimientos {

  private String cuenta;
  private double saldo;
  private List<Movimiento> movs;

  public Movimientos() {
    movs = new ArrayList<>();
  }

  public String getCuenta() {
    return cuenta;
  }

  @XmlElement(name = "cuenta")
  public void setCuenta(String cuenta) {
    this.cuenta = cuenta;
  }

  public double getSaldo() {
    return saldo;
  }

  @XmlElement(name = "saldo")
  public void setSaldo(double saldo) {
    this.saldo = saldo;
  }

  public List<Movimiento> getMovs() {
    return movs;
  }

  @XmlElementWrapper(name = "movs")
  @XmlElement(name = "movimiento")
  public void setMovs(List<Movimiento> movs) {
    this.movs = movs;
  }

}
