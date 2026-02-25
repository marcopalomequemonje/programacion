package com.juego.razas;

import com.juego.modelo.Estadisticas;

public class Humano implements Raza {
    private String nombre;
    //CONTRUCTOR
    public Humano(String nombre) {
        this.nombre = nombre;
    }
    //METODOS GET Y SET
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    //USAMOS OVERRIDE PARA SOBREESCRIBIR
    @Override
    //FUNCIONES

    public void baseEstadisticas(Estadisticas estadisticas) {
        estadisticas.setFuerza(5);
        estadisticas.setInteligencia(5);
        estadisticas.setDestreza(5);
        estadisticas.setVida(100);
    }
}
