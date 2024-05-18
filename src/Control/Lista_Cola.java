package Control;

import Modelo.Botella;
import Modelo.Cola;

public class Lista_Cola {

    private Nodo_Cola inicio, fin;
    private int organizar = 0;

    public void setOrganizar(int organizar) {
        this.organizar = organizar;
    }

    public int getOrganizar() {
        return organizar;
    }

    public Lista_Cola() {
        for (int i = 0; i < 12; i++) {
            Nodo_Cola nuevo = new Nodo_Cola(new Cola());
            if (inicio == null) {
                inicio = nuevo;
            } else {
                fin.setSiguiente(nuevo);
                nuevo.setSiguiente(inicio);
            }
            fin = nuevo;
        }
    }

    public boolean agregarBotella(Botella elemento) {
        
        String encontrar;
        switch (organizar) {
            case 0:
                encontrar = elemento.getCepa();
                break;
            case 1:
                encontrar = elemento.getColor();
                break;
            case 2:
                encontrar = elemento.getEdad();
                break;
            default:
                encontrar = elemento.getNivel_de_azucar();
        }
        
        Cola temp = EncontrarTipo(encontrar);
        if (temp != null) {
            temp.getBotella().agregar(elemento);
        } else if ((temp = EncontrarVacio()) != null) {
            temp.setTipo(encontrar);
            temp.getBotella().agregar(elemento);
        } else {
            return false;
        }
        return true;
    }

    public Cola EncontrarTipo(String tipo) {
        Nodo_Cola aux = inicio;
        do {
            if (aux.getElemento().getTipo().equals(tipo)
                    && aux.getElemento().getBotella().Recorrer_Pila_Contar() < 12) {
                
                return aux.getElemento();
            }
            aux = aux.getSiguiente();
        } while (aux != inicio);
        return null;
    }

    public Cola EncontrarVacio() {
        Nodo_Cola aux = inicio;
        do {
            if (aux.getElemento().getTipo().equals("")) {
                return aux.getElemento();
            }
            aux = aux.getSiguiente();
        } while (aux != inicio);
        return null;
    }

    public Cola EncontrarPilaSiguiente(Lista_Botella aaa) {
        Nodo_Cola aux = inicio;
        do {
            if (aux.getElemento().getBotella().equals(aaa)) {
                return aux.getSiguiente().getElemento();
            }
            aux = aux.getSiguiente();
        } while (aux != inicio);
        return null;
    }

    public Cola EncontrarPilaAnterior(Lista_Botella aaa) {
        Nodo_Cola anterior = fin;
        Nodo_Cola aux = inicio;
        do {
            if (aux.getElemento().getBotella().equals(aaa)) {
                return anterior.getElemento();
            }
            anterior = anterior.getSiguiente();
            aux = aux.getSiguiente();
        } while (aux != inicio);
        return null;
    }

    public boolean Reorganizar(int tipo) {
        Lista_Botella temp = new Lista_Botella();
        Nodo_Cola aux = inicio;
        do {
            aux.getElemento().getBotella().transferir(temp);
            aux = aux.getSiguiente();
        } while (aux != inicio);

        do {
            aux.getElemento().setTipo("");
            aux = aux.getSiguiente();
        } while (aux != inicio);

        organizar = tipo;
        return temp.reorganizar(this);
    }
    
    

    public Cola getInicio() {
        return inicio.getElemento();
    }
}
