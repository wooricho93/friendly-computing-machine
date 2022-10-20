
public class MemberCall {

	int iv = 10; // ��ü ���� �� �޸� ������ �ε�
	static int cv = 20; // ����� ���ÿ� �޸� ������ �ε�
	
	int iv2 = cv;
	
//	static int cv2 = iv; -> ����; Ŭ���� ������ �ν��Ͻ� ���� ��� �Ұ�
	static int cv2 = new MemberCall().iv; // ��ü�� �����ϸ� �ν��Ͻ� ���� ��� ����
	
	static void staticMethod() {
		System.out.println(cv);
//		System.out.println(iv); -> ����; Ŭ���� �޼��忡���� �ν��Ͻ� ���� ��� �Ұ�
		MemberCall c = new MemberCall(); // ��ü ����
		System.out.println(c.iv); // ��ó�� ��ü�� ������ �Ŀ��� �ν��Ͻ� ���� ���� ����
	}
	
	void instanceMethod() { // �ν��Ͻ� �޼���� �ν��Ͻ� ����, Ŭ���� ����, �ν��Ͻ� �޼��� ��� ��� ����
		System.out.println(cv);
		System.out.println(iv);
	}
	
	static void staticMethod2() {
		staticMethod();
//		instanceMethod(); -> ����; Ŭ���� �޼���� �ν��Ͻ� �޼��� ��� �Ұ�
		MemberCall c = new MemberCall();
		c.instanceMethod(); // �ν��Ͻ��� ������ �Ŀ� ȣ�� ����
	}
	
	void instanceMethod2() {
		staticMethod();
		instanceMethod();
	}

}
