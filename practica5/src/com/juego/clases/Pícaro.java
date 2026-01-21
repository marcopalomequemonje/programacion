package com.juego.clases;

import com.juego.modelo.Estadisticas;

public class Pícaro implements Clase{
    private Estadisticas estadisticas;
    //CONTRUCTOR
    public Pícaro(Estadisticas estadisticas) {
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
    public void bonificadorEstadisticas(Estadisticas estadisticas) {

    }
}
