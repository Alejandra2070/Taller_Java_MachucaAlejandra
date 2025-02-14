package proyectonotasvibrantes;

import java.util.Scanner;
import java.util.ArrayList;

public class ProyectoNotasVibrantes {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Concierto> listaConcierto = new ArrayList<>();
        ArrayList<Cliente> listaCliente = new ArrayList<>();
        ArrayList<Zona> listaZona = new ArrayList<>();
        ArrayList<Ticket> listaTicket = new ArrayList<>();
        
        Concierto concierto1 = new Concierto(1, "Cumbia House", "Señor Loop", "13/02/2025", "Bogota", 206000);
        Concierto concierto2 = new Concierto(2, "Las mujeres ya no lloran", "Shakira", "20/02/2025", "Barranquilla", 840000);
        Concierto concierto3 = new Concierto(3, "Tropicalia Tour", "Fonseca", "24/04/2025", "Medellin", 506000);
        
        listaConcierto.add(concierto1);
        listaConcierto.add(concierto2);
        listaConcierto.add(concierto3);
        
        Cliente cliente1 = new Cliente(1, "Alejandra", "Machuca", "am3793825@gmail.com", 313467408);
        listaCliente.add(cliente1);
        
        Zona zona1 = new Zona(1, "Corazon de Bogota", 500, 100000);
        listaZona.add(zona1);
        
        Ticket ticket1 = new Ticket( 1, 1, 1, 1, 500000);
        listaTicket.add(ticket1);
        
        System.out.println("*******************************************");
        System.out.println(" ✨✨✨ Bienvenidos a Notas Vibrantes ✨✨✨ ");
        System.out.println("*******************************************");
        System.out.println("                   Menu               ");
        
        boolean salir = false;
        
