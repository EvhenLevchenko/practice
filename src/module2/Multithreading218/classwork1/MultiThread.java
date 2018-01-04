package module2.Multithreading218.classwork1;


class MyRunnable implements Runnable {
//    private  String name;
//
//    public MyRunnable(String name) {
//        this.name = name;
//    }
//
//    public String getName() {
//        return name;
//    }

    @Override
    public void run() {

//        try {
//            Thread.sleep(100);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }

        long start = System.currentTimeMillis();

        for (int i = 0; i < 10; i++) {
            if(i==5){
                MultiThread.mainThread.interrupt();
            }
            if (Thread.interrupted()) {
                System.out.println("I was interrupted (" + Thread.currentThread().isInterrupted() + ")");
                continue;
            }

            long beforeSleep = System.currentTimeMillis();
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                System.out.println("I was interrupted while I was sleeping");
                long afterSleep = System.currentTimeMillis();
             //   System.out.println("Sleep for " + (afterSleep - beforeSleep) + " ms");
                break;
            }
            long afterSleep = System.currentTimeMillis();
          //  System.out.println("Sleep for " + (afterSleep - beforeSleep) + " ms");

            System.out.println(Thread.currentThread().getName() + " " + i);
        }
        long end = System.currentTimeMillis();
        System.out.println("Thread finished " + (end - start) + " ms");
    }
}


public class MultiThread {

    static Thread mainThread;

    public static void main(String[] args) {
        mainThread=Thread.currentThread();
        Thread thread1 = new Thread(new MyRunnable());
        thread1.start();//запустили

        try {
            thread1.join();//ожидает пока завершится поток thread1
        } catch (InterruptedException e) {
            System.out.println("I was interrupted while I was waiting for thread to finish");
        }
        for (int i = 0; i < 10; i++) {

//            if (i == 4) {
//                thread1.interrupt();
//            }
//            if (i == 5) {
//                try {
//                    thread1.join();
//                } catch (InterruptedException e) {
//                    e.printStackTrace();
//                }
//            }
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                //       e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName() + " " + i);
        }

    }
}