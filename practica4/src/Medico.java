import java.time.LocalDate;

public class Medico {
    //ATRIBUTOS
    private String DNI;
    private String nombre;
    private Integer edad;
    private String sexo;
    private double sueldo_bruto;
    private Integer fecha_inicio;
    private Area area;
    //CONSTRUCTOR
    public Medico(String DNI, String nombre, Integer edad, String sexo, double sueldo_bruto, Integer fecha_inicio, Area area){
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
    public Integer getFecha_inicio() {return fecha_inicio;}
    public Area getArea() {return area;}
    //SET
    public void setDNI(String DNI) {this.DNI = DNI;}
    public void setNombre(String nombre) {this.nombre = nombre;}
    public void setEdad(Integer edad) {this.edad = edad;}
    public void setSexo(String sexo) {this.sexo = sexo;}
    public void setSueldo_bruto(double sueldo_bruto) {this.sueldo_bruto = sueldo_bruto;}
    public void setFecha_inicio(Integer fecha_inicio) {this.fecha_inicio = fecha_inicio;}
    public void setArea(Area area) {this.area = area;}
    //FUNCIONES CLASE MEDICO
    //CALCULAR SUELDO NETO
    public double calcularSueldoNeto(double retencion){
        return this.sueldo_bruto-(this.sueldo_bruto*retencion);
    }
    //CALCULAR AÑOS DE ANTIGÜEDAD
    public int getAniosAntiguedad(){
        //FECHA ACTUAL
        LocalDate fechaActual=LocalDate.now();
        //AÑO ACTUAL
        int anioActual = fechaActual.getYear();
        return anioActual-this.fecha_inicio;
    }
    //CALCULAR IMPUESTOS ANUALES
    public double calcularImpuestosAnuales(double tasaImpositiva) {
        return (this.sueldo_bruto * tasaImpositiva * 12);
    }
    //COMPROBAR SI ES MAYOR DE EDAD
    public boolean esMayorDeEdad(int mayoriaEdad){
        return (this.edad>=mayoriaEdad);
    }
    //CALCULO DE AUMENTO
    public double proximoAumento(double porcentajeAumento, int aniosRequeridos){
        if (getAniosAntiguedad()>= aniosRequeridos) {
            return this.sueldo_bruto + (this.sueldo_bruto*porcentajeAumento);
        }
        else{
            return this.sueldo_bruto;
        }
    }
    //GESTION DE AREA
    public void cambiarArea(Area nuevaArea){
        this.area.setNumMedicos(area.getNumMedicos()-1);
        nuevaArea.aumentarMedico();
        this.area=nuevaArea;
    }
}
