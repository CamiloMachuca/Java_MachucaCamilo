/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pruebajava;

/**
 *
 * @author Uniminuto Tibu
 */
public class Ticket {
    int id;
    int id_cliente;
    int id_concierto;
    String zona;
    float precioFinal;
    String fechaCompra;
    
    public Ticket(int id, int id_cliente, int id_concierto,String zona,float precioFinal, String fechaCompra){
        this.id=id;
        this.id_cliente=id_cliente;
        this.id_concierto=id_concierto;
        this.zona=zona;
        this.precioFinal=precioFinal;
        this.fechaCompra=fechaCompra;
    }

    @Override
    public String toString() {
        return "Ticket{" + "id=" + id + ", id_cliente=" + id_cliente + ", id_concierto=" + id_concierto + ", zona=" + zona + ", precioFinal=" + precioFinal + ", fechaCompra=" + fechaCompra + '}';
    }
    
    
    
}
