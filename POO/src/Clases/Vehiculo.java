
package Clases;

public class Vehiculo {

    /**
     * Definicion de Atributos de clase
     */
    protected String placaVehiculo;
    protected int nRuedas;
    protected String marca;
    protected String modelo;
    protected String fechaLanzamiento;
    protected int nAsientos;
    protected String estado="Parado"; //valor por defecto.
    
    /**
     * Constructor de la clase Vehiculo.
     * 
     * @param placaVehiculo Ingrese la placa del vehiculo.
     * @param marca Ingrese la marca del vehiculo.
     * @param modelo Ingrese el nombre del modelo.
     * @param fechaLanzamiento fecha de lanzamiento del modelo
     * @param nRuedas Cantidad de ruedas del vehiculo
     * @param nAsientos Ingrese el numero de asistentos del vehiculo 
     */
    public Vehiculo(String placaVehiculo, String marca, String modelo, 
            String fechaLanzamiento, int nRuedas, int nAsientos){
        
        this.placaVehiculo=placaVehiculo;
        this.marca=marca;
        this.modelo=modelo;
        this.fechaLanzamiento=fechaLanzamiento;
        this.nRuedas=nRuedas;
        this.nAsientos=nAsientos;
    }
    
    public String iniciarVehiculo(){
        this.estado="En Movimiento";
        /**
         * El constructor de cadena (StringBuilder) me permite crear cadenas de 
         * carateres con estructura
         */
        StringBuilder sb = new StringBuilder();
        
        sb.append("----------------------------").append("\n");
        sb.append(this.placaVehiculo).append(": ").append("Arrancando...").append("\n");
        sb.append("----------------------------").append("\n");
        
        return sb.toString();
    }
     
    public String pararVehiculo(){
        
        //Cambiamos su estado
        this.estado="Parado.";
        
         /**
         * El constructor de cadena (StringBuilder) me permite crear cadenas de 
         * carateres con estructura
         */
        StringBuilder sb = new StringBuilder();
        
        sb.append("----------------------------").append("\n");
        sb.append(this.placaVehiculo).append(": ").append("Parando...").append("\n");
        sb.append("----------------------------").append("\n");
                
        return sb.toString();
    }
    
    public String getInfo(){
        
        /**
         * El constructor de cadena (StringBuilder) me permite crear cadenas de 
         * carateres con estructura
         */
        StringBuilder sb = new StringBuilder();
        
        sb.append("----------------------------").append("\n");
        sb.append("Informacion").append("\n");
        sb.append("----------------------------").append("\n");
        
        sb.append("Placa: ").append(this.placaVehiculo).append("\n");
        sb.append("Marca: ").append(this.marca).append("\n");
        sb.append("Modelo: ").append(this.modelo).append("\n");
        sb.append("Fecha Modelo: ").append(this.fechaLanzamiento).append("\n");
        sb.append("Numero Ruedas: ").append(this.nRuedas).append("\n");
        sb.append("Numero Asientos: ").append(this.nAsientos).append("\n");
        sb.append("Estado: ").append(this.estado);
       
        return sb.toString();
    } 
    
}
