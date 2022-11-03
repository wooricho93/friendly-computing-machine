// 2단에서 9단까지 구구단을 출력하는 메서드 작성
public class Ex3 {

	public static void main(String[] args) {
		gugudan();
	}

	static void gugudan() {
		for (int i = 2; i <= 9; i++) {
			for (int j = 1; j <= 9; j++) {
				System.out.printf("%d * %d = %d%n", i, j, i * j);
			}
			
			System.out.println();
		}
		
	}
}
