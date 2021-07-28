package MODELO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class Productos implements CRUD {
    Connection con;
    Conexion acceso=new Conexion();
    PreparedStatement ps;
    ResultSet rs;
    EntidadProductos ep=new EntidadProductos();
    
    public EntidadProductos listarID(int ID_PRODUCTO){
    EntidadProductos ep=new EntidadProductos();
     String sql="select * from productos where ID_PRODUCTO=?"; 
     try{
         con=acceso.Conectar();
         ps=con.prepareStatement(sql);
         ps.setInt(1,ID_PRODUCTO);
         rs=ps.executeQuery();
         while(rs.next()){
         ep.setID_PRODUCTO(rs.getInt(1));
         ep.setNOMBRE_PRODUCTO(rs.getString(2));
         ep.setPRECIO_PRODUCTO(rs.getDouble(3));
         ep.setEXISTENCIAS_PRODUCTO(rs.getInt(4));
         }
     }catch(Exception e){
     }
        return ep; 
 }

    @Override
    public List listar() {
        List<EntidadProductos> lista =new ArrayList<>();
        String sql="select * from productos";
        try{
            con=acceso.Conectar();
            ps=con.prepareStatement(sql);
            rs=ps.executeQuery();
            while(rs.next()){
                EntidadProductos ep=new EntidadProductos();
                ep.setID_PRODUCTO(rs.getInt(1));
                ep.setNOMBRE_PRODUCTO(rs.getString(2));
                ep.setPRECIO_PRODUCTO(rs.getDouble(3));
                ep.setEXISTENCIAS_PRODUCTO(rs.getInt(4));
                lista.add(ep);
            }
        }catch(Exception e){   
        }
        return lista;
    }

    @Override
    public int add(Object[] o) {
           int r=0;
        String sql="insert into productos(NOMBRE_PRODUCTO,PRECIO_PRODUCTO,EXISTENCIAS_PRODUCTO)values(?,?,?)";
        try{
            con=acceso.Conectar();
            ps=con.prepareStatement(sql);
            ps.setObject(1, o[0]);
            ps.setObject(2, o[1]);
            ps.setObject(3, o[2]);
            r=ps.executeUpdate();
            }catch(Exception e){
            }
        return r;
        }
    

    @Override
    public int actualizar(Object[] o) {
        int r=0;
        String sql="update productos set NOMBRE_PRODUCTO=?,PRECIO_PRODUCTO=?,EXISTENCIAS_PRODUCTO=? where ID_PRODUCTO=?";
        try{
            con=acceso.Conectar();
            ps=con.prepareStatement(sql);
            ps.setObject(1, o[0]);
            ps.setObject(2, o[1]);
            ps.setObject(3, o[2]);
            ps.setObject(4, o[3]);
            r=ps.executeUpdate();
            }catch(Exception e){                
            }
        return r;
    }

    @Override
    public void eliminar(int ID) {
        String sql="delete from productos where ID_PRODUCTO=?"; 
      try{
            con=acceso.Conectar();
            ps=con.prepareStatement(sql);
            ps.setInt(1, ID);
            ps.executeUpdate();
            }catch(Exception e){                
            }
    }
    
        
    }

    


