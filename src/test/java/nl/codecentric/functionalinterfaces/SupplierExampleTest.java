package nl.codecentric.functionalinterfaces;

import nl.codecentric.functionalinterfaces.model.Car;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.function.Supplier;

import static org.junit.Assert.fail;

/**
 * Created by hylke on 05/05/15.
 */
public class SupplierExampleTest extends AbstractExampleTest {

    @Test
    public void testSupplier() {
        final Supplier<Car> carSupplier = () -> createCar("Tata", 23, false);
        driverCar(carSupplier);
        driverCar(Car::new);
    }

    private void driverCar(final Supplier<Car> car){
        car.get();
    }
}
