public class AireAcondicionado {
    
    private double temperatura;
    private double min;
    private double max;
    private double incremento;
    
    /**
     * constructor
     */
    public AireAcondicionado(double minimo, double maximo){
        temperatura = 15.0;
        incremento = 5.0;
        min = minimo;
        max = maximo;
    }
    
    /**
     * subir temperatura
     */
    public void subirTemperatura(){
        if((temperatura + incremento) <= max){
            temperatura += incremento;
        }
    }
    
    /**
     * bajar temperatura
     */
    public void bajarTemperatura(){
        if((temperatura - incremento) >= min){
            temperatura -= incremento;
        }
    }
    
    /**
     * cambiar el incremento
     */
    public void setIncremento(double nuevoIncremento){
        if(nuevoIncremento > 0){
            incremento = nuevoIncremento;
        }
    }
}