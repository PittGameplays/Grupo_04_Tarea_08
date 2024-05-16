package Modelo;

import java.util.Date;

public class Botella {
    private Date fecha_de_cosecha;
    private String cepa;
    private String color;
    private int edad;
    private String nivel_de_azucar;
 
    public Botella() {
    }

    public Botella(Date fecha_de_cosecha, String cepa, String color, int edad, String nivel_de_azucar) {
        this.fecha_de_cosecha = fecha_de_cosecha;
        this.cepa = cepa;
        this.color = color;
        this.edad = edad;
        this.nivel_de_azucar = nivel_de_azucar;
    }

    public Date getFecha_de_cosecha() {
        return fecha_de_cosecha;
    }

    public void setFecha_de_cosecha(Date fecha_de_cosecha) {
        this.fecha_de_cosecha = fecha_de_cosecha;
    }

    public String getCepa() {
        return cepa;
    }

    public void setCepa(String cepa) {
        this.cepa = cepa;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getNivel_de_azucar() {
        return nivel_de_azucar;
    }

    public void setNivel_de_azucar(String nivel_de_azucar) {
        this.nivel_de_azucar = nivel_de_azucar;
    }
   
}
