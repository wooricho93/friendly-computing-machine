
public class Accumulator {

	public static void main(String[] args) {
		for (int i = 0; i < 10; i++) {
			Accumulator.add(i);
		}
		
		Accumulator.showResult();
		
	}
	
	static int sum;
	
	static void add(int i) {
		sum += i;
	}
	
	static void showResult() {
		System.out.println("sum = " + sum);
	}

}

