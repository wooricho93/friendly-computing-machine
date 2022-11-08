import java.util.*;

public class Ex11_21 {

	public static void main(String[] args) {
		TreeMap<String, String> map = new TreeMap<>(); // 정렬 O
		
		map.put("kor", "국어");
		map.put("eng", "영어");
		map.put("math", "수학");
		map.put("com", "전산");
		
		Set<String> keySet = map.keySet();
		for (String s : keySet)
			System.out.print(s + "\t");
		System.out.println();
		for (String s : keySet)
			System.out.print(map.get(s) + "\t");
	}

}
