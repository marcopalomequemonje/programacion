import java.util.Scanner;

public class ejercicio2 {
    public static void main(String [] args) {
        System.out.println("Muestra por pantalla todos los elementos de un array de números enteros separados por\n" +
                "un espacio.");
        //Crea un array de 5 numeros enteros
        int[] a = {13,23,33,43,53};
        for (int i=0; i<a.length; i++) {
            System.out.print(i + "->"+a[i]+"   " );
        }
    }
}

