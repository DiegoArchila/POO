
package poo;

/**
 * Importación de las clases en otros paquetes,
 * Esto es una forma de encapsulamiento y abstraccion.
 */
import Clases.Tractomula;
import Clases.Vehiculo;
import Clases.Moto;

public class POO {

    public static void main(String[] args) {

        //La clase padre puede almacenar clases hijas, pero no alcontrario.
        Vehiculo t2 = new Tractomula("34 ton", "PRJ436", "Mack", "tr340", "2010", 10, 2);
        Tractomula t1 = new Tractomula("33 ton.", "XMB616", "Kenworth","T-800", "2019", 10, 2);
        Vehiculo m1=new Moto("Scooter", "XM128B", "Suzuki", "AX100", "2000", 2, 2);
       
        setArrancar(t2);
        getInfo(t2);
        setParar(t2);
        
        setArrancar(t1);
        getInfo(t1);
        setParar(t1);
        
        setArrancar(m1);
        getInfo(m1);
        setParar(m1);
}
    
    
    
    /**
     * Los siguientes metodos son ejemplo de polomorfismo
     */
    
    /**
     * 
     * @param transporte Objeto de tipo vehiculo o subclase. 
     */
    public static void getInfo(Vehiculo transporte){
        
        System.out.println(transporte.getInfo());
        
    }
    
     /**
     * 
     * @param transporte Objeto de tipo vehiculo o subclase. 
     */
    public static void setArrancar(Vehiculo transporte){
        
        System.out.println(transporte.iniciarVehiculo());
    
    }
    
     /**
     * 
     * @param transporte Objeto de tipo vehiculo o subclase. 
     */
    public static void setParar(Vehiculo transporte){
    
        System.out.println(transporte.pararVehiculo());
        
    }
    
}
