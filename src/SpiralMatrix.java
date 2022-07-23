import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SpiralMatrix {
    public static List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> spiralMatrix = new ArrayList<>();
        int col = 0;
        int row = 0;
        int minRow = 0;
        int minCol = 0;
        int maxCol = matrix[0].length - 1;
        int maxRow = matrix.length - 1;
        int k = 0;
        while (k < matrix.length * matrix[0].length) {
            if (row == minRow && col == minCol) {
                while (col <= maxCol) {
                    if (k >= matrix.length * matrix[0].length) {
                        break;
                    }
                    spiralMatrix.add(matrix[minRow][col]);
                    k++;
                    col++;
                }
                col = maxCol;
                minRow++;
                row = minRow;
            } else if(row == maxRow && col == maxCol){
                while (col >= minCol) {
                    if (k >= matrix.length * matrix[0].length) {
                        break;
                    }
                    spiralMatrix.add(matrix[maxRow][col]);
                    k++;
                    col--;
                }
                col = minCol;
                maxRow--;
                row = maxRow;
            } else if(col == maxCol){
                while (row <= maxRow) {
                    if (k >= matrix.length * matrix[0].length) {
                        break;
                    }
                    spiralMatrix.add(matrix[row][maxCol]);
                    k++;
                    row++;
                }
                row = maxRow;
                maxCol--;
                col = maxCol;
            } else {
                while (row >= minRow) {
                    if (k >= matrix.length * matrix[0].length) {
                        break;
                    }
                    spiralMatrix.add(matrix[row][minCol]);
                    k++;
                    row--;
                }
                row = minRow;
                minCol++;
                col = minCol;
            }
        }
        return spiralMatrix;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(spiralOrder(new int[][]{{1,2,3,4},
                {5,6,7,8}}).toArray()));
    }
}
