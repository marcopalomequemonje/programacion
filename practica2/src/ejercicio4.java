public class ejercicio4 {
    public static void main(String [] args) {
        System.out.println("Crea un array de números de 100 posiciones, que contendrá los números del 1 al 100.\n" +
                "Obtén la suma de todos ellos y la media.");
        //Crea un array de 100 posiciones
        int[] a=new int[100];
        //Bucle para crear los numeros
        for (int i=0; i<a.length; i++){
            int x=i+1;
            a[i]=x;
        }
        //Bucle para recorrer el array con posiciones
        for (int i=0; i<a.length; i++){
            System.out.println("["+i+"]"+"->"+a[i]);
        }
        //Suma de todos ellos
        int sum=0;
        for (int i = 0; i < a.length; i++) {
            sum=a[i]+sum;
        }
        System.out.println("Suma de todos ellos "+sum);
        //Media
        int med=0;
        med=sum/a.length;
        System.out.println("Media "+med);
}
}
