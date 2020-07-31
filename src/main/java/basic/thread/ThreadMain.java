package basic.thread;

import basic.thread.RunnableImpl;

public class ThreadMain {

    public static void main(String[] args) {

        RunnableImpl thread1 = new RunnableImpl();
        new Thread(thread1).start();
    }
}
