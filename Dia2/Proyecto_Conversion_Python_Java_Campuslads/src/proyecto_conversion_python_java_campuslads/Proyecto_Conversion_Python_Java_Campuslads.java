
package proyecto_conversion_python_java_campuslads;

import java.util.ArrayList;
import java.util.Scanner;

public class Proyecto_Conversion_Python_Java_Campuslads {

   
    public static void main(String[] args) {
        // TODO code application logic here
        ArrayList <Campers> listaCampers=new ArrayList <>();
        listaCampers.add(new Campers("T1", "no asignado", "pedro", 1, "Juan Pablo",
        "Perez Gonzalez", "Calle 123, ciudad mexico", "Maria Perez", "1234356785", "Inscrito", 
        "No asignado","no asignado", "no asignado", "no asignado"));
        
        listaCampers.add(new Campers("T1", "NodeJS", "Juan", 2, "Luis Pablo",
        "Perez Gonzalez", "Calle 123, ciudad mexico", "Marta Perez", "2234356785", "Inscrito", 
        "Alto","no asignado", "no asignado", "no asignado"));
        
        listaCampers.add(new Campers("T1", "NodeJS", "Juan", 3, "Miguel Torres",
        "Nacho Torres", "Calle 223, ciudad mexico", "Ana Torres", "2234356785", "Aprobado", 
        "No asignado","no asignado", "no asignado", "no asignado"));
        
        listaCampers.add(new Campers("T1", "NodeJS", "Juan", 4, "Miguel Torres",
        "Nacho Torres", "Calle 223, ciudad mexico", "Ana Torres", "2234356785", "Reprobado", 
        "No asignado","no asignado", "no asignado", "no asignado"));
        
        ArrayList <Trainers> listaTrainers=new ArrayList <>();
        listaTrainers.add(new Trainers(1, "pedro", "Rodrigues", "6A.M-10A.M", "NodeJS", "T1"));
        listaTrainers.add(new Trainers(2, "Miguel", "Camargo", "11A.M-4A.M", "No asignado", "T1"));
        
        ArrayList <Rutas> listaRutas=new ArrayList<>();
        listaRutas.add(new Rutas(1, "Java", "no hay trainers asignados", "01-02-2025", "01-12-2025", "fundamentos de programacion, programacion web"));
        listaRutas.add(new Rutas(2, "NetCore", "no hay trainers asignados", "01-02-2025", "01-12-2025", "Bases de datos, programacion web"));
        

       
        boolean buclePrincipal=true;
        while (buclePrincipal==true){
            System.out.println("");
            System.out.println("####################################");
            System.out.println("========= MENU PRINCIPAL ==========");
            System.out.println("#####################################");
            System.out.println("(1) Campers");
            System.out.println("(2) Trainers");
            System.out.println("(3) Coordinador");
            System.out.println("(4) Finalizar programa");
            Scanner teclado=new Scanner(System.in);
            String opcion=teclado.nextLine();
            
            switch(opcion){
                case "1":
                    boolean bucleCampers=true;
                    while (bucleCampers==true){
                        System.out.println("");
                        System.out.println("########################################");
                        System.out.println("============= MENU CAMPERS =============");
                        System.out.println("########################################");
                        System.out.println("(1) Mostrar mis datos como campers");
                        System.out.println("(2) Volver al menu principal");
                        int opcionCamper=teclado.nextInt();
                        
                        if (opcionCamper==1){
                            System.out.println("Ingrese el id:");
                            int idCamper=teclado.nextInt();
                            for(Campers i: listaCampers){
                                if (idCamper==i.id){
                                    System.out.println(i);
                                
                                }
                                
                            }
                        }
                        else if(opcionCamper==2){
                            System.out.println("Se regreso al menu principal");
                            bucleCampers=false;
                        }
                    
                    }
                    break;
                case "2":
                    boolean bucleTrainer=true;
                    while (bucleTrainer==true){
                        System.out.println("");
                    System.out.println("######################################");
                    System.out.println("============= Menu Trainers ===========");
                    System.out.println("########################################");
                    System.out.println("(1) verificar informacion del trainer");
                    System.out.println("(2) Reportes");
                    System.out.println("(3) volver al menu principal");
                    int opcionTrainer=teclado.nextInt();
                    if (opcionTrainer==1){
                        System.out.println("Ingrese tu id: ");
                        int idTrainer=teclado.nextInt();
                        for(Trainers i: listaTrainers){
                                if (idTrainer==i.id){
                                    System.out.println(i);
                                
                                }
                                
                            }
                    }
                    else if(opcionTrainer==2){
                        boolean bucleReportes=true;
                        while (bucleReportes==true){
                        System.out.println("#############################################");
                        System.out.println("=========== Menu opciones Reportes ===========");
                        System.out.println("##############################################");
                        System.out.println("(1)Listar los **campers** que se encuentren en estado de inscrito.");
                        System.out.println("(2)Listar los **campers** que aprobaron el examen inicial.");
                        System.out.println("(3)Listar los entrenadores que se encuentran trabajando con **CampusLands**.");
                        System.out.println("(4)Listar los **campers** que cuentan con bajo rendimiento.");
                        System.out.println("(5)Listar los **campers** y **trainers** que se encuentren asociados a una ruta de entrenamiento.");
                        System.out.println("(6)Mostrar cuantos **campers** perdieron y aprobaron cada uno de los módulos teniendo en cuenta la ruta de entrenamiento y el entrenador encargado.");
                        System.out.println("(7)volver al menu principal");
                        String opcionReportes=teclado.nextLine();
                        switch(opcionReportes){
                            case "1":
                                System.out.println("Los campers en estado inscrito son: ");
                                for(Campers i: listaCampers){
                                if (i.estado.equals("Inscrito")){
                                    System.out.println(i);
                                }
                                
                                }
                                break;
                            
                            case "2":
                                System.out.println("Los campers que aprobaron el examen inicial son: ");
                                for(Campers i: listaCampers){
                                if (i.estado.equals("Aprobado")){
                                    System.out.println(i);
                                }
                                
                                }
                                break;
                                
                            case "3":
                                System.out.println("los entrenadores que se encuentran trabajando con **CampusLands** son:");
                                for(Trainers i: listaTrainers){
                                    System.out.println(i);
                                
                                }
                                break;
                                
                            case "4":
                                System.out.println("los **campers** que cuentan con bajo rendimiento son:");
                                for(Campers i: listaCampers){
                                if (i.riesgo.equals("Alto")){
                                    System.out.println(i);
                                }
                                
                                
                                }
                                break;
                                
                            case "5":
                                System.out.println("los **campers** y **trainers** que se encuentren asociados a una ruta de entrenamiento son:");
                                System.out.println("#################################");
                                System.out.println("Los campers asociados a una ruta");
                                System.out.println("#################################");

                                for(Campers i: listaCampers){
                                 if (!i.ruta.equals("no asignado")){
                                     System.out.println(i);
                                 }
                                 }

                                System.out.println("#################################");
                                System.out.println("Los Trainers asociados a una ruta");
                                System.out.println("#################################");
                                for(Trainers i: listaTrainers){
                                    if (!i.ruta.equals("No asignado")){
                                        System.out.println(i);

                                    }
                                 }
                               break;
                                
                            case "6":
                                teclado.nextLine();
                                System.out.println("Ingrese la ruta que siguio el campers");
                                String rutaCamper=teclado.nextLine();
                                System.out.println("Los campers que aprobaron y reprobaron cada unos de los modulos fueron");
                                System.out.println("####################");
                                System.out.println("Campers aprobados");
                                System.out.println("####################");
                                for(Campers i: listaCampers){
                                    if (i.estado.equals("Aprobado") && i.ruta.equals(rutaCamper)){
                                        System.out.println(i);

                                    }
                                 }
                                System.out.println("######################");
                                System.out.println("Campers reprobados");
                                System.out.println("######################");
                                for(Campers i: listaCampers){
                                    if (i.estado.equals("Reprobado") && i.ruta.equals(rutaCamper)){
                                        System.out.println(i);

                                    }
                                 }
                                break;
                            
                            case "7":
                                System.out.println("Se volvio al menu del trainer");
                                bucleReportes=false;
                           
                            default: System.out.println("opcion incorrecta porfavor intentelo de nuevo");
                           
                                
                        }
                    }
                    }
                    else if(opcionTrainer==3){
                        System.out.println("se regreso al menu principal");
                        bucleTrainer=false;
                    
                    }
                    }
                    
                    break;
                    
                case "3":
                    boolean bucleCoordinador=true;
                    while (bucleCoordinador==true){
                        System.out.println("############################################");
                        System.out.println("============== Menu coordinador ===========");
                        System.out.println("############################################");
                        System.out.println("(1) Agregar nota del examen de ingreso");
                        System.out.println("(2) Añadir nuevo campers");
                        System.out.println("(3) Asignar notas a los campers");
                        System.out.println("(4) Asignar las rutas de entrenamiento a los grupos");
                        System.out.println("(5) Crear nuevas rutas");
                        System.out.println("(6) Asignar los trainers encargados de cada ruta ");
                        System.out.println("(7) Realizar reportes");
                        System.out.println("(8) Salir al menu principal");
                        String opcionCoordinador=teclado.nextLine();
                        
                        switch (opcionCoordinador){
                            case "1":
                                
                                System.out.println("Ingrese el id del camper que deseas agregarle la nota");
                                int idCamp=teclado.nextInt();
                                
                                Campers camperEditar=null;
                                for(Campers i: listaCampers){
                                 if (i.id==idCamp){
                                     camperEditar=i;
                                 }
                                 }
                                if (camperEditar != null){
                                    System.out.println("Ingrese la nota teorica del campers:");
                                    float notaTeorica=teclado.nextFloat();
                                    System.out.println("Ingrese la nota practica del campers:");
                                    float notaPractica=teclado.nextFloat();
                                    
                                    float promedio= notaTeorica+ notaPractica / 2;
                                    
                                    if (promedio>=60){
                                        camperEditar.cambiarEstado("Aprobado");
                                        
                                    }
                                    else if(promedio<60){
                                        camperEditar.cambiarEstado("Reprobado");
                                        
                                    }
                                    
                                }
                                break;
                                
                            case "2":
                                System.out.println("#####################################");
                                System.out.println("Ingrese los datos del nuevo camper");
                                System.out.println("#####################################");
                                teclado.nextLine();
                                System.out.println("Ingrese el grupo (T1, T2, C1)");
                                String nuevGrupo=teclado.nextLine();
                                System.out.println("Ingrese la ruta del campers");
                                String nuevRuta=teclado.nextLine();
                                System.out.println("Ingrese el trainer");
                                String nuevTrainer=teclado.nextLine();
                                System.out.println("Ingrese el id");
                                int nuevId=teclado.nextInt();
                                System.out.println("Ingrese los nombres: ");
                                teclado.nextLine();
                                String nuevNombre=teclado.nextLine();
                                System.out.println("Ingrese los apellidos");
                                String nuevApellido=teclado.nextLine();
                                System.out.println("Ingrese la dirrecion");
                                String nuevDireccion=teclado.nextLine();
                                System.out.println("Ingrese el nombre del acudiente");
                                String nuevAcudiente=teclado.nextLine();
                                System.out.println("Ingrese el numero de celular");
                                String nuevCelular=teclado.nextLine();
                                System.out.println("Ingrese el estado del camper (Inscrito, Aprobado, Reprovado)");
                                String nuevEstado=teclado.nextLine();
                                System.out.println("Ingrese el riesgo en que se encuentra el campers en sel expulsado (bajo, alto)");
                                String nuevRiesgo=teclado.nextLine();
                                System.out.println("Ingrese si el campers aprobo el modulo1 (Aprobado, Reprobado)");
                                String nuevModulo1=teclado.nextLine();
                                System.out.println("Ingrese si el campers aprobo el modulo2");
                                String nuevModulo2=teclado.nextLine();
                                System.out.println("Ingrese si el campers aprobo el modulo3");
                                String nuevModulo3=teclado.nextLine();
                                
                                
                                listaCampers.add(new Campers(nuevGrupo, nuevRuta, nuevTrainer, nuevId, nuevNombre,
                                nuevApellido, nuevDireccion, nuevAcudiente, nuevCelular, nuevEstado, 
                                nuevRiesgo,nuevModulo1, nuevModulo2, nuevModulo3));
                                break;
                                
                            case "3":
                                System.out.println("Ingrese el id del camper que deseas agregarle la nota");
                                int idCampe=teclado.nextInt();
                                
                                Campers camperEditarr=null;
                                for(Campers i: listaCampers){
                                 if (i.id==idCampe){
                                     camperEditarr=i;
                                 }
                                 }
                                if (camperEditarr != null){
                                    System.out.println("Ingrese la nota teorica del campers:");
                                    float notaTeorica=teclado.nextFloat();
                                    System.out.println("Ingrese la nota practica del campers:");
                                    float notaPractica=teclado.nextFloat();
                                    
                                    float promedio= notaTeorica+ notaPractica / 2;
                                    
                                    if (promedio>=60){
                                        camperEditarr.cambiarEstado("Aprobado");
                                        
                                    }
                                    else if(promedio<60){
                                        camperEditarr.cambiarEstado("Reprobado");
                                        
                                    }
                               
                                }
                                break;
                                
                            case "4":
                                System.out.println("Asignar la ruta de entrenamiento de los grupos");
                                break;
                                
                            case "5":
                                System.out.println("#########################");
                                System.out.println("Crear nuevas rutas");
                                System.out.println("#########################");
                                System.out.println("Ingrese el id");
                                int nueId=teclado.nextInt();
                                System.out.println("Ingrese el nombre");
                                teclado.nextLine();
                                String nueNombre=teclado.nextLine();
                                System.out.println("Ingrese los trainers asignados");
                                String nueTrainers=teclado.nextLine();
                                System.out.println("Ingrese la fecha de inicio");
                                String nueFechaInicio=teclado.nextLine();
                                System.out.println("Ingrese la fecha final");
                                String nueFechaFin=teclado.nextLine();
                                System.out.println("Ingrese los modulos");
                                String nueModulos=teclado.nextLine();
                                
                                listaRutas.add(new Rutas(nueId, nueNombre, nueTrainers, nueFechaInicio, 
                                        nueFechaFin, nueModulos));
                                break;
                                
                            case "6":
                                System.out.println(" Asignar los trainers encargados de cada ruta ");
                                System.out.println("Ingrese el id de la ruta: ");
                                int busquedaRuta=teclado.nextInt();
                                System.out.println("Ingrese el trainer o los trainers encargados de esa ruta");
                                teclado.nextLine();
                                String nombresTrainers=teclado.nextLine();
                                Rutas rutasEditar=null;
                                for(Rutas i: listaRutas){
                                 if (i.id==busquedaRuta){
                                     rutasEditar=i;
                                 }
                                 }
                                rutasEditar.AñadirTrainers(nombresTrainers);
                                break;
                                
                            case "7":
                                System.out.println("Realizar reportes");
                                boolean bucleReportes=true;
                                while (bucleReportes==true){
                                    System.out.println("");
                                    System.out.println("#############################################");
                                    System.out.println("=========== Menu opciones Reportes ===========");
                                    System.out.println("##############################################");
                                    System.out.println("(1)Listar los **campers** que se encuentren en estado de inscrito.");
                                    System.out.println("(2)Listar los **campers** que aprobaron el examen inicial.");
                                    System.out.println("(3)Listar los entrenadores que se encuentran trabajando con **CampusLands**.");
                                    System.out.println("(4)Listar los **campers** que cuentan con bajo rendimiento.");
                                    System.out.println("(5)Listar los **campers** y **trainers** que se encuentren asociados a una ruta de entrenamiento.");
                                    System.out.println("(6)Mostrar cuantos **campers** perdieron y aprobaron cada uno de los módulos teniendo en cuenta la ruta de entrenamiento y el entrenador encargado.");
                                    System.out.println("(7)volver al menu principal");
                                    String opcionReportes=teclado.nextLine();
                                    switch(opcionReportes){
                                        case "1":

                                            System.out.println("Los campers en estado inscrito son: ");
                                            for(Campers i: listaCampers){
                                            if (i.estado.equals("Inscrito")){
                                                System.out.println(i);
                                            }

                                            }
                                            break;

                                        case "2":
                                            System.out.println("Los campers que aprobaron el examen inicial son: ");
                                            for(Campers i: listaCampers){
                                            if (i.estado.equals("Aprobado")){
                                                System.out.println(i);
                                            }

                                            }
                                            break;

                                        case "3":
                                            System.out.println("los entrenadores que se encuentran trabajando con **CampusLands** son:");
                                            for(Trainers i: listaTrainers){
                                                System.out.println(i);

                                            }
                                            break;

                                        case "4":
                                            System.out.println("los **campers** que cuentan con bajo rendimiento son:");
                                            for(Campers i: listaCampers){
                                            if (i.riesgo.equals("Alto")){
                                                System.out.println(i);
                                            }


                                            }
                                            break;

                                        case "5":
                                            System.out.println("los **campers** y **trainers** que se encuentren asociados a una ruta de entrenamiento son:");
                                            System.out.println("#################################");
                                            System.out.println("Los campers asociados a una ruta");
                                            System.out.println("#################################");

                                            for(Campers i: listaCampers){
                                             if (!i.ruta.equals("no asignado")){
                                                 System.out.println(i);
                                             }
                                             }

                                            System.out.println("#################################");
                                            System.out.println("Los Trainers asociados a una ruta");
                                            System.out.println("#################################");
                                            for(Trainers i: listaTrainers){
                                                if (!i.ruta.equals("No asignado")){
                                                    System.out.println(i);

                                                }
                                             }
                                           break;

                                        case "6":
                                            teclado.nextLine();
                                            System.out.println("Ingrese la ruta que siguio el campers");
                                            String rutaCamper=teclado.nextLine();
                                            System.out.println("Los campers que aprobaron y reprobaron cada unos de los modulos fueron");
                                            System.out.println("####################");
                                            System.out.println("Campers aprobados");
                                            System.out.println("####################");
                                            for(Campers i: listaCampers){
                                                if (i.estado.equals("Aprobado") && i.ruta.equals(rutaCamper)){
                                                    System.out.println(i);

                                                }
                                             }
                                            System.out.println("######################");
                                            System.out.println("Campers reprobados");
                                            System.out.println("######################");
                                            for(Campers i: listaCampers){
                                                if (i.estado.equals("Reprobado") && i.ruta.equals(rutaCamper)){
                                                    System.out.println(i);

                                                }
                                             }
                                            break;

                                        case "7":
                                            System.out.println("Se volvio al menu del trainer");
                                            bucleReportes=false;

                                        default: System.out.println("opcion incorrecta porfavor intentelo de nuevo");


                                    }
                                }
                                break;
                                
                            case "8":
                                System.out.println("Se regreso al menu principal");
                                bucleCoordinador=false;
                                

                        }
                        
                    }
                    break;
                    
                case "4":
                    System.out.println("Se finalizo el programa");
                    buclePrincipal=false;
                    break;
                 
                default: System.out.println("la opcion es incorrecta porfavor intentar nuevamente");
            
            }
        
        }
        
    }

   
}
