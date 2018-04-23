package attic.book2.Chapter4.ParmDemo;

class ChkNum {
    // return true if x is even
    boolean isEven(int x) {
        if((x%2) == 0) return true;
        else return false;
    }
}

class ParmDemo {
    public static void main(String args[]) {
        ChkNum e = new ChkNum();

        if(e.isEven(10)) System.out.println("10 is even.");

        if(e.isEven(9)) System.out.println("9 is even.");

        if(e.isEven(8)) System.out.println("8 is even.");

        if(e.isEven(6)) System.out.println("6 is even ");
    }
}