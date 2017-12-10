import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//for(MyDayOfWeek myDayOfWeek:MyDayOfWeek.values()){
        //  System.out.println(myDayOfWeek);
        for (MyDayOfWeek myDayOfWeek : MyDayOfWeek.values()) {
            switch (myDayOfWeek) {
                case MONDAY:
                case FRIDAY:
                    System.out.println("My Java day " + myDayOfWeek);
            }
        }

        Scanner scanner = new Scanner(System.in);
        MyDayOfWeek myDayOfWeek = MyDayOfWeek.valueOf(scanner.nextLine());
        System.out.println("The next day day of week " + myDayOfWeek.nextday());
        scanner.close();
    }


    public enum MyDayOfWeek {
        SUNDAY {
            public MyDayOfWeek nextDay() {
                return MONDAY;
            }
        },
        MONDAY {
            public MyDayOfWeek nextDay() {
                return MONDAY;
            }
        },
        TUESDAY {
            public MyDayOfWeek nextDay() {
                return WEDNESDAY;
            }
        },
        WEDNESDAY {
            public MyDayOfWeek nextDay() {
                return THURSDAY;
            }
        },
        THURSDAY {
            public MyDayOfWeek nextDay() {
                return FRIDAY;
            }
        },
        FRIDAY {
            public MyDayOfWeek nextDay() {
                return SATURDAY;
            }
        },
        SATURDAY {
            public MyDayOfWeek nextDay() {
                return SUNDAY;
            }
        };

        public MyDayOfWeek nextday() {
            MyDayOfWeek result = this;
            switch (this) {
                case SUNDAY:
                    result = MONDAY;
                case MONDAY:
                    result = TUESDAY;
                case TUESDAY:
                    result = WEDNESDAY;
                case WEDNESDAY:
                    result = THURSDAY;
                case THURSDAY:
                    result = SATURDAY;
                case SATURDAY:
                    result = MONDAY;

            }
            return result;

        }
    }
}

