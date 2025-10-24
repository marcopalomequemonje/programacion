import java.util.Scanner;

public class ejercicio6 {
    public static void main(String[] args) {
        System.out.println("Programa Java que guarda en un array 10 números enteros que se leen por teclado. A continuación se recorre el array y calcula cuántos números son positivos, cuántos negativos y cuántos ceros.");
        Scanner sc= new Scanner(System.in);
        //Crear Array con 10 numeros
        int [] a = new int[10];
        //Pedir los 10 numeros por teclado
        for (int i = 0; i < a.length; i++) {
            System.out.println("Introduce un número ");
            a[i]= sc.nextInt();
        }
        //Variables negativas, positivas y 0
        int pos=0;
        int neg=0;
        int cero=0;
        //recorre el array con for y calcula los numeros
        for (int i = 0; i < a.length; i++) {
            //Calcula positivos
            if (a[i]>0){
                pos++;
            }
            //Calcula negativos
            else if (a[i]<0){
                neg++;
            }
            //Calcula ceros
            else  {
                cero++;
            }
        }
        //Imprime en pantalla
        System.out.println("Hay "+pos+" números positivos");
        System.out.println("Hay "+neg+" números negativos");
        System.out.println("Hay "+cero+" números ceros");
    }
}
