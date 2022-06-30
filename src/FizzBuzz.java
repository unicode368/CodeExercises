import java.util.ArrayList;
import java.util.List;

public class FizzBuzz {
    public static List<String> fizzBuzz(int n) {
        List<String> list = new ArrayList<>();
        for(int i = 0; i < n; i++) {
            boolean b = ((i + 1) % 3 == 0 && (i + 1) % 5 == 0) ? list.add("FizzBuzz") :
                    (i + 1) % 3 == 0 ? list.add("Fizz") : (i + 1) % 5 == 0 ?
                            list.add("Buzz") : list.add(String.valueOf(i + 1));
        }
        return list;
    }
}
