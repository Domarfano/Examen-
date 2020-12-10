package invertirpila;

import invertirpila.cola.Nodo;

public class NodoPila {
 
        
    String elemento;
    Nodo nodo;

    public NodoPila siguiente, anterior;
   
    public NodoPila(String elemento) {
        this.elemento = elemento;
        siguiente = null;
    }
    

 
}