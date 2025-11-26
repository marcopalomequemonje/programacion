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

}