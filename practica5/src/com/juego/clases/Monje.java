package com.juego.clases;

import com.juego.modelo.Estadisticas;

public class Monje implements Clase{
    private Estadisticas estadisticas;
    //CONTRUCTOR
    public Monje(Estadisticas estadisticas) {
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
    estadisticas.setDestreza(estadisticas.getDestreza()+1);
    estadisticas.setVida(getEstadisticas().getVida()+110);
    }
}
