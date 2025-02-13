package proyectonotasvibrantes;

public class Zona {
    int id;
    String nombreZona;
    int capacidad;
    long precioAdicional;

    public Zona(int id, String nombreZona, int capacidad, long precioAdicional) {
        this.id = id;
        this.nombreZona = nombreZona;
        this.capacidad = capacidad;
        this.precioAdicional = precioAdicional;
    }

    @Override
    public String toString() {
        return "Zona{" + "id=" + id + ", nombreZona=" + nombreZona + ", capacidad=" + capacidad + ", precioAdicional=" + precioAdicional + '}';
    }
}
