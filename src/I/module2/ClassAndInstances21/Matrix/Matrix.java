package I.module2.ClassAndInstances21.Matrix;

import java.util.Arrays;

public class Matrix {
    private int[][] firstMatrix = {{2, 3, 5, 7}, {5, 6, 2, 1}, {4, 3, 2, 2}, {5, 2, 3, 1}};
    private int[][] secondMatrix = {{2, 7, 5, 3}, {5, 2, 7, 3}, {2, 7, 1, 4}, {6, 7, 5, 4}};


    public int[][] getFirstMatrix() {
        return firstMatrix;
    }

    public int[][] getSecondMatrix() {
        return secondMatrix;
    }

    public void additionalMatrix(int[][] addMatrix) {
        for (int i = 0; i < firstMatrix.length; i++) {
            for (int j = 0; j < secondMatrix.length; j++)
                addMatrix[i][j] = firstMatrix[i][j] + secondMatrix[i][j];
                System.out.println(Arrays.toString(addMatrix[i]));
            }
            System.out.println();

        }

    public void multiplicationMatrix(int[][] multMatrix) {
        for (int i = 0; i < firstMatrix.length; i++) {
            for (int j = 0; j < secondMatrix.length; j++)
                multMatrix[i][j] = firstMatrix[i][j] * secondMatrix[i][j];
            System.out.println(Arrays.toString(multMatrix[i]));
        }
    }
}
class Main {

    public static void main(String[] args) {
        Matrix matrix = new Matrix();
        System.out.println("Addition matrix: ");
        matrix.additionalMatrix(new int[4][4]);
        System.out.println("Multiplication matrix: ");
        matrix.multiplicationMatrix(new int[4][4]);
    }
}