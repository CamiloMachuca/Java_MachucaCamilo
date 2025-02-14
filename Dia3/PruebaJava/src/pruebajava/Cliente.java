/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pruebajava;

/**
 *
 * @author Uniminuto Tibu
 */
public class Cliente {
    static int contadorId=0;
    int id;
    String nombre;
    String apellido;
    String correo;
    String telefono;
    
   
    
    public Cliente( String nombre, String apellido, String correo, String telefono){
        contadorId++;
        this.id=contadorId;
        this.nombre=nombre;
        this.apellido=apellido;
        this.correo=correo;
        this.telefono=telefono;
        
    }

    @Override
    public String toString() {
        return "Cliente{" + "\n id = " + id + "\n nombre = " + nombre + "\n apellido = " + apellido + "\n correo = " + correo + "\n telefono = " + telefono + '}';
    }
    
    
    
}
