package Control;

import Modelo.Botella;

public class Lista_Botella {
    Nodo_Botella inicio, ultimo;

    public Lista_Botella() {
        inicio = ultimo = null;
    }
    
    public void agregar(Botella elemento){
        Nodo_Botella nuevo = new Nodo_Botella(elemento);
        
        if(colaVacia()){
            inicio = ultimo = nuevo;
        }
    }
    
    public boolean colaVacia(){
        return inicio == null;
    }
}
