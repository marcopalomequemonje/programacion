import java.util.Scanner;

public class ejercicio5 {
    public static void main(String[] args) {
        System.out.println("Crea un array de números donde le indicamos por teclado el tamaño del array, rellenaremos el array con números aleatorios entre 0 y 9, al final muestra por pantalla el valor de cada posición y la suma de todos los valores.");
        //Pide el numero del array por teclado
        Scanner sc = new Scanner(System.in);
        System.out.println("Establece el tamaño que desees para crear un Array");
        int x = sc.nextInt();
        //Array
        int[] a = new int[x];
        //Crear la variable de suma
        int sum = 0;
        //Bucle para crear numeros aleatorios y mostrar su posición y números.
        for (int i = 0; i < a.length; i++) {
            a[i] = (int) (Math.random() * 9);
            System.out.println("[" + i + "]=" + a[i]);
            //suma
            sum = sum + a[i];
        }
        //mostrar resultado
        System.out.println("Suma de todos ellos " + sum);
    }
}
