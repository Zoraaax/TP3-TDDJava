package m2i.valentin.tp3.exo1;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ThermometreTest {

    private Thermometre thermometre;

    @BeforeEach
    public void setUp() {
        thermometre = new Thermometre();
    }

    @Test
    public void empty_array_should_return_0() {

        int result = thermometre.checkTemperature(new int[]{});

        assertEquals(0, result);
    }

    @Test
    public void array_with_one_element_should_return_this_element() {

        int result = thermometre.checkTemperature(new int[]{4});

        assertEquals(4, result);
    }

    @Test
    public void array_with_multiple_elements_should_return_closest_to_0() {

        int result = thermometre.checkTemperature(new int[]{4, 8});

        assertEquals(4, result);
    }
}
