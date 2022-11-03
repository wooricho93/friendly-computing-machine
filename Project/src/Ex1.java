import java.util.ArrayList;
import java.util.Scanner;

// 사용자로부터 아이디를 받아서 중복체크하는 메서드 작성
public class Ex1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("아이디를 입력해 주세요.");
		String str = sc.nextLine();
		id(str);
	}
	
	static void id(String str) {
//		String[] strArr = {"abc123", "qwerty", "helloworld", "skyblue49", "ezenaca0308"};
//		
//		boolean b = false;
//		
//		for (int i = 0; i < strArr.length; i++) {
//			if (strArr[i].equals(str)) { b = true; }
//		}
//			
//		if (b == true) 
//			System.out.println("중복된 아이디입니다. 다른 아이디를 입력해 주세요.");
//		else
//			System.out.println("사용 가능한 아이디입니다.");
			
		
		Scanner sc = new Scanner(System.in);
		ArrayList<String> list = new ArrayList(5);
		list.add("abc123");
		list.add("qwerty");
		list.add("helloworld");
		list.add("skyblie49");
		list.add("ezenaca0408");
		while (true) {
			if (list.contains(str)) {
				System.out.println("중복된 아이디입니다. 다른 아이디를 입력해주세요.");
					str = sc.nextLine();
			} else {
				System.out.println("사용 가능한 아이디입니다.");
				break;
			}
		}
	}
}
