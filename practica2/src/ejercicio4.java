public class ejercicio4 {
    public static void main(String [] args) {
        System.out.println("Crea un array de números de 100 posiciones, que contendrá los números del 1 al 100.\n" +
                "Obtén la suma de todos ellos y la media");
        //Crea un array de 100 posiciones
        int[] a=new int[100];
        //Bucle para crear los numeros
        for (int i=0; i<a.length; i++){
            int x=i+1;
            System.out.println("Número " +x);
            a[i]=x;
        }
        //Bucle para recorrer el array con posiciones
        for (int i=0; i<a.length; i++){
            System.out.println(a[i]);
        }
}
}
