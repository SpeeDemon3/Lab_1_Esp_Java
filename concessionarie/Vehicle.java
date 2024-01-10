package concessionarie;

/**
 * @author -> Antonio Ruiz Benito
 * Clase generica para representar un vehiculo
 */
public class Vehicle {

    // Atributos
    private String brand;
    private String model;
    private Integer year;

    // Constructores
    public Vehicle(){}

    public Vehicle(String brand, String model, Integer year) {
        this.brand = brand;
        this.model = model;
        this.year = year;
    }

    // Getters & Setters


    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    // ToString
    @Override
    public String toString() {
        return "Vehicle{" +
                "brand=" + brand +
                ", model=" + model +
                ", year=" + year +
                '}';
    }

    // Metodos propios de la clase
    public void startEngineVehicle() {
        System.out.println("Motor encendido!!!");
    }

    public void accelerateVehicle(int speed) {
        System.out.println("Acelerando -> " + speed + "Km/h");
    }

    public void breakVehicle(int speed) {
        System.out.println("Decelerando -> " + speed);
    }

}
