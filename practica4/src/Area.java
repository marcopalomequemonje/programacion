public class Area {
    //ATRIBUTOS
    private String nombre;
    private Integer identificador;
    private Integer planta;
    private Hospital hospital;
    //CONSTRUCTOR
    public Area(String nombre, Integer id, Integer planta, Hospital hospital){
    this.nombre=nombre;
    this.identificador=id;
    this.planta=planta;
    this.hospital=hospital;
    int numMedicos=0;
    }
    //METODOS GET Y SET
        //GET
        public String getNombre() {return nombre;}
        public Integer getIdentificador() {return identificador;}
        public Integer getPlanta() {return planta;}
        public Hospital getHospital() {return hospital;}
        //SET
        public void setNombre(String nombre) {this.nombre = nombre;}
        public void setIdentificador(Integer identificador) {this.identificador = identificador;}
        public void setPlanta(Integer planta) {this.planta = planta;}
        public void setHospital(Hospital hospital) {this.hospital = hospital;}
}
