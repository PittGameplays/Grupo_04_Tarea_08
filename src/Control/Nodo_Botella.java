package Control;

import Modelo.Botella;

public class Nodo_Botella {
    private Botella elemento;
    private Nodo_Botella siguiente;

    public Botella getElemento(){
        return elemento;
    }

    public Nodo_Botella getSiguiente(){
        return siguiente;
    }

    public void setElemento(Botella elemento){
        this.elemento = elemento;
    }

    public void setSiguiente(Nodo_Botella siguiente){
        this.siguiente = siguiente;
    }
}
