package com.juego.clases;

import com.juego.modelo.Estadisticas;

public class Sacerdote implements Clase {
    private Estadisticas estadisticas;
    //CONTRUCTOR
    public Sacerdote(Estadisticas estadisticas) {
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
    estadisticas.setInteligencia(estadisticas.getInteligencia()+3);
    estadisticas.setVida(estadisticas.getVida()+95);
    }
}
