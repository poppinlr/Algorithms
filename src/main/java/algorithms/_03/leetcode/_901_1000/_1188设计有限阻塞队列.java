package algorithms._03.leetcode._901_1000;

import java.util.*;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class _1188设计有限阻塞队列 {

    private List<Integer> list = new ArrayList<>();
    private int capacity = 0;

    public _1188设计有限阻塞队列(int capacity) {
        this.capacity = capacity;
    }

    public void enqueue(int element) throws InterruptedException {
        synchronized (list) {
            while (list.size() == this.capacity) {
                list.wait();
                list.notifyAll();
            }
            list.add(element);
//
        }
    }

    public int dequeue() throws InterruptedException {
        synchronized (list) {
            while (list.size() == 0) {
                list.wait();
                list.notifyAll();
            }
            int num = list.get(0);
            list.remove(0);
//            list.notifyAll();
            return num;
        }

    }

    public int size() {
        synchronized (list) {
            return list.size();
        }
    }

//
//    private final int capacity;
//    private final Queue<Integer> queue = new ArrayDeque<>();
//    private final Lock lock = new ReentrantLock();
//    private final Condition enCondition = lock.newCondition();
//    private final Condition deCondition = lock.newCondition();
//
//    public _1188设计有限阻塞队列(int capacity) {
//        this.capacity = capacity;
//    }
//
//    public void enqueue(int element) throws InterruptedException {
//        lock.lock();
//        try {
//            while (size() == this.capacity) {
//                enCondition.await();
//            }
//            queue.add(element);
//            deCondition.signal();
//        } finally {
//            lock.unlock();
//        }
//    }
//
//    public int dequeue() throws InterruptedException {
//        lock.lock();
//        try {
//            while (size() == 0) {
//                deCondition.await();
//            }
//            int poll = queue.poll();
//            enCondition.signal();
//            return poll;
//        } finally {
//            lock.unlock();
//        }
//    }
//
//    public int size() {
//        synchronized (queue){
//            return queue.size();
//        }
//    }
}
