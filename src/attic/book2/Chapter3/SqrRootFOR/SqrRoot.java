package attic.book2.Chapter3.SqrRootFOR;

public class SqrRoot {
    public static void main(String[] args) {

        for (double num = 1.0; num < 100.0; num++) {
            double sroot = Math.sqrt(num);
            System.out.println("Квадратный корень из " + num + " = " + sroot);

            //вычислить ошибку  округления
            double rerr = num - (sroot * sroot);
            System.out.println("0шибкa округления: " + rerr);
            System.out.println();
        }
    }
}
