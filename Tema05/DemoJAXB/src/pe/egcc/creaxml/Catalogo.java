package pe.egcc.creaxml;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

/**
 *
 * @author GustavoCoronel
 */
@XmlRootElement(name = "catalogo")
@XmlType(propOrder = {"nombre", "periodo", "productos"})
public class Catalogo {

  private String nombre;
  private String periodo;
  private List<Producto> productos;

  public Catalogo() {
    productos = new ArrayList<>();
  }

  public String getNombre() {
    return nombre;
  }

  @XmlElement(name = "nombre")
  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

  public String getPeriodo() {
    return periodo;
  }

  @XmlElement(name = "periodo")
  public void setPeriodo(String periodo) {
    this.periodo = periodo;
  }

  public List<Producto> getProductos() {
    return productos;
  }

  @XmlElementWrapper(name = "productos") 
  @XmlElement(name = "producto")
  public void setProductos(List<Producto> productos) {
    this.productos = productos;
  }

}
