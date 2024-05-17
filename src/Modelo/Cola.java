package Modelo;

import Control.Lista_Botella;

public class Cola {
    private String tipo;
    private Lista_Botella botellas;

    public Cola() {
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Lista_Botella getBotella() {
        return botellas;
    }

    public void setBotella(Lista_Botella botella) {
        this.botellas = botella;
    }
    
     
}
