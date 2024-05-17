package Control;

import Modelo.Botella;
import Modelo.Cola;
import javax.swing.JOptionPane;

public class Lista_Cola {

    private Nodo_Cola inicio, fin;
    private int organizar = 0;

    public void setOrganizar(int organizar) {
        this.organizar = organizar;
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
    
    public void agregarBotella(Botella elemento){
        Cola temp = EncontrarTipo(elemento.getCepa());
        if(temp != null){
            temp.getBotella().agregar(elemento);
        } else if((temp = EncontrarVacio()) != null){
            temp.setTipo(elemento.getCepa());
            temp.getBotella().agregar(elemento);
        } else {
            JOptionPane.showMessageDialog(null, "No se ha encontrado ninguna columna disponible");
        }
    }

    public Cola EncontrarTipo(String tipo) {
        for (Nodo_Cola aux = inicio; aux != null; aux = aux.getSiguiente()) {
            if (aux.getElemento().getTipo().equals(tipo) && aux.getElemento().getBotella().Recorrer_Pila_Contar() < 12) {
                return aux.getElemento();
            }
        }
        return null;
    }
    
    public Cola EncontrarVacio() {
        for (Nodo_Cola aux = inicio; aux != null; aux = aux.getSiguiente()) {
            if (aux.getElemento().getTipo().equals("")) {
                return aux.getElemento();
            }
        }
        return null;
    }

    public Cola InicioCola() {
        return inicio.getElemento();
    }
}
