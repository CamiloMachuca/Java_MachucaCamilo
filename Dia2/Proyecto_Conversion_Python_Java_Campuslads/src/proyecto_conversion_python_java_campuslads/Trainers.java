
package proyecto_conversion_python_java_campuslads;

/**
 *
 * @author USUARIO
 */
public class Trainers {
    int id;
    String nombre;
    String apellido;
    String horario;
    String ruta;
    String grupo;
    
    public Trainers(int id,String nombre, String apellido, String horario, String ruta,  String grupo){
        this.id=id;
        this.nombre=nombre;
        this.apellido=apellido;
        this.horario=horario;
        this.ruta=ruta;
        this.grupo=grupo;
    }
    public void datosTrainers(){
        System.out.println("id= "+id);
        System.out.println("nombre= "+ nombre);
        System.out.println("apellido= "+ apellido);
        System.out.println("horario= "+ horario);
        System.out.println("ruta= "+ ruta);
        System.out.println("grupo= "+ grupo);
    }

    @Override
    public String toString() {
        return "Trainers{" + "id=" + id + ", nombre=" + nombre + ", apellido=" + apellido + ", horario=" + horario + ", ruta=" + ruta + ", grupo=" + grupo + '}';
    }
    
    
    
}
