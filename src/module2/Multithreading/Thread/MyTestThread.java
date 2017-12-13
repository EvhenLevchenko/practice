package module2.Multithreading.Thread;

public class MyTestThread  extends Thread {
    @Override
    public void run() {
        for (int i =10 ; i >0 ; i--) {
            System.out.println(i);
            try{
               Thread.sleep(10);
            }catch (InterruptedException e){

                e.printStackTrace();
            }
        }
    }
}
