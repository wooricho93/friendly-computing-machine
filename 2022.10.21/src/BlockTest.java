package wooricho;

public class BlockTest {

	public static void main(String[] args) {
		System.out.println("BlockTest bt = new BlockTest();"); // ②
		BlockTest bt = new BlockTest();
		
		System.out.println("BlockTest bt2 = new BlockTest();"); // ⑤
		BlockTest bt2 = new BlockTest();
	}

	static {
		System.out.println("static : { }"); // ①
	}
	
	{
		System.out.println("{ }"); // ③ ⑥
	}
	
	public BlockTest() {
		System.out.println("생성자"); // ④ ⑦
	}
	
}