package pe.egcc.demows.ws;

import java.util.List;

import javax.jws.WebService;
import javax.xml.ws.Endpoint;

import pe.egcc.demows.model.Libro;
import pe.egcc.demows.service.LibroService;

@WebService
public class LibrosWS {

  public List<Libro> traerLibros() {
    LibroService libroService = new LibroService();
    return libroService.traerLibros();
  }

  public int sumar(int n1, int n2) {
    return (n1 + n2);
  }

  public static void main(String[] args) {
    Endpoint.publish("http://localhost:8082/librosws", new LibrosWS());
    System.out.println("Servicio inicializado!");
  }
  
}
