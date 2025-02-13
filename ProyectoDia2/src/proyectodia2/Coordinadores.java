package proyectodia2;
public class Coordinadores {
    String nombre;
    String apellido;
    String cargo;

    public Coordinadores(String nombre, String apellido, String cargo) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.cargo = cargo;
    }
    
    public String getNom(){
        return nombre;
    }
    
    public String getApe(){
        return apellido;
    }
    
    public String getCar(){
        return cargo;
    }
    
    public void setNom(String nombre){
        this.nombre = nombre;
    }
    
    public void setApe(String apellido){
        this.apellido = apellido;
    }
    
    public void setCar(String cargo){
        this.cargo = cargo;
    }

    @Override
    public String toString() {
        return "Coordinadores{" + "nombre=" + nombre + ", apellido=" + apellido + ", cargo=" + cargo + '}';
    }
    
    
}
