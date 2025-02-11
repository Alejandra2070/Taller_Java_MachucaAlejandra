package tienda;

import java.util.Scanner;
import java.util.ArrayList;
/**
 *
 * @author Usuario
 */
public class Tienda {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> nombreProductos = new ArrayList<String>();
        
        nombreProductos.add("Lili Pink");
        nombreProductos.add("Carolina Herrera");
        nombreProductos.add("Versace");
        nombreProductos.add("Rabanne");
        
        System.out.println("Bienvenido al menu de nuestra tienda de perfumes");
        while (true) {
            System.out.println("---------------------------------------------------------");
            System.out.println("1. Agregar perfumes");
            System.out.println("2. Mostrar inventario de perfumes");
            System.out.println("3. Actualizar informacion del perfume");
            System.out.println("4. Eliminar un perfume");
            System.out.println("5. Salir del programa");
            System.out.println("Elige una de nuestras opciones: ");
            int opc = scanner.nextInt();

            if (opc == 1){
                System.out.println("Ingresa el nombre del perfume: ");
                scanner.nextLine();
                String nombre = scanner.nextLine();
                nombreProductos.add(nombre);
                /*System.out.println("Ingresa la marca del perfume: ");
                String marca = scanner.nextLine();
                System.out.println("Ingresa el precio del perfume: ");
                int precio = scanner.nextInt();
                System.out.println("Ingresa la cantidad de perfumes: ");
                int cantidad = scanner.nextInt();*/
            }
            else if (opc == 2){
                System.out.println("Estos son nuestros perfumes: ");
                for (int i=0;i<nombreProductos.size();i++) {
                    System.out.println(nombreProductos.get(i));
                }
            }
            else if (opc == 3){
                System.out.println("Ingresa el indice del perfume que deseas actualizar: ");
                int indice = scanner.nextInt();
                scanner.nextLine();
                System.out.println("Ingresa el nuevo nombre del perfume: ");
                String name = scanner.nextLine();
                nombreProductos.set(indice, name);
            }
            else if (opc == 4){
                System.out.println("Ingresa el indice del perfume que deseas eliminar: ");
                int ind = scanner.nextInt();
                nombreProductos.remove(ind);
            }
            else {
                System.out.println("Gracias por usar nuestro programa. Vuelve pronto. :D");
                break;
            }
        }
    }
}