package Modelo;

import java.util.List;

public class Cola {
    private String tipo;
    private List<String> botella;

    public Cola() {
    }

    public Cola(String tipo, List<String> botella) {
        this.tipo = tipo;
        this.botella = botella;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public List<String> getBotella() {
        return botella;
    }

    public void setBotella(List<String> botella) {
        this.botella = botella;
    }
    
     
}
