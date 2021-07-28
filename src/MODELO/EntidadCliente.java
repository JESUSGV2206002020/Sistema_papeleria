package MODELO;

public class EntidadCliente {
    int ID_CLIENTE;
    String CODIGO_CLIENTE;
    String NOMBRE;
    String APELLIDO_P;
    String APELLIDO_M;
    String EMAIL;
    String TELEFONO;
    
    public EntidadCliente(){
        
    }
    
    public EntidadCliente(int ID_CLIENTE,String CODIGO_CLIENTE,String NOMBRE,String APELLIDO_P,String APELLIDO_M,String EMAIL,String TELEFONO){
        this.ID_CLIENTE = ID_CLIENTE;
        this.CODIGO_CLIENTE = CODIGO_CLIENTE;
        this.NOMBRE = NOMBRE;
        this.APELLIDO_P = APELLIDO_P;
        this.APELLIDO_M = APELLIDO_M;
        this.EMAIL = EMAIL;
        this.TELEFONO = TELEFONO;
    }

    public int getID_CLIENTE() {
        return ID_CLIENTE;
    }

    public void setID_CLIENTE(int ID_CLIENTE) {
        this.ID_CLIENTE = ID_CLIENTE;
    }
    
    public String getCODIGO_CLIENTE() {
        return CODIGO_CLIENTE;
    }

    public void setCODIGO_CLIENTE(String CODIGO_CLIENTE) {
        this.CODIGO_CLIENTE = CODIGO_CLIENTE;
    }

    public String getNOMBRE() {
        return NOMBRE;
    }

    public void setNOMBRE(String NOMBRE) {
        this.NOMBRE = NOMBRE;
    }

    public String getAPELLIDO_P() {
        return APELLIDO_P;
    }

    public void setAPELLIDO_P(String APELLIDO_P) {
        this.APELLIDO_P = APELLIDO_P;
    }

    public String getAPELLIDO_M() {
        return APELLIDO_M;
    }

    public void setAPELLIDO_M(String APELLIDO_M) {
        this.APELLIDO_M = APELLIDO_M;
    }

    public String getEMAIL() {
        return EMAIL;
    }

    public void setEMAIL(String EMAIL) {
        this.EMAIL = EMAIL;
    }

    public String getTELEFONO() {
        return TELEFONO;
    }

    public void setTELEFONO(String TELEFONO) {
        this.TELEFONO = TELEFONO;
    }
    
}
