package proyectonotasvibrantes;

import java.util.Scanner;
import java.util.ArrayList;

public class ProyectoNotasVibrantes {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Concierto> listaConcierto = new ArrayList<>();
        
        Concierto concierto1 = new Concierto(1, "Cumbia House", "Señor Loop", "13/02/2025", "Bogota", 206.000);
        Concierto concierto2 = new Concierto(2, "Las mujeres ya no lloran", "Shakira", "20/02/2025", "Barranquilla", 840.000);
        Concierto concierto3 = new Concierto(3, "Tropicalia Tour", "Fonseca", "24/04/2025", "Medellin", 506.000);
        
        listaConcierto.add(concierto1);
        listaConcierto.add(concierto2);
        listaConcierto.add(concierto3);
        
        System.out.println("--------------------------------");
        System.out.println("Bienvenidos a Notas Brivantes");
        System.out.println("--------------Menu--------------");
        System.out.println("1. Ver conciertos disponibles");
        System.out.println("2. Registrar cliente");
        System.out.println("3. Comprar ticket");
        System.out.println("4. Ver tickets por cliente");
        System.out.println("5. Cancelar ticket");
        System.out.println("6. Salir del programa");
        System.out.println("--------------------------------");
        
        int opc = scanner.nextInt();
        
        switch(opc){
            case 1:
                System.out.println("Los conciertos disponibles son: ");
                for (int i = 0; i < listaConcierto.size(); i++){
                    System.out.println(listaConcierto.get(i).id);
                }
                break;
        }
    }
    
}
