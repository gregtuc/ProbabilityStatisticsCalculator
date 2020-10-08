
import java.math.BigInteger;

public class Combinations {

	public Combinations() {
		// TODO Auto-generated constructor stub
	}

	public BigInteger factorial(int n) {
		BigInteger result = BigInteger.ONE;
		for (; n > 1; n--) {
			result = result.multiply(BigInteger.valueOf(n));
		}
		return result;
	}

	public double combinations(int n, int r) {
		// compute n factorial
		BigInteger nfact = factorial(n);
		// compute r factorial
		BigInteger rfact = factorial(r);
		// compute n-r factorial
		BigInteger nrfact = factorial(n - r);
		// computer result
		BigInteger result = nfact.divide(rfact.multiply(nrfact));
		// return result
		double doubleresult = result.doubleValue();
		return doubleresult;
	}
}
