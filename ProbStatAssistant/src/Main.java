import java.io.Console;
import java.io.IOException;
import java.math.BigInteger;
import java.util.Scanner;
public class Main {
	
	 
    
	public static void main(String[] args) {

		// Initialize Variables and Chapter Objects
		Scanner keyboard = new Scanner(System.in);
		Combinations textbook = new Combinations();
		Permutations chaptertwo = new Permutations();
		Distributions chapterthree = new Distributions();
		int choice = 0;
		int option = 0;

			// Ask user for input
			System.out.println("What type of problem would you like to solve?");
			System.out.println("1: Discrete Uniform Distribution (consecutive integers)");
			System.out.println("2: Binomial Distributions");
			System.out.println("3: Negative Binomial Distributions");
			System.out.println("4: Geometric Distributions");
			System.out.println("5: Hypergeometric Distribution");
			System.out.println("6: Poisson");
			System.out.println("7: Combinations");
			System.out.println("8: Permutations");
			System.out.println("9: Factorial");

			// Get user input
			choice = keyboard.nextInt();

			// Switch to figure out which methods to use
			switch (choice) {

			// DUD (consecutive integers)
			case 1:

				// Get input
				int a, b;
				System.out.println("Enter a: ");
				a = keyboard.nextInt();
				System.out.println("Enter b: ");
				b = keyboard.nextInt();

				// Call method and print results
				chapterthree.DUDConsec(a, b);

				// Exit program
				System.out.println("Program terminating.");
				System.exit(0);
				break;

			// Binomial
			case 2:
				int n, x;
				double p;
				System.out.println("Enter the number of independant trials 'n': ");
				n = keyboard.nextInt();
				System.out.println("Enter the probability of success 'p' for each event X: ");
				p = keyboard.nextDouble();
				System.out.println("Enter the number of successes 'x' for the event 'X' over 'n' trials: ");
				x = keyboard.nextInt();

				// Call method and print results
				chapterthree.Binomial(n, p, x);

				// Exit program
				System.out.println("Program terminating.");
				System.exit(0);
				break;
			// Negative Binomial
			case 3:
				int r;
				System.out.println("Enter the number of independant trials 'x': ");
				x = keyboard.nextInt();
				System.out.println("Enter the probability of success 'p' for each event X: ");
				p = keyboard.nextDouble();
				System.out.println("Enter the number of successes 'r': ");
				r = keyboard.nextInt();

				// Call method and print results
				chapterthree.NegativeBinomial(x, r, p);

				// Exit program
				System.out.println("Program terminating.");
				System.exit(0);
				break;
			// Geometric
			case 4:
				System.out.println("Enter the number of independant trials 'x': ");
				x = keyboard.nextInt();
				System.out.println("Enter the probability of success 'p' for each event X: ");
				p = keyboard.nextDouble();

				// Call method and print results
				chapterthree.Geometric(x, p);

				// Exit program
				System.out.println("Program terminating.");
				System.exit(0);
				break;
			// Hypergeometric
			case 5:
				int N, k;
				System.out.println("Enter the total number of items 'N': ");
				N = keyboard.nextInt();
				System.out.println("Enter the sample size 'n': ");
				n = keyboard.nextInt();
				System.out.println("Enter the number of elements called successes 'k': ");
				k = keyboard.nextInt();
				System.out.println("Enter the number of times success occurs 'x': ");
				x = keyboard.nextInt();

				// Call method and print results
				chapterthree.HyperGeometric(N, n, k, x);

				// Exit program
				System.out.println("Program terminating.");
				System.exit(0);
				break;

			// Poisson
			case 6:
				double lambda, t;
				System.out.println("Enter the mean given 'lambda': ");
				lambda = keyboard.nextDouble();
				System.out.println("Enter the units of time elapsed 't': ");
				t = keyboard.nextDouble();
				System.out.println("Enter the number of successes in this timespan 'x': ");
				x = keyboard.nextInt();

				// Call method and print results
				chapterthree.Poisson(lambda, t, x);

				// Exit program
				System.out.println("Program terminating.");
				System.exit(0);
				break;

			// Combinations
			case 7:
				System.out.println("Enter the total number of elements 'n': ");
				n = keyboard.nextInt();
				System.out.println("Enter the number of elements selected 'r': ");
				r = keyboard.nextInt();

				// Call method and print results
				double result = textbook.combinations(n, r);
				System.out.println("Number of combinations: " + result);
				// Exit program
				System.out.println("Program terminating.");
				System.exit(0);
				break;
				
			case 8:
				System.out.println("Are there objects that repeat?");
				System.out.println("1: Yes");
				System.out.println("2: No");
				option = keyboard.nextInt();

				if (option == 1) {
					// Repeating objects
					System.out.println("Enter the total number of objects: ");
					n = keyboard.nextInt();

					System.out.println("How many different objects repeat?");
					int nrepeat = keyboard.nextInt();
					int[] values = new int[nrepeat];

					System.out.println("Enter the number of times that each object repeats: ");
					for (int i = 0; i < nrepeat; i++) {// for reading array
						values[i] = keyboard.nextInt();
					}

					// Call method and print results
					chaptertwo.PermRepeat(n, nrepeat, values);

					// Exit program
					System.out.println("Program terminating.");
					System.exit(0);

				} else {
					// No repeating objects
					System.out.println("Enter the total number of objects: ");
					n = keyboard.nextInt();

					// Call method and print results
					chaptertwo.PermNoRepeat(n);

					// Exit program
					System.out.println("Program terminating.");
					System.exit(0);
				}
				break;
				
			case 9: 
				System.out.println("Enter the value for the factorial 'n': ");
				n = keyboard.nextInt();
				
				BigInteger factresult = BigInteger.ONE;
				factresult = textbook.factorial(n);
				System.out.println("Factorial Result: "+factresult);
				// Exit program
				System.out.println("Program terminating.");
				System.exit(0);
				
			default:
				System.out.println("You must choose a number between 1 and 5.");
			}
		
		keyboard.close();
		
	}
	
}
