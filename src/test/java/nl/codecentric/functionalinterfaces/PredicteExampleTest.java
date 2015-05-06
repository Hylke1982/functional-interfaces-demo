package nl.codecentric.functionalinterfaces;

import nl.codecentric.functionalinterfaces.model.Car;
import org.junit.Test;

import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import static org.junit.Assert.assertEquals;

/**
 * Created by hylke on 05/05/15.
 */
public class PredicteExampleTest extends AbstractExampleTest {


    @Test
    public void testPredicate() {
        final Predicate<Car> predicate = cars -> cars.getName().matches("^(L|T).*$");
        final List<Car> cars = getCars();
        final List<Car> filteredCars = cars.stream().filter(predicate).collect(Collectors.<Car>toList());

        assertEquals(2, filteredCars.size());
        assertEquals("Toyota", filteredCars.get(0).getName());
        assertEquals("Lada", filteredCars.get(1).getName());

    }

}
