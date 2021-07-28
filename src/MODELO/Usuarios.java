package MODELO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
public class Usuarios {
    PreparedStatement ps;
    ResultSet rs;
    
    Conexion con=new Conexion();
    Connection acceso;
    
    public EntidadUsuario ValidarUsuario(String PASSWORD,String USUARIO){
    EntidadUsuario ev=new EntidadUsuario();
    String sql="select * from usuarios where PASSWORD=? and USUARIO=?";
    try{
        acceso=con.Conectar();
        ps=acceso.prepareStatement(sql);
        ps.setString(1, PASSWORD);
        ps.setString(2, USUARIO);
        rs=ps.executeQuery();
        while(rs.next()){
            ev.setID_USUARIO(rs.getInt(1));
            ev.setNOMBRE(rs.getString(2));
            ev.setAPELLIDO_P(rs.getString(3));
            ev.setAPELLIDO_M(rs.getString(4));
            ev.setEMAIL(rs.getString(5));
            ev.setTELEFONO(rs.getString(6));
            ev.setTIPO_ACCESO(rs.getString(7));
            ev.setUSUARIO(rs.getString(8));
            ev.setPASSWORD(rs.getString(9));
        }
    }catch(Exception e){ 
    }
    return ev;
    }
}