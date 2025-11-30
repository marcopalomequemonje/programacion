public class Main {
    public static void main(String[] args) {
        //CREAR DIRECCIÓN
        Direccion direccion1 = new Direccion(
                "Avenida del Sol",
                12,
                41001,
                "Sevilla",
                "Sevilla"
        );
        //CREAR HOSPITAL
        Hospital hospital = new Hospital(
                "Hospital Andaluz",
                "CIF12345",
                direccion1
        );
        System.out.println("Hospital creado");
        System.out.println("Nombre: " + hospital.getNombre());
        System.out.println("CIF: " + hospital.getCIF());
        System.out.println("Dirección: " + hospital.getDireccion().getCalle());
        System.out.println();
        //CREAR ÁREAS
        Area area1 = new Area("Urgencias", 101, 1, hospital);
        Area area2 = new Area("Cardiología", 102, 2, hospital);
        //Añadir áreas al hospital
        hospital.añadirArea(area1);
        hospital.añadirArea(area2);
        System.out.println("Áreas añadidas");
        System.out.println("Área 1: " + area1.getNombre());
        System.out.println("Área 2: " + area2.getNombre());
        System.out.println();
        //CREAR MÉDICOS
        Medico medico1 = new Medico(
                "12345678A",
                "Juan Pérez",
                45,
                "Hombre",
                2500,
                2015,
                area1
        );
        Medico medico2 = new Medico(
                "87654321B",
                "Ana Gómez",
                32,
                "Mujer",
                2800,
                2018,
                area1
        );
        //Asignamos los médicos al área
        area1.aumentarMedico();
        area1.aumentarMedico();
        System.out.println("Médicos creados y asignados");
        System.out.println("Médico 1: " + medico1.getNombre() + " (Área: " + medico1.getArea().getNombre() + ")");
        System.out.println("Médico 2: " + medico2.getNombre() + " (Área: " + medico2.getArea().getNombre() + ")");
        System.out.println("Número médicos en Urgencias: " + area1.getNumMedicos());
        System.out.println();
        //CREAR CONTRATO
        Contrato contrato1 = new Contrato(2015, medico1, hospital);
        System.out.println("Contrato creado");
        System.out.println("Año creación contrato: " + contrato1.getFecha_creacion());
        System.out.println("¿Contrato del mismo año que inicio médico? " + contrato1.esDeAnio(2015));
        System.out.println("Años desde la creación del contrato: " + contrato1.diasDesdeCreacion());
        System.out.println();
        //PROBAR FUNCIONES DE MÉDICO
        System.out.println("Funciones de Médico");
        System.out.println("Sueldo neto (20% retención): " + medico1.calcularSueldoNeto(0.20));
        System.out.println("Antigüedad: " + medico1.getAniosAntiguedad() + " años");
        System.out.println("Impuestos anuales (15%): " + medico1.calcularImpuestosAnuales(0.15));
        System.out.println("¿Es mayor de edad (>18)? " + medico1.esMayorDeEdad(18));
        System.out.println();
        //CAMBIAR DE ÁREA
        System.out.println("Cambio de área");
        System.out.println("Área actual del médico: " + medico1.getArea().getNombre());
        medico1.cambiarArea(area2);
        System.out.println("Nueva área del médico: " + medico1.getArea().getNombre());
        System.out.println("Médicos en Urgencias: " + area1.getNumMedicos());
        System.out.println("Médicos en Cardiología: " + area2.getNumMedicos());
        System.out.println();
        //PRUEBAS DE ÁREA
        System.out.println("Comparación de áreas");
        System.out.println("Área con más médicos: " + area1.compararMedicos(area2));
        System.out.println("Capacidad restante en Urgencias (máx 10): " + area1.calcularCapacidadRestante(10));
        System.out.println("Capacidad restante en Cardiología (máx 10): " + area2.calcularCapacidadRestante(10));
        System.out.println();
        //PROBAR FUNCIONES DEL HOSPITAL
        System.out.println("Funciones de Hospital");
        System.out.println("Total médicos en hospital: " + hospital.getNumeroTotalMedicos());
        System.out.println("¿Existe área con ID 102? " + hospital.existeArea("102"));
        System.out.println("Proporción médicos área 102: " + hospital.getProporcionMedicosArea("102"));
        System.out.println();

    }
}
