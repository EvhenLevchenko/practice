package I.module1.Arrays.example1;

public class MultiArray {
    public static void main(String[] args) {
        final int SIZE = 10;
        char[][] graph = new char[SIZE][SIZE];

        for (int row = 0; row < SIZE; row++) {
            for (int colume = 0; colume < SIZE; colume++) {
                if (row == 0 || row == SIZE - 1
                             || colume == 0 || colume == SIZE - 1) {
                    graph[row][colume] = '$';
                } else {
                    graph[row][colume] = ' ';
                }
            }
        }


        for (int row = 0; row < SIZE; row++) {
            for (int colume = 0; colume < SIZE; colume++) {
                System.out.print(graph[row][colume]);
            }
            System.out.println();
        }
    }
}
