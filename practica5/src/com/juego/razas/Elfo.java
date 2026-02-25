package com.juego.razas;

import com.juego.modelo.Estadisticas;

public class Elfo implements Raza{
    //CONTRUCTOR
    public Elfo() {}
//METODOS
    //USAMOS OVERRIDE PARA SOBREESCRIBIR
    @Override
    //FUNCIONES
    public void baseEstadisticas(Estadisticas estadisticas) {
        estadisticas.setFuerza(4);
        estadisticas.setInteligencia(6);
        estadisticas.setDestreza(7);
        estadisticas.setVida(90);
    }
}
