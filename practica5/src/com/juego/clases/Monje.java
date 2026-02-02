package com.juego.clases;

import com.juego.modelo.Estadisticas;

public class Monje implements Clase{
    //CONTRUCTOR
    public Monje() {}
//METODOS GET Y SET

    //USAMOS OVERRIDE PARA SOBREESCRIBIR
    @Override
    //FUNCIONES
    public void bonificadorEstadisticas(Estadisticas estadisticas) {
    estadisticas.setFuerza(estadisticas.getFuerza()+2);
    estadisticas.setDestreza(estadisticas.getDestreza()+1);
    estadisticas.setVida(estadisticas.getVida()+110);
    }
}
