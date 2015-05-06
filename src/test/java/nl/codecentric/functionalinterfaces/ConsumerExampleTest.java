package nl.codecentric.functionalinterfaces;

import nl.codecentric.functionalinterfaces.model.Car;
import org.junit.Test;

import java.util.List;
import java.util.function.Consumer;

import static org.junit.Assert.assertEquals;

/**
 * Created by hylke on 05/05/15.
 */
public class ConsumerExampleTest extends AbstractExampleTest {

    @Test
    public void testConsumer1() {
        final Consumer<Car> consumer = car -> car.setName(car.getName().toUpperCase());
        final List<Car> cars = getCars();
        cars.stream().forEach(consumer);

        assertEquals(3, cars.size());
        assertEquals("AUDI", cars.get(0).getName());
        assertEquals("TOYOTA", cars.get(1).getName());
        assertEquals("LADA", cars.get(2).getName());
    }

    @Test
    public void testConsumer2() {
        final List<Car> cars = getCars();
        cars.stream().forEach(car -> car.setName(car.getName().toUpperCase()));

        assertEquals(3, cars.size());
        assertEquals("AUDI", cars.get(0).getName());
        assertEquals("TOYOTA", cars.get(1).getName());
        assertEquals("LADA", cars.get(2).getName());
    }
}
