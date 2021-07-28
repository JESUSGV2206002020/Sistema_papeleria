package MODELO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class Clientes implements CRUD{
    Connection con;
    Conexion cn=new Conexion();
    PreparedStatement ps;
    ResultSet rs;
    EntidadCliente co=new EntidadCliente();
    
   public EntidadCliente listaID(String CODIGO_CLIENTE){
       EntidadCliente c=new EntidadCliente();
       String sql="select * from clientes where CODIGO_CLIENTE=?";
       try{
            con=cn.Conectar();
            ps=con.prepareStatement(sql);
            ps.setString(1, CODIGO_CLIENTE);
            rs=ps.executeQuery();
            while(rs.next()){
            c.setID_CLIENTE(rs.getInt(1));
            c.setCODIGO_CLIENTE(rs.getString(2));
            c.setNOMBRE(rs.getString(3));
            c.setAPELLIDO_P(rs.getString(4));
            c.setAPELLIDO_M(rs.getString(5));
            c.setEMAIL(rs.getString(6));
            c.setTELEFONO(rs.getString(7));
          }
          }catch (Exception e){        
      }
       return c;
   }

    @Override
    public List listar(){
        List<EntidadCliente> lista =new ArrayList<>();
        String sql="select * from clientes";
        try{
            con=cn.Conectar();
            ps=con.prepareStatement(sql);
            rs=ps.executeQuery();
            while(rs.next()){
                EntidadCliente c=new EntidadCliente();
                c.setID_CLIENTE(rs.getInt(1));
                c.setCODIGO_CLIENTE(rs.getString(2));
                c.setNOMBRE(rs.getString(3));
                c.setAPELLIDO_P(rs.getString(4));
                c.setAPELLIDO_M(rs.getString(5));
                c.setEMAIL(rs.getString(6));
                c.setTELEFONO(rs.getString(7));
                lista.add(c);
            }
        }catch(Exception e){   
        }
        return lista;
    }

    @Override
    public int add(Object[] o) {
        int r=0;
        String sql="insert into clientes(CODIGO_CLIENTE,NOMBRE,APELLIDO_P,APELLIDO_M,EMAIL,TELEFONO)values(?,?,?,?,?,?)";
        try{
            con=cn.Conectar();
            ps=con.prepareStatement(sql);
            ps.setObject(1, o[0]);
            ps.setObject(2, o[1]);
            ps.setObject(3, o[2]);
            ps.setObject(4, o[3]);
            ps.setObject(5, o[4]);
            ps.setObject(6, o[5]);
            r=ps.executeUpdate();
            }catch(Exception e){
            }
        return r;
        }
        
    
    @Override
    public int actualizar(Object[] o) {
        int r=0;
        String sql="update clientes set CODIGO_CLIENTE=?,NOMBRE=?,APELLIDO_P=?,APELLIDO_M=?,EMAIL=?,TELEFONO=? where ID_CLIENTE=?";
        try{
            con=cn.Conectar();
            ps=con.prepareStatement(sql);
            ps.setObject(1, o[0]);
            ps.setObject(2, o[1]);
            ps.setObject(3, o[2]);
            ps.setObject(4, o[3]);
            ps.setObject(5, o[4]);
            ps.setObject(6, o[5]);
            ps.setObject(7, o[6]); 
            r=ps.executeUpdate();
            }catch(Exception e){                
            }
        return r;
    }

    @Override
    public void eliminar(int ID) {
      String sql="delete from clientes where ID_CLIENTE=?"; 
      try{
            con=cn.Conectar();
            ps=con.prepareStatement(sql);
            ps.setInt(1, ID);
            ps.executeUpdate();
            }catch(Exception e){                
            }
    }
}
