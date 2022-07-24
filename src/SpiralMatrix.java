import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SpiralMatrix {
    public static List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> spiralMatrix = new ArrayList<>();
        int top = 0;
        int left = 0;
        int right = matrix[0].length - 1;
        int bottom = matrix.length - 1;
        while (top <= bottom && left <= right) {
            walkTheRing(matrix, top, bottom, left, right,
                    spiralMatrix);
            //if 1 or 2 rows or 1 or 2 cols
            if(bottom - top <= 1 || right - left <= 1) {
                break;
            }
            top++;
            left++;
            right--;
            bottom--;
        }
        return spiralMatrix;
    }

    public static void walkTheRing(int[][] matrix, int top, int bottom,
                            int left, int right, List<Integer> res) {
        //left to right
        for(int i = left; i <= right; i++) {
            res.add(matrix[top][i]);
        }
        //top to bottom
        for(int i = top + 1; i <= bottom; i++) {
            res.add(matrix[i][right]);
        }
        if(top == bottom) {
            return;
        }
        //right to left
        for(int i = right - 1; i >= left; i--) {
            res.add(matrix[bottom][i]);
        }
        if(left == right) {
            return;
        }
        //bottom to top
        for(int i = bottom - 1; i >= top + 1; i--) {
            res.add(matrix[i][left]);
        }
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(spiralOrder(new int[][]{{1,2,3,4},
                {5,6,7,8}}).toArray()));
    }
}
