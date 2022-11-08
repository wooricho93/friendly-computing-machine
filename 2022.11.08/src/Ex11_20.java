import java.util.*;

public class Ex11_20 {

	public static void main(String[] args) {
		HashMap<String, String> map = new HashMap<>(); // 정렬 X
		
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
