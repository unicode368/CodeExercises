package solvedTests;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import solved.PlusOne;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

@RunWith(Parameterized.class)
public class PlusOneTest {
    int[] inputNumber;
    int[] expectedResult;
    String description;

    public PlusOneTest(int[] inputNumber,
                      int[] expectedResult, String description) {
        this.inputNumber = inputNumber;
        this.expectedResult = expectedResult;
        this.description = description;
    }

    @Parameterized.Parameters
    public static Collection numsAndResults() {
        return Arrays.asList(new Object[][] {
                { new int[]{1,2,3} , new int[]{1,2,4}, "Add to digit-ascending number" },
                { new int[]{4,3,2,1} , new int[]{4,3,2,2}, "Add to digit-descending number" },
                { new int[]{9} , new int[]{1,0}, "Add to nine" },
                { new int[]{9,9,9} , new int[]{1,0,0,0}, "Add to 999" }
        });
    }

    @Test
    public void testPlusOne() {
        System.out.println(description);
        assertArrayEquals(expectedResult,
                PlusOne.plusOne(inputNumber));
    }
}

