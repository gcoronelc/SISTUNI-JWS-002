package pe.egcc.leerxml;

import java.io.File;
import java.util.ArrayList;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

/**
 *
 * @author Gustavo Coronel
 */
public class LeerXML {

  public static void main(String[] args) throws JAXBException {
    JAXBContext context = JAXBContext.newInstance(Libreria.class);
    Unmarshaller unmarshaller = context.createUnmarshaller();
    File file = new File("libreria.xml");
    Libreria libreria = (Libreria) unmarshaller.unmarshal(file);
    System.out.println("Nombre: " + libreria.getNombre());
    ArrayList<Libro> libros = libreria.getLibros();
    for (Libro l : libros) {
      System.out.println(l.getIsbn() + " | " + l.getTitulo() + " | " + l.getAutor());
    }
  }
}
