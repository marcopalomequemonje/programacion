public class ejercicio4 {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Modifica el programa anterior de tal forma que las sumas parciales y la suma total aparezcan en la pantalla con un pequeño retraso, dando la impresión de que el ordenador se queda “pensando” antes de mostrar los números.");
        //Creamos el array
        int[][] a = new int[4][5];
        //Creamos un for para recorrer el array y almecenar los numeros escritos por teclado
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                //AQUI ES DONDE SE GUARDA EL ARRAY QUE LE PONEMOS NUMEROS ALEATORIOS
                a[i][j]=(int) (Math.random()*1999+1);
            }
        }
        //Bucle con for para calcular la suma de las filas
        //suma total
        int sumatotal=0;
        for (int i = 0; i < a.length; i++) {
            System.out.println("-------------------------------------------------------------------");
            //CREAMOS LA VARIABLE DE SUMA
            int suma = 0;
            //CREAMOS UN BUCLE PARA QUE VALLA RECORRIENDO EL ARRAY
            for (int j = 0; j < a[i].length; j++) {
                System.out.printf("|%5d",a[i][j]);
                System.out.printf("%5s","");
                suma += a[i][j];
            }
            sumatotal+=suma;
            try {
                Thread.sleep(3000);
                System.out.printf("|%5s", "∑:");
                System.out.printf("%-5d |", suma);
                System.out.println();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        System.out.println("-------------------------------------------------------------------");
        //Bucle para calcular el mayor de las columnas
        for (int i = 0; i < a[0].length; i++) {
            //CREO LA VARIABLE MAYOR, QUE SEA IGUAL A EL ARRAY EN LA POSCION 0 Y QUE LA I RECORRA LAS COLUMNAS EN VEZ DE LAS FILAS
            int mayor = a[0][i];
            //EN ESTE APARTADO LA J RECORRE LAS FILAS Y LA I LAS COLUMNAS, ES DECIR SE INVIERTEN
            for (int j = 1; j < a.length; j++) {
                if (a[j][i] > mayor) {
                    mayor = a[j][i];
                }
            }
            System.out.printf("|%5s","∑:");
            System.out.printf("%-5d",mayor);
        }
        try {
            Thread.sleep(3000);
            System.out.printf("|%7s    |", sumatotal);
            System.out.printf("%-5s", "");
        } finally {

        }
        System.out.println();
        System.out.println("-------------------------------------------------------------------");
}
}
