package invertirpila;

import java.util.Scanner;


public class Invertirpila {

    
    public static void main(String[] args) {
        
        int opcion = 0;
        String elemento = "";

        Scanner input = new Scanner(System.in);
        PilaDinamica stack = new PilaDinamica();
        cola cc = new cola();
            
 
        do {
        System.out.println("");
        System.out.println("**************MENU**************");
        System.out.println("[Introducir elementos en la pila---1]");
        System.out.println("[Mostrar Elementos de la pila------2]");
        System.out.println("[Mostrar Elementos de la pila invertidos]---3]");
        System.out.println("[Salir]---4]");
        opcion = input.nextInt();
        System.out.println("");     
            switch(opcion){
      
            case 1:
                
            stack.Empujar(elemento);

            break;
           
            case 2:
            
            stack.mostrarPila();   
                
            break;
            
            case 3:
            
            stack.mostrarPilaInvertida(stack.mostrarPilaInvertida(elemento));  
                
            break;
            
           
            } 
        } while (opcion < 4);

    }

}
