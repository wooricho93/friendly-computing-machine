
public class StringBuilderTest {

	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder("990915-1012999");
//		System.out.println(sb.replace(6, 7, " "));
		sb.delete(6, 7);
		System.out.println(sb.insert(6, " "));
	}

}
