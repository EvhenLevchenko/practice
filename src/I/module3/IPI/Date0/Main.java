package I.module3.IPI.Date0;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.time.temporal.ChronoUnit;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {
//        Date date=new Date();
//        System.out.println(date.getTime());
        Clock clock = Clock.systemDefaultZone();
        System.out.println(clock.millis());
        System.out.println(Clock.systemUTC().millis());
//        ZoneId.getAvailableZoneIds().forEach(s -> {
        //   System.out.println(Clock.system(ZoneId.of(s)));
        // Clock c=Clock.system(ZoneId.of(s));
//            LocalTime localTime=LocalTime.now(ZoneId.of(s));
//            System.out.println(s+" "+localTime);
//        });
//        String zone1="Asia/Singapore";
//        String zone2="Australia/Lindeman";
//        LocalTime l1=LocalTime.now(ZoneId.of(zone1));
//        LocalTime l2=LocalTime.now(ZoneId.of(zone2));
//
//        System.out.println(l1);
//        System.out.println(l2);
//
//        System.out.println(l1.isAfter(l2));;
//        System.out.println(ChronoUnit.HOURS.between(l2,l1));
//        System.out.println(ChronoUnit.MILLIS.between(l2,l1));
//
//
//        LocalTime myTime=LocalTime.of(23,59,59);
//        System.out.println(myTime);


//        LocalTime localTime1=LocalTime.of(20,20,20);
//        LocalTime localTime2=LocalTime.of(20,22,20);
//        System.out.println(ChronoUnit.MICROS.between(localTime1,localTime2));


        LocalDate today = LocalDate.now();
        System.out.println(today);
        LocalDate tomorow = today.plus(1, ChronoUnit.DAYS);//добавляет кол-во дней мес
        System.out.println(tomorow);

        LocalDate sd = today.minusDays(666);
        System.out.println(sd);

        LocalDate myDate=LocalDate.of(2099, Month.FEBRUARY,2);
        System.out.println(myDate);
        System.out.println(myDate.getDayOfWeek());
        System.out.println(myDate.getDayOfYear());

        String md="24.05.2017";
        DateTimeFormatter myFormater=DateTimeFormatter
                .ofLocalizedDate(FormatStyle.MEDIUM)
                .withLocale(Locale.GERMANY);

        LocalDate mdd=LocalDate.parse(md,myFormater);
        System.out.println(mdd);



        LocalDateTime localDateTime=LocalDateTime.now();
        System.out.println(localDateTime);


        Instant instant=Instant.now();
        System.out.println(instant);


        Calendar  gr= GregorianCalendar.getInstance();

    }
}
