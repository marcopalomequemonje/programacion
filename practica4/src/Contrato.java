public class Contrato {
    //ATRIBUTOS
    private Integer fecha_creacion;
    private Medico medico;
    private Hospital hospital;
    //CONSTRUCTOR
    public Contrato(Integer fecha_creacion, Medico medico, Hospital hospital){
        this.fecha_creacion=fecha_creacion;
        this.medico=medico;
        this.hospital=hospital;
    }
    //METODOS GET Y SET
        //GET
        public Integer getFecha_creacion() {return fecha_creacion;}
        public Medico getMedico() {return medico;}
        public Hospital getHospital() {return hospital;}
        //SET
        public void setFecha_creacion(Integer fecha_creacion) {this.fecha_creacion = fecha_creacion;}
        public void setMedico(Medico medico) {this.medico = medico;}
        public void setHospital(Hospital hospital) {this.hospital = hospital;}
}