import com.rpg.handler.EdadImposibleException;
import com.rpg.model.Ciudad;
import com.rpg.model.Personaje;
import com.rpg.utils.FileHelper;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        //String rutaactual=System.getProperty("user.dir");
        //System.out.println(rutaactual);
        /*List<Ciudad> ciudades= TxtHelper.readList("practica07/ficheros/datos.txt");
        for(Ciudad ciudad:ciudades){
            System.out.println(ciudad);
        }*/
        ArrayList<Ciudad> ciudades= new ArrayList<>();
        FileHelper.abrirCSV("practica07/ficheros/datos.txt", ciudades, Ciudad.class);
        //mostrar ciudades
        for(Ciudad ciudad:ciudades){
            System.out.println(ciudad);
        }
        ArrayList<Personaje> personajes= new ArrayList<>();
        Personaje p1= new Personaje("32901173h", "Paco", 45, "Hombre", 56000.70);
        Personaje p2= new Personaje("32901443h", "Pepe", 75, "Hombre", 59000.70);
        personajes.add(p1);
        personajes.add(p2);
        FileHelper.guardarCSV("practica07/ficheros/personajes1.txt", personajes);
        //Abrir
        ArrayList<Personaje> personajes2= new ArrayList<>();
        FileHelper.abrirCSV("practica07/ficheros/personajes2.txt", personajes2, Personaje.class);
        for(Personaje personaje:personajes2){
            System.out.println(personaje);
        }
        try {
            int edad;
            Scanner sc = new Scanner(System.in);
            System.out.println("Introduce la edad: ");
            edad = Integer.parseInt(sc.nextLine());
            if (edad < 1 || edad > 120) {
                throw new EdadImposibleException();
            }
            System.out.println("Su edad es: " + edad);
        }catch (EdadImposibleException e) {
            System.out.println("Imposible tener esa edad");
        }catch (Exception e){
            System.out.println("Error al introducir la edad. Formato no valido");
        }
    }
}
