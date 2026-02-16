import java.util.HashSet;
import java.util.Set;

public class Artista {
    private String nombre;
    private Set<String> listaCanciones;
    //CONSTRUCTOR
    public Artista(String nombre) {
        this.nombre = nombre;
    }
    //METODOS SET Y GET

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    //METODO CREAR CANCION
    public void crearCanciones(){
        listaCanciones= new HashSet<>();
    }
}
