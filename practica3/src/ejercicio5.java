public class ejercicio5 {
    public static void main(String[] args) {
        System.out.println("Crear un programa que cuando se le introduzca números enteros rellene un array de 6 filas por 10 columnas con números enteros positivos comprendidos entre 0 y 1000 (ambos incluidos). A continuación, el programa deberá:\n" +
                "dar la posición del número máximo y mínimo\n" +
                "la suma total de todas las filas y columnas\n" +
                "la suma de todas las columnas\n" +
                "la suma de todas las filas.\n");
        //Creamos el array
        int[][] a = new int[6][10];
        //Creamos un for para recorrer el array y almecenar los numeros escritos por teclado
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                //AQUI ES DONDE SE GUARDA EL ARRAY QUE LE PONEMOS NUMEROS ALEATORIOS ENTRE 0 Y 1000
                a[i][j] = (int) (Math.random() * 1001);
            }
        }
        //CREAMOS VARIABLES
        //suma total
        int sumatotal = 0;
        //creamos la variable de sumafilas
        int sumafilas = 0;
        //creamos la variable de sumacol
        int sumacol = 0;
        //Bucle con for para calcular la suma de las filas
        for (int i = 0; i < a.length; i++) {
            System.out.println("----------------------------------------------------------------------------------------------------");
            //CREAMOS UN BUCLE PARA QUE VALLA RECORRIENDO EL ARRAY
            for (int j = 0; j < a[i].length; j++) {
                //MUESTRA LA TABLA
                System.out.printf("%5d", a[i][j]);
                System.out.printf("%5s", "|");
                sumafilas += a[i][j];
            }
            sumatotal+=sumafilas;
            System.out.println();
        }
        System.out.println("----------------------------------------------------------------------------------------------------");
        //Bucle para calcular el mayor de las columnas
        for (int i = 0; i < a[0].length; i++) {
            //CREO LA VARIABLE MAYOR, QUE SEA IGUAL A EL ARRAY EN LA POSCION 0 Y QUE LA I RECORRA LAS COLUMNAS EN VEZ DE LAS FILAS
            int mayor = a[0][i];
            //EN ESTE APARTADO LA J RECORRE LAS FILAS Y LA I LAS COLUMNAS, ES DECIR SE INVIERTEN
            for (int j = 1; j < a.length; j++) {
                if (a[j][i] > mayor) {
                    mayor = a[j][i];
                }
                sumacol+=a[j][i];
            }

        }
        System.out.println("");
        System.out.println("La suma de todas las columnas es: " + sumacol);
        System.out.println("La suma de todas las filas es: " + sumafilas);
    }
}
