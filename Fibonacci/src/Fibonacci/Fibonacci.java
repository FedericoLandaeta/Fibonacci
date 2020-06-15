
package Fibonacci;


import java.util.Scanner;

/**
 * 
 * @author Federico 
 *
 */

public class Fibonacci {

	/**
	 *Returns the Fibonacci sequence up to the nth number chosen by the user.
	 *There are two methods. One is a recursive solution and one is an iterative solution.
	 *Both are printed onto the screen. After both are printed the time each process took is also printed.
	 * 
	 * @param args Passed into the main
	 */
	public static void main(String[] args) {
		System.out.println("Enter a number to show the Fibonacci sequence place: ");
		int number = new Scanner(System.in).nextInt();
		System.out.println("Fibonacci Series " + number + " number: ");
		System.out.println("Using iteration: "); 
		
		long startTimeIteration = System.nanoTime();
		for (int i=1; i<=number; i++) {
			System.out.println(fibonacciIteration(i));
		}
		long endTimeIteration = System.nanoTime();
		
		long startTimeRecursion = System.nanoTime();
		System.out.println("Using recursion: ");
		for (int i=1; i<=number; i++) {
			System.out.println(fibonacciRecursion(i) + " ");
		}
		long endTimeRecursion = System.nanoTime();
		System.out.println("The time for "+number+" recusrions was "+(endTimeIteration-startTimeIteration)+"ns");
		System.out.println("The time for "+number+" iterations was "+(endTimeRecursion-startTimeRecursion)+"ns");
	}
	
	/**
	 * 
	 * @param number	the number input by the user specifying the nth number in the sequence
	 * 
	 * @return       	the sum of the two previous Fibonacci numbers
	 */
	public static int fibonacciRecursion(int number) {
		if(number == 1 || number == 2) {
			return 1;
		}
		return fibonacciRecursion(number-1)+ fibonacciRecursion(number-2);
	}

	/**
	 * 
	 * @param number	the number input by the user specifying the nth number in the sequence
	 * 
	 * @return			the current fibonacci number
	 */
	public static int fibonacciIteration(int number) {
		if (number == 1 || number == 2) {
			return 1;
		}
		int fibonacci1 = 1, fibonacci2=1, fibonacci=1;
		for(int i=3; i<= number; i++) {
			fibonacci= fibonacci1+fibonacci2;
			fibonacci1=fibonacci2;
			fibonacci2 = fibonacci;
		}
		return fibonacci;
	}
	

}
