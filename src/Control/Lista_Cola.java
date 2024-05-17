package Control;

import Modelo.Cola;

public class Lista_Cola {

    Nodo_Cola inicio, fin;

    public Lista_Cola() {
        for (int i = 0; i < 12; i++) {
            Nodo_Cola nuevo = new Nodo_Cola(new Cola());
            if (inicio == null) {
                inicio = nuevo;
            } else {
                fin.siguiente = nuevo;
            }
            fin = nuevo;
        }
    }

    public Cola Encontrar(String tipo) {
        for (Nodo_Cola aux = inicio; aux != null; aux = aux.getSiguiente()) {
            if (aux.getElemento().getTipo().equals(tipo) && aux.getElemento().getBotella().Recorrer_Pila_Contar() < 12) {
                return aux.getElemento();
            }
        }
        return null;
    }

    public Cola InicioCola() {
        return inicio.elemento;
    }
}
