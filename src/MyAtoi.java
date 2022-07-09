public class MyAtoi {
    public static int myAtoi(String s) {
        if(s.length() == 0) {
            return 0;
        }
        int start = 0;
        int sign = 1;
        int length;
        long number = 0;
        char[] digits = new char[200];
        while(s.charAt(start) == ' ') {
            ++start;
            if(start == s.length()) {
                return (int) number;
            }
        }
        if(s.charAt(start) == '+') {
            ++start;
        } else if(s.charAt(start) == '-') {
            sign = -1;
            ++start;
        }
        int i = 0;
        while(start != s.length() &&
                Character.isDigit(s.charAt(start))) {
            digits[i] = s.charAt(start);
            ++i;
            ++start;
        }
        length = i;
        i = 0;
        while(length > 0) {
            if(digits[i] != '0' && length > 10) {
                return sign == -1 ? Integer.MIN_VALUE
                        : Integer.MAX_VALUE;
            }
            number += Math.pow(10, length - 1) * Character.getNumericValue(digits[i]);
            ++i;
            --length;
        }
        if (number * sign >= Integer.MAX_VALUE) {
            return Integer.MAX_VALUE;
        } else if (number * sign <= Integer.MIN_VALUE) {
            return Integer.MIN_VALUE;
        }
        return (int) number * sign;
    }
}
