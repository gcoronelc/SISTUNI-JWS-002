package pe.egcc.ejb;

import java.util.List;
import java.util.Map;
import javax.ejb.Remote;

/**
 *
 * @author GustavoCoronel
 */
@Remote
public interface CuentaEjbRemote {

  List<Map<String,?>> obtenerMovimientos(String cuenta);
  
}
