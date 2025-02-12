package proyectodia2;

public class Reportes {
    int id;
    String nombre;
    String apellido;
    String estado;

    public Reportes(int id, String nombre, String apellido, String estado) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "Reportes{" + "id=" + id + ", nombre=" + nombre + ", apellido=" + apellido + ", estado=" + estado + '}';
    }
}
