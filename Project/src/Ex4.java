import java.util.Scanner;

// 정수를 입력받아서 이진법을 출력하는 메서드 작성
public class Ex4 {

	public static void main(String[] args) {
		method1();

	}
	
	static void method1() {
		Scanner sc = new Scanner(System.in);
		System.out.print("0~32767 사이의 정수를 입력해 주세요.> ");
		int i = sc.nextInt();
		method2(i);
	}
	static void method2(int i) {
		String str = String.format("%016d", Integer.parseInt(Integer.toBinaryString(i)));
		method3(str);
	}

	static void method3(String str) {
		System.out.println(str);
	}
}
