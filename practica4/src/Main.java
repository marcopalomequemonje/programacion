public class Main {
        public static void main (String[]args){
        //DATOS DIRECCIÓN
        Direccion direccion1 = new Direccion(
                "Av. del Paraiso",
                7,
                11408,
                "Jerez de la Fra.",
                "Cádiz"
        );
        //DATOS HOSPITAL
        Hospital hospital1 = new Hospital(
                "Maria Auxiliadora",
                "3243245L",
                direccion1
        );
        //DATOS AREA
        Area area1 = new Area(
                "Area1",
                111,
                4,
                hospital1
        );
        //DATOS MÉDICO
        Medico medico1 = new Medico(
                "33789590L",
                "Paco",
                42,
                "Masculino",
                2400.21,
                2009,
                area1

        );
        area1.aumentarMedico();
        //DATOS CONTRATO
        Contrato contrato1 = new Contrato(
                2017,
                medico1,
                hospital1
        );
    }
}