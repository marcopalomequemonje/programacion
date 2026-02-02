package com.juego.clases;

import com.juego.modelo.Estadisticas;

public class Pícaro implements Clase{
    //CONTRUCTOR
    public Pícaro() {}
//METODOS
    //USAMOS OVERRIDE PARA SOBREESCRIBIR
    @Override
    //FUNCIONES
    public void bonificadorEstadisticas(Estadisticas estadisticas) {
    estadisticas.setDestreza(estadisticas.getDestreza()+3);
    estadisticas.setVida(estadisticas.getVida()+105);
    }
}
