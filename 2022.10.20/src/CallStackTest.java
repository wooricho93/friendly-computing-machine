
public class CallStackTest {

	public static void main(String[] args) {
		firstMethod(); // static �޼���� ��ü ���� ���� ȣ�� ����
		System.out.println("���α׷��� �����մϴ�.");
	}
	static void firstMethod() {
		secondMethod();
	}
	
	static void secondMethod() {
		System.out.println("���α׷��� �����մϴ�.");
	}

}
