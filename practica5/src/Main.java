import com.juego.clases.Bardo;
import com.juego.modelo.Personaje;
import com.juego.razas.Humano;

public class Main{
    public static void main(String[] args) {
        Personaje p1=new Personaje("Marco",new Humano(),new Bardo());
        System.out.println(p1.getEstadisticas().comprobarInteligencia(5));
    }
}