package pe.egcc.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import java.util.Map;
import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import pe.egcc.domain.Movimiento;
import pe.egcc.domain.Movimientos;
import pe.egcc.ejb.CuentaEjbRemote;

/**
 *
 * @author Gustavo Coronel
 */
@WebServlet(name = "Prueba01", urlPatterns = {"/Prueba01"})
public class Prueba01 extends HttpServlet {

  @EJB
  private CuentaEjbRemote cuentaEjb;

  @Override
  protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    try {
      
      String cuenta = request.getParameter("cuenta");
      
      List<Map<String, ?>> lista = cuentaEjb.obtenerMovimientos(cuenta);
      Movimientos movimientos = new Movimientos();
      if (!lista.isEmpty()) {
        movimientos.setCuenta(lista.get(0).get("cuencodigo").toString());
        movimientos.setSaldo(Double.parseDouble(lista.get(0).get("cuensaldo").toString()));
        for (Map<String, ?> r : lista) {
          Movimiento m = new Movimiento();
          m.setNro(Integer.parseInt(r.get("movinumero").toString()));
          m.setTipo(r.get("tiponombre").toString());
          m.setImporte(Double.parseDouble(r.get("moviimporte").toString()));
          movimientos.getMovs().add(m);
        }
        // Generar XML
        JAXBContext jaxbContext = JAXBContext.newInstance(Movimientos.class);
        Marshaller jaxbMarshaller = jaxbContext.createMarshaller();
        jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
        
        response.setContentType("Application/xml;charset=UTF-8");
        PrintWriter out = response.getWriter();
        // Escribir en el archivo 
        jaxbMarshaller.marshal(movimientos, out);
        out.flush();
      }
    } catch (Exception e) {
    } 
  }

}
