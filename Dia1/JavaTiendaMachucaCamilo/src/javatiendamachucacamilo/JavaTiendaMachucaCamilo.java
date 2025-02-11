
package javatiendamachucacamilo;

import java.util.ArrayList;
import java.util.Scanner;


public class JavaTiendaMachucaCamilo {

    
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner teclado= new Scanner (System.in);
        
        ArrayList <Producto> listaProductos=new ArrayList <>();
        listaProductos.add(new Producto("Coca-Cola", 2.500, 10));
        listaProductos.add(new Producto("pepsi", 3.600, 12));
        
        
        boolean booleanito=true;
        
        while (booleanito==true){
            System.out.println("------- Menu -------");
            System.out.println("1. Ver productos");
            System.out.println("2. Editar producto");
            System.out.println("3. Añadir producto");
            System.out.println("4. Eliminar producto");
            System.out.println("5. Salir");
            System.out.println("Ingrese la opcion deseada:");
            
            int opcion=teclado.nextInt();
            teclado.nextLine();
            switch (opcion){
                case 1: 
                    System.out.println("-------- Productos -------");
                    for (int i=0; i<listaProductos.size();i++){
                        System.out.println((i+1)+ ". "+ listaProductos.get(i));
                    }
                    break;
                    
                case 2:
                    System.out.println("Ingrese el numero del producto que quieres editar: ");
                    int numEditar=teclado.nextInt()- 1;
                    teclado.nextLine();
                    
                    if (numEditar < listaProductos.size()){
                        System.out.println("Ingrese el nuevo nombre: ");
                        String nuevoNombre=teclado.nextLine();
                        System.out.println("Ingrese el nuevo precio: ");
                        double nuevoPrecio=teclado.nextDouble();
                        System.out.println("Ingrese la nueva cantidad: ");
                        int nuevaCantidad=teclado.nextInt();
                        teclado.nextLine();
                        listaProductos.set(numEditar, new Producto (nuevoNombre, nuevoPrecio, nuevaCantidad));
                        System.out.println("Se actualizo el producto correctamente");
                        
                    
                    }
                    break;
                    
                case 3:
                    
                    
                    System.out.println("Ingrese el nombre: ");
                    String nombre= teclado.nextLine();
                    
                    
                    System.out.println("Ingrese el precio: ");
                    double precio=teclado.nextDouble();
                    System.out.println("Ingrese la cantidad");
                    int cantidad=teclado.nextInt();
                    teclado.nextLine();
                    
                    listaProductos.add(new Producto(nombre, precio, cantidad));
                    System.out.println("Se añadio correctamente el producto");
                    break;
                    
                case 4:
                    System.out.println("Ingrese el numero del producto a eliminar: ");
                    int numEliminar=teclado.nextInt()-1;
                    
                    if (numEliminar<listaProductos.size()){
                        listaProductos.remove(numEliminar);
                        System.out.println("Se elimino correctamente el producto");
                    }
                    break;
                    
                case 5:
                    System.out.println("Se salio del programa");
                    booleanito=false;
                    break;
                    
                default:
                    System.out.println("Opcion no valida intentar de nuevo");
                    
            }
        
        }
    }
    
}
