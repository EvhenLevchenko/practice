package attic.book2.Chapter3.IfElseDemo;

public class IfElseDemo {
    public static void main(String[] args) {


        int test = 50;
        char grade;

        if (test >= 90) {
            grade = 'A';
        } else if (test >= 80) {
            grade = 'B';
        } else if (test >= 70) {
            grade = 'C';
        } else if (test >= 60) {
            grade = 'D';
        } else {
            grade = 'F';
        }
        System.out.println("Grade= " + grade);


        for (int x = 0; x < 7; x++) {
            if (x == 1)
                System.out.println("x равно единице");
            else if (x == 2)
                System.out.println("x равно двум");
            else if (x == 3)
                System.out.println("x равно трем");
            else if (x == 4)
                System.out.println("x равно четырем");
            else if (x == 5)
                System.out.println("Знaчeниe х находится вне диапазона 1 - 5");
            else System.out.println("gtrh");
        }
    }
}
