package dontsee.lms.persom;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.Scanner;

public class Student extends Person implements Serializable {
    public Student(String firstName, String secondName, int id) {
        super(firstName, secondName, id);
    }



    @Override
    public Student add() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first name:");
        String firstName = scanner.nextLine();
        System.out.println("Enter second name:");
        String secondName = scanner.nextLine();
        System.out.println("Enter id:");
        int id = scanner.nextInt();
        return new Student(firstName, secondName,id);
    }


//    @Override
//    public Student add() {
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Enter first name:");
//        String firstName = scanner.nextLine();
//        System.out.println("Enter second name:");
//        String secondName = scanner.nextLine();
//        System.out.println("Enter nationality:");
//        String nationality = scanner.nextLine();
//        System.out.println("Enter number of passport:");
//        String numberOfPassport = scanner.nextLine();
//        System.out.println("Enter date of Birthday:\nyear:");
//        int yearOfBirthday = Integer.parseInt(scanner.nextLine());
//        System.out.println("month:");
//        int monthOfBirthday = Integer.parseInt(scanner.nextLine());
//        System.out.println("day:");
//        int dayOfBirthday = Integer.parseInt(scanner.nextLine());
//        LocalDate dateOfBirthday = LocalDate.of(yearOfBirthday, monthOfBirthday, dayOfBirthday);
//        return new Student(firstName, secondName,id, dateOfBirthday);
//
//    }
}
