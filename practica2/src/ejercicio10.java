import java.util.Scanner;

public class ejercicio10 {
    public static void main(String[] args) {
        System.out.println("Crea un programa que muestre por pantalla la nota de un estudiante, de entre una lista de estudiantes con sus respectivas notas. El nombre del estudiante lo introduce el usuario por teclado (usa la clase Scanner). Utiliza un array para los nombres de los alumnos y otro para las notas. ¿Serías capaz de hacerlo con un array BIdimensional?");
        //Pedir nombre por teclado por teclado
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el nombre del alumno ");
        String nombre= sc.nextLine();
        //Crear Arrays
        String[] aestudiantes={"Marco","Alvaro","Sergio","Raul","Cristian"};
        double[] notas={10,9.7,4,2.5,8};
        //Hacemos un bucle con for para recorrer el array
        for (int i = 0; i < aestudiantes.length ; i++) {
            if (aestudiantes[i].equals(nombre)) {
                System.out.println("La nota del alumno "+aestudiantes[i]+" es "+notas[i]+" sobre 10");
            }
        }
    }
}
