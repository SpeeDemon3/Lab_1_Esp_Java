package tools;

/**
 * @author -> Antonio Ruiz Benito
 * Clase con diferentes menus para el programa
 */
public class Menu {

    /**
     * Metodo para mostrar el menu principal,
     * haciendo uso de la nueva funcionalidad en Java 17
     * para insertar varias lineas en una sola variable
     * sin necesidad de ir concatenando
     */
    public static void mainMenu() {
        String main = """
                1 - Añadir vehículos
                2 - Mostrar vehículos
                3 - Salir
                """;

        System.out.println(main);
    }

    /**
     * Metodo para mostrar los tipos de vehiculos que se
     * pueden añadir
     */
    public static void vehicleMenu() {
        String vehicle = """
                1 - Añadir coche
                2 - Añadir moto
                """;

        System.out.println(vehicle);
    }

    /**
     * Metodo para mostrar el menu
     * de los vehiculos disponibles
     */
    public static void showMenuVehicle() {
        String menu = """
                1 - Mostrar todos
                2 - Mostrar por tipo de vehículo
                3 - Mostrar por marca
                """;

        System.out.println(menu);
    }

    /**
     * Metodo para mostar el menu
     * para escoger entre visualizar coches
     * o motocicletas
     */
    public static void showMenuCarOrMotorbike() {
        String menu = """
                1 - Mostrar Coches
                2 - Mostrar Motocicletas
                """;

        System.out.println(menu);
    }

}
