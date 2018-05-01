package I.module1.Arrays.example0;

public class MultiArray {
    public static void main(String[] args) {
        //Обьявим константу для размера массива
        int COLUME = 10;
        int ROW = 5;

        // Create two-dimensional array
        char[][] graph = new char[ROW][COLUME];
        //Цикл по первой размерности (первые квадратные скобки )
        for (int i = 0; i < ROW; i++) {
            //Цикл по второй размерности (первые квадратные скобки )
            for (int j = 0; j < COLUME; j++) {
                graph[i][j] = '0';
            }
        }
        //Теперь выводим массив на экран
        // Цикл по первой размерноти выводит строки
        for (int i = 0; i < ROW; i++) {
            // Цикл по второй размерности выводит колонки-вывод 1 строки
            for (int j = 0; j < COLUME; j++) {
                //Используем оператор print -без перехода на след строку
                System.out.print(graph[i][j]);
            }
            System.out.println();
        }
    }
}
