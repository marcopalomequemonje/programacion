public class ejercicio1 {
    static void main(String[] args) {
        System.out.println("Define un array de números tipo double de 3 filas por 7 columnas con nombre doub y asigna los valores según la siguiente tabla. Muestra el contenido de todos los elementos del array dispuestos en forma de tabla como se muestra en la figura.\n");
        Double [] [] doub = {
                {0.0, 30.0, 2.0, null, null, 5.0},
                {75.0, null, null, null, 0.0, null},
                {null, null, -2.0, 9.0, null, 11.0}
        };
        for (int i = 0; i < doub.length; i++) {
            for (int j = 0; j < doub[i].length ; j++) {
                System.out.print(doub[i][j]+"      ");
            }
            System.out.println();

        }
    }
}
