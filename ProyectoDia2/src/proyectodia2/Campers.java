package proyectodia2;

public class Campers {
    int id;
    String fecha;
    int usuario;
    String contrasena;
    String nombre;
    String apellido;
    String direccion;
    String acudiente;
    int numero_celular;
    int numero_fijo;
    String estado;
    String riesgo;
    String grupo;
    String actividad1;

    public Campers(int id, String fecha, int usuario, String contrasena, String nombre, String apellido, String direccion, String acudiente, int numero_celular, int numero_fijo, String estado, String riesgo, String grupo, String actividad1) {
        this.id = id;
        this.fecha = fecha;
        this.usuario = usuario;
        this.contrasena = contrasena;
        this.nombre = nombre;
        this.apellido = apellido;
        this.direccion = direccion;
        this.acudiente = acudiente;
        this.numero_celular = numero_celular;
        this.numero_fijo = numero_fijo;
        this.estado = estado;
        this.riesgo = riesgo;
        this.grupo = grupo;
        this.actividad1 = actividad1;
    }
    
    public Campers(){}
    
    public int getUser(){
        return usuario;
    }
    
    public void setU(int usuario){
        this.usuario = usuario;
    }
    
    public String getPass(){
        return contrasena;
    }
    
    public String getNombre(){
        return nombre;
    }
    
    public String getApe(){
        return apellido;
    }
    
    public String getDirec(){
        return direccion;
    }
    
    public int getNumC(){
        return numero_celular;
    }
    
    public int getNumF(){
        return numero_fijo;
    }
    
    public String getEst(){
        return estado;
    }
    
    public String getRies(){
        return riesgo;
    }
    
    public String getAct(){
        return actividad1;
    }
    
    
    
    public void setC(String contrasena){
        this.contrasena = contrasena;
    }
    
    public void setNom(String nombre){
        this.nombre = nombre;
    }
    
    public void setApe(String apellido){
        this.apellido = apellido;
    }
    
    public void setD(String direccion){
        this.direccion = direccion;
    }
    
    public void setNumC(int numero_celular){
        this.numero_celular = numero_celular;
    }
    
    public void setNumF(int numero_fijo){
        this.numero_fijo = numero_fijo;
    }
    
    public void setEst(String estado){
        this.estado = estado; 
    }
    
    public void setRiesgo(String riesgo){
        this.riesgo = riesgo; 
    }
    
    public void setGrupo(String grupo){
        this.grupo = grupo; 
    }
    
    public void setAct(String actividad1){
        this.actividad1 = actividad1; 
    }
    
    @Override
    public String toString() {
        return "Campers{" + 
                "id=" + id +
                ", fecha=" + fecha + '\'' +
                ", usuario=" + usuario + 
                ", contrasena=" + contrasena + '\'' +
                ", nombre=" + nombre + '\'' +
                ", apellido=" + apellido + '\'' +
                ", direccion=" + direccion + '\'' +
                ", acudiente=" + acudiente + '\'' +
                ", numero_celular=" + numero_celular + 
                ", numero_fijo=" + numero_fijo + 
                ", estado=" + estado + '\'' +
                ", riesgo=" + riesgo + '\'' +
                ", grupo=" + grupo + '\'' +
                ", actividad1=" + actividad1 + '\'' +
                '}';
    }
} 