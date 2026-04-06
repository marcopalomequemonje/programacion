package rpg.dao;

import rpg.model.Raza;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class RazaDAO {
    private ArrayList<Raza> razas;

    public RazaDAO() {
        this.razas = new ArrayList<>();
        cargaRaza();
    }

    public ArrayList<Raza> getRazas() {
        return razas;
    }

    public void setRazas(ArrayList<Raza> razas) {
        this.razas = razas;
    }

    public void cargaRaza() {
        try (Connection connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/XRPG", "xrpg_user", "xrpg_password");
             Statement statement = connection.createStatement();
             ResultSet resultset = statement.executeQuery("SELECT * FROM razas")) {

            while (resultset.next()) {
                int idRaza = resultset.getInt("id");
                String nombreRaza = resultset.getString("nombre");
                int bonificador_vida = resultset.getInt("bonificador_vida");
                int bonificador_fuerza = resultset.getInt("bonificador_fuerza");
                this.razas.add(new Raza(idRaza, nombreRaza, bonificador_vida, bonificador_fuerza));
                //System.out.println(idRaza + "\t" + nombreRaza + "\t" + bonificador_vida + "\t" + bonificador_fuerza);
            }

        } catch (SQLException e) {
            System.out.println("Error en la conexión de la base de datos");
            e.printStackTrace();
        }
    }
}
