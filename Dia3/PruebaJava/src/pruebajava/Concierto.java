
package pruebajava;


public class Concierto {
    int id;
    String nombre;
    String artista;
    String fecha;
    String lugar;
    int precioBase;
    
    public Concierto(int id,String nombre,String artista, String fecha,String lugar,int precioBase){
        this.id=id;
        this.nombre=nombre;
        this.artista=artista;
        this.fecha=fecha;
        this.lugar=lugar;
        this.precioBase=precioBase;
        
    }

    @Override
    public String toString() {
        return "Concierto{" + "id=" + id + ", nombre=" + nombre + ", artista=" + artista + ", fecha=" + fecha + ", lugar=" + lugar + ", precioBase=" + precioBase + '}';
    }
    
    
    
}
