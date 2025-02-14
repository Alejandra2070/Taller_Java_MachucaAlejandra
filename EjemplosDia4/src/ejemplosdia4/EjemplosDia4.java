package ejemplosdia4;

public class EjemplosDia4 {

    public static void main(String[] args) {
        
        //Encapsulamiento
        //Permite ocultar la complejidad interna de una clase, 
        //proporcionando una interfaz controlada para interactuar con los objetos de esa clase. 
        
        Animal animalito1 = new Animal("Gatito", "Carne");
        Animal animalito2 = new Animal();
        
        animalito2.setNombre("Lorito");
        
        System.out.println(animalito1.getNombre());
        
        animalito1.setNombre("Perrito");
        System.out.println(animalito1.getNombre());
        
        System.out.println(animalito1);
        System.out.println(animalito2);
    }
    
}
