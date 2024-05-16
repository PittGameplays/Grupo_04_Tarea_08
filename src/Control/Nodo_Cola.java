package Control;

import Modelo.Cola;

public class Nodo_Cola {
    Cola elemento;      
    Nodo_Cola siguiente;
    
    public Nodo_Cola(Cola elemento) {
        this.elemento = elemento;
        siguiente = null;
    }

    public Nodo_Cola(Cola elemento, Nodo_Cola siguiente) {
        this.elemento = elemento;
        this.siguiente = siguiente;
    }

    public Cola getElemento() {
        return elemento;
    }

    public Nodo_Cola getSiguiente() {
        return siguiente;
    }

    public void setElemento(Cola elemento) {
        this.elemento = elemento;
    }

    public void setSiguiente(Nodo_Cola siguiente) {
        this.siguiente = siguiente;
    }
}

