import java.util.*;

public class Ex11_19 {

	public static void main(String[] args) {
		HashMap<Integer, String> map = new HashMap<>();
		
		map.put(1, "Kim");
		map.put(5, "Park");
		map.put(7, "Lee");
		map.put(10, "Choi");
		map.put(15, "Han");
		map.put(2, "Sim");
		
		System.out.println(map);
		
		System.out.println(map.get(1));
		System.out.println(map.get(2));
		System.out.println(map.get(5));
		System.out.println(map.get(7));
		
//		map.remove(5);
		
		// map에서 for 문을 사용하는 방법①
		Set<Integer> keySet = map.keySet();
		for (int i : keySet)
			System.out.print(i + "\t"); // key
		System.out.println();
		
		for (int i : keySet)
			System.out.print(map.get(i) + "\t"); // value
		System.out.println();
		
		// map에서 for 문을 사용하는 방법②
		Iterator<Integer> it = keySet.iterator();
		while (it.hasNext())
			System.out.print(it.next() + "\t"); // key
		System.out.println();
		it = keySet.iterator();
		while (it.hasNext())
			System.out.print(map.get(it.next()) + "\t"); // value
	}

}
