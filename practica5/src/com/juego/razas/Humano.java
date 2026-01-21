package com.juego.razas;

import com.juego.modelo.Estadisticas;

public class Humano implements Raza {
    //CONTRUCTOR
    public Humano() {
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
