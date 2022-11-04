import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Ex11_9 {

	public static void main(String[] args) {
		List<String> list = new LinkedList();
		
		list.add("Toy");
		list.add("Box");
		list.add("Robor");
		list.add("Bot");
		list.add("Toy");
		
		Iterator<String> it = list.iterator();
		
		while(it.hasNext()) {
			System.out.print(it.next() + "\t");
		}
		
		System.out.println();
		
		it = list.iterator();
		while(it.hasNext()) {
			System.out.print(it.next() + "\t");
		}
	}

}
