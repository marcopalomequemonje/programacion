package com.juego.razas;

import com.juego.modelo.Estadisticas;

public class Enano implements Raza{
    private Estadisticas estadisticas;
    //CONTRUCTOR
    public Enano(Estadisticas estadisticas) {
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
    public void baseEstadisticas(Estadisticas estadisticas) {
        estadisticas.setFuerza(7);
        estadisticas.setInteligencia(4);
        estadisticas.setDestreza(4);
        estadisticas.setVida(110);
    }
}
