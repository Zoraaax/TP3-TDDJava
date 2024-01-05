package m2i.valentin.tp3.exo1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ThermometreTest {

    @Test
    public void thermometre_should_return_0() {
        Thermometre thermometre = new Thermometre();

        int result = thermometre.checkTemperature(0);

        assertEquals(0, result);
    }
}