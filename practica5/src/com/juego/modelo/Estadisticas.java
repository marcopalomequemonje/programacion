package com.juego.modelo;
//ATRIBUTOS ESTADISTICAS
public class Estadisticas {
    private int fuerza;
    private  int inteligencia;
    private int destreza;
    private int vida;
//CONTRUCTOR ESTADISTICAS
    public Estadisticas() {
        this.fuerza = 0;
        this.inteligencia = 0;
        this.destreza = 0;
        this.vida = 0;
    }
//METODO GET Y SET FUERZA
    public int getFuerza() {
        return fuerza;
    }

    public void setFuerza(int fuerza) {
        this.fuerza = fuerza;
    }
//METODO GET Y SET INTELIGENCIA
    public int getInteligencia() {
        return inteligencia;
    }

    public void setInteligencia(int inteligencia) {
        this.inteligencia = inteligencia;
    }
//METODO GET Y SET DESTREZA
    public int getDestreza() {
        return destreza;
    }

    public void setDestreza(int destreza) {
        this.destreza = destreza;
    }
//METODO GET Y SET VIDA
    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }
}