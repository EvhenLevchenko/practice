package attic.book2.Chapter4.Vehicle;


class Venicle {
    int passengers;// количество пассажиров
    int fuelcap;// емкость топливного бака
    int mpg;// потребления топлива в милях на галлон
}

 class VehicleDerno {
    public static void main(String[] args) {
        Venicle minivan = new Venicle();

        int range;

        minivan.passengers = 7;
        minivan.fuelcap = 3;
        minivan.mpg = 21;

        range = minivan.fuelcap * minivan.mpg;
        System.out.println(" Mини-фypгoн может перевезти " +
                minivan.passengers + " пассажиров на расстояние " + range +
                " миль");
    }
}
