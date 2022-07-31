import java.util.Stack;

public class MyAtoi {
    public static int myAtoiStack(String s) {
        if(s.length() == 0) {
            return 0;
        }
        int start = 0;
        int sign = 1;
        long number = 0;
        Stack<Character> digits = new Stack<>();
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
        while(start != s.length() &&
                Character.isDigit(s.charAt(start))) {
            digits.push(s.charAt(start));
            ++start;
        }
        long powOfTen = 1;
        while(number < Integer.MAX_VALUE && !digits.empty()) {
            int digit = digits.pop() - '0';
            if (digit != 0 && powOfTen >= Integer.MAX_VALUE) {
                return sign == -1 ? Integer.MIN_VALUE : Integer.MAX_VALUE;
            }
            number += powOfTen * digit;
            if (powOfTen <= Integer.MAX_VALUE) {
                powOfTen *= 10;
            }
        }
        if (number * sign >= Integer.MAX_VALUE) {
            return Integer.MAX_VALUE;
        } else if (number * sign <= Integer.MIN_VALUE) {
            return Integer.MIN_VALUE;
        }
        return (int) number * sign;
    }

    public int myAtoi(String s) {
        if(s.length() == 0) {
            return 0;
        }
        int pos = 0;
        int sign = 1;
        long number = 0;
        while(pos < s.length() && s.charAt(pos) == ' ') {
            ++pos;
        }

        if (pos == s.length()) {
            return 0;
        }

        if(s.charAt(pos) == '+') {
            ++pos;
        } else if(s.charAt(pos) == '-') {
            sign = -1;
            ++pos;
        }

        while(pos != s.length() &&
                Character.isDigit(s.charAt(pos))) {
            number = number * 10 + (s.charAt(pos) - '0');
            if (number >= Integer.MAX_VALUE) {
                return sign == -1 ? Integer.MIN_VALUE :
                        Integer.MAX_VALUE;
            }
            ++pos;
        }
        return (int) number * sign;
    }
}
