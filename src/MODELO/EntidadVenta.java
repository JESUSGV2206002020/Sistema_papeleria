
package MODELO;


public class EntidadVenta {
    int ID_VENTA;
    int ID_CLIENTE;
    int ID_USUARIO;
    String NUMERO_VENTA;
    double MONTO;
    String FECHA;
    
    public EntidadVenta(){   
    }
    
    public EntidadVenta(int ID_VENTA,int ID_CLIENTE,int ID_USUARIO,String NUMERO_VENTA,double MONTO,String FECHA){
        this.ID_VENTA = ID_VENTA;
        this.ID_CLIENTE = ID_CLIENTE;
        this.ID_USUARIO = ID_USUARIO;
        this.NUMERO_VENTA = NUMERO_VENTA;
        this.MONTO = MONTO;
        this.FECHA = FECHA;
    }

    public int getID_VENTA() {
        return ID_VENTA;
    }

    public void setID_VENTA(int ID_VENTA) {
        this.ID_VENTA = ID_VENTA;
    }

    public int getID_CLIENTE() {
        return ID_CLIENTE;
    }

    public void setID_CLIENTE(int ID_CLIENTE) {
        this.ID_CLIENTE = ID_CLIENTE;
    }

    public int getID_USUARIO() {
        return ID_USUARIO;
    }

    public void setID_USUARIO(int ID_USUARIO) {
        this.ID_USUARIO = ID_USUARIO;
    }

    public String getNUMERO_VENTA() {
        return NUMERO_VENTA;
    }

    public void setNUMERO_VENTA(String NUMERO_VENTA) {
        this.NUMERO_VENTA = NUMERO_VENTA;
    }

    public double getMONTO() {
        return MONTO;
    }

    public void setMONTO(double MONTO) {
        this.MONTO = MONTO;
    }

    public String getFECHA() {
        return FECHA;
    }

    public void setFECHA(String FECHA) {
        this.FECHA = FECHA;
    }
            
}

