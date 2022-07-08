import java.util.ArrayList;
import java.util.List;

public class SpiralMatrix {
    public static List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> spiralMatrix = new ArrayList<>();
        int col = 0;
        int row = 0;
        int minRow = 0;
        int minCol = 0;
        int maxCol = matrix.length;
        int maxRow = matrix[0].length;
        int temp;
        int k = 0;
        while (k < matrix.length * matrix[0].length) {
            if (row > col || row == col && col == maxCol - 1) {
                while (row > 0) {
                    spiralMatrix.add(matrix[col][row]);
                    k++;
                    row--;
                }
                temp = col;
                col = row;
                row = temp;
            } else {
                while (col < maxCol) {
                    spiralMatrix.add(matrix[row][col]);
                    k++;
                    col++;
                }
                temp = row + 1;
                row = col - 1;
                col = temp;
            }
        }
        return spiralMatrix;
    }

    public static void main(String[] args) {
        spiralOrder(new int[][]{{1,2}, {3,4}});
    }
}
