package com.juego.razas;

import com.juego.modelo.Estadisticas;

public class Enano implements Raza{
    //CONTRUCTOR
    public Enano() {}
//METODOS
    //USAMOS OVERRIDE PARA SOBREESCRIBIR
    @Override
    //FUNCIONES
    public void baseEstadisticas(Estadisticas estadisticas) {
        estadisticas.setFuerza(7);
        estadisticas.setInteligencia(4);
        estadisticas.setDestreza(4);
        estadisticas.setVida(110);
    }
}
