package attic.book2.Chapter4.TwoVehicles;


// В этой программе создаются два объекта класса Vehicle
class Vehicle {
    int passengers; // количество пассажиров
    int fuelcap; // емкость топливного бака
    int mpg; // потребление топлива в милях на галлон//


}

class TwoVehicles {
    public static void main(String[] args) {
        Vehicle minivan = new Vehicle();
        Vehicle sportscar = new Vehicle();

        Vehicle carl = new Vehicle();
        Vehicle car2 = carl;
        Vehicle саrЗ = new Vehicle();
        car2 = саrЗ;


        carl.passengers = 2;
        System.out.println(carl.passengers);
        System.out.println(car2.passengers);
        System.out.println();

        int range1, range2;

        minivan.passengers = 4;
        minivan.fuelcap = 10;
        minivan.mpg = 21;

        sportscar.passengers = 2;
        sportscar.fuelcap = 8;
        sportscar.mpg = 12;

        // Рассчитать даль ность поездкип рпи олном баке
        range1 = minivan.fuelcap * minivan.mpg;
        range2 = sportscar.fuelcap * sportscar.mpg;

        System.out.println("Мини-фypгoн может перевезти " +
                minivan.passengers + "пассажиров на расстояние " + range1 +
                " миль");
        System.out.println("Cпopтивный автомобиль может перевезти " +
                sportscar.passengers + " пассажиров на расстояние " + range2 +
                " миль");
    }
}
