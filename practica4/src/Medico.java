import java.time.LocalDate;

public class Medico {
    //ATRIBUTOS
    private String DNI;
    private String nombre;
    private Integer edad;
    private String sexo;
    private double sueldo_bruto;
    private LocalDate fecha_inicio;
    private Area area;
    //CONSTRUCTOR
    public Medico(String DNI, String nombre, Integer edad, String sexo, double sueldo_bruto, LocalDate fecha_inicio, Area area){
        this.DNI=DNI;
        this.nombre=nombre;
        this.edad=edad;
        this.sexo=sexo;
        this.sueldo_bruto=sueldo_bruto;
        this.fecha_inicio=fecha_inicio;
        this.area=area;
    }
    //METODOS GET Y SET
        //GET
        public String getDNI() {return DNI;}
        public String getNombre() {return nombre;}
        public Integer getEdad() {return edad;}
        public String getSexo() {return sexo;}
        public double getSueldo_bruto() {return sueldo_bruto;}
        public LocalDate getFecha_inicio() {return fecha_inicio;}
        public Area getArea() {return area;}
        //SET
        public void setDNI(String DNI) {this.DNI = DNI;}
        public void setNombre(String nombre) {this.nombre = nombre;}
        public void setEdad(Integer edad) {this.edad = edad;}
        public void setSexo(String sexo) {this.sexo = sexo;}
        public void setSueldo_bruto(double sueldo_bruto) {this.sueldo_bruto = sueldo_bruto;}
        public void setFecha_inicio(LocalDate fecha_inicio) {this.fecha_inicio = fecha_inicio;}
        public void setArea(Area area) {this.area = area;}
}