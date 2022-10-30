import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Ex9_14 {

	public static void main(String[] args) {
		String str = "abc123@gmail.com, xyz789@naver.com, hancom@hancom.kr, testbeta@hanmail.net, apple@apple.org";
		
		String regex = "([\\w]*@[\\w]*.com)";
		
		Pattern p = Pattern.compile(regex);
		Matcher m = p.matcher(str);
		
		while (m.find())
			System.out.println(m.group());
	}
}
