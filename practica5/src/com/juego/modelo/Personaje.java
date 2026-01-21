package com.juego.modelo;

import com.juego.clases.Clase;
import com.juego.razas.Raza;

public class Personaje {
    private String nombre;
    private Raza raza;
    private Clase clase;
    private Estadisticas estadisticas;

    public Personaje(String nombre,Raza raza, Clase clase){
        this.nombre=nombre;
        this.raza=raza;
        this.clase=clase;
        this.estadisticas=new Estadisticas();
        raza.baseEstadisticas(this.estadisticas);
        clase.bonificadorEstadisticas(this.estadisticas);

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Raza getRaza() {
        return raza;
    }

    public void setRaza(Raza raza) {
        this.raza = raza;
    }

    public Clase getClase() {
        return clase;
    }

    public void setClase(Clase clase) {
        this.clase = clase;
    }

    public Estadisticas getEstadisticas() {
        return estadisticas;
    }

    public void setEstadisticas(Estadisticas estadisticas) {
        this.estadisticas = estadisticas;
    }
}

