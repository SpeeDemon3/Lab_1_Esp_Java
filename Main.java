import concessionarie.Car;
import concessionarie.Motorbike;
import concessionarie.Vehicle;
import tools.ListTool;
import tools.Menu;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

/**
 * @author -> Antonio Ruiz Benito
 * Clase principal del programa
 */
public class Main {
    public static void main(String[] args) {

        System.out.println("### Gestión concesionario ###");

        // Variable para controlar el bucle do while
        boolean control = false;

        // Array para guardar todos los vehiculos sin inportar el tipo
        List<Vehicle> vehicleList = new ArrayList<>();
        // Array para guardar los coches
        List<Car> carList = new ArrayList<>();
        // Array para guardar las motos
        List<Motorbike> motorbikeList = new ArrayList<>();

        // Utilizando un bucle do while aseguro que el programa se siga ejecutando hasta que el usuario decida lo contrario
        do {

            // Utilizo la clase Scanner para poder interactuar y guardar los valores introducidos por el usuario
            Scanner sc = new Scanner(System.in);

            // Muestro el menu principal al usuario
            Menu.mainMenu();

            int optionUser = 0;

            // Manejo la excepcion que puediese ocurrir si el usuario introduce algo distinto de un valor numerico
            try {
                // Guardo el valor introducido por el usuario
                optionUser = sc.nextInt();

            } catch (InputMismatchException ime) {
                System.out.println("El valor introducido debe ser numérico!!!");
            }


            // Utilizando un switch manejare las diferentes opciones
            switch (optionUser) {
                //Añadir vehículos
                case 1:
                    // Muestro el menu con los tipos de vehiculos disponibles para añadir
                    Menu.vehicleMenu();

                    int opc = sc.nextInt();

                    switch (opc) {
                        case 1:
                            ListTool.addCar(carList, vehicleList);
                            break;
                        case 2:
                            ListTool.addMotorbike(motorbikeList, vehicleList);
                            break;
                        default:
                            System.out.println("Debes introducir un valor valido.");
                    }
                    break;

                // Mostrar vehículos
                case 2:
                    // Muestro el menu para mostrar los vehiculos disponibles
                    Menu.showMenuVehicle();

                    opc = sc.nextInt();
                    sc.nextLine();

                    switch (opc) {
                        // Mostrar todos
                        case 1:
                            ListTool.showVehicles(vehicleList);
                            break;
                        // Mostrar por tipo de vehículo
                        case 2:
                            Menu.showMenuCarOrMotorbike();

                            Integer opcUserVehicle = ListTool.checkCorrectNumber(0, 2);

                            if (opcUserVehicle == 1) {
                                ListTool.showListCar(carList);
                            } else {
                                ListTool.showListMotorbike(motorbikeList);
                            }
                            break;
                        // Mostrar por marca
                        case 3:
                            System.out.println("Introduce la marca del vehículo:");

                            String brandUser = sc.nextLine();

                            ListTool.showBrandVehicles(vehicleList, brandUser);

                            break;
                        default:
                            System.out.println("Debes introducir un valor valido.");
                    }

                    break;
                // Salir
                case 3:
                    System.out.println("Finalizando programa...\n");
                    // Cambio el valor de la variable para poder selir del bucle
                    control = true;
                    break;
                // Valor por defecto en caso de que el usuario seleccione una opcion numerica no valida
                default:
                    System.out.println("Opción incorrecta, vuelva a intentarlo:");
            }
        } while(!control);

        System.out.println("\t\t\t\t\t\tLab realizado por Antonio Ruiz Benito.");

    }
}