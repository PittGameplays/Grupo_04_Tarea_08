package Control;

import Modelo.Cola;

public class Lista_Cola {
    Nodo_Cola inicio ,fin;
    int tamaño=0;
    
    public boolean ColaVacia(){
        return inicio ==null;
    }
 
    public void Agregar(Cola elemento){
      if(tamaño<=12){
            Nodo_Cola nuevo  = new Nodo_Cola(elemento);
        if(ColaVacia()){
            inicio= nuevo;
        }else{
            fin.siguiente =nuevo;
        }
        fin = nuevo;
        tamaño++;
      }
    }
    
    public Cola EliminarCola(){
        Cola auxiliar = inicio.elemento;
        inicio = inicio.siguiente;
        tamaño--;
        return auxiliar;
    }
    
    public Cola InicioCola(){
        return inicio.elemento;
    }
}
