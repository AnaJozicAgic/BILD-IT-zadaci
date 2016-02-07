package zadaci_06_02_2016;

public class PrikazivanjeFaktoraStack {

	public static void main(String[] args) {
		try {
			java.util.Scanner input = new java.util.Scanner(System.in);
			int min = 0;// Variable for finding smallest factor // smallest
						// fsctors

			StackOfIntegers stack = new StackOfIntegers();
			StackOfIntegers stack2 = new StackOfIntegers();
			// Loop for finding and storing smallest factors to a stack
			int broj = input.nextInt();
			for (int i = 2; i <= broj; i++) {
				while (broj % i == 0) {
					min = i;
					stack.push(min);
					broj /= i;
				}
			}
			// Loop for moving elements to second stock to revers order
			for (int i = stack.size; i >= 0; i--) {
				while (!stack.empty()) {
					stack2.push(stack.pop());
				}
			}
			// Poping elements from second stack
			for (int i = 0; i < stack2.size; i++) {
				while (!stack2.empty()) {
					System.out.print(stack2.pop() + " ");
				}
			}
			input.close();
		} catch (Exception e) {
			System.out.println("Doslo je do greske: ");
			main(args);
		}
	}

}
