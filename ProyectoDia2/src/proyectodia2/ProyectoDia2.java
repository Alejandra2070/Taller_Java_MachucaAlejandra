package proyectodia2;

import java.util.Scanner;
import java.util.ArrayList;

public class ProyectoDia2 {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Campers> listaCampers = new ArrayList<>();
        
        Campers camper1 = new Campers(1, "2024-08-15", 1, "luisC", "Luis", "Caicedo", "Calle 6 # 55C-42", "Pedro Caicedo", 324329337, 601568928, "Inscrito", "Bajo", "t1", "Desarrollo del proyecto Java");
        Trainers trainer1 = new Trainers(1, "Johlver", "Ruta NodeJS", "6am a 10am");
        Reportes reporte1 = new Reportes(1, "Anne", "Ortega", "Inscrito");
        
        System.out.println("Bienvenido!! :D");
        System.out.println("----------Menu----------");
        System.out.println("1. Campers");
        System.out.println("2. Trainers");
        System.out.println("3. Coordinador");
        System.out.println("4. Salir");
        System.out.println("Elige una de nuestras opciones: ");
        
        int opc = scanner.nextInt();
        
        if (opc == 1){
            System.out.println("----Menu Campers----");
            System.out.println("1. Revisar mi informacion");
            System.out.println("2. Actividades realizadas");
            System.out.println("3. Salir del programa");
            System.out.println("Elige una de nuestras opciones: ");
            
            int opc1 = scanner.nextInt();
            
            switch (opc1){
                case 1:
                    System.out.println(camper1);
                    break;
                case 2:
                    System.out.println("Describe la actividad que realizaste: ");
                    scanner.nextLine();
                    String act = scanner.nextLine();
                    camper1.setAct(act);
                    break;
                default:
                    System.out.println("Gracias por usar nuestro programa. Vuelve pronto! :D");
                    break;
            }
        }
        else if (opc==2){
            System.out.println("-----Menu Trainers-----");
            System.out.println("1. Estado de los Campers");
            System.out.println("2. Ruta de los Trainers");
            System.out.println("3. Reporte de Campers");
            System.out.println("4. Salir del programa");
            System.out.println("Elige una de nuestras opciones: ");
            
            int opc2 = scanner.nextInt();
            
            switch(opc2){
                
                case 1:
                    System.out.println("Este es el estado de los Campers: ");
                    System.out.println("Nombre Estudiante: " + camper1.getNombre()+ " " + camper1.getApe());
                    System.out.println("Estado: " + camper1.getEst());
                    break;
                    
                case 2:
                    System.out.println("Esta es la ruta de los trainers: ");
                    System.out.println("Nombre Trainer: " + trainer1.newName());
                    System.out.println(trainer1.newRut());
                    break;
                
                case 3:
                    System.out.println("Estos son los reportes de los campers: ");
                    System.out.println(reporte1);
                    break;
                 
                case 4:
                    System.out.println("Gracias por utilizar nuestro programa. Vuelve pronto! :D");
                    break;
                    
            }
        }
        else if (opc==3){
            System.out.println("-----Menu Coordinador-----");
            System.out.println("1. Registrar Campers");
            System.out.println("2. Actualizar datos del Camper");
            System.out.println("3. Ver los campers inscritos");
            System.out.println("Elige una de nuestras opciones: ");
            int opc3 = scanner.nextInt();
            
            switch(opc3){
                
                case 1:
                    System.out.println("Ingresa los datos del nuevo camper: ");
                    
                    System.out.println("Id: ");
                    int id = scanner.nextInt();
                    scanner.nextLine();
                    
                    System.out.println("Fecha: ");
                    String fecha = scanner.nextLine();
                    
                    System.out.println("Usuario: ");
                    int usuario = scanner.nextInt();
                    scanner.nextLine();
                    
                    System.out.println("Contrasena: ");
                    String contrasena = scanner.nextLine();
                    
                    System.out.println("Nombre: ");
                    String nombre = scanner.nextLine();
                    
                    System.out.println("Apellido: ");
                    String apellido = scanner.nextLine();
                    
                    System.out.println("Direccion: ");
                    String direccion = scanner.nextLine();
                    
                    System.out.println("Acudiente: ");
                    String acudiente = scanner.nextLine();
                    
                    System.out.println("Numero de telefono: ");
                    int numero_celular = scanner.nextInt();
                    scanner.nextLine();
                    
                    System.out.println("Numero fijo: ");
                    int numero_fijo = scanner.nextInt();
                    scanner.nextLine();
                    
                    System.out.println("Estado: ");
                    String estado = scanner.nextLine();
                    
                    System.out.println("Riesgo: ");
                    String riesgo = scanner.nextLine();
                    
                    System.out.println("Grupo: ");
                    String grupo = scanner.nextLine();
                    
                    System.out.println("Actividad: ");
                    String actividad = scanner.nextLine();
                    
                    Campers nuevoCamper = new Campers(id, fecha, usuario, contrasena, nombre, apellido, direccion, acudiente, numero_celular, numero_fijo, estado, riesgo, grupo, actividad);
                    
                    listaCampers.add(nuevoCamper);
                    break;
                    
                case 2:
                    System.out.println("¿Que dato deseas actualizar?");
                    System.out.println("1. Usuario");
                    System.out.println("2. Contrasena");
                    System.out.println("3. Nombre");
                    System.out.println("4. Apellido");
                    System.out.println("5. Direccion");
                    System.out.println("6. Numero de celular");
                    System.out.println("7. Numero fijo");
                    System.out.println("8. Estado");
                    System.out.println("9. Riesgo");
                    System.out.println("10. Actividad");
                    System.out.println("Elige una de nuestras opciones: ");
                    int opc4 = scanner.nextInt();
                    
                    switch(opc4){
                        case 1:
                            System.out.println("Ingresa el nuevo usuario: ");
                            int nuevoU = scanner.nextInt();
                            scanner.nextLine();
                            camper1.setU(nuevoU);
                            System.out.println("El usuario fue actualizado a: " + camper1.getNombre());
                            break;
                        case 2:
                            System.out.println("Ingresa la nueva contrasena: ");
                            String nuevaC = scanner.nextLine();
                            camper1.setC(nuevaC);
                            System.out.println("La constrasena fue actualizada a: " + camper1.getPass());
                            break;
                        case 3:
                            System.out.println("Ingresa el nuevo nombre: ");
                            String nuevoN = scanner.nextLine();
                            camper1.setNom(nuevoN);
                            System.out.println("El nombre fue actualizado a: " + camper1.getNombre());
                            break;
                        case 4:
                            System.out.println("Ingresa el nuevo apellido: ");
                            String nuevoA = scanner.nextLine();
                            camper1.setApe(nuevoA);
                            System.out.println("El apellido fue actualizado a: " + camper1.getApe());
                            break;
                        case 5:
                            System.out.println("Ingresa la nueva direccion: ");
                            String nuevaD = scanner.nextLine();
                            camper1.setD(nuevaD);
                            System.out.println("La direccion fue actualizada a: " + camper1.getDirec());
                            break;
                        case 6:
                            System.out.println("Ingresa el nuevo numero de telefono: ");
                            int nuevoNumC = scanner.nextInt();
                            scanner.nextLine();
                            camper1.setNumC(nuevoNumC);
                            System.out.println("El numero de telefono fue actualizado a: " + camper1.getNumC());
                            break;
                        case 7:
                            System.out.println("Ingresa el nuevo numero fijo: ");
                            int nuevoNumF = scanner.nextInt();
                            scanner.nextLine();
                            camper1.setNumF(nuevoNumF);
                            System.out.println("El usuario fue actualizado a: " + camper1.getNumF());
                            break;
                        case 8:
                            System.out.println("Ingresa el nuevo estado: ");
                            String nuevoE = scanner.nextLine();
                            camper1.setEst(nuevoE);
                            System.out.println("El estado fue actualizado a: " + camper1.getEst());
                            break;
                        case 9:
                            System.out.println("Ingresa el nuevo riesgo: ");
                            String nuevoR = scanner.nextLine();
                            camper1.setRiesgo(nuevoR);
                            System.out.println("El riesgo fue actualizado a: " + camper1.getRies());
                            break;
                        case 10:
                            System.out.println("Ingresa la nueva actividad: ");
                            String nuevaAct = scanner.nextLine();
                            camper1.setAct(nuevaAct);
                            System.out.println("La actividad fue actualizada a: " + camper1.getAct());
                            break;
                    }
                    
                case 3:
                    for (int i=0;i<listaCampers.size();i++) {
                    System.out.println(listaCampers.get(i));
                }
            }
        }
    } 
}
