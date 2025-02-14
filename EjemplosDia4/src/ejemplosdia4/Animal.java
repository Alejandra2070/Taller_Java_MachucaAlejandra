/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejemplosdia4;

public class Animal {
    
    //Debe ser privado para que funcione como encapsulamiento
    
    private String nombre; 
    private String alimento;
    
    //Polimorfismo
    //Es la capacidad de un objeto para adquirir múltiples formas o comportamientos.
    
    public Animal(){}

    public Animal(String nombre, String alimento) {
        this.nombre = nombre;
        this.alimento = alimento;
    }

    @Override
    public String toString() {
        return "Animal{" + "nombre=" + nombre + ", alimento=" + alimento + '}';
    }
    
    //para visualizar lo que está en privado se utilizan los getters y setters
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getAlimento() {
        return alimento;
    }

    public void setAlimento(String alimento) {
        this.alimento = alimento;
    }
}

