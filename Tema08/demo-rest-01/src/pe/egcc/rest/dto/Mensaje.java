package pe.egcc.rest.dto;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="mensaje")
public class Mensaje {

  private String texto;

  public Mensaje() {
  }

  public Mensaje(String texto) {
    this.texto = texto;
  }

  public String getTexto() {
    return texto;
  }

  public void setTexto(String texto) {
    this.texto = texto;
  }
  
  

}
