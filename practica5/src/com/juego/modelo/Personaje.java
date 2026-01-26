package com.juego.modelo;

import com.juego.clases.Clase;
import com.juego.habilidades.CuraCuerpoCuerpo;
import com.juego.habilidades.DanioCuerpoCuerpo;
import com.juego.habilidades.DanioDistancia;
import com.juego.habilidades.Habilidad;
import com.juego.razas.Raza;

import java.util.ArrayList;

public class Personaje {
    private String nombre;
    private Raza raza;
    private Clase clase;
    private Estadisticas estadisticas;
    private ArrayList<Habilidad> listaHabilidades;

    public Personaje(String nombre,Raza raza, Clase clase){
        this.nombre=nombre;
        this.raza=raza;
        this.clase=clase;
        this.estadisticas=new Estadisticas();
        raza.baseEstadisticas(this.estadisticas);
        clase.bonificadorEstadisticas(this.estadisticas);
        this.listaHabilidades=new ArrayList<>();

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
    //FUNCIONES
    public void anadirHabilidad() {
        this.listaHabilidades.add(new DanioCuerpoCuerpo());
        this.listaHabilidades.add(new DanioDistancia());
        this.listaHabilidades.add(new CuraCuerpoCuerpo());
    }
}

