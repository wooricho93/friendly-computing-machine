import java.util.LinkedList;
import java.util.List;

public class Ex11_4 {

	public static void main(String[] args) {
List<String> lists = new LinkedList();
		
		lists.add("Toy2");
		lists.add("Box2");
		lists.add("Robot2");

		for (String str : lists) {
			System.out.println(str);
		}
		
		lists.remove(0);
		
		System.out.println();
		
		for (int i = 0; i < lists.size(); i++) {
			System.out.println(lists.get(i));
		}
		System.out.println();
		
		LinkedList list = (LinkedList)lists;
		list.add("aaa");
		list.add("bbb");
		
		System.out.println(list.peekLast());
	}

}
