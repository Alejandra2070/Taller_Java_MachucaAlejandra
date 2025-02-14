package proyectonotasvibrantes;

public class Cliente {
    int id;
    String nombre;
    String apellido;
    String correo;
    long telefono;

    public Cliente(int id, String nombre, String apellido, String correo, long telefono) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.correo = correo;
        this.telefono = telefono;
    }

    @Override
    public String toString() {
        return "Cliente{" + "id=" + id + ", nombre=" + nombre + ", apellido=" + apellido + ", correo=" + correo + ", telefono=" + telefono + '}';
    } 
}
