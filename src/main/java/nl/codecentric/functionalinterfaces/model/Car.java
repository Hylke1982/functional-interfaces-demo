package nl.codecentric.functionalinterfaces.model;

/**
 * Created by hylke on 05/05/15.
 */
public class Car {

    private Integer numberOfWheels;

    private boolean roofExists;

    private String name;

    public Integer getNumberOfWheels() {
        return numberOfWheels;
    }

    public void setNumberOfWheels(Integer numberOfWheels) {
        this.numberOfWheels = numberOfWheels;
    }

    public boolean isRoofExists() {
        return roofExists;
    }

    public void setRoofExists(boolean roofExists) {
        this.roofExists = roofExists;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
