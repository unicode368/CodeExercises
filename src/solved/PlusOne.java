package solved;

import java.util.Arrays;

public class PlusOne {
    public static int[] plusOne(int[] digits) {
        int[] result;
        boolean sizeIncrease = false;
        int addUp = 1;
        int val;

        for (int i = digits.length - 1; i >= 0; i--) {
            if (digits[i] != 9) {
                break;
            }

            if (i == 0) {
                sizeIncrease = true;
            }
        }

        if (sizeIncrease) {
            result = new int[digits.length + 1];
            result[0] = 1;

            for(int i = digits.length - 1; i >= 0; i--) {
                result[i + 1] = 0;
            }
        } else {
            result = new int[digits.length];

            for(int i = digits.length - 1; i >= 0; i--) {
                if (digits[i] + addUp > 9) {
                    result[i] = 0;
                    addUp = 1;
                } else {
                    result[i] = digits[i] + addUp;
                    addUp = 0;
                }
            }
        }
        return result;
    }
}
