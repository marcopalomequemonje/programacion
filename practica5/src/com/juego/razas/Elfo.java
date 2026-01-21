package com.juego.razas;

import com.juego.modelo.Estadisticas;

public class Elfo implements Raza{
    private Estadisticas estadisticas;
    //CONTRUCTOR
    public Elfo(Estadisticas estadisticas) {
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
        estadisticas.setFuerza(4);
        estadisticas.setInteligencia(6);
        estadisticas.setDestreza(7);
        estadisticas.setVida(90);
    }
}
