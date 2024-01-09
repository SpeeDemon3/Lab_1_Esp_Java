package concessionarie;

/**
 * @author -> Antonio Ruiz Benito
 * Clase que representa una motocicleta y extiende de la clase vehiculo
 */
public class Motorbike extends Vehicle{

    // Atributos
    private Integer engineDisplacement;
    private Boolean hasSidecar;

    // Constructores
    public Motorbike() {}

    public Motorbike(Integer engineDisplacement, Boolean hasSidecar) {
        this.engineDisplacement = engineDisplacement;
        this.hasSidecar = hasSidecar;
    }

    public Motorbike(String brand, String model, Integer year, Integer engineDisplacement, Boolean hasSidecar) {
        super(brand, model, year);
        this.engineDisplacement = engineDisplacement;
        this.hasSidecar = hasSidecar;
    }

    // Getters & Setters
    public Integer getEngineDisplacement() {
        return engineDisplacement;
    }

    public void setEngineDisplacement(Integer engineDisplacement) {
        this.engineDisplacement = engineDisplacement;
    }

    public Boolean getHasSidecar() {
        return hasSidecar;
    }

    public void setHasSidecar(Boolean hasSidecar) {
        this.hasSidecar = hasSidecar;
    }


    // ToString
    @Override
    public String toString() {
        return "Motorbike{" +
                "engineDisplacement=" + engineDisplacement +
                ", hasSidecar=" + hasSidecar +
                '}';
    }

    // Metodos propios de la clase

    /**
     * Metodo para realizar un caballito
     */
    public void wheelie() {
        System.out.println("Moto realizando un caballito");
    }

    /**
     * Metodo para poner el casco al motorista
     */
    public void putHelmet() {
        System.out.println("Casco puesto.");
    }

}
