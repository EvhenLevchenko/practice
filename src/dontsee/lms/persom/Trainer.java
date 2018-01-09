package dontsee.lms.persom;

import java.io.Serializable;
import java.util.Scanner;


public class Trainer extends Person implements Serializable {

    public Trainer(String firstName, String secondName, int id) {
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
}
