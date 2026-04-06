package rpg.model;

import java.util.Map;

public class Personaje {
    private int id;
    private String nombre;
    private int nivel;
    private int oro;
    private int vida_actual;
    private Raza id_raza;
    private Clases_RPG id_clase;
    private Ciudades id_ciudad_actual;
    private Map<Items,Integer> inventario;
    private Map<Habilidades, Boolean> habilidades;

    public Personaje(int id, String nombre, int nivel, int oro, int vida_actual, Raza id_raza, Clases_RPG id_clase, Ciudades id_ciudad_actual, Map<Items, Integer> inventario, Map<Habilidades, Boolean> habilidades) {
        this.id = id;
        this.nombre = nombre;
        this.nivel = nivel;
        this.oro = oro;
        this.vida_actual = vida_actual;
        this.id_raza = id_raza;
        this.id_clase = id_clase;
        this.id_ciudad_actual = id_ciudad_actual;
        this.inventario = inventario;
        this.habilidades = habilidades;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    public int getOro() {
        return oro;
    }

    public void setOro(int oro) {
        this.oro = oro;
    }

    public int getVida_actual() {
        return vida_actual;
    }

    public void setVida_actual(int vida_actual) {
        this.vida_actual = vida_actual;
    }

    public Raza getId_raza() {
        return id_raza;
    }

    public void setId_raza(Raza id_raza) {
        this.id_raza = id_raza;
    }

    public Clases_RPG getId_clase() {
        return id_clase;
    }

    public void setId_clase(Clases_RPG id_clase) {
        this.id_clase = id_clase;
    }

    public Ciudades getId_ciudad_actual() {
        return id_ciudad_actual;
    }

    public void setId_ciudad_actual(Ciudades id_ciudad_actual) {
        this.id_ciudad_actual = id_ciudad_actual;
    }

    public Map<Items, Integer> getInventario() {
        return inventario;
    }

    public void setInventario(Map<Items, Integer> inventario) {
        this.inventario = inventario;
    }

    public Map<Habilidades, Boolean> getHabilidades() {
        return habilidades;
    }

    public void setHabilidades(Map<Habilidades, Boolean> habilidades) {
        this.habilidades = habilidades;
    }
}
