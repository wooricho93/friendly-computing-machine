package ex1;

public class FlowEx08 {

	public static void main(String[] args) {
		for (int i = 2; i <= 9; i++) {
			for (int j = 1; j <= 9; j++) {
				
				if (i == j)
					continue;
				
				System.out.printf("%d x %d = %d%n", i, j, i * j);
			}
			System.out.println();
		}
	}
}
