
package pe.egcc.ejb;

import com.sun.javafx.scene.control.skin.VirtualFlow;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.List;
import java.util.Map;
import javax.ejb.Stateless;
import pe.egcc.db.AccesoDB;
import pe.egcc.util.JdbcUtil;

/**
 *
 * @author GustavoCoronel
 */
@Stateless
public class CuentaEjb implements CuentaEjbRemote {

  @Override
  public List<Map<String,?>> obtenerMovimientos(String cuenta) {
    List<Map<String,?>> lista = new VirtualFlow.ArrayLinkedList<>();
    Connection cn = null;
    try {
      cn = AccesoDB.getConnection();
      String sql = "select cuencodigo, cuensaldo, cuenestado, "
              + "monenombre, movinumero, movifecha, tiponombre, "
              + "tipoaccion, moviimporte from v_movimiento "
              + "where cuencodigo = ?";
      PreparedStatement pstm = cn.prepareStatement(sql);
      pstm.setString(1, cuenta);
      ResultSet rs = pstm.executeQuery();
      lista = JdbcUtil.rsToList(rs);
      rs.close();
      pstm.close();
    } catch (Exception e) {
      lista = new VirtualFlow.ArrayLinkedList<>();
    } finally{
      try {
        cn.close();
      } catch (Exception e) {
      }
    }
    return lista;
  }


}
