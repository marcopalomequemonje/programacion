public class ejercicio1 {
    static void main(String[] args) {
        System.out.println("Define un array de números tipo double de 3 filas por 7 columnas con nombre doub y asigna los valores según la siguiente tabla. Muestra el contenido de todos los elementos del array dispuestos en forma de tabla como se muestra en la figura.\n");
        //Creamos el array
        Double [] [] doub = {
                //FILA 1
                {0.0, 30.0, 2.0, null, null, 5.0},
                //FILA 2
                {75.0, null, null, null, 0.0, null},
                //FILA 3
                {null, null, -2.0, 9.0, null, 11.0}
        };
        //AQUI VAMOS A CREAR LA PRIMERA LINEA DE LA TABLA
        System.out.println("-------------------------------------------------------------------------------");
        System.out.print("| Array num |");
        //FOR PARA CREAR LAS POSICONES DE LAS COLUMNAS (cabecera de la tabla)
        for (int i = 0; i < doub.length; i++) {
            for (int j = 0; j < doub[i].length; j++) {
                //%10s marcamos  el espacio que queremos dar
                System.out.printf("%10s|", "Columna " + j);
            }
        break;
        }
        System.out.println();
        System.out.println("|-----------------------------------------------------------------------------|");
        //FOR PARA MOSTRAR LOS NUMEROS EN LA TABLA
        for (int i = 0; i < doub.length; i++) {
            //Nombre PARA LAS FILAS
            System.out.print("|  Fila "+i+"   |");
            //RECORREMOS TODAS LAS POSICIONES DEL ARRAY
            for (int j = 0; j < doub[i].length ; j++) {
                //PARA QUE NULL NOS APAREZCA EN BLANCO
                //!= SI EL ARRAY CONTIENE ALGO DIFERENTE A NULL MUESTRA LOS NUMEROS
                if (doub[i][j]!=null) {
                    //CON %10.0 CON EL 0 PONEMOS LOS DECIMALES, EN ESTE CASO SE USA LA F Y EL 0. PARA INDICAR QUE NO TIENE DECIMAL
                    //EN EL CASO DE QUE QUIERAS CON ALGUN DECIMAL SERIA %10.1f EL 1 TE INDICA CUANTOS DECIMALES QUIERES
                    System.out.printf("%10.0f|",doub[i][j]);
                }
                //SI NO PUES MUESTRA ESPACIO EN BLANCO
                else {
                    System.out.printf("%10.0s|","");
                }
            }

            System.out.println();
            System.out.println("|-----------------------------------------------------------------------------|");
        }
    }
}
