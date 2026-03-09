package com.rpg.model;


public class Personaje {
    private String DNI;
    private String nombre;
    private Integer edad;
    private String sexo;
    private double sueldo_bruto;

    public Personaje(){}

    public Personaje(String DNI, String nombre, Integer edad, String sexo, double sueldo_bruto) {
        this.DNI = DNI;
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;
        this.sueldo_bruto = sueldo_bruto;
    }

    public String getDNI() {
        return DNI;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public double getSueldo_bruto() {
        return sueldo_bruto;
    }

    public void setSueldo_bruto(double sueldo_bruto) {
        this.sueldo_bruto = sueldo_bruto;
    }


    @Override
    public String toString() {
        return "Personaje{" +
                "DNI='" + DNI + '\'' +
                ", nombre='" + nombre + '\'' +
                ", edad=" + edad +
                ", sexo='" + sexo + '\'' +
                ", sueldo_bruto=" + sueldo_bruto +
                    '}';
    }
}
