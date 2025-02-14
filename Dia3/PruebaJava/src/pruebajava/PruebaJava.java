
package pruebajava;

import java.util.ArrayList;
import java.util.Scanner;


public class PruebaJava {

   
    public static void main(String[] args) {
        // TODO code application logic here
        ArrayList<Concierto> listaConciertos=new ArrayList<>();
        listaConciertos.add(new Concierto("malumaTur", "Maluma", "2025-04-02","Cucuta", 300000));
        listaConciertos.add(new Concierto("KarolGTur", "Karol G", "2025-08-01","Medellin", 200000));
        listaConciertos.add(new Concierto("AnuelTur", "Anuel", "2025-10-03","Mexico", 200000));

        ArrayList<Cliente> listaClientes=new ArrayList<>();
        listaClientes.add(new Cliente("Pedro", "Molina", "Pedro999@gmail.com", "12334444"));
        
        ArrayList<Ticket> listaTickets=new ArrayList<>();
        
        ArrayList<Zona> listaZona=new ArrayList<>();
        listaZona.add(new Zona("Zona1","10",50000));
        listaZona.add(new Zona("Zona2","30",30000));
        listaZona.add(new Zona("Zona3","30",10000));

        
        boolean buclePrincipal=true;
        while (buclePrincipal==true){
            System.out.println("");
            System.out.println("##############################");
            System.out.println("Bienvemido a Notas Vibrantes");
            System.out.println("========== MENU ==========");
            System.out.println("##############################");
            System.out.println("(1.) Ver conciertos disponibles.");
            System.out.println("(2.) Registrar cliente.");
            System.out.println("(3.) Comprar ticket.");
            System.out.println("(4.) Ver tickets por cliente.");
            System.out.println("(5.) Cancelar ticket.");
            System.out.println("(6.) Listar los tickets vendidos para un concierto específico.");
            System.out.println("(7.) Mostrar los conciertos a los que asistirá un cliente.");
            System.out.println("(8.) Mostrar los ingresos totales generados por un concierto.");
            System.out.println("(9.) Finalizar programa");
            Scanner teclado= new Scanner(System.in);
            String opcion=teclado.nextLine();
            switch (opcion){
                case "1":
                    System.out.println("Conciertos disponibles");
                    for(Concierto i: listaConciertos){
                        System.out.println(i);
                        System.out.println("");
                    }
                    break;

                case "2":
                    boolean bucleClientes=true;
                    while (bucleClientes==true){
                        System.out.println("");
                        System.out.println("Registrar Clientes");
                        System.out.println("Ingrese el nombre del cliente:");
                        String nuevNombre=teclado.nextLine();
                        System.out.println("Ingrese el apellido del cliente:");
                        String nuevApellido=teclado.nextLine();
                        System.out.println("Ingrese el correo del cliente:");
                        String nuevCorreo=teclado.nextLine();
                        System.out.println("Ingrese el telefono del cliente:");
                        String nuevTelefono=teclado.nextLine();
                        // Falta cambiar la lista a Clientes
                        listaClientes.add(new Cliente(nuevNombre, nuevApellido, nuevCorreo,nuevTelefono));
                        System.out.println("Deseas añadir un nuevo cliente (1)si (2)no");
                        String opc=teclado.nextLine();
                        
                        if (opc .equals("1")){
                            System.out.println("Ingrese el nuevo cliente");
                        }
                        else if(opc.equals("2")){
                            System.out.println("Se regreso al menu principal");
                            bucleClientes=false;
                            
                        }
                        
                    }
                    break;

                case "3":
                    boolean bucleTicket=true;
                    while (bucleTicket==true){
                        System.out.println("");
                        System.out.println("Comprar ticket");
                        System.out.println("===== Personas =====");
                        for (Cliente i: listaClientes){
                            System.out.println(i);
                            System.out.println("");
                        }
                        System.out.println("");
                        System.out.println("Ingrese el id de la persona");
                        int nuevoIdPersona=teclado.nextInt();

                        System.out.println("");
                        System.out.println("=================================");
                        System.out.println("==== Conciertos Disponibles =====");
                        System.out.println("=================================");
                        for (Concierto c: listaConciertos){
                            System.out.println(c);
                            System.out.println("");

                        }
                        int contPrecioBase=0;
                        System.out.println("");
                        System.out.println("Ingrese el id del concierto");
                        int nuevoIdConcierto=teclado.nextInt();
                        for (Concierto c: listaConciertos){
                            if (nuevoIdConcierto==c.id){
                                contPrecioBase=c.precioBase;
                            }

                        }
                        System.out.println("");
                        System.out.println("==================================");
                        System.out.println("======= Zonas Disponibles ========");
                        System.out.println("==================================");
                        for (Zona i: listaZona){
                            System.out.println(i);
                            System.out.println("");

                        }
                        int contPrecioZona=0;
                        String contNombreZona="";
                        System.out.println("Ingrese el id de la zona ");
                        int nuevoIdZona=teclado.nextInt();
                        for (Zona z: listaZona){
                            if (nuevoIdZona==z.id){
                                contNombreZona=z.nombreZona;
                                contPrecioZona=z.precioAdicional;
                            }
                        }
                        int nuevoPrecioFinal= contPrecioBase + contPrecioZona;
                         listaTickets.add(new Ticket(nuevoIdPersona,nuevoIdConcierto,contNombreZona,nuevoPrecioFinal));
                         System.out.println("====== Se añadio correctamente el Ticket ========");
                         System.out.println("");
                         System.out.println("Deseas comprar un nuevo ticket (1)si (2)no");
                         teclado.nextLine();
                         String opcioo=teclado.nextLine();
                         if (opcioo.equals("1")){
                             System.out.println("Ingrese los datos del nuevo Ticket");
                         }
                         else if(opcioo.equals("2")){
                             System.out.println("Se regreso al menu principal");
                             bucleTicket=false;
                         }
                    }
                    break;
                    
                case "4":
                    System.out.println("");
                    System.out.println("========================");
                    System.out.println("Ver tickets por cliente");
                    System.out.println("========================");
                    System.out.println("Ingrese el id del cliente: ");
                    int idClienteBusqueda=teclado.nextInt();
                    System.out.println("Los ticket del cliente son:");
                    for (Ticket t: listaTickets){
                        if (idClienteBusqueda==t.id_cliente){
                            System.out.println(t);
                            System.out.println("");
                        }
                    }
                    break;
                    
                case "5":
                    System.out.println("");
                    System.out.println("==================");
                    System.out.println("Cancelar ticket.");
                    System.out.println("==================");
                    System.out.println("Ingrese el id del ticket que desea cancelar ");
                    int idTiketEliminar=teclado.nextInt();
                    for (Ticket t: listaTickets){
                        if (idTiketEliminar==t.id){
                            listaTickets.remove(t);
                            
                        }
                    }
                    System.out.println("===== Ticket Eliminado correctamente =====");
                    break;
                    
                case "6":
                    System.out.println("");
                    System.out.println("=========================================================");
                    System.out.println("Listar los tickets vendidos para un concierto específico.");
                     System.out.println("=========================================================");
                    System.out.println("Ingrese el id del concierto:");
                    int idConciertoo=teclado.nextInt();
                    System.out.println("Los ticket de ese concierto son:");
                    for (Ticket t: listaTickets){
                        if (idConciertoo==t.id_concierto){
                            System.out.println(t);
                            System.out.println("");
                        }
                    }
                    break;
                    
                    
                case "7":
                    System.out.println("");
                    System.out.println("=====================================================");
                    System.out.println("Mostrar los conciertos a los que asistirá un cliente.");
                    System.out.println("=====================================================");
                    System.out.println("Ingrese el id del cliente");
                    int idClie=teclado.nextInt();
                    for(Ticket t: listaTickets){
                        if (idClie==t.id_cliente){
                            for (Concierto c: listaConciertos){
                                if (t.id_concierto==c.id){
                                    System.out.println(c);
                                    System.out.println("");
                                }
                            }
                        }
                    }
                    break;
                    
                case "8":
                    int IngresosGenerados=0;
                    System.out.println("");
                    System.out.println("========================================================");
                    System.out.println("Mostrar los ingresos totales generados por un concierto.");
                    System.out.println("========================================================");
                    System.out.println("Ingrese el id del concierto:");
                    int idConciert=teclado.nextInt();
                    System.out.println("Los ingresos generados son:");
                    for (Ticket t: listaTickets){
                        if (idConciert==t.id_concierto){
                            IngresosGenerados +=t.precioFinal;
                        }
                    }
                    System.out.println(IngresosGenerados);
                    break;
                    
                    
                    
                case "9":
                    System.out.println("");
                    System.out.println("=======================");
                    System.out.println("Se finalizo el programa");
                    System.out.println("=======================");
                    buclePrincipal=false;
                    break;
                    
                default: System.out.println("Opcion incorrecta porfavor intente de nuevo");




            }
        }
        
        
    }
    
}
