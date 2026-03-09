package com.rpg.utils;

import com.rpg.model.Ciudad;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class TxtHelper {
    public static List<Ciudad> readList (String path){
        ArrayList<Ciudad> ciudades=new ArrayList<>();
        //INTENTA EJECUTAR Y SI SALTA SE VA LA INFORMANCION AL CATCH
        try{
            //ABRE EL ARCHIVO
            FileReader fr=new FileReader(path);
            //LEE EL ARCHIVO
            BufferedReader br=new BufferedReader(fr);
            //LEE POR LINEAS
            String line=br.readLine();
            while (line!=null){
                //EL SPLIT INDICA EL SEPARADOR EM ESTE CASO ;
                String[] datos = line.split(";");
                String nombre=datos[0];
                int poblacion=Integer.parseInt(datos[1]);
                String clima=datos[2];
                int riesgo=Integer.parseInt(datos[3]);
                Ciudad ciudad=new Ciudad(nombre,poblacion,clima,riesgo);
                ciudades.add(ciudad);
                line=br.readLine();
            }
            br.close();
        //Sirve para capturar errores
        }catch (Exception ex){
            System.out.println("Hubo un error al leer el archivo"+ex.getMessage());
        }
        return ciudades;
    }
}
