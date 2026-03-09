import com.rpg.model.Ciudad;
import com.rpg.utils.TxtHelper;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args){
        String rutaactual=System.getProperty("user.dir");
        System.out.println(rutaactual);
        List<Ciudad> ciudades= TxtHelper.readList("practica07/ficheros/datos.txt");
        for(Ciudad ciudad:ciudades){
            System.out.println(ciudad);
        }
    }
}
