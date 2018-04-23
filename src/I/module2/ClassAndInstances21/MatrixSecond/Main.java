package I.module2.ClassAndInstances21.MatrixSecond;

public class Main {
    public static void main(String[] args) {
        Matrix matrix = new Matrix();

        int[][] matrix1 = {{1, 2}, {4, 5}};
        int[][] matrix2 = {{7, 8}, {10, 11}};

        System.out.println("The first matrix: ");
        for (int[] ints : matrix1) {
            for (int anInt : ints) {
                System.out.print(anInt + " ");
            }
            System.out.println();
        }

        System.out.println("The second matrix: ");
        for (int[] ints : matrix2) {
            for (int anInt : ints) {
                System.out.print(anInt + " ");
            }
            System.out.println();
        }
        System.out.println("The sum of matrices: ");
        matrix.sumOfMatrix(matrix1,matrix2);

        System.out.println("The result of multiplication of matrices: ");
        matrix.multOfMatrix(matrix1,matrix2);
    }
}
