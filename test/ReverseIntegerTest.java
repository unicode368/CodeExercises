import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

@RunWith(Parameterized.class)
public class ReverseIntegerTest {
    int number;
    int expectedResult;
    String description;

    public ReverseIntegerTest(int number, int expectedResult,
                        String description) {
        this.number = number;
        this.expectedResult = expectedResult;
        this.description = description;
    }

    @Parameterized.Parameters
    public static Collection numsAndTargets() {
        return Arrays.asList(new Object[][] {
                { 123 , 321, "Plain reverse" },
                { -123 , -321, "Reverse negative number" },
                { 9 , 9, "Less than 10" },
                { 0 , 0, "Reverse zero" },
                {-2147483648, 0, "Reversed number out of bounds"}
        });
    }

    @Test
    public void testAddTwoNumbers() {
        System.out.println(description);
        assertEquals(expectedResult,
                ReverseInteger.reverse(number));
    }
}
