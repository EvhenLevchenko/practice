package module1.ControlFlowStatements;

public class Switch {
    public static void main(String[] args) {
        int month = 4;
        int daysInMonth = 0;

        switch (month) {
            default:
                System.out.println("Other");
                break;
            case 0:
                System.out.println("Jan");
                break;
            case 1:
                System.out.println("Feb");
                break;
            case 2:
                System.out.println("Mar");
                break;
            case 4:
            case 3:
                System.out.println("Apr");
                break;
            case 5:
                System.out.println("May");
                break;
            case 6:
                System.out.println("Sep");
                break;
        }
    }
}
