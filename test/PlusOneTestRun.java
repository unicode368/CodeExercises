import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

public class PlusOneTestRun {
    public static void main(String[] args) {
        Result result = JUnitCore.runClasses(PlusOneTest.class);

        for (Failure failure : result.getFailures()) {
            System.out.println(failure.toString());
        }

        if (result.wasSuccessful()) {
            System.out.println("Testing is successful.");
        } else {
            System.out.println("One or more tests failed.");
        }
    }
}
