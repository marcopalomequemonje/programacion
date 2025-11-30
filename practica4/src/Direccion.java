public class Direccion {
    //ATRIBUTOS
    private String calle;
    private int numero;
    private int codigoPostal;
    private String localidad;
    private String provincia;
    //CONSTRUCTOR
    public Direccion (String calle, int numero, int codigoPostal, String localidad, String provincia){
        this.calle=calle;
        this.numero=numero;
        this.codigoPostal=codigoPostal;
        this.localidad=localidad;
        this.provincia=provincia;
    }
    //METODOS GET Y SET
    //GET

    public String getCalle() {
        return calle;
    }

    public int getNumero() {
        return numero;
    }

    public int getCodigoPostal() {
        return codigoPostal;
    }

    public String getLocalidad() {
        return localidad;
    }

    public String getProvincia() {
        return provincia;
    }
    //SET

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public void setCodigoPostal(int codigoPostal) {
        this.codigoPostal = codigoPostal;
    }

    public void setLocalidad(String localidad) {
        this.localidad = localidad;
    }

    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }
}
