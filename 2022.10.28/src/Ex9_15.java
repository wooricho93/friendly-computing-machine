import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Ex9_15 {

	public static void main(String[] args) {
		String[] str = {"abcdefg", "012345", "가나다라", "rabbit", "desk", "2apple3"};
		
		String regex = "[^0-9]";
		
		for (String data : str) {
			System.out.printf("%s\t%S%n", data, data.replaceAll(regex, "*"));
		}
	}
}
