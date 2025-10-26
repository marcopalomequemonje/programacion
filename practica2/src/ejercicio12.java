import java.util.Scanner;

public class ejercicio12 {
    public static void main() {
        //Pide el dni por teclado
        Scanner sc= new Scanner(System.in);
        System.out.println("Introduce DNI sin letra: ");
        //Crear el array
        String[] abc = {"T", "R", "W", "A", "G", "M", "Y", "F", "P", "D", "X", "B", "N", "J", "Z", "S", "Q", "V", "H", "L", "C", "K", "E"};
        //Crear variables dni
        int dni=sc.nextInt();
        int l=dni%23;
        System.out.println("La letra del DNI introducido es "+abc[l]);
    }
}
