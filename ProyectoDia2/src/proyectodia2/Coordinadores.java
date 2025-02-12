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

    @Override
    public String toString() {
        return "Coordinadores{" + "nombre=" + nombre + ", apellido=" + apellido + ", cargo=" + cargo + '}';
    }
    
    
}
