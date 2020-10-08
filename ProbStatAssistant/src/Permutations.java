import java.math.BigInteger;

public class Permutations extends Combinations {

	public Permutations() {
		// TODO Auto-generated constructor stub
	}

	public void PermNoRepeat(int n) {
		// Print the result
		System.out.println("Permutations: " + factorial(n));
		// End function
		return;
	}

	public void PermRepeat(int n, int nrepeat, int[] arr) {
		// Calculate Numerator
		BigInteger num = factorial(n);

		// Calculate Denominator
		BigInteger den = BigInteger.ONE;
		for (int i = 0; i < arr.length; i++) {
			den = den.multiply(factorial(arr[i]));
		}

		// Calculate Permutations
		BigInteger result = num.divide(den);

		// Print Result
		System.out.println("Permutations: " + result);

		// End Function
		return;
	}

	public void ConditionalProbability(int[][] matrix, int eventA, int eventB) {
		System.out.println("The matrix you entered is: ");
		int A = 0, B = 0, notA = 0, notB = 0;
		// Calculate Total
		int total = 0;
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				System.out.print(matrix[i][j] + "\t");
				total += matrix[i][j];

				// Add up total for event A
				if (i == eventA) {
					A += matrix[i][j];
				} else {
					// else add up total for not event A
					notA += matrix[i][j];
				}
				// Add up total for event B
				if (j == eventB) {
					B += matrix[i][j];
				} else {
					// else add up total for not event B
					notB += matrix[i][j];
				}
			}
			System.out.println();
		}
		// P(A n B)
		double panb = (double)matrix[eventA][eventB] / (double)total;
		System.out.println("P(A n B): "+panb);
		// P(A|B)
		double pab = ((double)matrix[eventA][eventB] / (double)total) / ((double)B / (double)total);
		System.out.println("P(A|B): "+pab);
		// P(B|A)
		double pba = ((double)matrix[eventA][eventB] / (double)total) / ((double)A / (double)total);
		System.out.println("P(B|A): "+pba);
	}
}
