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

 

    
    public void datosCampers(){
        System.out.println("grupo= "+ grupo);
        System.out.println("ruta= "+ ruta);
        System.out.println("trainer= "+ trainer);
        System.out.println("id= "+ id );
        System.out.println("nombres= "+ nombres);
        System.out.println("apellidos= "+ apellidos);
        System.out.println("direccion= "+ direccion);
        System.out.println("acudiente= "+acudiente );
        System.out.println("celular= "+ celular);
        System.out.println("esatdo= "+ estado);
        System.out.println("riesgo= "+ riesgo);
        System.out.println("modulo1= "+ modulo1);
        System.out.println("modulo2= "+ modulo2);
        System.out.println("modulo3= "+ modulo3);
    
    }

    @Override
    public String toString() {
        return "Campers{" + "grupo=" + grupo + ", ruta=" + ruta + ", trainer=" + trainer + ", id=" + id + ", nombres=" + nombres + ", apellidos=" + apellidos + ", direccion=" + direccion + ", acudiente=" + acudiente + ", celular=" + celular + ", estado=" + estado + ", riesgo=" + riesgo + ", modulo1=" + modulo1 + ", modulo2=" + modulo2 + ", modulo3=" + modulo3 + '}';
    }
    
    
}
