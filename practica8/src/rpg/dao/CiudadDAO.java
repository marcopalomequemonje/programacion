package rpg.dao;

import rpg.model.Ciudades;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class CiudadDAO {
    private ArrayList<Ciudades> ciudades;

    public CiudadDAO() {
        this.ciudades = new ArrayList<>();
        cargaCiudad();
    }

    public ArrayList<Ciudades> getCiudades() {
        return ciudades;
    }

    public void setCiudades(ArrayList<Ciudades> ciudades) {
        this.ciudades = ciudades;
    }
    public void cargaCiudad(){
        try (Connection connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/XRPG", "xrpg_user", "xrpg_password");
             Statement statement = connection.createStatement();
             ResultSet resultset = statement.executeQuery("SELECT * FROM ciudades")) {

            while (resultset.next()) {
                int idCiudad = resultset.getInt("id");
                String nombreCiudad = resultset.getString("nombre");
                int nivel_minimo_acceso = resultset.getInt("nivel_minimo_acceso");
                this.ciudades.add(new Ciudades(idCiudad, nombreCiudad, nivel_minimo_acceso));
                System.out.println(idCiudad + "\t" + nombreCiudad+"\t"+nivel_minimo_acceso);
            }

        } catch (SQLException e) {
            System.out.println("Error en la conexión de la base de datos");
            e.printStackTrace();
        }
    }
}
