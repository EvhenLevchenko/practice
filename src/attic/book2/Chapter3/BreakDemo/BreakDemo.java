package attic.book2.Chapter3.BreakDemo;

public class BreakDemo {
    public static void main(String[] args) {
        int num=100;

        for (int i = 0; i <num ; i++) {
            if(i>=num)break;
            System.out.print(i+" ");
        }
        System.out.println("Цыкл завершен");
    }
}
