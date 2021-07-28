package MODELO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.print.DocFlavor;
import javax.swing.JOptionPane;

public class Ventas {
    Conexion cn=new Conexion();
    Connection con;
    PreparedStatement ps;
    ResultSet rs;
    int r=0;
    
    public String ID_VENTA(){
        String ID_VENTA="";
        String sql="select max(ID_VENTA) from ventas";
        try{
        con=cn.Conectar();
        ps=con.prepareStatement(sql);
        rs=ps.executeQuery(); 
        while(rs.next()){
        ID_VENTA=rs.getString(1);
            
        }
        }catch(Exception e){   
        }
        return ID_VENTA;
    }
    public int GuardarVentas(EntidadVenta ev){
        EntidadVenta ventas=new EntidadVenta();
        String sql="insert into ventas(ID_CLIENTE,ID_USUARIO,NUMERO_VENTA,MONTO,FECHA)values(?,?,?,?,?)";
        try {
          con=cn.Conectar();
          ps=con.prepareStatement(sql);
          ps.setInt(1, ev.getID_CLIENTE());
          ps.setInt(2, ev.getID_USUARIO());
          ps.setString(3, ev.getNUMERO_VENTA());
          ps.setDouble(4, ev.getMONTO());
          ps.setString(5, ev.getFECHA());
          r=ps.executeUpdate();
        } catch (Exception e) {
        }
        return r;
    }
     public int GuardarDetalleVentas(EntidadDetalleVentas edv){
         String sql="insert into detalle_ventas(ID_VENTA,ID_PRODUCTO,CANTIDAD,PRECIO_VENTA)values(?,?,?,?)";
         try {
         con=cn.Conectar();
         ps=con.prepareStatement(sql);
         ps.setInt(1, edv.getID_VENTA());
         ps.setInt(2, edv.getID_PRODUCTO());
         ps.setInt(3, edv.getCANTIDAD());
         ps.setDouble(4, edv.getPRECIO_VENTA());
         ps.executeUpdate();
         } catch (Exception e) {
         }
         return r;
     }
}
