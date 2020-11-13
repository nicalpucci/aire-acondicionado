public class AireAcondicionado {
    
    private double temperatura;
    
    /**
     * constructor
     */
    public AireAcondicionado(){
        temperatura = 15.0;
    }
    
    /**
     * subir temperatura
     */
    public void subirTemperatura(){
        temperatura += 5;
    }
    
    /**
     * bajar temperatura
     */
    public void bajarTemperatura(){
        temperatura -= 5;
    }
}