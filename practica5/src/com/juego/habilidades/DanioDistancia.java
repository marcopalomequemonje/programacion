package com.juego.habilidades;

public class DanioDistancia implements Habilidad{
    private String nombre;
    private int danio;
    private int contador;

    public DanioDistancia() {
        this.nombre = "Ataque Táctico";
        this.danio = 90;
        this.contador = 1;
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

    @Override
    public void usarHabilidad() {
        this.contador--;
    }
}
