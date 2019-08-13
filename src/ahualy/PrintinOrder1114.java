package ahualy;

class Foo {

    private  boolean firstFinished;
    private  boolean secondFinished;
    private Object lock = new Object();



    public void first(Runnable printFirst) {
        synchronized (lock){
            printFirst.run();
            firstFinished = true;
            lock.notifyAll();
            System.out.println("1");
        }
    }
    public void second(Runnable printSecond) throws InterruptedException {

        synchronized (lock){
            while (!firstFinished){
                lock.wait();
            }
            printSecond.run();
            secondFinished = true;
            lock.notifyAll();
            System.out.println(2);
        }
    }
    public void third(Runnable printThird) throws InterruptedException {
        System.out.println("second");
        synchronized (lock){

            while (!secondFinished) {
                lock.wait();
            }
            printThird.run();
            System.out.println(3);
        }
    }
}

public class PrintinOrder1114 {
    public static void main(String args[]) throws InterruptedException {
        Thread t1 = new Thread();
        Thread t2 = new Thread();
        Thread t3 = new Thread();
        Foo f = new Foo();
        f.first(t1);
        f.third(t2);
        f.second(t3);


    }
}
