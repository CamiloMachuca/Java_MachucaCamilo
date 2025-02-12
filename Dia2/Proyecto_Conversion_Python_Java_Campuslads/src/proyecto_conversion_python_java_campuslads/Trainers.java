
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

    @Override
    public String toString() {
        return "Trainers{" + "id=" + id + "\n nombre=" + nombre + "\n apellido=" + apellido + "\n horario=" + horario + "\n ruta=" + ruta + "\n grupo=" + grupo + '}';
    }
    
    
    
}
