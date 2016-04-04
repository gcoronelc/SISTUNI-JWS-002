package pe.egcc.prueba;

import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.WebResource;

/**
 *
 * @author GustavoCoronel
 */
public class Prueba01 {
  
  public static void main(String[] args) {
    try {
      
      Client client = Client.create();
      WebResource webResource = client.resource("http://localhost:8083/demo-rest-01/rest/wsmensaje");
      ClientResponse response = webResource.accept("application/json").get(ClientResponse.class);

      if (response.getStatus() != 200) {
        throw new RuntimeException("Failed : HTTP error code : " + response.getStatus());
      }

      System.out.println("Output from Server .... \n");
      String respuesta = response.getEntity(String.class);
      System.out.println(respuesta);

    } catch (Exception e) {
      System.out.println("Error");
      e.printStackTrace();
    }
  }
  
}
