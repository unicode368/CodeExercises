public class RotateImage {
    public static void rotate(int[][] matrix) {
        int temp;
        for(int i = 0; i < matrix.length; i++) {
            for(int j = 0; j < matrix[i].length; j++) {
                if (j == matrix[i].length - 1) {
                    temp = matrix[i][j];
                    matrix[i][j] = matrix[j][i];
                    matrix[j][i] = temp;
                } else {
                    temp = matrix[i][j];
                    matrix[i][j] = matrix[matrix[i].length - 1 - j][i];
                    matrix[matrix[i].length - 1 - j][i] = temp;
                }
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {
        rotate(new int[][]{{1,2,3},{4,5,6},{7,8,9}});
    }
}
