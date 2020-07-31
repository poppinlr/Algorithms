package algorithms.js;

public class Solution1 {

    private int sum = 0;
    private int numExchange = 0;

    public int numWaterBottles(int numBottles, int numExchange) {
        this.numExchange = numExchange;
        return num(numBottles);
    }

    private int num(int numBottles) {

        if (numBottles < this.numExchange - 1) {
            return numBottles;
        }

        if (numBottles == this.numExchange - 1) {
            return numBottles + 1;
        }

        int drink = numBottles / this.numExchange * this.numExchange;
        int exchange = numBottles / this.numExchange;
        int left = numBottles % this.numExchange;
        return sum = sum + drink + num(exchange + left);
    }
}
