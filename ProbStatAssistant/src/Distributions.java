
public class Distributions extends Combinations {

	public Distributions() {
		// TODO Auto-generated constructor stub
	}

	public void DUDConsec(int a, int b) {
		// compute mean
		double mean = (double) (a + b) / 2;
		// compute variance
		double variance = (Math.pow(((double) b - (double) a + 1), 2) - 1) / 12;
		// computer standard deviation
		double std = Math.sqrt(variance);
		// Print results
		System.out.println("Mean: " + mean);
		System.out.println("variance: " + variance);
		System.out.println("std: " + std);
		// End function
		return;
	}

	public void Binomial(int n, double p, int x) {
		// compute probability
		double prob = (double) (combinations(n, x) * Math.pow(p, x) * Math.pow((1 - p), (n - x)));
		// compute mean
		double mean = (double) n * p;
		// compute variance
		double variance = (double) n * p * (1 - p);
		// compute standard deviation
		double std = Math.sqrt(variance);
		// Print results
		System.out.println("Probability: " + prob);
		System.out.println("Mean: " + mean);
		System.out.println("Variance: " + variance);
		System.out.println("Standard Deviation: " + std);
		// End function
		return;
	}

	public void NegativeBinomial(int x, int r, double p) {
		// compute probability
		double prob = (double) (combinations(x - 1, r - 1) * Math.pow(p, r) * Math.pow((1 - p), x - r));
		// compute mean
		double mean = (double) r / p;
		// compute variance
		double variance = ((double) r * (1 - p)) / Math.pow(p, 2);
		// compute standard deviation
		double std = Math.sqrt(variance);
		// Print results
		System.out.println("Probability: " + prob);
		System.out.println("Mean: " + mean);
		System.out.println("Variance: " + variance);
		System.out.println("Standard Deviation: " + std);
		// End function
		return;
	}

	public void Geometric(double x, double p) {
		// compute probability
		double prob = p * Math.pow((1 - p), x - 1);
		// compute mean
		double mean = 1 / p;
		// compute variance
		double variance = (1 - p) / Math.pow(p, 2);
		// compute standard deviation
		double std = Math.sqrt(variance);
		// Print results
		System.out.println("Probability: " + prob);
		System.out.println("Mean: " + mean);
		System.out.println("Variance: " + variance);
		System.out.println("Standard Deviation: " + std);
		// End function
		return;
	}

	public void HyperGeometric(int N, int n, int k, int x) {
		// compute probability
		double prob = (combinations(k, x) * combinations((N - k), (n - x))) / combinations(N, n);
		double p = (double) k / (double) N;
		// compute mean
		System.out.println(k);
		System.out.println(N);
		double mean = (double) n * (double) p;
		// compute variance
		double variance = (double) n * p * (1 - p) * (((double) N - (double) n) / ((double) N - 1));
		// compute standard deviation
		double std = Math.sqrt(variance);
		// Print results
		System.out.println("Probability: " + prob);
		System.out.println("Mean: " + mean);
		System.out.println("Variance: " + variance);
		System.out.println("Standard Deviation: " + std);
		// End function
		return;
	}

	public void Poisson(double lambda, double t, int x) {
		// compute probability
		double prob = (Math.pow(Math.E, (-lambda * t)) * Math.pow(lambda * t, x)) / factorial(x).doubleValue();
		// Print results
		System.out.println("Probability: " + prob);
		// End function
		return;
	}

}
