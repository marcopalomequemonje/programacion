import java.util.HashSet;
import java.util.Set;

public class Oyente {
    private String nombre;
    private Set<String> listaReproduccion;
    //CONSTRUCTOR
    public Oyente(String nombre) {
        this.nombre = nombre;
    }
    //METODOS GET Y SER

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Set<String> getListaReproduccion() {
        return listaReproduccion;
    }

    public void setListaReproduccion(Set<String> listaReproduccion) {
        this.listaReproduccion = listaReproduccion;
    }
    //FUNCIONES
    //CREAR LISTA REPRODUCION
    public void crearListaReproduccion(){
        listaReproduccion= new HashSet<>();
    }
    public void borrarLista(){
        listaReproduccion.removeAll(listaReproduccion);
    }
}
