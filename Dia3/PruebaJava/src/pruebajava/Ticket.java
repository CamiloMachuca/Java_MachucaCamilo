/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pruebajava;

import java.time.LocalDate;

/**
 *
 * @author Uniminuto Tibu
 */
public class Ticket {
    static int contTiket=0;
    int id;
    int id_cliente;
    int id_concierto;
    String zona;
    int precioFinal;
    LocalDate fechaCompra;
    
   
    public Ticket( int id_cliente, int id_concierto,String zona,int precioFinal){
        contTiket++;
        this.id=contTiket;
        this.id_cliente=id_cliente;
        this.id_concierto=id_concierto;
        this.zona=zona;
        this.precioFinal=precioFinal;
        this.fechaCompra=LocalDate.now();
    }

    @Override
    public String toString() {
        return "Ticket{" + "\n id = " + id + "\n id_cliente = " + id_cliente + "\n id_concierto = " + id_concierto + "\n zona = " + zona + "\n precioFinal = " + precioFinal + "\n fechaCompra = " + fechaCompra + '}';
    }
    
    
    
}
