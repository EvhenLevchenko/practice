package attic.book2.Chapter1.GalToLitTable;

public class GalToLitTable {
    public static void main(String[] args) {
        double duim, metr;
        int counter = 0;//Счетчик строк ииициаnизируется иуnевым значением

        for (metr = 1; metr <= 100; metr++) {
            duim = metr * 39.37; // преобразовать в литры
            System.out.println(metr + " метрам соответствует " +
                    duim + " дюймам");
            counter++; //Уаеnнчнвать значение счетчика строк на 1 на каждой итерацнн цнкпа

            if (counter == 12) { // есnн значение счетчика равно 10, аwаестн пустую строку
                System.out.println();
                counter = 0; // сбросить счетчик строк
            }
        }
        System.out.println("Peзyльтaт сравнения 10 > 9: " + (10 > 9));
    }
}