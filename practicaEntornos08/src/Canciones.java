public class Canciones implements Mezclas{
    private String nombre;

    public Canciones(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public double generarRegalias() {
        return 100;
    }
}
