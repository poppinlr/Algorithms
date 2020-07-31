package algorithms._04.leetcode2;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;
import java.util.function.IntConsumer;

public class _1116打印零与奇偶数 {

    private int n;
    private ReentrantLock lock = new ReentrantLock();
    Condition condition0 = lock.newCondition();
    Condition conditionEven = lock.newCondition();
    Condition conditionOdd = lock.newCondition();
    private volatile int count = 0;

    public _1116打印零与奇偶数(int n) {
        this.n = n;
    }

    // printNumber.accept(x) outputs "x", where x is an integer.
    public void zero(IntConsumer printNumber) throws InterruptedException {
        lock.lock();
        if (count == 0) {
            printNumber.accept(0);
            condition0.await();
        } else if (count % 2 == 0) {
            conditionEven.signal();
        } else {
            conditionOdd.signal();
        }

        lock.unlock();
    }

    public void even(IntConsumer printNumber) throws InterruptedException {
        lock.lock();
        for (int i = 1; i <= n; i = i + 2) {
            printNumber.accept(i);
            conditionEven.await();
            this.count = i;
            condition0.signal();
        }
        lock.unlock();
    }

    public void odd(IntConsumer printNumber) throws InterruptedException {
        lock.lock();
        for (int i = 2; i <= n; i = i + 2) {
            printNumber.accept(i);
            conditionOdd.await();
            this.count = i;
            condition0.signal();
        }
        lock.unlock();
    }
}
