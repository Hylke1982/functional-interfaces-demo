package nl.codecentric.functionalinterfaces;

import nl.codecentric.functionalinterfaces.model.Car;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by hylke on 05/05/15.
 */
public abstract class AbstractExampleTest {

    protected List<Car> getCars() {
        final List<Car> cars = new ArrayList<>();
        cars.add(createCar("Audi", 4, true));
        cars.add(createCar("Toyota", 4, true));
        cars.add(createCar("Lada", 3, false));
        return cars;
    }

    protected Car createCar(final String name, final Integer numberOfWheels, final boolean roofExists) {
        final Car car = new Car();
        car.setName(name);
        car.setNumberOfWheels(numberOfWheels);
        car.setRoofExists(roofExists);
        return car;
    }
}
