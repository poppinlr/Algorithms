package basic.thread;

import edu.princeton.cs.algs4.StdOut;

import java.util.concurrent.*;

public class CallableImpl implements Callable<Boolean> {
    @Override
    public Boolean call() throws Exception {
        StdOut.println(Thread.currentThread().getName());
        return true;
    }

    public static void main(String[] args) throws ExecutionException, InterruptedException {

        CallableImpl c1 = new CallableImpl();
        ExecutorService service = Executors.newFixedThreadPool(3);
        Future<Boolean> r = service.submit(c1);
        boolean b = r.get();
        service.shutdown();
    }
}
