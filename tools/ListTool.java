package tools;

import concessionarie.Car;
import concessionarie.Motorbike;
import concessionarie.Vehicle;

import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

/**
 * @author -> Antonio Ruiz Benito
 * Clase con metodos para trabajar
 * con listas
 */
public class ListTool {

    // Utilizo Scanner en static para poder utilizarla en todos los metodos de esta clase
    static Scanner sc = new Scanner(System.in);

    /**
     * Metodo para introducir un coche dentro de una lista de coches
     * controlando los errores que pudiese provocar el usuario
     * @param listCar -> Lista donde se añadiran los coches de tipo ArrayList
     */
    public static void addCar(List<Car> listCar, List<Vehicle> listVehicle) {

        System.out.println("Introduce la marca del vehículo:");
        String modelUser = sc.nextLine().toLowerCase();

        System.out.println("Introduce el modelo del vehículo:");
        String modelCarUser = sc.nextLine().toLowerCase();

        System.out.println("Introduce el año del vehículo (Indicandolo con un número entero desde el año 2001 al 2025):");
        Integer yearCarUser = 0;
        checkCorrectNumber(yearCarUser, 2000 , 2025);


        System.out.println("Introduce el número de puertas del vehículo (Indicandolo con un número entero del 2 al 5):");
        Integer numberOfDoorsCar = 0;
        checkCorrectNumber(numberOfDoorsCar, 1, 6);

        Boolean control = true;
        Boolean isConvertibleCar = false;
        while (control) {
            System.out.println("Indica si es convertible o no (Introduciendo [1]TRUE || [2]FALSE):");
            try {
                int opcUser = sc.nextInt();
                if (opcUser == 1) {
                    isConvertibleCar = true;
                    control = false;
                } else if (opcUser == 2) {
                    control = false;
                } else  {
                    System.out.println("El valor introducido no es correcto!!!");
                }

            } catch (InputMismatchException ime) {
                System.out.println("Debes introducir un valor numérico valido:");
            }
        }

        // Creo el objeto de tipo Car con los parametros introducidos por el usuario
        Car car = new Car(modelUser, modelCarUser, yearCarUser, numberOfDoorsCar, isConvertibleCar);

        // Añado el objeto Car a la lista
        listCar.add(car);

        // Añado el objeto a la lista de vehiculos sin importar el tipo del que sea
        listVehicle.add(car);
    }

    /**
     * Metodo para comprobar si el valor introducido por un usuario es valido
     * @param number
     * @param numMin -> Valor minimo
     * @param numMax -> Valor Maximo
     * @return -> Valor correcto introducido por el usuario
     */
    public static Integer checkCorrectNumber(Integer number, Integer numMin, Integer numMax) {
        // Utilizando un bucle while obligo al usuario a introducir un valor numerico valido
        while (number <= numMin || number > numMax) {
            try {
                number = sc.nextInt();
                // Vacio el buffer
                sc.nextLine();
                // Controlo la excepcion que pudiese ocurrir si el usuario introduce algo distinto de un valor numerico

                if (number <= numMin || number > numMax) {
                    System.out.println("Debes introducir un valor válido:");
                }

            } catch (InputMismatchException ime) {
                System.out.println("Debes introducir un valor numérico válido:");
                number = 0;
            }
        }

        return number;
    }

    public static void addMotorbike(List<Motorbike> motorbikeList, List<Vehicle> listVehicle) {

        //String brand, String model, Integer year, Integer engineDisplacement, Boolean hasSidecar
        System.out.println("Introduce la marca de la motocicleta:");
        String modelUser = sc.nextLine().toLowerCase();

        System.out.println("Introduce el modelo de la motocicleta:");
        String modelCarUser = sc.nextLine().toLowerCase();

        System.out.println("Introduce el año del vehículo (Indicandolo con un número entero desde el año 2000 al 2025):");
        Integer yearMotorBikeUser = 0;
        checkCorrectNumber(yearMotorBikeUser, 2000 , 2025);

        System.out.println("Introduce el desplazamiento del motor (Indicandolo con un número entero entre 1 y 220):");
        Integer engineDisplacement = 0;
        checkCorrectNumber(engineDisplacement, 0, 220);

        Boolean control = true;
        Boolean hasSidecar = false;
        while (control) {
            System.out.println("Indica si tiene sidecar o no (Introduciendo [1]TRUE || [2]FALSE):");
            try {
                int opcUser = sc.nextInt();
                if (opcUser == 1) {
                    hasSidecar = true;
                    control = false;
                } else if (opcUser == 2) {
                    control = false;
                } else  {
                    System.out.println("El valor introducido no es correcto!!!");
                }

            } catch (InputMismatchException ime) {
                System.out.println("Debes introducir un valor numérico valido:");
            }
        }

        // Creo el objeto de tipo Motorbike con los parametros introducidos por el usuario
        Motorbike motorbike = new Motorbike(modelUser, modelCarUser, yearMotorBikeUser, engineDisplacement, hasSidecar);

        // Añado el objeto Car a la lista
        motorbikeList.add(motorbike);

        // Añado el objeto a la lista de vehiculos sin importar el tipo del que sea
        listVehicle.add(motorbike);
    }

    /**
     * Metodo para recorrer un ArrayList
     * @param list -> Lista de tipo Car
     */
    public static void showListCar (List<Car> list) {
        for (Car l :  list) {
            System.out.println("Marca: " + l.getBrand() + " - Modelo :" + l.getModel() + " - Año: "
                    + l.getYear() + " - N.Puertas: " + l.getNumberOfDoors()
                    + " - Convertible: " + l.getConvertible());
        }
    }

    /**
     * Metodo para recorrer un ArrayList
     * @param list -> Lista de tipo Motorbike
     */
    public static void showListMotorbike (List<Motorbike> list) {
        for (Motorbike l :  list) {
            System.out.println("Marca: " + l.getBrand() + " - Modelo :" + l.getModel() + " - Año: "
                    + l.getYear() + " - Desplazamiento: " + l.getEngineDisplacement()
                    + " - Sidecar: " + l.getHasSidecar());
        }
    }

}
