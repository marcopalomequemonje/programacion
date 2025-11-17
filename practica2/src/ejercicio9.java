import java.util.Scanner;

public class ejercicio9 {
    public static void main(String[] args) {
        System.out.println("Crea un programa en Java que:\n" +
                "Pida al usuario por teclado 10 números enteros y los guarde en un array.\n" +
                "Recorra el array para encontrar:\n" +
                "El valor máximo y la posición en la que aparece.\n" +
                "El valor mínimo y la posición en la que aparece\n");

        Scanner sc = new Scanner(System.in);
        //Crear Array con 10 numeros
        int[] a = new int[10];
        //Pedir los 10 numeros por teclado
        for (int i = 0; i < a.length; i++) {
            int posicion=i;
            posicion++;
            System.out.println("Introduce número "+posicion);
            a[i] = sc.nextInt();
        }
        //Recorra el array para encontrar:El valor máximo y la posición en la que aparece.
        //Crear variable max y menor y posicion
        int maxpos= 0;
        int menorpos= 0;
        int max = 0;
        int menor = 0;
        //Bucle para comprobar el menor
        for (int i = 0; i < a.length; i++) {
            if (a[i] > max) {
                max = a[i];
                maxpos= i;
            }
            else if (a[i] < menor) {
                menor=a[i];
                menorpos=i;
            }
        }
        System.out.println("Valor máximo: "+max +" en la posición "+maxpos);
        System.out.println("Valor minimo: "+menor +" en la posición "+menorpos);
    }
}