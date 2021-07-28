package MODELO;
public class EntidadUsuario {
    int ID_USUARIO;
    String NOMBRE;
    String APELLIDO_P;
    String APELLIDO_M;
    String EMAIL;
    String TELEFONO;
    String TIPO_ACCESO;
    String USUARIO;
    String PASSWORD;
    
    public EntidadUsuario(){
        
    }
    
    public EntidadUsuario(int ID_USUARIO,String NOMBRE,String APELLIDO_P,String APELLIDO_M,String EMAIL,String TELEFONO,String TIPO_ACCESO,String USUARIO,String PASSWORD){
        this.ID_USUARIO = ID_USUARIO;
        this.NOMBRE = NOMBRE;
        this.APELLIDO_P = APELLIDO_P;
        this.APELLIDO_M = APELLIDO_M;
        this.EMAIL = EMAIL;
        this.TELEFONO = TELEFONO;
        this.TIPO_ACCESO = TIPO_ACCESO;
        this.USUARIO = USUARIO;
        this.PASSWORD = PASSWORD;
    }

    public int getID_USUARIO() {
        return ID_USUARIO;
    }

    public void setID_USUARIO(int ID_USUARIO) {
        this.ID_USUARIO = ID_USUARIO;
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

    public String getTIPO_ACCESO() {
        return TIPO_ACCESO;
    }

    public void setTIPO_ACCESO(String TIPO_ACCESO) {
        this.TIPO_ACCESO = TIPO_ACCESO;
    }

    public String getUSUARIO() {
        return USUARIO;
    }

    public void setUSUARIO(String USUARIO) {
        this.USUARIO = USUARIO;
    }

    public String getPASSWORD() {
        return PASSWORD;
    }

    public void setPASSWORD(String PASSWORD) {
        this.PASSWORD = PASSWORD;
    }
    
}
