package zadaci_06_02_2016;

public class PrimeStack {

	public static void main(String[] args) {
		// creating new object of class StackOfIntegers with specified capacity
		StackOfIntegers stack1 = new StackOfIntegers(50);
		// finding prime numbers and storing tham in the stack one in the
		// incessing order
		int prime = 0;
		for (int i = 1; i <= 120; i++) {
			int brojac = 0;
			for (int j = i; j >= 1; j--) {
				if (i % j == 0) {
					brojac++;
				}
			}
			if (brojac == 2) {
				prime = i;
				stack1.push(prime);
			}
		}
		// creating new object of class StackOfIntegers with specified capacity
		StackOfIntegers stack2 = new StackOfIntegers(50);
		// Poping integers from stack one and pushingtham to stack 2
		for (int i = 0; i < stack1.size; i++) {
			while (!stack1.empty()) {
				stack2.push(stack1.pop());
			}
		}
		// Poping elements to the user
		for (int i = 0; i < stack2.size; i++) {
			while (!stack2.empty()) {
				System.out.print(stack2.pop() + " ");
			}
		}

	}

}
