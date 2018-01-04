package module2.Multithreading218.CounterTest;


class Counter {
    public int value=0;

}


class CounterThread extends Thread {

    private final Counter counter;

    public CounterThread(Counter counter) {
        this.counter = counter;
    }
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            counter.value++;
        }
    }
}


public class CounterTest {

    public static void main(String[] args) {
        Counter counter = new Counter();

        Thread[] threads = new Thread[40];
        for (int i = 0; i < threads.length; i++) {
            threads[i] = new CounterThread(counter);
            threads[i].start();
        }

        for (Thread thread : threads) {
            try {
                thread.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }


        System.out.println("Value = " + counter.value);


    }


}
