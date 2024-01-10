package concessionarie;

/**
 * @author -> Antonio Ruiz Benito
 * Clase que representa un coche y hereda de la clase vehiculo
 */
public class Car extends Vehicle{

    // Atributos
    private Integer numberOfDoors;
    private Boolean isConvertible;

    // Constructores

    public Car() {}

    public Car(Integer numberOfDoors, Boolean isConvertible) {
        this.numberOfDoors = numberOfDoors;
        this.isConvertible = isConvertible;
    }

    public Car(String brand, String model, Integer year, Integer numberOfDoors, Boolean isConvertible) {
        super(brand, model, year);
        this.numberOfDoors = numberOfDoors;
        this.isConvertible = isConvertible;
    }

    // Getters & Setters

    public Integer getNumberOfDoors() {
        return numberOfDoors;
    }

    public void setNumberOfDoors(Integer numberOfDoors) {
        this.numberOfDoors = numberOfDoors;
    }

    public Boolean getConvertible() {
        return isConvertible;
    }

    public void setConvertible(Boolean convertible) {
        isConvertible = convertible;
    }


    // ToString
    @Override
    public String toString() {
        return "Car{" +
                "brand=" + this.getBrand() +
                ", model=" + this.getModel() +
                ", year=" + this.getYear() +
                "numberOfDoors=" + numberOfDoors +
                ", isConvertible=" + isConvertible +
                '}';
    }

    // Metodos propios de la clase

    /**
     * Metodo para tocar el claxon
     */
    public void honk(){
        System.out.println("Claxon activado.");
    }

    /**
     * Metodo para ponerse el cituron de seguridad
     */
    public void putSeabelt() {
        System.out.println("Cinturón de seguridad abrochado.");
    }

    /**
     * Metodo para hacer derrapar el coche
     */
    public void drift() {
        System.out.println("Coche derrapando!!!");
    }

}
