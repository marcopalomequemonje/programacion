package com.rpg.utils;

import java.io.*;
import java.lang.reflect.Field;
import java.util.ArrayList;

public class FileHelper {

    // GUARDAR CSV
    public static <T> void guardarCSV(String path, ArrayList<T> lista) {
        //SI la lista esta vacia o es nula no ejecuta, sale sin devolver nada
        if (lista == null || lista.isEmpty()) return;

        try (BufferedWriter bw = new BufferedWriter(new FileWriter(path))) {

            // Cabecera con nombres de campos
            //Field es un tipo de clase y extrae los nombres de los campos
            Field[] campos = lista.get(0).getClass().getDeclaredFields();
            for (int i = 0; i < campos.length; i++) {
                //escribe el elemento selecionado (su nombre en la cabecera)
                bw.write(campos[i].getName());
                //comprueba que no sea el ultimo campo y si se cumple pone en nuestro caso el ; (lo del split)
                if (i < campos.length - 1) bw.write(";");
            }
            //una vez ejecutado salta a la siguiente linea y se vuelve a repetir el mismo bucle
            bw.newLine();

            // Datos
            for (T obj : lista) {
                //recorre los campos anteriores
                for (int i = 0; i < campos.length; i++) {
                    //con la funcion accesible lo hace publico para poder consultar el valor
                    campos[i].setAccessible(true);
                    //obtiene el valor de la propiedad
                    Object valor = campos[i].get(obj);
                    //convierte ese valor a String y lo almacena
                    bw.write(valor != null ? valor.toString() : "");
                    //separa datos
                    if (i < campos.length - 1) bw.write(";");
                }
                //vuelve a ejecutar
                bw.newLine();
            }

            System.out.println("CSV guardado correctamente");

        } catch (Exception e) {
            System.out.println("Error guardando CSV: " + e.getMessage());
        }
    }

    // ABRIR CSV
    public static <T> void abrirCSV(String path, ArrayList<T> lista, Class<T> tipo) {
        lista.clear();

        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            //LEE LA PRIMERA LINEA Y SI ESTA VACIA NO DEVUELVE NADA
            String cabecera = br.readLine(); // nombres campos
            if (cabecera == null) return;
            //COGE LA LINEA Y LA CORTA CADCA VEZ QUE ENCUENTRA UN ; Y SEPARA DATOS PARA ALMECENARLOS
            String[] nombresCampos = cabecera.split(";");

            Field[] campos = tipo.getDeclaredFields();

            String linea;
            while ((linea = br.readLine()) != null) {
                //Coge todos los valores y los almecena en String
                String[] valores = linea.split(";");
                //crea un objeto del tipo que sea llamando a su constructor por defecto
                T obj = tipo.getDeclaredConstructor().newInstance();
                //recorre los nombres de los campos
                for (int i = 0; i < nombresCampos.length; i++) {
                    //coge el campo
                    Field campo = campos[i];
                    //lo hace publico
                    campo.setAccessible(true);

                    //esto lo que hace es convertir el valor al tipo de dato correspondiente y guardarlo en el objeto.
                    Object valorConvertido = convertir(valorSeguro(valores, i), campo.getType());
                    campo.set(obj, valorConvertido);
                }
                //aqui añade a la lista el objeto creado
                lista.add(obj);
            }

            System.out.println("CSV cargado correctamente");

        } catch (Exception e) {
            System.out.println("Error abriendo CSV: " + e.getMessage());
        }
    }
    //metodo que convierte cualquier valor que falte en la linea extraida a una cadena vacia
    private static String valorSeguro(String[] valores, int i) {
        if (i >= valores.length) return "";
        return valores[i];
    }
    //segun el tipo de dato hace un parseo a lo que sea
    private static Object convertir(String valor, Class<?> tipo) {
        if (tipo == int.class || tipo == Integer.class) return Integer.parseInt(valor);
        if (tipo == double.class || tipo == Double.class) return Double.parseDouble(valor);
        if (tipo == boolean.class || tipo == Boolean.class) return Boolean.parseBoolean(valor);
        if (tipo == long.class || tipo == Long.class) return Long.parseLong(valor);
        return valor;
    }
}