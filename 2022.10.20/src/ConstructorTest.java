
public class ConstructorTest {

	public static void main(String[] args) {
		Data1 d1 = new Data1(); // �ν��Ͻ�(��ü)�� �����Ǿ� ������ �䱸
//		Data2 d2 = new Data2();
	}

}

class Data1 { // �����ڰ� �������� �ʱ� ������ �⺻ �����ڰ� �ڵ����� ������
	int value;
}

class Data2 { // �����ڰ� �̹� �ֱ� ������ �⺻ �����ڰ� ������ ����
	int value;
	Data2(int x) {
		value = x;
	}
}