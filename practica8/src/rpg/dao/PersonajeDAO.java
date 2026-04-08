package rpg.dao;

import rpg.model.Items;
import rpg.model.Personaje;
import rpg.model.Raza;
import rpg.model.Clases_RPG;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class PersonajeDAO {
    private ArrayList<Personaje> personajes;
    private RazaDAO razaDAO;
    private ClaseDAO claseDAO;
    private CiudadDAO ciudadDAO;

    public PersonajeDAO() {
        this.personajes = new ArrayList<>();
        cargaPersonaje();
        this.razaDAO=new RazaDAO();
        this.claseDAO=new ClaseDAO();
        this.ciudadDAO= new CiudadDAO();
    }

    public ArrayList<Personaje> getPersonajes() {
        return personajes;
    }

    public void setPersonajes(ArrayList<Personaje> personajes) {
        this.personajes = personajes;
    }

    public void cargaPersonaje() {
        try (Connection connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/XRPG", "xrpg_user", "xrpg_password");
             Statement statement = connection.createStatement();
             ResultSet resultset = statement.executeQuery("SELECT * FROM personajes")) {

            while (resultset.next()) {
                int idPersonaje = resultset.getInt("id");
                String nombrePersonaje = resultset.getString("nombre");
                int nivel = resultset.getInt("nivel");
                int oro = resultset.getInt("oro");
                int vida_actual = resultset.getInt("vida_actual");
                int id_raza = resultset.getInt("id_raza");
                int id_clase = resultset.getInt("id_clase");
                int id_ciudad_actual = resultset.getInt("id_ciudad_actual");


                //this.personajes.add(new Personaje(idPersonaje,nombrePersonaje,nivel,oro,vida_actual,id_raza,id_clase,id_ciudad_actual));
                //System.out.println(idItem+ "\t" +nombreItem+ "\t" +tipoItem+ "\t" +precioOro+ "\t" +bonificador_ataque+ "\t" +bonificador_defensa);
            }

        } catch (SQLException e) {
            System.out.println("Error en la conexión de la base de datos");
            e.printStackTrace();
        }
    }

    public Raza buscarRaza(int id_raza){
        Raza razaBuscada = null;
        for (Raza raza: razaDAO.getRazas()){
            if (raza.getId()==id_raza){
                razaBuscada=raza;
            }
        }
        return razaBuscada;
    }

    public Clases_RPG buscarClase(int id_clase){
        Clases_RPG claseBuscada = null;
        for (Clases_RPG cLase: claseDAO.getClases()){
            if (cLase.getId()==id_clase){
                claseBuscada=cLase;
            }
        }
        return claseBuscada;
    }

    /*public Clases_RPG buscarClase(int id_clase){
        Clases_RPG claseBuscada = null;
        for (Clases_RPG cLase: claseDAO.getClases()){
            if (cLase.getId()==id_clase){
                claseBuscada=cLase;
            }
        }
        return claseBuscada;
    }*/


}
