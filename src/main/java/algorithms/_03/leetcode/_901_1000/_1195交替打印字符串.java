package algorithms._03.leetcode._901_1000;

import edu.princeton.cs.algs4.StdOut;

import java.util.function.IntConsumer;

public class _1195交替打印字符串 {

    private int n;
    private Object lock = new Object();

    public _1195交替打印字符串(int n) {
        this.n = n;


    }

    // printFizz.run() outputs "fizz".
    public void fizz(Runnable printFizz) throws InterruptedException {
        synchronized (lock) {
            while (true) {
                if (n % 3 == 0) {
                    StdOut.println(n);
                }
            }
        }

    }

    // printBuzz.run() outputs "buzz".
    public void buzz(Runnable printBuzz) throws InterruptedException {
        while (n % 5 == 0) {
            StdOut.println(n);
        }
    }

    // printFizzBuzz.run() outputs "fizzbuzz".
    public void fizzbuzz(Runnable printFizzBuzz) throws InterruptedException {
        while (n % 5 == 0 || n % 3 == 0) {
            StdOut.println(n);
        }
    }

    // printNumber.accept(x) outputs "x", where x is an integer.
    public void number(IntConsumer printNumber) throws InterruptedException {

    }
}
