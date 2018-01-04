package module2.Multithreading218.CountDownTest;


import java.util.concurrent.CountDownLatch;

class Worker extends  Thread{

    private  final CountDownLatch latch;

    Worker(CountDownLatch latch) {
        this.latch = latch;
    }
}
public class CountDownTest {
    public static void main(String[] args) {

    }
}