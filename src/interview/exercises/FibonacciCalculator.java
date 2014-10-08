package interview.exercises;

import java.util.Scanner;

public class FibonacciCalculator {
  public static void main(String args[]) {

    // input to print Fibonacci series upto how many numbers
    System.out.println("Enter number upto which Fibonacci series to print: ");
    Scanner scanner = new Scanner(System.in);
    int number = scanner.nextInt();

    System.out.println("Fibonacci series upto " + number + " numbers : ");
    // printing Fibonacci series upto number
    for (int i = 1; i <= number; i++) {
      System.out.print(fibonacciIterative(i) + " ");
    }
    System.out.println("\n Fibonacci series upto " + number + " numbers Recursive : ");
    for (int i = 1; i <= number; i++) {
      System.out.print(fibonacciRecursive(i) + " ");
    }
    scanner.close();
  }

  /*
   * Java program for Fibonacci number using recursion. This program uses tail recursion to
   * calculate Fibonacci number for a given number
   * 
   * @return Fibonacci number
   */
  public static int fibonacciRecursive(int number) {
    if (number == 1 || number == 2) {
      return 1;
    }

    return fibonacciRecursive(number - 1) + fibonacciRecursive(number - 2); // tail recursion
  }

  /*
   * Java program to calculate Fibonacci number using loop or Iteration.
   * 
   * @return Fibonacci number
   */
  public static int fibonacciIterative(int number) {
    if (number == 1 || number == 2) {
      return 1;
    }
    int fibo1 = 1, fibo2 = 1, fibonacci = 1;
    for (int i = 3; i <= number; i++) {
      fibonacci = fibo1 + fibo2; // Fibonacci number is sum of previous two Fibonacci number
      fibo1 = fibo2;
      fibo2 = fibonacci;

    }
    return fibonacci; // Fibonacci number

  }
}
