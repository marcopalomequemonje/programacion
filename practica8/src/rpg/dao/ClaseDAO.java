package rpg.dao;

import rpg.model.Ciudades;
import rpg.model.Clases_RPG;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class ClaseDAO {
    private ArrayList<Clases_RPG> clases;

    public ClaseDAO() {
        this.clases = new ArrayList<>();
        cargaClase();
    }

    public ArrayList<Clases_RPG> getClases() {
        return clases;
    }

    public void setClases(ArrayList<Clases_RPG> clases) {
        this.clases = clases;
    }

    public void cargaClase(){
        try (Connection connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/XRPG", "xrpg_user", "xrpg_password");
             Statement statement = connection.createStatement();
             ResultSet resultset = statement.executeQuery("SELECT * FROM clases_rpg")) {

            while (resultset.next()) {
                int idClase = resultset.getInt("id");
                String nombreClase = resultset.getString("nombre");
                this.clases.add(new Clases_RPG(idClase, nombreClase));
                //System.out.println(idClase + "\t" + nombreClase);
            }

        } catch (SQLException e) {
            System.out.println("Error en la conexión de la base de datos");
            e.printStackTrace();
        }
    }
}
