package attic.book2.Chapter3.SwitchDemoFallThrough;

import java.util.ArrayList;

public class SwitchDemoFallThrough {
    public static void main(String[] args) {
        ArrayList<String> futureMonth = new ArrayList<String>();

        int month = 4;
        switch (month) {
            case 1:
            case 2:
            case 3:
                futureMonth.add("January,February,March");
            case 4:
                futureMonth.add("April");
            case 5:
                futureMonth.add("May");
            case 6:
                futureMonth.add("June");
            case 7:
                futureMonth.add("July");
            case 8:
                futureMonth.add("August");
            case 9:
                futureMonth.add("September");
            case 10:
                futureMonth.add("Octember");
            case 11:
                futureMonth.add("November");
            case 12:
                futureMonth.add("December");
                break;
            default:
                break;
        }
        if (futureMonth.isEmpty()) {
            System.out.println("Invalid month number");
        } else {
            for (String monthName : futureMonth) {
                System.out.println(monthName);
            }
        }
    }
}
