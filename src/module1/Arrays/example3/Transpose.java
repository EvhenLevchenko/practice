package module1.Arrays.example3;

public class Transpose {
    public static void main(String[] args) {
        final int ROW = 4;
        final int COLUME = 3;

        int[][] a = new int[ROW][COLUME];
        for (int i = 0; i < ROW; i++) {
            for (int j = 0; j < COLUME; j++) {
                a[i][j] = ROW * i + COLUME * j;
            }
        }
        System.out.println("Начальная матрица");
        System.out.println("------");
        for (int i = 0; i < ROW; i++) {
            for (int j = 0; j < COLUME; j++) {
                System.out.printf("%4d", a[i][j]);
            }
            System.out.println();
        }
        for (int i = 0; i < ROW; i++) {
            for (int j = i+1; j < COLUME; j++) {
                int temp = a[i][j];
                a[i][j] = a[j][i];
                a[j][i] = temp;
            }
        }
        System.out.println();
        System.out.println("Новая матрица");
        System.out.println("------");
        for (int i = 0; i < ROW; i++) {
            for (int j = 0; j < COLUME; j++) {
                System.out.printf("%3d", a[i][j]);
            }
            System.out.println();
        }
    }
}
