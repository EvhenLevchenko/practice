package I.module1.Arrays;

public class Main {
    public static void main(String[] args) {
        for (int i = 0; i <= 0; i++) {
            System.out.print("* | ");

            for (int j = 1; j < 10; j++) {
                System.out.print(j+ "\t");
            }
            System.out.println("\n------------------------------------");
        }
        for (int i = 1; i < 10; i++) {
            System.out.print(i + " | ");
            for (int j = 1; j < 10; j++) {
                System.out.print(i * j + "\t");
            }
            System.out.println();
        }
    }
}
//        int i=1;
//        while (i<9){
//            int j=i;
//            while(j>0){
//                System.out.print(j);
//                j--;
//            }
//            i++;
//            System.out.println();
//        }


//        for (int i = 0; i < 10; i++) {
//            for (int j = i + 1; j > 0; j--) {
//                System.out.print(j + " ");
//            }
//            System.out.println();
//        }
