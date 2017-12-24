package module1.ControlFlowStatements;

import com.sun.xml.internal.bind.v2.TODO;

public class If {
    public static void main(String[] args) {

        int age = 35;
        if (age < 13) {
            System.out.println("Child");
        } else if (age < 18) {
            System.out.println("Teenager");
        } else if (age < 35) {
            System.out.println("Young adult");
        } else if (age < 50) {
            System.out.println("Middle-age");
        }


        int testscore = 51;
        char grade;

        if (testscore >= 90) {
            grade = 'A';
        } else if (testscore >= 80) {
            grade = 'B';
        } else if (testscore >= 70) {
            grade = 'C';
        } else if (testscore >= 60) {
            grade = 'D';
        } else {
            grade = 'F';
        }
        System.out.println("Grade = " + grade);


        int x = 10;
        int y = 20;

        if (x < y) {
            System.out.println("x<y");
        } else if (x == y) {
            System.out.println("x==y");
        } else {
            System.out.println("x > y");
        }
        System.out.println("WHILE");
        //TODO while
//
//        int number = 1;// щетчик
//        while (number <= 10) {//uslovie
//            System.out.print(number);
//            number++;//telo
//        }//telo
        //TODO do while
//int number=1;
//do{
//    System.out.print(number);
//    number++;
//}while(number<=10);
//TODO for
//        for (int number = 2; number <= 10; number++) {
//            System.out.println(number);
//        }


        for (int row = 1; row < 10; row++) {
            for (int column = 1; column < 10; column++) {
                System.out.print(column);
            }
            System.out.println();
        }

    }
}




