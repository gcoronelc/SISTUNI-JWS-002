package pe.egcc.rest.server;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import pe.egcc.rest.dto.Mensaje;

@Path(value = "wsmensaje")
public class WSMensaje {

  @GET
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON })
  public Mensaje getMensaje() {
    Mensaje mensaje = new Mensaje("Hola todos. Bienvenidos a SistemasUNI.");
    return mensaje;
  }

}
