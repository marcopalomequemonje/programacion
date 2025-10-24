import java.util.Scanner;

public class ejercicio7 {
    public static void main(String[] args) {
        System.out.println("Programa Java que llene un array con 10 números enteros que se leen por teclado. A continuación calcula y muestra la media de los valores positivos y la de los valores negativos del array.");
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
        int totalpos=0;
        int totalneg=0;
        //recorre el array con for y calcula los numeros
        for (int i = 0; i < a.length; i++) {
            //Calcula positivos
            if (a[i]>0){
                pos++;
                totalpos+=a[i];
            }
            //Calcula negativos
            else if (a[i]<0){
                neg++;
                totalneg+=a[i];
            }

        }
        //Hacer la media
        double divpos = totalpos/pos;
        double divneg = totalneg/neg;
        //Imprime en pantalla
        System.out.println("Hay "+pos+" números positivos");
        System.out.println("Hay "+neg+" números negativos");
        System.out.println("Media de los valores positivos: "+divpos);
        System.out.println("Media de los valores positivos: "+divneg);
    }
}
