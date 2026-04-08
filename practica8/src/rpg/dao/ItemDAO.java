package rpg.dao;
import rpg.model.Items;
import rpg.model.Raza;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class ItemDAO {
    private ArrayList<Items> items;

    public ItemDAO() {
        this.items = new ArrayList<>();
        cargaItems();
    }

    public ArrayList<Items> getItems() {
        return items;
    }

    public void setItems(ArrayList<Items> items) {
        this.items = items;
    }

    public void cargaItems() {
        try (Connection connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/XRPG", "xrpg_user", "xrpg_password");
             Statement statement = connection.createStatement();
             ResultSet resultset = statement.executeQuery("SELECT * FROM items")) {

            while (resultset.next()) {
                int idItem = resultset.getInt("id");
                String nombreItem = resultset.getString("nombre");
                String tipoItem = resultset.getString("tipo");
                int precioOro = resultset.getInt("precio_oro");
                int bonificador_ataque = resultset.getInt("bonificador_ataque");
                int bonificador_defensa = resultset.getInt("bonificador_defensa");
                this.items.add(new Items(idItem, nombreItem, tipoItem,precioOro, bonificador_ataque, bonificador_defensa));
                //System.out.println(idItem+ "\t" +nombreItem+ "\t" +tipoItem+ "\t" +precioOro+ "\t" +bonificador_ataque+ "\t" +bonificador_defensa);
            }

        } catch (SQLException e) {
            System.out.println("Error en la conexión de la base de datos");
            e.printStackTrace();
        }
    }
}


