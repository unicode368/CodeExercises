public class PlusOne {
    public static int[] plusOne(int[] digits) {
        int[] result = new int[digits.length + 1];
        result[0] = 1;
        digits[digits.length - 1]++;
        for(int i = digits.length - 1; i >= 0; i--) {
            if(digits[i] > 9 && i != 0) {
                digits[i] = 0;
                digits[i - 1]++;
            } else if(digits[i] > 9 && i == 0){
                digits[i] = 0;
            } else {
                result = digits;
                break;
            }
            result[i + 1] = digits[i];
        }
        return result;
    }
}
