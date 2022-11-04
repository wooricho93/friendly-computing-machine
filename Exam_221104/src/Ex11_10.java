import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Ex11_10 {

	public static void main(String[] args) {

		
		String[] strArr = new String[5];
		
		strArr[0] = "Korea";
		strArr[1] = "America";
		strArr[1] = "Japan";
		strArr[1] = "China";
		strArr[1] = "England";
		
		String[] strArr2 = {"Korea1", "Korea2", "Korea3", "Korea4", "Korea5"};
		
		System.out.println("strArr2 = " + Arrays.toString(strArr2));
		
		List<String> list = new ArrayList();
		list.add("Korea1");
		list.add("Korea2");
		list.add("Korea3");
		
		Iterator<String> it = list.iterator();
		
		System.out.print("list1 = ");
		
		while (it.hasNext())
			System.out.print(it.next() + " ");
		
		System.out.println();
		
		List<String> list2 = Arrays.asList("Korean", "English", "Math", "Total", "Average");
		list2 = new ArrayList<>(list2); // 크기를 변경할 수 있는 list
		list2.add("Sum");
		Iterator<String> it2 = list2.iterator();
		
		System.out.print("list2 = ");
		
		while (it2.hasNext())
			System.out.print(it2.next() + " ");
	}

}
