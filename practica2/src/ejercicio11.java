public class ejercicio11 {
    public static void main(String[] args) {
        System.out.println("Escribe un programa java que invierta el orden de los valores de un array. Por invertir el orden de los valores de un array, me refiero que el último pasa a ser el primero, el penúltimo el segundo y así sucesivamente. PRUEBA CON UN ARRAY DE TAMAÑO 6.");
    //crear array
        int [] a= {1,2,3,4,5,6};
        int [] inv= new int[6];
        //Creamos un bucle con for para que recorra el array
        for (int i = 0; i < a.length; i++) {
            inv[i]= a.length-1-i;
        }
        for (int i = 0; i < a.length; i++) {
            System.out.println("["+i +"]"+" valor "+inv[i]);
        }
    }
}
