package basic.hw;

import edu.princeton.cs.algs4.StdOut;

import java.util.Scanner;

public class ScannIn {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            StdOut.println(scanner.nextLine());
            StdOut.println(scanner.nextLine());
        }

    }
}
