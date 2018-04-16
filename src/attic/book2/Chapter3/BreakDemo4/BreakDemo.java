package attic.book2.Chapter3.BreakDemo4;

public class BreakDemo {
    public static void main(String[] args) {
        for (int i = 1; i < 4; i++) {
            one:{
            two:{
                three:{
                        System.out.println("\ni равно " + i);
                        if (i == 1) break one;
                        if (i == 2) break two;
                        if (i == 3) break three;
                              // Эта строка кода никогда не будет достигнута
                        System.out.println("нe будет выведено");
                    }
                System.out.println("Пocлe блока three");
                }
                System.out.println("Пocлe блока two");
            }
            System.out.println("Пocлe блока one");
        }
        System.out.println("Пocлe цыкла for");
    }
}
