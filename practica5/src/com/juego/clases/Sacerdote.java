package com.juego.clases;

import com.juego.modelo.Estadisticas;

public class Sacerdote implements Clase {
    //CONTRUCTOR
    public Sacerdote() {}
//METODOS
    //USAMOS OVERRIDE PARA SOBREESCRIBIR
    @Override
    //FUNCIONES
    public void bonificadorEstadisticas(Estadisticas estadisticas) {
    estadisticas.setInteligencia(estadisticas.getInteligencia()+3);
    estadisticas.setVida(estadisticas.getVida()+95);
    }
}
