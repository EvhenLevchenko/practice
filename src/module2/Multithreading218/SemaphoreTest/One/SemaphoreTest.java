package module2.Multithreading218.SemaphoreTest.One;

import java.util.Random;
import java.util.concurrent.Semaphore;
import java.util.concurrent.atomic.AtomicInteger;


class Cart {
    private AtomicInteger weight = new AtomicInteger(0);

    public void addWeight() {
        weight.getAndIncrement();
    }

    public void reduceWeight() {
        weight.getAndDecrement();
    }

    public int getWeight() {
        return weight.intValue();
    }
}


class Miner extends Thread {

    private final Cart cart;
    private final Semaphore semaphore;
    private Random random = new Random();

    public Miner(Cart cart, Semaphore semaphore) {
        this.cart = cart;
        this.semaphore = semaphore;
    }

    @Override
    public void run() {
        while (!isInterrupted()) {
            try {
                if (cart.getWeight() >= 4) {
                    Thread.sleep(100);
                    continue;
                }
                semaphore.acquire();
                System.out.println(getName() + ": Started mining...");
                Thread.sleep(random.nextInt(500) + 300);
                System.out.println(getName() + ": Mined, waiting to load");
                Thread.sleep(random.nextInt(300));
                cart.addWeight();
                System.out.println(getName() + ": Loaded");
                semaphore.release();
            } catch (InterruptedException e) {
                break;
            }
        }
        System.out.println(getName() + ": Shift over!");


    }
}

class Unloader extends Thread {
    private final Cart cart;
    private final Semaphore semaphore;

    public Unloader(Cart cart, Semaphore semaphore) {
        this.cart = cart;
        this.semaphore = semaphore;
    }

    @Override
    public void run() {
        while (!isInterrupted()) {
            try {
                if (cart.getWeight() == 0) {
                    sleep(100);
                    continue;
                }
                semaphore.acquire(4);
                System.out.println("Unloader: Cart Arrived");
                while (cart.getWeight() > 0) {
                    Thread.sleep(500);
                    cart.reduceWeight();
                }
                System.out.println("Unloader: Finished unloading");
                semaphore.release(4);
            } catch (InterruptedException e) {
                break;
            }
        }
        System.out.println("Unloader: Shift over!");
    }

}


public class SemaphoreTest {


    public static void main(String[] args) throws InterruptedException {

        Cart cart = new Cart();
        Semaphore semaphore = new Semaphore(4);

        Thread[] miners = new Thread[4];
        for (int i = 0; i < miners.length; i++) {
            miners[i] = new Miner(cart, semaphore);
            miners[i].start();
        }

        Thread unloader = new Unloader(cart, semaphore);
        unloader.start();

        Thread.sleep(10000);

        for (int i = 0; i < miners.length; i++) {
            miners[i].interrupt();
        }
        unloader.interrupt();


    }


}