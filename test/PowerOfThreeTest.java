import org.junit.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.ValueSource;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PowerOfThreeTest {
    @ParameterizedTest
    @ValueSource(ints = {27, 19647, 1, 0, -3}, booleans = {true, false, true, false, false},
    strings = {"Three to the power of 3", "Aliquot but not power of", "Power of 3 to 0",
            "Zero", "Not the power of three"})
    public void testIsPowerOfThree(int number, boolean expectedResult,
                                   String description) {
        System.out.println(description);
        assertEquals(expectedResult,
                PowerOfThree.isPowerOfThree(number));
    }
}
