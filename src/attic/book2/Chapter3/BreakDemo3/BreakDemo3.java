package attic.book2.Chapter3.BreakDemo3;

public class BreakDemo3 {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            System.out.println("Cчeтчик внешнего цикла: " + i);
            System.out.print("Cчeтчик внутреннего цикла: ");
            int t = 0;
            for (int j = 0; j <100 ; j++) {
                if (j==20)break;
                System.out.print(j+" ");
            }
//            while (t < 100) {
//                if (t == 20) break; // прервать цикл, если t 10
//                System.out.print(t + " ");
//                t++;
//            }
            System.out.println();
        }
        System.out.println("Циклы завершены.");
    }
}
