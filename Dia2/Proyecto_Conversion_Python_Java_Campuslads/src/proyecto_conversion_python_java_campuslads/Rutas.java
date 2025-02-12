
package proyecto_conversion_python_java_campuslads;


public class Rutas {
    
    int id;
    String nombre;
    String trainers;
    String fechaInicio;
    String fechaFin;
    String modulos;
     
    public Rutas(int id, String nombre, String trainers, String fechaInicio, String fechaFin, String modulos  ){
        this.id=id;
        this.nombre=nombre;
        this.trainers=trainers;
        this.fechaInicio=fechaInicio;
        this.fechaFin=fechaFin;
        this.modulos=modulos;
    }
    public void AñadirTrainers(String trainers ){
        this.trainers=trainers;
    }

    @Override
    public String toString() {
        return "Rutas{" + "id=" + id + ", nombre=" + nombre + ", trainers=" + trainers + ", fechaInicio=" + fechaInicio + ", fechaFin=" + fechaFin + ", modulos=" + modulos + '}';
    }
    
    
    
}
