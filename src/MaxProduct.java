import java.io.*;
import java.util.*;

public class MaxProduct {
    public int maxProduct(int[] nums) {
        int minProd = nums[0];
        int maxProd = nums[0];
        int globalMax = nums[0];
        for(int i = 1; i < nums.length; i++) {
            int tempMax = maxProd;
            maxProd = getMax(minProd * nums[i], maxProd * nums[i], nums[i]);
            globalMax = Math.max(globalMax, maxProd);
            minProd = getMin(minProd * nums[i], tempMax * nums[i], nums[i]);
        }
        return globalMax;
    }

    public static String isDuo(int number) {
        List<Integer> diffDigits = new ArrayList<>();
        if(number < 0) {
            diffDigits.add(-10);
        }
        number = Math.abs(number);
        while (number > 0 && diffDigits.size() <= 2) {
            if(!diffDigits.contains(number % 10)) {
                diffDigits.add(number % 10);
            }
            number -= number % 10;
            number /= 10;
        }

        return diffDigits.size() <= 2 ? "y" : "n";
    }

    public static void main(String[] args) {

    }

    public int getMax(int a, int b, int c) {
        return Math.max(Math.max(a,b), c);
    }

    public int getMin(int a, int b, int c) {
        return Math.min(Math.min(a,b), c);
    }

}
