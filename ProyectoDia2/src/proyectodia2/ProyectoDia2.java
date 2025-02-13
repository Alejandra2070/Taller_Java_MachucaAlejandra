package proyectodia2;

import java.util.Scanner;
import java.util.ArrayList;

public class ProyectoDia2 {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Campers> listaCampers = new ArrayList<>();
        ArrayList<Trainers> listaTrainers = new ArrayList<>();
        ArrayList<Coordinadores> listaCoordi = new ArrayList<>();
        
        Campers camper1 = new Campers(1, "2024-08-15", 1, "luisC", "Luis", "Caicedo", "Calle 6 # 55C-42", "Pedro Caicedo", 324329337, 601568928, "Inscrito", "Bajo", "t1", "Desarrollo del proyecto Java");
        Trainers trainer1 = new Trainers(1, "Johlver", "Ruta NodeJS", "6am a 10am");
        Coordinadores coordi1 = new Coordinadores("Stiven", "Carvajal", "Coordinador");
        
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
            while(true){
                System.out.println("1. Revisar mi informacion");
                System.out.println("2. Actualizar mi informacion");
                System.out.println("3. Salir del programa"); //---------------------------------------------
                System.out.println("Elige una de nuestras opciones: ");

                int opc1 = scanner.nextInt();

                switch (opc1){
                    case 1:
                        System.out.println(camper1);
                        break;
                    case 2:
                        System.out.println("¿Que dato te gustaria actualizar?");
                        System.out.println("1. Nombre");
                        System.out.println("2. Apellido");
                        System.out.println("3. Direccion");
                        System.out.println("4. Numero de celular");
                        System.out.println("5. Numero fijo");
                        System.out.println("6. Actividad");
                        System.out.println("Elige una de nuestras opciones: ");
                        int opc5 = scanner.nextInt();

                        switch(opc5){
                            case 1:
                                System.out.println("Ingresa el nuevo nombre: ");
                                scanner.nextLine();
                                String nuevoN = scanner.nextLine();
                                camper1.setNom(nuevoN);
                                System.out.println("El nombre fue actualizado correctamente a: " + camper1.getNombre());
                                break;
                            case 2:
                                System.out.println("Ingresa el nuevo apellido: ");
                                scanner.nextLine();
                                String nuevoA = scanner.nextLine();
                                camper1.setApe(nuevoA);
                                System.out.println("El apellido fue actualizado correctamente a: " + camper1.getApe());
                                break;
                            case 3:
                                System.out.println("Ingresa la nueva direccion: ");
                                scanner.nextLine();
                                String nuevaD = scanner.nextLine();
                                camper1.setD(nuevaD);
                                System.out.println("La direccion fue actualizada correctamente a: " + camper1.getDirec());
                                break;
                            case 4:
                                System.out.println("Ingresa el nuevo numero de telefono: ");
                                int nuevoNumC = scanner.nextInt();
                                scanner.nextLine();
                                camper1.setNumC(nuevoNumC);
                                System.out.println("El numero de telefono fue actualizado correctamente a: " + camper1.getNumC());
                                break;
                            case 5:
                                System.out.println("Ingresa el nuevo numero fijo: ");
                                int nuevoNumF = scanner.nextInt();
                                scanner.nextLine();
                                camper1.setNumF(nuevoNumF);
                                System.out.println("El numero fijo fue actualizado correctamente a: " + camper1.getNumF());
                                break;
                            case 6:
                                System.out.println("Ingresa la nueva actividad: ");
                                scanner.nextLine();
                                String nuevaAct = scanner.nextLine();
                                camper1.setAct(nuevaAct);
                                System.out.println("La actividad fue actualizada correctamente a: " + camper1.getAct());
                                break;
                        }
                    case 3:
                        System.out.println("Hasta luego. :D");
                        break;
                }
            } 
        }
        else if (opc==2){
            while(true){
                System.out.println("-----Menu Trainers-----");
                System.out.println("1. Estado de los Campers");
                System.out.println("2. Ruta de los Trainers");
                System.out.println("3. Actualizar informacion de Trainer");
                System.out.println("4. Ver informacion de los Trainers");
                System.out.println("5. Salir del programa");//-------------------------------------------------------
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
                        System.out.println("¿Que te gustaria actualizar?: ");
                        System.out.println("1. Nombre");
                        System.out.println("Elige una de nuestras opciones: ");
                        int opc6 = scanner.nextInt();
                        scanner.nextLine();

                        if (opc6 == 1){
                            System.out.println("Ingresa el nuevo nombre: ");
                            String n = scanner.nextLine();
                            trainer1.getNam(n);
                            System.out.println("El nombre fue actualizado a: " + trainer1.newName());
                        }
                        break;
                        
                    case 4:
                        System.out.println("Esta es la informacion de los Trainers: ");
                        System.out.println(trainer1);
                        break;
                        
                    case 5: 
                        System.out.println("Gracias por utilizar nuestro programa. Vuelve pronto! :D");
                        break;
                }
            }
            
        }
        else if (opc==3){
            while(true){
                System.out.println("-----Menu Coordinador-----");
                System.out.println("1. Ver Campers");
                System.out.println("2. Registrar Campers");
                System.out.println("3. Actualizar datos del Camper");
                System.out.println("4. Eliminar Campers");
                System.out.println("5. Ver Trainers");
                System.out.println("6. Registrar Trainers");
                System.out.println("7. Actualizar informacion del Trainer");
                System.out.println("8. Eliminar Trainer");
                System.out.println("9. Ver Coordinadores");
                System.out.println("10. Registrar Coordinador");
                System.out.println("11. Actualizar informacion del Coordinador");
                System.out.println("12. Eliminar Coordinador");
                System.out.println("Elige una de nuestras opciones: ");
                int opc3 = scanner.nextInt();

                switch(opc3){

                    case 1:
                        System.out.println("Estos son los campers: ");
                        System.out.println(camper1);
                        System.out.println(listaCampers);
                        break;
                    case 2:
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
                        System.out.println(listaCampers);
                        break;

                    case 3:
                        System.out.println("¿Que dato te gustaria actualizar?");
                        System.out.println("1. Nombre");
                        System.out.println("2. Apellido");
                        System.out.println("3. Direccion");
                        System.out.println("4. Numero de celular");
                        System.out.println("5. Numero fijo");
                        System.out.println("6. Actividad");
                        System.out.println("Elige una de nuestras opciones: ");
                        int opc5 = scanner.nextInt();

                        switch(opc5){
                            case 1:
                                System.out.println("Ingresa el nuevo nombre: ");
                                scanner.nextLine();
                                String nuevoN = scanner.nextLine();
                                camper1.setNom(nuevoN);
                                System.out.println("El nombre fue actualizado correctamente a: " + camper1.getNombre());
                                break;
                            case 2:
                                System.out.println("Ingresa el nuevo apellido: ");
                                scanner.nextLine();
                                String nuevoA = scanner.nextLine();
                                camper1.setApe(nuevoA);
                                System.out.println("El apellido fue actualizado correctamente a: " + camper1.getApe());
                                break;
                            case 3:
                                System.out.println("Ingresa la nueva direccion: ");
                                scanner.nextLine();
                                String nuevaD = scanner.nextLine();
                                camper1.setD(nuevaD);
                                System.out.println("La direccion fue actualizada correctamente a: " + camper1.getDirec());
                                break;
                            case 4:
                                System.out.println("Ingresa el nuevo numero de telefono: ");
                                int nuevoNumC = scanner.nextInt();
                                scanner.nextLine();
                                camper1.setNumC(nuevoNumC);
                                System.out.println("El numero de telefono fue actualizado correctamente a: " + camper1.getNumC());
                                break;
                            case 5:
                                System.out.println("Ingresa el nuevo numero fijo: ");
                                int nuevoNumF = scanner.nextInt();
                                scanner.nextLine();
                                camper1.setNumF(nuevoNumF);
                                System.out.println("El numero fijo fue actualizado correctamente a: " + camper1.getNumF());
                                break;
                            case 6:
                                System.out.println("Ingresa la nueva actividad: ");
                                scanner.nextLine();
                                String nuevaAct = scanner.nextLine();
                                camper1.setAct(nuevaAct);
                                System.out.println("La actividad fue actualizada correctamente a: " + camper1.getAct());
                                break;
                        
                        }    
                    case 4:
                        System.out.println("¿Que camper quieres eliminar? Ingresa su nombre: ");
                        scanner.nextLine();
                        String delete = scanner.nextLine();
                        boolean elimina = false;
                        for (int i = 0; i < listaCampers.size(); i++){
                            if (listaCampers.get(i).nombre.equalsIgnoreCase(delete)){
                                listaCampers.remove(i);
                                elimina = true;
                                break;
                            }
                        }
                        break;
                    case 5:
                        System.out.println("Estos son los Trainers: ");
                        System.out.println(trainer1);
                        System.out.println(listaTrainers);
                        break;
                    case 6:
                        System.out.println("Ingresa los datos del nuevo Trainer: ");

                        System.out.println("Ingresa el id: ");
                        int idT = scanner.nextInt();
                        scanner.nextLine();

                        System.out.println("Ingresa el nombre: ");
                        String nombreT = scanner.nextLine();

                        System.out.println("Ingresa la ruta: ");
                        String rutaT = scanner.nextLine();

                        System.out.println("Ingresa el horario: ");
                        String horario = scanner.nextLine();

                        Trainers nuevoTrainer = new Trainers (idT, nombreT, rutaT, horario);

                        listaTrainers.add(nuevoTrainer);
                        
                        break;
                    case 7:
                        System.out.println("¿Que te gustaria actualizar?: ");
                        System.out.println("1. Nombre");
                        System.out.println("2. Ruta");
                        System.out.println("3. Horario");
                        int opc7 = scanner.nextInt();

                        if (opc7 == 1){
                            System.out.println("Ingresa el nuevo nombre: ");
                            scanner.nextLine();
                            String n = scanner.nextLine();
                            trainer1.getNam(n);
                            System.out.println("El nombre fue actualizado a: " + trainer1.newName());
                        }
                        else if (opc7 == 2){
                            System.out.println("Ingresa la nueva ruta: ");
                            String rut = scanner.nextLine();
                            trainer1.getRut(rut);
                            System.out.println("La nueva ruta fue actualizada a: " + trainer1.newRut());
                        }
                        else if (opc7 == 3){
                            System.out.println("Ingresa el nuevo horario: ");
                            String horarioT = scanner.nextLine();
                            trainer1.getHor(horarioT);
                            System.out.println("El horario fue actualizado a: " + trainer1.newHor());
                        }
                        break;
                    case 8:
                        System.out.println("¿Que trainer quieres eliminar? Ingresa su nombre: ");
                        scanner.nextLine();
                        String delete1 = scanner.nextLine();
                        boolean elimina1 = false;
                        for (int i = 0; i < listaTrainers.size(); i++){
                            if (listaTrainers.get(i).nombre.equalsIgnoreCase(delete1)){
                                listaTrainers.remove(i);
                                elimina1 = true;
                                break;
                            }
                        }
                        break;
                    case 9:
                        System.out.println("Estos son nuestros Coordinadores: ");
                        System.out.println(coordi1);
                        System.out.println(listaCoordi);
                        break;
                    case 10:
                        System.out.println("Ingresa los datos del nuevo Coordinador: ");

                        System.out.println("1. Ingresa el nombre: ");
                        scanner.nextLine();
                        String nombreC = scanner.nextLine();

                        System.out.println("2. Ingresa el apellido: ");
                        String apellidoC = scanner.nextLine();

                        System.out.println("3. Ingresa el cargo: ");
                        String coordiC = scanner.nextLine();

                        Coordinadores nuevoCoordi = new Coordinadores(nombreC, apellidoC, coordiC);

                        listaCoordi.add(nuevoCoordi);
                        break;
                    case 11:
                        System.out.println("¿Que quieres actualizar?: ");
                        System.out.println("1. Nombre");
                        System.out.println("2. Apellido");
                        System.out.println("3. Cargo");

                        int opc8 = scanner.nextInt();

                        if (opc8 == 1){
                            System.out.println("Ingresa el nuevo nombre: ");
                            scanner.nextLine();
                            String nombreCo = scanner.nextLine(); 
                            coordi1.setNom(nombreCo);
                            System.out.println("El nombre fue actualizado a: " + coordi1.getNom());
                        }
                        else if (opc8 == 2){
                            System.out.println("Ingresa el nuevo apellido: ");
                            scanner.nextLine();
                            String apeCo = scanner.nextLine();
                            coordi1.setApe(apeCo);
                            System.out.println("El apellido fue actualizado a: " + coordi1.getApe());
                        }
                        else if (opc8 == 3){
                            System.out.println("Ingresa el nuevo cargo: ");
                            scanner.nextLine();
                            String carCo = scanner.nextLine();
                            coordi1.setCar(carCo);
                            System.out.println("El cargo fue actualizado a: " + coordi1.getCar());
                        }
                        break;
                    case 12: 
                        System.out.println("¿Que coordinador quieres eliminar? Ingresa su nombre: ");
                        scanner.nextLine();
                        String delete2 = scanner.nextLine();
                        boolean elimina2 = false;
                        for (int i = 0; i < listaCoordi.size(); i++){
                            if (listaCoordi.get(i).nombre.equalsIgnoreCase(delete2)){
                                listaCoordi.remove(i);
                                elimina2 = true;
                                break;
                            }
                        }
                        break;
                } 
            }
        }
    }
}