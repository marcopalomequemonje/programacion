package com.juego.clases;

import com.juego.modelo.Estadisticas;

public class Paladín implements Clase{
    private Estadisticas estadisticas;
    //CONTRUCTOR
    public Paladín(Estadisticas estadisticas) {
        this.estadisticas = estadisticas;
    }
//METODOS GET Y SET

    public Estadisticas getEstadisticas() {
        return estadisticas;
    }

    public void setEstadisticas(Estadisticas estadisticas) {
        this.estadisticas = estadisticas;
    }
    //USAMOS OVERRIDE PARA SOBREESCRIBIR
    @Override
    //FUNCIONES
    public void bonificadorEstadisticas(Estadisticas estadisticas) {
    estadisticas.setFuerza(estadisticas.getFuerza()+2);
    estadisticas.setInteligencia(estadisticas.getInteligencia()+1);
    estadisticas.setVida(estadisticas.getVida()+115);
    }
}
