package m2i.valentin.tp3.exo1;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

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

    public static Stream<Arguments> array_with_two_elements_should_return_closest_to_0_provider() {
        return Stream.of(
                Arguments.of(new int[]{12, 22}, 12),
                Arguments.of(new int[]{5, 3}, 3),
                Arguments.of(new int[]{1, 1}, 1)
        );
    }

    @ParameterizedTest
    @MethodSource("array_with_two_elements_should_return_closest_to_0_provider")
    public void array_with_multiple_elements_should_return_closest_to_0(
            int[] givenArray,
            int expectedValue
    ) {

        int result = thermometre.checkTemperature(givenArray);

        assertEquals(expectedValue, result);
    }

    public static Stream<Arguments> equals_value_should_return_positive_element_provider() {
        return Stream.of(
                Arguments.of(new int[]{-4, 4}, 4),
                Arguments.of(new int[]{-1, 1}, 1),
                Arguments.of(new int[]{-12, 12}, 12)
        );
    }

    @ParameterizedTest
    @MethodSource("equals_value_should_return_positive_element_provider")
    public void equals_value_should_return_positive_element(
            int[] givenArray,
            int expectedValue
    ) {
        int result = thermometre.checkTemperature(givenArray);

        assertEquals(expectedValue, result);
    }

    @Test
    public void should_throw_exception_when_array_is_superior_to_1000() {
        int[] givenArray = new int[1001];
        for (int index = 0; index < givenArray.length; index++) {
            givenArray[index] = index;
        }

        assertThrows(IllegalArgumentException.class, () -> {
            thermometre.checkTemperature(givenArray);
        });
    }
}
