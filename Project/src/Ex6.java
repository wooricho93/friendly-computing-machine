import java.util.Scanner;

// 연도를 입력받아 윤년여부를 확인하는 메서드 작성
public class Ex6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("연도를 입력하세요.");
		int year = sc.nextInt();
		leapYear(year);
	}

	static void leapYear(int year) {
		if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
			System.out.println(year + "년도는 윤년입니다.");
		} else {
			System.out.println(year + "년도는 윤년이 아닙니다.");
		}
	}
}
