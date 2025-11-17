import java.util.Scanner;

public class ejercicio1 {
    public static void main(String [] args) {
        System.out.println("Crea un array de 10 posiciones de números con valores pedidos por teclado. Muestra por\n" +
                "consola el índice y el valor al que corresponde");
        //Crea un array de 10 posiciones de números pedidos por teclado
        Scanner sc = new Scanner(System.in);
        int[] arrayInt = new int [10];
        for (int i=0; i<arrayInt.length; i++){
            System.out.println("Introduce el siguiente valor:");
            arrayInt[i] = sc.nextInt();
        }
        //Muestra por consola el indice y el valor
        for (int i=0; i<arrayInt.length; i++) {
            System.out.println(i+"->"+arrayInt[i]);
        }
    }
}
