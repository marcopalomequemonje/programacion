package com.juego.clases;

import com.juego.modelo.Estadisticas;
//ATRIBUTOS
public class Bardo implements Clase {

//CONTRUCTOR
    public Bardo() {
    }

    //USAMOS OVERRIDE PARA SOBREESCRIBIR
    @Override
    //FUNCIONES
    public void bonificadorEstadisticas(Estadisticas estadisticas) {
        estadisticas.setInteligencia(estadisticas.getInteligencia()+3);
        estadisticas.setVida(estadisticas.getVida()+90);
    }
}

