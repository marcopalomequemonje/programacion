import java.util.Scanner;

public class ejercicio2 {
    public static void main(String[] args) {
        System.out.println("Escribe un programa que solicite 20 números enteros. Estos números debemos de introducirlo en un array de 4 filas por 5 columnas. El programa mostrará las sumas parciales de filas y en las columnas el mayor número de la columna. La suma total debe aparecer en la esquina inferior derecha.\n");
        Scanner sc = new Scanner(System.in);
        //Pedimos por teclado los numeros
        System.out.println("Introduce 20 numeros: ");
        //Creamos el array
        int[][] a = new int[4][5];
        //Creamos un for para recorrer el array y almecenar los numeros escritos por teclado
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                //AQUI ES DONDE SE GUARDA EL ARRAY
                a[i][j] = sc.nextInt();
            }
        }
        //Bucle con for para calcular la suma de las filas
       //suma total
        int sumatotal=0;
        for (int i = 0; i < a.length; i++) {
            System.out.println("-------------------------------------------------------------------");
            //CREAMOS LA VARIABLE DE SUMA
            int suma = 0;
            //CREAMOS UN BUCLE PARA QUE VALLA RECORRIENDO EL ARRAY
            for (int j = 0; j < a[i].length; j++) {
                System.out.printf("|%5d",a[i][j]);
                System.out.printf("%5s","");
                suma += a[i][j];
            }
            sumatotal+=suma;

            System.out.printf("|%5s","∑:");
            System.out.printf("%-5d |",suma);
            System.out.println();
        }
        System.out.println("-------------------------------------------------------------------");
        //Bucle para calcular el mayor de las columnas
        for (int i = 0; i < a[0].length; i++) {
            int mayor = a[0][i];
            for (int j = 1; j < a.length; j++) {
                if (a[j][i] > mayor) {
                    mayor = a[j][i];
                }
            }
            System.out.printf("|%5s","∑:");
            System.out.printf("%-5d",mayor);
        }
        System.out.printf("|%7s    |",sumatotal);
        System.out.printf("%-5s","");
        System.out.println();
        System.out.println("-------------------------------------------------------------------");
    }
}
