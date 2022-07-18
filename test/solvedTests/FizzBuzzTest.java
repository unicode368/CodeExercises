package solvedTests;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import solved.FizzBuzz;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import static org.junit.jupiter.api.Assertions.assertEquals;

@RunWith(Parameterized.class)
public class FizzBuzzTest {
    int number;
    List<String> expectedResult;
    String description;

    public FizzBuzzTest(int number, List<String> expectedResult,
                        String description) {
        this.number = number;
        this.expectedResult = expectedResult;
        this.description = description;
    }

    @Parameterized.Parameters
    public static Collection numsAndTargets() {
        return Arrays.asList(new Object[][] {
                { 3 , Arrays.asList("1", "2", "Fizz"), "Fizz only" },
                { 5 , Arrays.asList("1", "2", "Fizz", "4", "Buzz"), "Fizz and Buzz" },
                { 15 , Arrays.asList("1", "2", "Fizz", "4", "Buzz", "Fizz", "7", "8", "Fizz",
                        "Buzz", "11", "Fizz", "13", "14", "solved.FizzBuzz"), "Fizz, Buzz and solved.FizzBuzz" }
        });
    }

    @Test
    public void testAddTwoNumbers() {
        System.out.println(description);
        assertEquals(expectedResult,
                FizzBuzz.fizzBuzz(number));
    }
}
