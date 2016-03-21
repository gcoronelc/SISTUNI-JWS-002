package pe.egcc.creaxml;

import java.io.File;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

/**
 *
 * @author Gustavo Coronel
 */
public class GeneraXML2 {

  public static void main(String[] args) throws JAXBException {
    
    Catalogo catalogo = new Catalogo();
    
    catalogo.setNombre("Otoño 2016");
    catalogo.setPeriodo("MAR - JUN 2016");
    
    catalogo.getProductos().add( new Producto(1000, "Zapatos de Damas", 350.00) );
    catalogo.getProductos().add( new Producto(2000, "Zapatos de Caballero", 400.00) );
    catalogo.getProductos().add( new Producto(3000, "Casaca delgada", 370.00) );
    catalogo.getProductos().add( new Producto(4000, "Pantalón Caballero", 260.00) );
        
    File file = new File("D:\\EGCC\\catalogo.xml");
    JAXBContext jaxbContext = JAXBContext.newInstance(Catalogo.class);
    Marshaller jaxbMarshaller = jaxbContext.createMarshaller();
    jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true); 
    // Escribir en el archivo 
    jaxbMarshaller.marshal(catalogo, file); 
    // Salida por consola 
    jaxbMarshaller.marshal(catalogo, System.out);
    
  }
  
}
