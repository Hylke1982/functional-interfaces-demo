package nl.codecentric.functionalinterfaces;

import nl.codecentric.functionalinterfaces.model.Car;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

import static org.junit.Assert.assertEquals;

/**
 * Created by hylke on 05/05/15.
 */
public class FunctionExampleTest extends AbstractExampleTest{

    @Test
    public void testMakeNamesUpperCase() {
        final Function<Car, String> upperCaseFunction = x -> x.getName().toUpperCase();
        final List<String> carNames = getCars()
                .stream()
                .map(upperCaseFunction)
                .collect(Collectors.toList());
        assertEquals(3, carNames.size());
        assertEquals("AUDI", carNames.get(0));
        assertEquals("TOYOTA", carNames.get(1));
        assertEquals("LADA", carNames.get(2));
    }




}
