package attic.book2.Chapter2.Prost;

public class Prime {
    public static void main(String[] args) {
        for (int i = 2; i < 100; i++) {
            boolean isprime = true;
            for (int j = 2; j <= i / j; j++)
                if ((i % j) == 0) isprime = false;//operator
                if (isprime)
                    System.out.println(i + " - простое число.");

        }
    }
}
