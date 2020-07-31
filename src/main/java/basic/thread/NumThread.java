package basic.thread;

import edu.princeton.cs.algs4.StdOut;

public class NumThread {

    /**
     * //停止线程
     * interrupt
     *
     * resume
     */

    private static final Object lock = new Object();
    private static int count = 0;

    public static void main(String[] args) throws InterruptedException {
        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                synchronized (lock){
                    while (count <= 100) {
                        System.out.println(count);
                        count++;
                        lock.notify();
                        if(count==101){
                            break;
                        }
                        try {
                            lock.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                }
            }
        });
        thread1.start();
//        thread1.run();
//        Thread thread2 = new Thread(()-> {
//            synchronized (lock){
//                while (count <= 100) {
//                    System.out.println(count);
//                    count++;
//                    lock.notify();
//                    try {
//                        lock.wait();
//                    } catch (InterruptedException e) {
//                        e.printStackTrace();
//                    }
//                }
//            }
//        });
////        thread2.join();
//        thread2.start();
    }
}
