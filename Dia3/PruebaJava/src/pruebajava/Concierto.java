
package pruebajava;


public class Concierto {
    static int contenedorIdCon=0;
    int id;
    String nombre;
    String artista;
    String fecha;
    String lugar;
    int precioBase;
    
    Concierto(){
        id++;
    }
    
    public Concierto(String nombre,String artista, String fecha,String lugar,int precioBase){
        contenedorIdCon++;
        this.id=contenedorIdCon;
        this.nombre=nombre;
        this.artista=artista;
        this.fecha=fecha;
        this.lugar=lugar;
        this.precioBase=precioBase;
        
    }

    @Override
    public String toString() {
        return "Concierto{" + "\n id = " + id + "\n nombre = " + nombre + "\n artista = " + artista + "\n fecha = " + fecha + "\n lugar = " + lugar + "\n precioBase = " + precioBase + '}';
    }
    
    
    
}
