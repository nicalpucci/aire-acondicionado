public class AireAcondicionado {
    
    private double temperatura;
    private double min;
    private double max;
    private double incremento;
    private int vecesCambiada;
    private double tMaxAlc;
    private double tMinAlc;
    
    /**
     * constructor
     */
    public AireAcondicionado(double minimo, double maximo){
        temperatura = 15.0;
        incremento = 5.0;
        min = minimo;
        max = maximo;
        vecesCambiada = 0;
        tMaxAlc = temperatura;
        tMinAlc = temperatura;
    }
    
    /**
     * subir temperatura
     */
    public void subirTemperatura(){
        if((temperatura + incremento) <= max){
            temperatura += incremento;
            vecesCambiada++;
        }
        if((temperatura + incremento) > tMaxAlc){
            tMaxAlc = temperatura;
        }
    }
    
    /**
     * bajar temperatura
     */
    public void bajarTemperatura(){
        if((temperatura - incremento) >= min){
            temperatura -= incremento;
            vecesCambiada++;
        }
        if((temperatura - incremento) < tMinAlc){
            tMinAlc = temperatura;
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
    
    /**
     * metodo getter estadisticas
     */
    public String getEstadisticas(){
        String status;
        status = ("Temperatura actual: "+temperatura+"ºC - Temperatura máxima posible: "+
        max+"ºC - Temperatura mínima posible: "+min+"ºC - Temperaturas máxima/mínima alcanzadas: "+tMaxAlc+"ºC/"+tMinAlc+
        "ºC - Temperatura cambiada "+vecesCambiada+" veces");
        return status;
    }
    /**
     * seccion de estadisticas
     */
    public void mostrarEstadisticas(){
        System.out.println("Temperatura actual: "+temperatura+"ºC - Temperatura máxima posible: "+
        max+"ºC - Temperatura mínima posible: "+min+"ºC - Temperaturas máxima/mínima alcanzadas: "+tMaxAlc+"ºC/"+tMinAlc+
        "ºC - Temperatura cambiada "+vecesCambiada+" veces");
    }
}