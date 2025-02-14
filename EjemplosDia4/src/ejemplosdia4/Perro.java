package ejemplosdia4;

// Herencia
//Permite definir nuevas clases basadas en clases previamente existentes

public class Perro extends Animal{
    private String raza;

    public Perro(String raza, String nombre, String alimento) {
        super(nombre, alimento);
        this.raza = raza;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    @Override
    public String toString() {
        return "Perro{" + "raza=" + raza + "nombre" + super.getNombre() + '}';
    }
    
    
    
}
