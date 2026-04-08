package rpg.dao;

import rpg.model.Habilidades;
import rpg.model.Raza;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class HabilidadDAO {
    private ArrayList<Habilidades> habilidades;

    public HabilidadDAO() {
        this.habilidades = new ArrayList<>();
        cargaHabilidad();
    }

    public ArrayList<Habilidades> getHabilidades() {
        return habilidades;
    }

    public void setHabilidades(ArrayList<Habilidades> habilidades) {
        this.habilidades = habilidades;
    }

    public void cargaHabilidad() {
        try (Connection connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/XRPG", "xrpg_user", "xrpg_password");
             Statement statement = connection.createStatement();
             ResultSet resultset = statement.executeQuery("SELECT * FROM habilidades")) {

            while (resultset.next()) {
                int idHabilidad = resultset.getInt("id");
                String nombreHabilidad = resultset.getString("nombre");
                int dano_base = resultset.getInt("dano_base");
                int usos_maximos = resultset.getInt("usos_maximos");
                int id_clase = resultset.getInt("id_clase");
                this.habilidades.add(new Habilidades(idHabilidad,nombreHabilidad,dano_base,usos_maximos,id_clase));
                //System.out.println(idHabilidad+ "\t" +nombreHabilidad+ "\t" +dano_base+ "\t" +usos_maximos+ "\t" +id_clase);
            }

        } catch (SQLException e) {
            System.out.println("Error en la conexión de la base de datos");
            e.printStackTrace();
        }
    }
}
