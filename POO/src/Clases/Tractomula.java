
package Clases;


public class Tractomula extends Vehiculo{
    
    /**
    * Definicion de Atributos de clase
    */
    private String maxCarga;
    
     /**
     * Constructor de la clase Vehiculo, pero sera llenada desde
     * las clases hijas, ya que segun mi modelo, solo puedes crear los tipos
     * clases hijas y suministrar la información mediante el acceso al
     * constructor con el metodo SUPER
     * 
     * @param placaVehiculo Ingrese la placa del vehiculo.
     * @param marca Ingrese la marca del vehiculo.
     * @param modelo Ingrese el nombre del modelo.
     * @param fechaLanzamiento fecha de lanzamiento del modelo
     * @param nRuedas Cantidad de ruedas del vehiculo
     * @param nAsientos Ingrese el numero de asistentos del vehiculo 
     * @param maxCarga Ingrese la cantidad maxima de carga en tonelaje
     */
    public Tractomula(String maxCarga, String placaVehiculo, String marca, 
          String modelo, String fechaLanzamiento, int nRuedas, int nAsientos) {
        
        super(placaVehiculo, marca, modelo, fechaLanzamiento, nRuedas, nAsientos);
        this.maxCarga = maxCarga;
        
    }
    
    @Override
     public String iniciarVehiculo(){
         
        StringBuilder sb = new StringBuilder();
        sb.append(super.iniciarVehiculo());
        sb.append("Demoro mucho, pero ya estoy en movimiento.").append("\n");
        sb.append("----------------------------").append("\n");
        
        return sb.toString();
    }
     
    @Override
    public String pararVehiculo(){
        
        StringBuilder sb = new StringBuilder();
        sb.append(super.pararVehiculo());
        sb.append("He parado muy lento, por mi carga.").append("\n");
        sb.append("----------------------------").append("\n");
        
        return sb.toString();
        
    }
    
    @Override
    public String getInfo(){
            
       StringBuilder sb = new StringBuilder();
       sb.append(super.getInfo()).append("\n");
       sb.append("Tonelaje Maximo: ").append(this.maxCarga).append("\n");
       sb.append("----------------------------").append("\n");
       return sb.toString();
    }
}
