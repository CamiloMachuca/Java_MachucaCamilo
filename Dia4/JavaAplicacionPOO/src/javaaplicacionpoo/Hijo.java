
package javaaplicacionpoo;


public class Hijo extends Padre{
    // Encapsulamiento
    private String sexo;
    
    // Polimorfismo
    public Hijo() {
        super(null, null, 0);
    }
    

    //Herrencia
    public Hijo(String sexo, String nombree, String apelliddo, int edad) {
        super(nombree, apelliddo, edad);
        this.sexo = sexo;
    }

    @Override
    public String toString() {
        return "Hijo{" + "sexo=" + sexo + "nombre="+ super.getNombree()+'}';
    }

   

    
    
    
    
    
    
    
    
    
    
    
    
    
}
