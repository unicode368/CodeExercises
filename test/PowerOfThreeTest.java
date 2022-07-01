import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

@RunWith(Parameterized.class)
public class PowerOfThreeTest {
    int number;
    boolean expectedResult;
    String description;

    public PowerOfThreeTest(int number, boolean expectedResult,
                        String description) {
        this.number = number;
        this.expectedResult = expectedResult;
        this.description = description;
    }

    @Parameterized.Parameters
    public static Collection numsAndTargets() {
        return Arrays.asList(new Object[][] {
                { 27 , true, "Three to the power of 3" },
                { 19647 , false, "Aliquot but not power of" },
                { 1 , true, "Power of 3 to 0" },
                { -3 , false, "Not the power of three" }
        });
    }

    @Test
    public void testAddTwoNumbers() {
        System.out.println(description);
        assertEquals(expectedResult,
                PowerOfThree.isPowerOfThree(number));
    }
}
