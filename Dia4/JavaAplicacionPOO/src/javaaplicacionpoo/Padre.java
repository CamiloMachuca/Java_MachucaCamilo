/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaaplicacionpoo;

/**
 *
 * @author Uniminuto Tibu
 */
public class Padre{
    
   private String nombree;
   private String apelliddo;
   private int edad;

    public Padre() {
    }

   
    public Padre(String nombree, String apelliddo, int edad){
        this.nombree = nombree;
        this.apelliddo = apelliddo;
        this.edad = edad;
        
    }

    public String getNombree() {
        return nombree;
    }

    public void setNombree(String nombree) {
        this.nombree = nombree;
    }

    public String getApelliddo() {
        return apelliddo;
    }

    public void setApelliddo(String apelliddo) {
        this.apelliddo = apelliddo;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    
    
    
    
   
    
   
   
  
    
}
