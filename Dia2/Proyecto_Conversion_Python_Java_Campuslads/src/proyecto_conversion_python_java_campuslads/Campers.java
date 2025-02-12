/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto_conversion_python_java_campuslads;

/**
 *
 * @author USUARIO
 */
class Campers {
    
    String grupo;
    String ruta;
    String trainer;
    int id;
    String nombres;
    String apellidos;
    String direccion;
    String acudiente;
    String celular;
    String estado;
    String riesgo;
    String modulo1;
    String modulo2;
    String modulo3;
    public Campers (String grupo, String ruta, String trainer, int id, String nombres, String apellidos, String direccion, String acudiente, String celular, String estado, String riesgo, String modulo1, String modulo2, String modulo3){
        this.grupo=grupo;
        this.ruta=ruta;
        this.trainer=trainer;
        this.id=id;
        this.nombres=nombres;
        this.apellidos=apellidos;
        this.direccion=direccion;
        this.acudiente=acudiente;
        this.celular=celular;
        this.estado=estado;
        this.riesgo=riesgo;
        this.modulo1=modulo1;
        this.modulo2=modulo2;
        this.modulo3=modulo3;
    
    }
    public void cambiarEstado(String nuevoEstado){
        this.estado=nuevoEstado;
    }

 


    @Override
    public String toString() {
        return "Campers{" + "grupo= " + grupo + "\n ruta= " + ruta + "\n trainer= " + trainer + "\n id= " + id + "\n nombres= " + nombres + "\n apellidos= " + apellidos + "\n direccion= " + direccion + "\n acudiente= " + acudiente + "\n celular= " + celular + "\n estado= " + estado + "\n riesgo= " + riesgo + "\n modulo1= " + modulo1 + "\n modulo2= " + modulo2 + "\n modulo3= " + modulo3 + '}';
    }
    
    
}
