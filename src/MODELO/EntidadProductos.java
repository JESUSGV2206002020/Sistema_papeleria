package MODELO;


public class EntidadProductos {
    int ID_PRODUCTO;
    String NOMBRE_PRODUCTO;
    double PRECIO_PRODUCTO;
    int EXISTENCIAS_PRODUCTO;
    
    public EntidadProductos() {
    }
    
    public EntidadProductos(int ID_PRODUCTO,String NOMBRE_PRODUCTO,double PRECIO_PRODUCTO,int EXISTENCIAS_PRODUCTO){
    this.ID_PRODUCTO = ID_PRODUCTO;
       this.NOMBRE_PRODUCTO = NOMBRE_PRODUCTO;
       this.PRECIO_PRODUCTO = PRECIO_PRODUCTO;
       this.EXISTENCIAS_PRODUCTO = EXISTENCIAS_PRODUCTO;
    }

    public int getID_PRODUCTO() {
        return ID_PRODUCTO;
    }

    public void setID_PRODUCTO(int ID_PRODUCTO) {
        this.ID_PRODUCTO = ID_PRODUCTO;
    }

    public String getNOMBRE_PRODUCTO() {
        return NOMBRE_PRODUCTO;
    }

    public void setNOMBRE_PRODUCTO(String NOMBRE_PRODUCTO) {
        this.NOMBRE_PRODUCTO = NOMBRE_PRODUCTO;
    }

    public double getPRECIO_PRODUCTO() {
        return PRECIO_PRODUCTO;
    }

    public void setPRECIO_PRODUCTO(double PRECIO_PRODUCTO) {
        this.PRECIO_PRODUCTO = PRECIO_PRODUCTO;
    }

    public int getEXISTENCIAS_PRODUCTO() {
        return EXISTENCIAS_PRODUCTO;
    }

    public void setEXISTENCIAS_PRODUCTO(int EXISTENCIAS_PRODUCTO) {
        this.EXISTENCIAS_PRODUCTO = EXISTENCIAS_PRODUCTO;
    }
    
}
