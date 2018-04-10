package attic.book2.Chapter1.GalToLit;

public class GalToLit {
    public static void main(String[] args) {
        double gallons = 10.00;
        double litters = gallons * 3.785;
        System.out.println(gallons + " галлонам соответсвует " + litters + " литров");

        if (gallons == 10.0) System.out.println(true);
        else System.out.println(false);
    }
}
