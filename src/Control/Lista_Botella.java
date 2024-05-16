package Control;

import Modelo.Botella;

public class Lista_Botella {
    Nodo_Botella inicio, fin;

    public Lista_Botella() {
        inicio = fin = null;
    }
    
    public void agregar(Botella elemento){
        Nodo_Botella nuevo = new Nodo_Botella(elemento);
        
        if(colaVacia()){
            inicio = fin = nuevo;
        } else {
            nuevo.setSiguiente(inicio);
            inicio.setAnterior(nuevo);
            inicio = nuevo;
        }
    }
    
    public boolean colaVacia(){
        return inicio == null;
    }
    
    public Botella retirar(){
        if(!colaVacia()){
            Botella temp = fin.getElemento();
            fin = fin.getAnterior();
            fin.setSiguiente(null);
            return temp;
        }
        return null;
    }
}
