/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javatiendamachucacamilo;

class Producto {
    
    
    String nombre;
    double precio;
    int cantidad;
    
    // constructor 
    public Producto(String nombre, double precio, int cantidad){
        this.nombre=nombre;
        this.precio=precio;
        this.cantidad=cantidad;
    }
    
    @Override
    public String toString(){
        return "nombre: "+ nombre + " precio " + precio+ " cantidad "+ cantidad;
    }
    
}
