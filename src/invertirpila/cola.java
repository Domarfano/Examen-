package invertirpila;

public class cola {  
    
    
    PilaDinamica Pila = new PilaDinamica();
    NodoPila front, ultimo;
    int nro, tamanio;

    private void insertar(NodoPila cima) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    class Nodo {
        int info;
        Nodo sig;
    }
    
    private Nodo raiz,fondo;
    
    cola() {
        raiz=null;
        fondo=null;
    }
    
    boolean vacia (){
        if (raiz == null)
            return true;
        else
            return false;
    }

    void insertar (int info)
    {
        Nodo nuevo;
        nuevo = new Nodo ();
        nuevo.info = info;
        nuevo.sig = null;
        if (vacia ()) {
            raiz = nuevo;
            fondo = nuevo;
        } else {
            fondo.sig = nuevo;
            fondo = nuevo;
        }
    }

    int extraer ()
    {
        if (!vacia ())
        {
            int informacion = raiz.info;
            if (raiz == fondo){
                raiz = null;
                fondo = null;
            } else {
                raiz = raiz.sig;
            }
            return informacion;
        } else
            return Integer.MAX_VALUE;
    }

    public String imprimir() {
        Nodo reco=raiz;
        System.out.println("Listado de todos los elementos de la cola.");
        while (reco!=null) {
            System.out.print(reco.info+"-");
            reco=reco.sig;
        }
        System.out.println();
        return null;
    }

    
}
