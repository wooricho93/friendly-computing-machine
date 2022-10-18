package ex1;

public class FlowEx01 {

	public static void main(String[] args) {
		int sum = 0;
		
		for (int i = 1; i <= 10; i++) {
			sum += i;
		}
		
		
		int i = 1;
		sum = 0;
		
		while(i<=10) {
			sum += i;
			i++;
		}
		System.out.println("합계: " + sum);
	}
}
