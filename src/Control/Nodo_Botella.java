package Control;

import Modelo.Botella;

public class Nodo_Botella {
    private Botella elemento;
    private Nodo_Botella anterior, siguiente;

    public Nodo_Botella(Botella elemento) {
        this.elemento = elemento;
        anterior = siguiente = null;
    }

    public Nodo_Botella getAnterior() {
        return anterior;
    }

    public void setAnterior(Nodo_Botella anterior) {
        this.anterior = anterior;
    }

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
