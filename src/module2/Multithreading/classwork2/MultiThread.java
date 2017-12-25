package module2.Multithreading.classwork2;


class MyRunnable implements Runnable {

    @Override
    public void run() {
        for (int i = 0; i < 20; i++) {
            System.out.println(Thread.currentThread().getName() + " " + i);
        }
    }
}


public class MultiThread {

    public static void main(String[] args) {

        Thread thread1 = new Thread(new MyRunnable());
        thread1.start();

        for (int i = 0; i < 10; i++) {
            if (i == 5) {

                try {
                    thread1.join();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }}
                System.out.println(Thread.currentThread().getName() + i);
            }

        }
    }
