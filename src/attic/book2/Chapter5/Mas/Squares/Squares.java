package attic.book2.Chapter5.Mas.Squares;

public class Squares {
    public static void main(String[] args) {
        int squares[][] = {
                {1, 100},
                {2, 4},
                {3, 88},
                {4, 8},
                {5, 10},
                {6, 12},
        };

        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 2; j++)

                System.out.print(squares[i][j] + " ");
            System.out.println();
        }
    }
}
