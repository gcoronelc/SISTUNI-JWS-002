package pe.egcc.ws;

import javax.jws.WebMethod;
import javax.jws.WebService;

/**
 *
 * @author Gustavo Coronel
 */
@WebService(serviceName = "MateService")
public class MateService {

  @WebMethod
  public int sumar(int n1, int n2) {
    return (n1 + n2);
  }

  @WebMethod
  public int restar(int n1, int n2) {
    return (n1 - n2);
  }
}
