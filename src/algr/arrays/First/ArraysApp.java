package algr.arrays.First;

public class ArraysApp {
    public static void main(String[] args) {

        int j;
        int[] arr = new int[100]; // Создание массива
        int nElems = 0; // Количество элементов
        long searchKey; // Ключи искомого элемента
//--------------------------------------------------------------
        arr[0] = 7; // Вставка 10 элементов
        arr[1] = 9;
        arr[2] = 4;
        arr[3] = 5;
        arr[4] = 2;
        arr[5] = 8;
        arr[6] = 1;
        arr[7] = 0;
        arr[8] = 6;
        arr[9] = 3;
        nElems = 10; // Массив содержит 10 элементов
        for (j = 0; j < nElems; j++)  // Вывод элементов
            System.out.print(arr[j] + " ");
        System.out.println("");

        searchKey = 11; // Поиск элемента с ключом 66
        for (j = 0; j < nElems; j++)   // Для каждого элемента

            if (arr[j] == searchKey) // Значение найдено?
                break; // Да - выход из цикла
        if (j == nElems) // Достигнут последний элемент?
            System.out.println("Can't find " + searchKey); // Да
        else
            System.out.println("Found " + searchKey); // Нет


        searchKey=4;
        for ( j = 0; j <nElems ; j++)
            if(arr[j]==searchKey)
                break;
            for (int k = j; k <nElems-1 ; k++)
                arr[k]=arr[k+1];
                nElems--;

                for ( j = 0; j <nElems ; j++)
                    System.out.print(arr[j]+" ");





    }
}


