
public class ConstructorTest2 {

	public static void main(String[] args) {
		Datas d1 = new Datas(); // �ν��Ͻ�(��ü)�� �����Ǿ� ������ �䱸
		Datas d2 = new Datas(2, 100, "test");
		Datas d3 = new Datas(1);
		Datas d4 = new Datas(1, 50);
		
		System.out.println(d2);
		System.out.println(d3);
		System.out.println(d4);
	}

}

class Datas { // �����ڰ� �������� �ʱ� ������ �⺻ �����ڰ� �ڵ����� ������
	int value;
	int num;
	String str;
	
	Datas() {
		
	}
	
	Datas(int v, int n, String s) {
		this.value = v; // �������� this
		this.num = n;
		this.str = s;
	}
	
	Datas(int v) {
		this(v, 0, null); // ������ this()
//		this.value = v;
	}
	
	Datas(int v, int n) {
		this(v, n, null);
//		this.value = v;
//		this.num = n;
	}
	
	public String toString() {
		return value + ", " + num  + ", " + str;
	}
}
