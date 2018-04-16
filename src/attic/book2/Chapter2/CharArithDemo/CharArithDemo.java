package attic.book2.Chapter2.CharArithDemo;

public class CharArithDemo {
    public static void main(String[] args) {
        CharArithDemo test = new CharArithDemo();
        System.out.println(test.toString());
        char ch;
        ch = 'X';
//        System.out.println("ch содержит " + ch);
//
//        ch++;//инкрементировать переменную ch
//        System.out.println("теперь ch содержит " + ch);
//
//        ch++;
//        System.out.println("теперь ch содержит " + ch);
//        ch++;
//        System.out.println("теперь ch содержит " + ch);
//        ch++;
//        System.out.println("1"+2+3);


        int b = 10;
        int h = 10;
        int v = 10;
        int n = 10;

        int c = b--;
        int o = --h;
        int p = ++v;
        int l = n++;

        System.out.println(c);
        System.out.println(o);
        System.out.println(p);
        System.out.println(l);


        boolean f = true;
        boolean u = false;
        u = f || u;
        //  System.out.println(u);

        boolean x = true;
        x ^= true;
        System.out.println(x);
        int t = 257;
        byte m = (byte) t;
        System.out.println(" Знaчeниe Ь: " + m);
        System.out.println("" + "" + "");

        int k = 3;
        int s = 10;
        h = s  % k;
        System.out.println(h);
    }
}
