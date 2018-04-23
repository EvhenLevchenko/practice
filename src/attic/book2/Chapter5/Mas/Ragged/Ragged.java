package attic.book2.Chapter5.Mas.Ragged;

class Ragged {
    public static void main(String args[]) {
        int riders[][] = new int[8][];
        riders[0] = new int[10];
        riders[1] = new int[10];
        riders[2] = new int[10];
        riders[3] = new int[10];
        riders[4] = new int[10];
        riders[5] = new int[2];
        riders[6] = new int[2];
        riders[7] = new int[2];

        int i, j;

        // fabricate some fake data
        for(i=0; i < 5; i++)//Mon-Friday
            for(j=0; j < 10; j++)//кол-во рейсов будние дни
                riders[i][j] = i + j ;
        for(i=5; i < 8; i++)
            for(j=0; j < 2; j++)
                riders[i][j] = i + j ;

        System.out.println("Кол-во пасажиров перевезенных каждым рейсом в будние дни");
        for(i=0; i < 5; i++) {
            for(j=0; j < 10; j++)
                System.out.print(riders[i][j] + " ");
            System.out.println();
        }
        System.out.println();

        System.out.println("Кол-во пасажиров перевезенных каждым рейсом в выхожные дни");
        for(i=5; i < 8; i++) {
            for(j=0; j < 2; j++)
                System.out.print(riders[i][j] + " ");
            System.out.println();
        }
    }
}
