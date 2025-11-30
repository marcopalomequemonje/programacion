import java.util.ArrayList;

public class Hospital {
    //ATRIBUTOS
    private String nombre;
    private String CIF;
    private ArrayList<Area> listaArea ;
    private Direccion direccion;
    //CONSTRUCTOR
     public Hospital (String nombre, String CIF, Direccion direccion){
         this.nombre=nombre;
         this.CIF=CIF;
         this.listaArea=new ArrayList<>();
         this.direccion=direccion;
     }
     //METODOS GET Y SET
    //GET
    public String getNombre() {return nombre;}
    public String getCIF() {return CIF;}
    public ArrayList<Area> getLista_area() {return listaArea;}
    public Direccion getDireccion() {return direccion;}

    //SET
    public void setNombre(String nombre) {this.nombre = nombre;}
    public void setCIF(String CIF) {this.CIF = CIF;}
    public void setListaArea(ArrayList<Area> listaArea) {this.listaArea = listaArea;}
    public void setDireccion(Direccion direccion) {this.direccion = direccion;}
    //FUNCIONES
    //AGREGAR MEDICO A ARRAYLIST
    public void añadirArea(Area nuevaArea){
        this.listaArea.add(nuevaArea);
    }
    //CALCULO AGREGADO
    public Integer getNumeroTotalMedicos(){
        int suma=0;
        for (int i = 0; i < this.listaArea.size(); i++) {
            suma+=this.listaArea.get(i).getNumMedicos();
        }
        return suma;
    }
    //CALCULO DE PROPORCION
    public double getProporcionMedicosArea(String idArea){
        double proporcion=0.0;
        for (int i = 0; i < this.listaArea.size(); i++) {
            if (idArea.equals(this.listaArea.get(i).getIdentificador())){
                proporcion=this.listaArea.get(i).getNumMedicos()*(getNumeroTotalMedicos());
            }
        }
        return proporcion;
    }
    //COMPROBACION DE EXISTENCIA
    public boolean existeArea(String idArea){
        boolean resultado=false;
        for (int i = 0; i < listaArea.size(); i++) {
            if (this.listaArea.get(i).getIdentificador().equals(idArea)){
                resultado=true;
                break;
            }
            else {
                resultado=false;
            }
        }
        return resultado;
    }

}