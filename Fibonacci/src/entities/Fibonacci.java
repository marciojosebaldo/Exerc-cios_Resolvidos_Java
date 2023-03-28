package entities;

public class Fibonacci {

	public int calculaFibonacci(int x) {
		/*
		 * if (x == 0 || x == 1) return x;
		 * 
		 * return calculaFibonacci(x-1) + calculaFibonacci(x-2);
		 */

		// a forma recursiva é:
		return (x == 0 || x == 1) ? x : calculaFibonacci(x - 1) + calculaFibonacci(x - 2);

	}
}