import java.util.*;

public class Bloque1 {
    private ArrayList<String> registroCombate;
    private Set<String> nombreVillano;
    private Map<String, Integer> bolsaOro;
    private Map<String, Double> catalogoHechizos;
    //CONSTRUCTOR
    public Bloque1() {
        //INICIALIZAR COLECIONES
        registroCombate=new ArrayList<>();
        nombreVillano= new HashSet<>();
        bolsaOro= new HashMap<>();
        }
    //1.Registro de muertes
    public void registroMuertes(){
    //AÑADIR 5 EVENTOS
    registroCombate.add("Orco derrotado");
    registroCombate.add("Poción usada");
    registroCombate.add("Golpe crítico recibido");
    registroCombate.add("Hechizo lanzado");
    registroCombate.add("Dragón invocado");
    //MOSTRAR 3 EVENTO
    System.out.println("Tercer evento: " + registroCombate.get(2));
    }
    //2.Censo Único
    public void censoUnico() {
        //AÑADIR MORGOTH 2 VECES
        nombreVillano.add("Morgoth");
        nombreVillano.add("Morgoth");
        //IMPRIMIR TAMAÑO DEL HASHSET
        System.out.println("Tamaño hashSet " + nombreVillano.size());
    }
    //3.Bolsa de Oro
    public void bolsaOro(){
        //AÑADE 3 HEROES
        bolsaOro.put("Marco", 200);
        bolsaOro.put("Alvaro", 220);
        bolsaOro.put("Cheko", 135);
        //IMPRIMIR ORO DE UNO DE ELLOS
        System.out.println(bolsaOro.get("Marco"));
    }
    //4.Limpieza del Calabozo
    public void limpiezaCalabozo() {
        //Elimina el evento más antiguo (índice 0)
        registroCombate.remove(0);
        //Añade uno nuevo al final ("Dragón avistado").
        registroCombate.add("Dragón avistado");
    }
    //5.Mercado de hechizos
    public void mercadoHechizos() {
        catalogoHechizos.put("Bola de Fuego", 25.5);
        catalogoHechizos.put("Rayo de Hielo", 18.0);
        for (String keyHechizo: catalogoHechizos.keySet()){
            Double mana=catalogoHechizos.get(keyHechizo);
        }
    }


}