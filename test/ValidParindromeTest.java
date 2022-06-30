import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.jupiter.api.Assertions.assertEquals;

@RunWith(Parameterized.class)
public class ValidParindromeTest {
    String palindrome;
    boolean expectedResult;
    String description;

    public ValidParindromeTest(String palindrome,
                               boolean expectedResult, String description) {
        this.palindrome = palindrome;
        this.expectedResult = expectedResult;
        this.description = description;
    }

    @Parameterized.Parameters
    public static Collection numsAndTargets() {
        return Arrays.asList(new Object[][] {
                { "A man, a plan, a canal: Panama" , true, "String is palindrome" },
                { "rocket, kcor", false, "String isn't palindrome" },
                { " ", true, "Empty string" }
        });
    }

    @Test
    public void testAddTwoNumbers() {
        System.out.println(description);
        assertEquals(expectedResult,
                ValidPalindrome.isPalindrome(palindrome));
    }
}
