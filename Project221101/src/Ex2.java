import java.util.Arrays;
import java.util.Scanner;

// 우편번호를 검색하는 메서드 작성
public class Ex2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("주소를 입력해 주세요.");
		String str = sc.nextLine();
		zipCode(str);
	}
	
	static void zipCode(String str) {
		String[][] arr2D = {
							{"서울특별시 중구 세종대로 110", "04524"},
							{"인천광역시 남동구 정각로 29", "21554"},
							{"대전광역시 서구 둔산로 100", "35242"},
							{"대구광역시 중구 공평로 88", "41911"},
							{"울산광역시 남구 중앙로 201", "44675"},
							{"광주광역시 서구 내방로 111", "61945"},
							{"부산광역시 연제구 중앙대로 1001", "47545"},
							{"경기도 수원시 팔달구 효원로 241", "16490"}
		};

		
		for (int i = 0; i < arr2D.length; i++) {
			if (str.equals(arr2D[i][0])) {
				System.out.println("입력하신 주소의 우편번호는 " + arr2D[i][1] + "입니다.");
				return;
			}
		}
		
		System.out.println("입력하신 주소를 찾을 수 없습니다. 다시 입력해 주세요.");	
	}
	
}
