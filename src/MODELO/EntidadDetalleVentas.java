
package MODELO;


public class EntidadDetalleVentas {
    int ID_DETALLE_VENTAS;
    int ID_VENTA;
    int ID_PRODUCTO;
    int CANTIDAD;
    double PRECIO_VENTA;
    
    public EntidadDetalleVentas(){
    }
    
    public EntidadDetalleVentas(int ID_DETALLE_VENTAS,int ID_VENTA,int ID_PRODUCTO,int CANTIDAD,double PRECIO_VENTA){
       this.ID_DETALLE_VENTAS = ID_DETALLE_VENTAS;
       this.ID_VENTA = ID_VENTA;
       this.ID_PRODUCTO = ID_PRODUCTO;
       this.CANTIDAD = CANTIDAD;
       this.PRECIO_VENTA = PRECIO_VENTA;
    }

    public int getID_DETALLE_VENTAS() {
        return ID_DETALLE_VENTAS;
    }

    public void setID_DETALLE_VENTAS(int ID_DETALLE_VENTAS) {
        this.ID_DETALLE_VENTAS = ID_DETALLE_VENTAS;
    }

    public int getID_VENTA() {
        return ID_VENTA;
    }

    public void setID_VENTA(int ID_VENTA) {
        this.ID_VENTA = ID_VENTA;
    }

    public int getID_PRODUCTO() {
        return ID_PRODUCTO;
    }

    public void setID_PRODUCTO(int ID_PRODUCTO) {
        this.ID_PRODUCTO = ID_PRODUCTO;
    }

    public int getCANTIDAD() {
        return CANTIDAD;
    }

    public void setCANTIDAD(int CANTIDAD) {
        this.CANTIDAD = CANTIDAD;
    }

    public double getPRECIO_VENTA() {
        return PRECIO_VENTA;
    }

    public void setPRECIO_VENTA(double PRECIO_VENTA) {
        this.PRECIO_VENTA = PRECIO_VENTA;
    }

   
    
}