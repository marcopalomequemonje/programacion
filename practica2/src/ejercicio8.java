import java.util.Scanner;

public class ejercicio8 {
    public static void main(String[] args) {
        System.out.println("Programa Java para leer la altura de N personas y calcular la altura media. Calcular cuántas personas tienen una altura superior a la media y cuántas tienen una altura inferior a la media. El valor de N se pide por teclado y debe ser entero positivo.");
        //Pedimos el valor por teclado
        Scanner sc = new Scanner(System.in);
        //Creamos la variable para pedir y que se almacene el numero escrito por teclado
        System.out.println("Introduce el numero de personas que deseas calcular: ");
        int per=sc.nextInt();
        //Creamos el array con el dato de per pedido por teclado
        double [] a = new double[per];
        //Creamos variable posicion para preguntar por la persona
        int posicion = 0;
        //pide uno por uno su altura
        for (int i = 0; i < a.length; i++) {
            posicion += +1;
            System.out.println("Introduce altura de la persona "+posicion+"en metros con decimal exacto ");
            a[i]= sc.nextDouble();
        }
        //Creamos variables de altura media
        int sup= 0;
        int inf= 0;
        //recorre el array con for y calcula los numeros
        for (int i = 0; i < a.length; i++) {
            //Calcula altura sup
            if (a[i]>=1.74){
                sup++;
            }
            //Calcula altura inf
            else {
                inf++;
            }
        }
        System.out.println("La gente que supera la altura media son:"+sup);
        System.out.println("La gente que se pertenece a la altura inferior son:"+inf);
    }
}
