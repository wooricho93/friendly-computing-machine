import java.util.*;
public class Ex11_15 {

	public static void main(String[] args) {
		Set set = new HashSet();
		
		for (int i = 0; set.size() < 6; i++) { // HashSet -> 중복 허용 X
			int num = (int)(Math.random() * 45) + 1;
			set.add(new Integer(num));
		}
		System.out.println("========= 정렬 전 =========");
		System.out.println(set);
		System.out.println("========= 정렬 후 =========");
		
		List list = new LinkedList(set); // 번호를 크기 순으로 정렬하기 위해서 LinkedHashSet 사용
		Collections.sort(list);
		System.out.println(list);
	}

}
