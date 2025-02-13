
package pruebajava;

import java.util.ArrayList;
import java.util.Scanner;


public class PruebaJava {

   
    public static void main(String[] args) {
        // TODO code application logic here
        ArrayList<Concierto> listaConciertos=new ArrayList<>();
        listaConciertos.add(new Concierto(1,"malumaTur", "Maluma", "2025-04-02","Cucuta", 300000));
        System.out.println("Bienvemido a  Notas Vibrantes");
        System.out.println("##########################");
        System.out.println("========== Menu ==========");
        System.out.println("##########################");
        System.out.println("(1.) Ver conciertos disponibles.");
        System.out.println("(2.) Registrar cliente.");
        System.out.println("(3.) Comprar ticket.");
        System.out.println("(4.) Ver tickets por cliente.");
        System.out.println("(5.) Cancelar ticket.");
        Scanner teclado= new Scanner(System.in);
        String opcion=teclado.nextLine();
        switch (opcion){
            case "1":
                System.out.println("Conciertos disponibles");
                for(Concierto i: listaConciertos){
                    System.out.println(i);
                }
                break;
                
            case "2":
                System.out.println("Registrar Clientes");
                System.out.println("Ingrese el id del cliente");
                int nuevId=teclado.nextInt();
                System.out.println("Ingrese el nombre del cliente:");
                teclado.nextLine();
                String nuevNombre=teclado.nextLine();
                System.out.println("Ingrese el apellido del cliente:");
                String nuevApellido=teclado.nextLine();
                System.out.println("Ingrese el correo del cliente:");
                String nuevCorreo=teclado.nextLine();
                System.out.println("Ingrese el telefono del cliente:");
                String nuevTelefono=teclado.nextLine();
                // Falta cambiar la lista a Clientes
                listaConciertos.add(new Concierto(nuevId,nuevNombre, nuevApellido, nuevCorreo,nuevTelefono, 300000));

                
        
        }
        
        
    }
    
}
