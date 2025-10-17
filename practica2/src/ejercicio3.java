public class ejercicio3 {
    public static void main(String [] args) {
        System.out.println("test");
        //Crea un array de 5 numeros enteros
        int[] a = {54,35,76,93,13};
        int menor = a[0];
        for (int i=0; i<a.length; i++){
            if (a[i] < menor){
                menor = a[i];
            }
        }
        System.out.print("El número mas pequeño es: "+menor);
    }
}

