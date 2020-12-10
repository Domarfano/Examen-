
package invertirpila;

import java.util.Scanner;

public class PilaDinamica {
 
    NodoPila cima, base;
    int tamanio;
    Scanner input = new Scanner(System.in);
 
    public boolean estaVacia() {
        return cima == null;
    }
 
    public void Empujar(String elemento) {
        
        System.out.println("");
        System.out.println("Introduzca X, elemento en la pila");
        elemento = input.nextLine();
        
        NodoPila nuevo = new NodoPila(elemento);
        nuevo.siguiente = cima;
        cima = nuevo;
        tamanio++;
               
    }
 
    public String SacarPila() {
        String auxiliar = cima.elemento;
        cima = cima.siguiente;
        tamanio--;
        return auxiliar;
    }
     
    public String mostrarPila() {
        NodoPila recorre = cima;
        while(recorre!=null) {
           
            System.out.println("---[" + recorre.elemento + "] Elemento de la pila");
            recorre = recorre.siguiente;
        }
        return null;
    }
    
    public String mostrarPilaInvertida(String elemento){
    
        NodoPila recorre = cima;
        NodoPila nuevo = new NodoPila(elemento);
        
        nuevo.siguiente = recorre;
        base = nuevo;
        tamanio++;
         
        while(base!=null) {
    
            System.out.println("---[" +base.elemento + "] Elemento de la pila");
            base = base.siguiente;
        }
        return null;
        
        
    }

    void mostrarPilaInvertida() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}