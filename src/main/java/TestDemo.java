import java.util.Random;

public class TestDemo {

	/*
	 * This method returns the sum of two positive ints 
	 */
	public int addPositive(int a, int b) {
		
		if (a > 0 && b > 0) {
			int sum = a + b;
			return sum; 
		} else {
			throw new IllegalArgumentException("Both parameters must be positive!");
		}
	}
	
	/*
	 * This method obtains a random int between 1 and 10 and returns the square of the number 
	 */
	public int randomNumberSquared() {
		int num = getRandomInt();
		return num*num;
		
	}
	
	int getRandomInt() {
		Random random = new Random();
		return random.nextInt(10) + 1;
	}
	
}
