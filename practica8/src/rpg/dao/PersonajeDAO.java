package rpg.dao;

import rpg.model.*;

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
    private HabilidadDAO habilidadDAO;
    private ConexionDB conexionDB;

    public PersonajeDAO() {
        this.personajes = new ArrayList<>();
        this.razaDAO=new RazaDAO();
        this.claseDAO=new ClaseDAO();
        this.ciudadDAO= new CiudadDAO();
        this.conexionDB=new ConexionDB();
        this.habilidadDAO=new HabilidadDAO();
        cargaPersonaje();
    }

    public ArrayList<Personaje> getPersonajes() {
        return personajes;
    }

    public void setPersonajes(ArrayList<Personaje> personajes) {
        this.personajes = personajes;
    }

    public RazaDAO getRazaDAO() {
        return razaDAO;
    }

    public void setRazaDAO(RazaDAO razaDAO) {
        this.razaDAO = razaDAO;
    }

    public ClaseDAO getClaseDAO() {
        return claseDAO;
    }

    public void setClaseDAO(ClaseDAO claseDAO) {
        this.claseDAO = claseDAO;
    }

    public CiudadDAO getCiudadDAO() {
        return ciudadDAO;
    }

    public void setCiudadDAO(CiudadDAO ciudadDAO) {
        this.ciudadDAO = ciudadDAO;
    }

    public HabilidadDAO getHabilidadDAO() {
        return habilidadDAO;
    }

    public void setHabilidadDAO(HabilidadDAO habilidadDAO) {
        this.habilidadDAO = habilidadDAO;
    }

    public ConexionDB getConexionDB() {
        return conexionDB;
    }

    public void setConexionDB(ConexionDB conexionDB) {
        this.conexionDB = conexionDB;
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
                Raza raza=buscarRaza(id_raza);
                Clases_RPG clase = buscarClase(id_clase);
                Ciudades ciudad = buscarCiudad(id_ciudad_actual);

                this.personajes.add(new Personaje(idPersonaje,nombrePersonaje,nivel,oro,vida_actual,raza,clase,ciudad));
            }

        } catch (SQLException e) {
            System.out.println("Error en la conexión de la base de datos");
            e.printStackTrace();
        }
    }

    public Raza buscarRaza(Integer id) {
        ResultSet resultset = conexionDB.executeQuery("SELECT * FROM razas WHERE id = " + id);

        try {
            if (resultset.next()) {
                String nombre = resultset.getString("nombre");
                int bonificador_vida = resultset.getInt("bonificador_vida");
                int bonificador_fuerza = resultset.getInt("bonificador_fuerza");

                return new Raza(id, nombre, bonificador_vida, bonificador_fuerza);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return null;
    }

    public Clases_RPG buscarClase(Integer id_clase){
        ResultSet resultset = conexionDB.executeQuery("SELECT * FROM clases_rpg WHERE id = " + id_clase);

        try {
            if (resultset.next()) {
                String nombre = resultset.getString("nombre");
                return new Clases_RPG(id_clase, nombre);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return null;
    }

    public Ciudades buscarCiudad(Integer id_ciudad_actual){
        ResultSet resultset = conexionDB.executeQuery("SELECT * FROM ciudades WHERE id = " + id_ciudad_actual);

        try {
            if (resultset.next()) {
                String nombre = resultset.getString("nombre");
                int nivel_minimo_acceso = resultset.getInt("nivel_minimo_acceso");

                return new Ciudades(id_ciudad_actual, nombre, nivel_minimo_acceso);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return null;
    }
}
