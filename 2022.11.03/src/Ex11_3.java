import java.util.ArrayList;
import java.util.List;

public class Ex11_3 {

	public static void main(String[] args) {
		List<String> lists = new ArrayList();
		
		lists.add("Toy");
		lists.add("Box");
		lists.add("Robot");

		for (String str : lists) {
			System.out.println(str);
		}
		
		lists.remove(1);
		
		System.out.println();
		
		for (int i = 0; i < lists.size(); i++) {
			System.out.println(lists.get(i));
		}
	}

}
