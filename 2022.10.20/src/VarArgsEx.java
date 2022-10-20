
public class VarArgsEx {

	public static void main(String[] args) {
		System.out.println(sum(1, 2, 3, 4, 5));
		System.out.println(sum(1, 2, 3, 4, 5, 6, 7, 8, 9 , 10));
		System.out.println(sum(1, 2, 3));
	}

	static int sum (int... args) {
		int total = 0;
		for (int i : args)
			total += i;
		return total;
	}
	
}
