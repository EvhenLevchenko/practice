package module1.Arrays.example0;

public class MultiArray {
    public static void main(String[] args) {
        //Обьявим константу для размера массива
        int SIZE = 10;
        // Create two-dimensional array
        char[][] graph = new char[SIZE][SIZE];
        //Цикл по первой размерности (первые квадратные скобки )
        for (int i = 0; i < SIZE; i++) {
            //Цикл по второй размерности (первые квадратные скобки )
            for (int j = 0; j < SIZE; j++) {
                graph[i][j] = '#';
            }
        }
        //Теперь выводим массив на экран
        // Цикл по первой размерноти выводит строки
        for (int row = 0; row < SIZE; row++) {
            // Цикл по второй размерности выводит колонки-вывод 1 строки
            for (int colum = 0; colum < SIZE; colum++) {
                //Используем оператор print -без перехода на след строку
                System.out.print(graph[row][colum]);
            }
            System.out.println();
        }
    }
}