        while (salir == false){
            System.out.println("*******************************************");
            System.out.println("1. Ver conciertos disponibles");
            System.out.println("2. Registrar cliente");
            System.out.println("3. Comprar ticket");
            System.out.println("4. Ver tickets por cliente");
            System.out.println("5. Cancelar ticket");
            System.out.println("6. Salir del programa");
            System.out.println("*******************************************");
            System.out.println("Elige una de nuestras opciones: ");

            int opc = scanner.nextInt();

            switch(opc){
                
                case 1:
                    
                    System.out.println("*******************************************");
                    System.out.println("Los conciertos disponibles son: ");
                    System.out.println("*******************************************");
                    for (int i = 0; i < listaConcierto.size(); i++){
                        System.out.println("Id: " + listaConcierto.get(i).id);
                        System.out.println("Nombre: " + listaConcierto.get(i).nombre);
                        System.out.println("Artista: " + listaConcierto.get(i).artista);
                        System.out.println("Fecha: " + listaConcierto.get(i).fecha);
                        System.out.println("Lugar: " + listaConcierto.get(i).lugar);
                        System.out.println("Precio Base: " + listaConcierto.get(i).precioBase);
                        System.out.println("*******************************************");
                    }
                    break;
                    
                case 2:
                    
                    System.out.println("Ingresa los datos del nuevo cliente: ");
                    System.out.println("1. Id: ");
                    int id =  scanner.nextInt();
                    System.out.println("2. Nombre: ");
                    scanner.nextLine();
                    String nombre = scanner.nextLine();
                    System.out.println("3. Apellido: ");
                    String ape = scanner.nextLine();
                    System.out.println("4. Correo: ");
                    String correo = scanner.nextLine();
                    System.out.println("5. Telefono: ");
                    int tel = scanner.nextInt();
                    
                    Cliente nuevoCli = new Cliente(id, nombre, ape, correo, tel);
                    
                    listaCliente.add(nuevoCli);
                    
                    System.out.println("*******************************************");
                    System.out.println("El cliente se registró correctamente: ");
                    System.out.println("Id: " + id);
                    System.out.println("Nombre: " + nombre);
                    System.out.println("Apellido: " + ape);
                    System.out.println("Correo: " + correo);
                    System.out.println("Telefono: " + tel);
                    
                    break;
                    
                case 3:
                    
                    System.out.println("*******************************************");
                    System.out.println("Clientes: ");
                    for (int i = 0; i < listaCliente.size(); i++){
                        System.out.println("Id: " + listaCliente.get(i).id);
                        System.out.println("Nombre: " + listaCliente.get(i).nombre);
                        System.out.println("Apellido: " + listaCliente.get(i).apellido);
                        System.out.println("Correo: " + listaCliente.get(i).correo);
                        System.out.println("Telefono: " + listaCliente.get(i).telefono);
                        System.out.println("*******************************************");
                    }
                    System.out.println("Si haces parte de nuestros clientes elige tu id. (Si no es asi por favor registrate primero): ");
                    int idCli = scanner.nextInt();
                    
                    System.out.println("*******************************************");
                    System.out.println("Estos son nuestros conciertos: ");
                    System.out.println("*******************************************");
                    for (int i = 0; i < listaConcierto.size(); i++){
                        System.out.println("Id: " + listaConcierto.get(i).id);
                        System.out.println("Nombre: " + listaConcierto.get(i).nombre);
                        System.out.println("Artista: " + listaConcierto.get(i).artista);
                        System.out.println("Fecha: " + listaConcierto.get(i).fecha);
                        System.out.println("Lugar: " + listaConcierto.get(i).lugar);
                        System.out.println("Precio Base: " + listaConcierto.get(i).precioBase);
                        System.out.println("*******************************************");
                    }
                    System.out.println("Elige el id del concierto para generar tu ticket: ");
                    int idC = scanner.nextInt();
                    
                    System.out.println("*******************************************");
                    System.out.println("Estas son las zonas: ");
                    System.out.println("*******************************************");
                    for (int i = 0; i < listaZona.size(); i++){
                        System.out.println("Id: " + listaZona.get(i).id);
                        System.out.println("Nombre de la Zona: " + listaZona.get(i).nombreZona);
                        System.out.println("Capacidad: " + listaZona.get(i).capacidad);
                        System.out.println("Precio adicional: " + listaZona.get(i).precioAdicional);
                        System.out.println("*******************************************");
                    }
                    System.out.println("Elige el id de una de nuestras zonas: ");
                    scanner.nextLine();
                    int idZ = scanner.nextInt();
                    
                    int precioF = 0;
                    for(int i = 0; i<listaConcierto.size(); i++){
                        if(listaConcierto.get(i).id==idC){
                            precioF=listaConcierto.get(i).precioBase;
                        }
                    }
                    
                    int precioA = 0;
                    for(int i = 0; i < listaZona.size(); i++){
                        if(listaZona.get(i).id == idZ){
                            precioA=listaZona.get(i).precioAdicional;
                        }
                    }
                    
                    Ticket nuevoTicket = new Ticket(idCli, idC, idZ, precioF, precioA);
                    listaTicket.add(nuevoTicket);
                    
                    System.out.println("*******************************************");
                    System.out.println("Tu ticket es: ");
                    System.out.println("*******************************************");
                    System.out.println("Id: " + nuevoTicket.id);
                    System.out.println("Id de Cliente: " + nuevoTicket.id_cliente);
                    System.out.println("Id del concierto: " + nuevoTicket.id_concierto);
                    System.out.println("Id de la Zona: " + nuevoTicket.zona);
                    System.out.println("Precio final: " + nuevoTicket.precioFinal);
                    System.out.println("Fecha de la compra: " + nuevoTicket.fechaCompra);
                    break;
                    
                case 4:
                    
                    System.out.println("Ingresa tu id de Cliente para ver tu ticket: ");
                    int idCliente = scanner.nextInt();
                    
                    boolean ticketE = false;
                    
                    for(int i = 0; i < listaTicket.size(); i++){
                        if(listaTicket.get(i).id == idCliente){
                            System.out.println("*******************************************");
                            System.out.println("Id: " + listaTicket.get(i).id);
                            System.out.println("Id del cliente: " + listaTicket.get(i).id_cliente);
                            System.out.println("Id del concierto: " + listaTicket.get(i).id_concierto);
                            System.out.println("Zona: " + listaTicket.get(i).zona);
                            System.out.println("Precio final: " + listaTicket.get(i).precioFinal);
                            System.out.println("Fecha de la compra: " + listaTicket.get(i).fechaCompra);
                            ticketE = true;
                            break;
                        }
                    }
                    if(!ticketE) {
                        System.out.println("*******************************************");
                        System.out.println("No tienes tickets disponibles.");
                    }
                    break;
                    
                case 5:
                    
                    System.out.println("Ingresa el id del ticket que quieres cancelar: ");
                    int idTick = scanner.nextInt();
                    for(int i = 0; i < listaTicket.size(); i++){
                        if (listaTicket.get(i).id==(idTick)){
                            listaTicket.remove(i); 
                        }
                    }
                    break;
                    
                case 6:
                    
                    System.out.println("Gracias por utilizar nuestro programa. Vuelve pronto! :D");
                    salir = true;
                    break;
            }
        }  
    }  
}