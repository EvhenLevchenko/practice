package module2.ClassAndInstances21.MatrixSecond;

public class Matrix {
    public static int[][] sumOfMatrix(int[][] m1, int[][] m2) {
        int[][] sum = new int[m1.length][m1[0].length];
        for (int i = 0; i < m1.length; i++) {
            for (int j = 0; j < m1[0].length; j++) {
                sum[i][j] = m1[i][j] + m2[i][j];
                System.out.print(sum[i][j] + " ");
            }
            System.out.println();
        }
        return sum;
    }

    static int[][] multOfMatrix(int[][] m1, int[][] m2) {
        int[][] mult = new int[m1.length][m2[0].length];
        for (int i = 0; i < m1.length; i++) {
            for (int j = 0; j < m2[0].length; j++) {
                for (int k = 0; k < m2.length; k++) {
                    mult[i][j] = m1[i][k] * m2[k][j];
                }
                System.out.print(mult[i][j] + " ");
            }
            System.out.println();
        }
        return mult;
    }
}
