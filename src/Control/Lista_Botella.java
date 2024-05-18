package Control;

import Modelo.Botella;
import javax.swing.table.DefaultTableModel;

public class Lista_Botella {

    Nodo_Botella inicio, fin;

    public Lista_Botella() {
        inicio = fin = null;
    }

    public Nodo_Botella getInicio() {
        return inicio;
    }

    public void agregar(Botella elemento) {
        Nodo_Botella nuevo = new Nodo_Botella(elemento);

        if (colaVacia()) {
            inicio = fin = nuevo;
        } else {
            nuevo.setSiguiente(inicio);
            inicio.setAnterior(nuevo);
            inicio = nuevo;
        }
    }

    public boolean colaVacia() {
        return inicio == null;
    }

    public int Recorrer_Pila_Contar() {
        int a = 0;
        for (Nodo_Botella aux = inicio; aux != null; aux = aux.getSiguiente()) {
            a++;
        }
        return a;
    }

    public Botella retirar() {
        if (!colaVacia()) {
            Botella temp = fin.getElemento();
            if (fin == inicio) {
                inicio = fin = null;
            } else {
                fin = fin.getAnterior();
                fin.setSiguiente(null);
            }
            return temp;
        }
        return null;
    }

    public void listar(DefaultTableModel modTabla) {
        modTabla.setRowCount(0);
        for (Nodo_Botella aux = inicio; aux != null; aux = aux.getSiguiente()) {
            modTabla.addRow(aux.getElemento().getRegistro());
        }
    }

    public void transferir(Lista_Botella temp) {
        int cont = Recorrer_Pila_Contar();
        for (int i = 0; i < cont; i++) {
            temp.agregar(this.retirar());
        }
    }

    public boolean reorganizar(Lista_Cola lista) {
        int cont = Recorrer_Pila_Contar();
        for (int i = 0; i < cont; i++) {
            if(!lista.agregarBotella(retirar())){
                return false;
            }
        }
        return true;
    }

}
