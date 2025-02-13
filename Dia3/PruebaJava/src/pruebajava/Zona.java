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
    int id;
    String nombreZona;
    String capacidad;
    String precioAdicional;
    
    public Zona(int id, String nombreZona,String capacidad,String precioAdicional){
        this.id=id;
        this.nombreZona=nombreZona;
        this.capacidad=capacidad;
        this.precioAdicional=precioAdicional;
        
    }

    @Override
    public String toString() {
        return "Zona{" + "id=" + id + ", nombreZona=" + nombreZona + ", capacidad=" + capacidad + ", precioAdicional=" + precioAdicional + '}';
    }
    
    
    
}
