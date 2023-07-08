import java.util.Random;

public class TestDemo {
	int	sum;
	
	public int addPositive(int a, int b) {
		sum = a+b;
		if(sum>0) {
		return sum;	
		} else {
			throw new IllegalArgumentException("Both parameters must be positive!");
		}				
	}
	//Method to subtract one positive number from another and keep a positive val
	public int subtractPositive(int a, int b) {
		sum = a-b;
		if(sum>=0) {
		return sum;	
		} else {
			throw new IllegalArgumentException("Both parameters must be not negative!");
		}				
	}
	
	public int randomNumberSquared() {
		int i = getRandomInt();
		int square = i * i;
		return square;
	}
	
	public int getRandomInt() {
		Random random = new Random();
		return random.nextInt(10)+1;
	}
}
