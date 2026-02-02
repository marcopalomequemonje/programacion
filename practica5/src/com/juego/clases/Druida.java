package com.juego.clases;

import com.juego.modelo.Estadisticas;

public class Druida implements Clase {
    //CONTRUCTOR
    public Druida(Estadisticas estadisticas) {}
//METODOS
    //USAMOS OVERRIDE PARA SOBREESCRIBIR
    @Override
    //FUNCIONES
    public void bonificadorEstadisticas(Estadisticas estadisticas) {
    estadisticas.setFuerza(estadisticas.getFuerza()+2);
    estadisticas.setInteligencia(estadisticas.getInteligencia()+1);
    estadisticas.setVida(estadisticas.getVida()+100);
    }
}
