package m2i.valentin.tp3.exo1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ThermometreTest {

    @Test
    public void empty_array_should_return_0() {
        Thermometre thermometre = new Thermometre();

        int result = thermometre.checkTemperature(new int[]{});

        assertEquals(0, result);
    }

    @Test
    public void array_with_one_element_should_return_this_element() {
        Thermometre thermometre = new Thermometre();

        int result = thermometre.checkTemperature(new int[]{1});

        assertEquals(1, result);
    }
}
