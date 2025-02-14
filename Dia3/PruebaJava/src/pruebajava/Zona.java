/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pruebajava;

/**
 *
 * @author Uniminuto Tibu
 */
public class Zona {
    static int contadorIdd=0;
    int id;
    String nombreZona;
    String capacidad;
    int precioAdicional;
    
    
    public Zona( String nombreZona,String capacidad,int precioAdicional){
        contadorIdd++;
        this.id=contadorIdd;
        this.nombreZona=nombreZona;
        this.capacidad=capacidad;
        this.precioAdicional=precioAdicional;
        
    }

    @Override
    public String toString() {
        return "Zona{" + "\n id = " + id + "\n nombreZona = " + nombreZona + "\n capacidad = " + capacidad + "\n precioAdicional = " + precioAdicional + '}';
    }
    
    
    
}
