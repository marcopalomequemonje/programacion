package com.juego.clases;

import com.juego.modelo.Estadisticas;

public class Guerrero implements Clase {
    //CONTRUCTOR
    public Guerrero() {}
//METODOS
    //USAMOS OVERRIDE PARA SOBREESCRIBIR
    @Override
    //FUNCIONES
    public void bonificadorEstadisticas(Estadisticas estadisticas) {
    estadisticas.setFuerza(estadisticas.getFuerza()+3);
    estadisticas.setVida(estadisticas.getVida()+120);
    }
}
