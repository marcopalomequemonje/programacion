public class Direccion {
    //ATRIBUTOS
    private String calle;
    private Integer numero;
    private Integer codigoPostal;
    private String localidad;
    private String provincia;
    //CONSTRUCTOR
    public Direccion(String  c, Integer num, Integer cp, String lc, String pv){
        this.calle=c;
        this.numero=num;
        this.codigoPostal=cp;
        this.localidad=lc;
        this.provincia=pv;
    }
    //METODOS GET Y SET
        //GET
        public String getCalle() {return this.calle;}
        public Integer getNumero() {return this.numero;}
        public Integer getCodigoPostal() {return this.codigoPostal;}
        public String getLocalidad() {return this.localidad;}
        public String getProvincia() {return this.provincia;}
        //SET
        public void setCalle(String calle) {this.calle = calle;}
        public void setNumero(Integer numero) {this.numero = numero;}
        public void setCodigoPostal(Integer codigoPostal) {this.codigoPostal = codigoPostal;}
        public void setLocalidad(String localidad) {this.localidad = localidad;}
        public void setProvincia(String provincia) {this.provincia = provincia;}
}
