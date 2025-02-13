package proyectonotasvibrantes;

public class Ticket {
    int id;
    int id_cliente;
    int id_concierto;
    String zona;
    long precioFinal;
    String fechaCompra;

    public Ticket(int id, int id_cliente, int id_concierto, String zona, long precioFinal, String fechaCompra) {
        this.id = id;
        this.id_cliente = id_cliente;
        this.id_concierto = id_concierto;
        this.zona = zona;
        this.precioFinal = precioFinal;
        this.fechaCompra = fechaCompra;
    }

    @Override
    public String toString() {
        return "Ticket{" + "id=" + id + ", id_cliente=" + id_cliente + ", id_concierto=" + id_concierto + ", zona=" + zona + ", precioFinal=" + precioFinal + ", fechaCompra=" + fechaCompra + '}';
    }
}
