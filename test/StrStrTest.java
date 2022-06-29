import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

@RunWith(Parameterized.class)
public class StrStrTest {
    String haystack;
    String needle;
    int expectedResult;
    String description;

    public StrStrTest(String haystack, String needle,
                      int expectedResult, String description) {
        this.haystack = haystack;
        this.needle = needle;
        this.expectedResult = expectedResult;
        this.description = description;
    }

    @Parameterized.Parameters
    public static Collection numsAndTargets() {
        return Arrays.asList(new Object[][] {
                { "hello" , "ll", 2, "Substring is present" },
                { "aaaaa" , "bba", -1, "Substring is not present" },
                { "aaaaa" , "", 0, "Substring is empty string"}
        });
    }

    @Test
    public void testAddTwoNumbers() {
        System.out.println(description);
        assertEquals(expectedResult,
                StrStr.strStr(haystack, needle));
    }
}
