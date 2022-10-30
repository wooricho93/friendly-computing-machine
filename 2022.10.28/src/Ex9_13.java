import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Ex9_13 {

	public static void main(String[] args) {
		String[] str = {"adsf12", "123456", "qwerty", "as5sf*", "456KOR"};
		
		String regex = "^[0-9a-z]{6}$";
		
		// matches(String regex) -> 정규표현식을 인자로 받고 동일한 패턴의 문자열인지 확인
		for (String data : str) {
			System.out.printf("%s \t %b%n", data, data.matches(regex));
		}
	}
}
