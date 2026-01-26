package com.juego.habilidades;

public class DanioCuerpoCuerpo implements Habilidad {
    private String nombre;
    private int danio;
    private int contador;

    public DanioCuerpoCuerpo() {
        this.nombre = "Puñetazo";
        this.danio = 35;
        this.contador = 5;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getDanio() {
        return danio;
    }

    public void setDanio(int danio) {
        this.danio = danio;
    }

    public int getContador() {
        return contador;
    }

    public void setContador(int contador) {
        this.contador = contador;
    }
    //FUNCIONES

    @Override
    public void usarHabilidad() {
        this.contador--;
    }
}
