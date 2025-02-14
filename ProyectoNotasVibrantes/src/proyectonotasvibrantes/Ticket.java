package proyectonotasvibrantes;

import java.time.LocalDate;

public class Ticket {
    static int contTicket=0;
    int id;
    int id_cliente;
    int id_concierto;
    int zona;
    long precioFinal;
    LocalDate fechaCompra;

    public Ticket(int id_cliente, int id_concierto, int zona, int precioF, int precioA) {
        contTicket=contTicket+1;
        this.id = contTicket;
        this.id_cliente = id_cliente;
        this.id_concierto = id_concierto;
        this.zona = zona;
        this.precioFinal = precioF + precioA;
        this.fechaCompra = LocalDate.now();
    }

    @Override
    public String toString() {
        return "Ticket{" + "id=" + id + ", id_cliente=" + id_cliente + ", id_concierto=" + id_concierto + ", zona=" + zona + ", precioFinal=" + precioFinal + ", fechaCompra=" + fechaCompra + '}';
    }
}
