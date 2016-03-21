package pe.egcc.leerxml;

import java.util.ArrayList;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

/**
 *
 * @author Gustavo Coronel
 */
@XmlRootElement(name = "libreria")
@XmlType(propOrder = {"nombre","libros"})
public class Libreria {

  private String nombre;
  private ArrayList<Libro> libros;

  public Libreria() {
    libros = new ArrayList<>();
  }

  @XmlElement(name = "nombre")
  public String getNombre() {
    return nombre;
  }

  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

  @XmlElementWrapper(name = "libros") 
  @XmlElement(name = "libro")
  public ArrayList<Libro> getLibros() {
    return libros;
  }

  public void setLibros(ArrayList<Libro> libros) {
    this.libros = libros;
  }

}
