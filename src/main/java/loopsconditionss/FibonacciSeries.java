package loopsconditionss;

import java.util.Scanner;

public class FibonacciSeries {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Enter the value of N: ");
        int n = s.nextInt();

        System.out.println("Fibonacci Series up to " + n + " terms:");
        printFibonacci(n);
    }

    public static void printFibonacci(int N) {
        int firstTerm = 0, secondTerm = 1;

        for (int i = 0; i < N; i++) {
            System.out.print(firstTerm + " ");
            int nextTerm = firstTerm + secondTerm;
            firstTerm = secondTerm;
            secondTerm = nextTerm;
        }
    }
}
