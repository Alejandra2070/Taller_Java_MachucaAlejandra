package proyectodia2;
public class Trainers {
    int id;
    String nombre;
    String ruta;
    String horario;

    public Trainers(int id, String nombre, String ruta, String horario) {
        this.id = id;
        this.nombre = nombre;
        this.ruta = ruta;
        this.horario = horario;
    }
    
    public String newName(){
        return nombre;
    }
    
    public String newRut(){
        return ruta;
    }
    
    public String newHor(){
        return horario;
    }
    
    public void getNam(String nombre){
        this.nombre = nombre;
    }
    
    public void getRut(String ruta){
        this.ruta = ruta;
    }
    
    public void getHor(String horario){
        this.horario = horario;
    }

    @Override
    public String toString() {
        return "Trainers{" + 
                "id=" + id + 
                ", nombre=" + nombre + 
                ", ruta=" + ruta + 
                ", horario=" + horario + 
                '}';
    }
    
}
