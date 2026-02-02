package com.juego.modelo;

import java.util.Scanner;

public class Combate {
    private Personaje p1;
    private Personaje p2;
    //CONSTRUCTOR
    public Combate(Personaje p1, Personaje p2) {
        this.p1 = p1;
        this.p2 = p2;
        inicarCombate();
    }
    //INICIAR COMBATE
    public void inicarCombate(){
        //PASO 1: ELEGIR PERSONAJE
        System.out.println("Personaje1:"+p1.toString());
        System.out.println("Personaje2:"+p2.toString());
        //PASO 2: COMIENZA EL COMBATE
        while (p1.getEstadisticas().getVida()>0&&p2.getEstadisticas().getVida()>0){
            //ELEGIR ATAQUE
            Scanner sc= new Scanner(System.in);
            System.out.println("Elige el ataque del jugador 1");

        }
    }
}
