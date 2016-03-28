package pe.egcc.services;

/**
 *
 * @author GustavoCoronel
 */
public class Matematica {

  public int sumar(int n1, int n2) {
    pe.egcc.wsclient.MateService_Service service = new pe.egcc.wsclient.MateService_Service();
    pe.egcc.wsclient.MateService port = service.getMateServicePort();
    return port.sumar(n1, n2);
  }

  public int restar(int n1, int n2) {
    pe.egcc.wsclient.MateService_Service service = new pe.egcc.wsclient.MateService_Service();
    pe.egcc.wsclient.MateService port = service.getMateServicePort();
    return port.restar(n1, n2);
  }

}
