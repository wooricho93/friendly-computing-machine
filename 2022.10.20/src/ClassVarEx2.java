
public class ClassVarEx2 {

	public static void main(String[] args) {
		Tests2 t = new Tests2();
		t.ivFunc();
	}

}

class Tests2 {
	int iv = 0;
	static int cv = 0; // ����� ���ÿ� �޸𸮿� �ö󰡱� ������ ��𼭵� ��� ����
	
	void ivFunc() {
		iv = 0;
		cv = 0;
		cvFunc();
		testFunc();
	}
	
	static void cvFunc() {
//		iv = 0;   -> iv�� ��ü ���� �������� �޸𸮿� �ö��� �ʱ� ������ ��� �Ұ�
//		ivFunc(); -> ivFunc()�� ��������
		cv = 0;
		testFunc();
	}
	
	
	static void testFunc() {
		cv = 0;
		cvFunc();
	}
}