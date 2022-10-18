package test;

public class Exam05 {

	public static void main(String[] args) {
//		double pi = 3.141592;
//		double shortPi = Math.round(pi * 1000) / 1000.0;
//		System.out.println(shortPi);
		
		String str1 = "abc";
		String str2 = "abc";
		String str3 = new String(str2);
		
		System.out.println(str1 == str2);
		System.out.println(str2 == str3);
		System.out.println(str1.equals(str2));
		System.out.println(str2.equals(str3));
	}

}
