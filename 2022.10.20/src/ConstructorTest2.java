
public class ConstructorTest2 {

	public static void main(String[] args) {
		Datas d1 = new Datas(); // 인스턴스(객체)가 생성되어 생성자 요구
		Datas d2 = new Datas(2, 100, "test");
		Datas d3 = new Datas(1);
		Datas d4 = new Datas(1, 50);
		
		System.out.println(d2);
		System.out.println(d3);
		System.out.println(d4);
	}

}

class Datas { // 생성자가 존재하지 않기 때문에 기본 생성자가 자동으로 생성됨
	int value;
	int num;
	String str;
	
	Datas() {
		
	}
	
	Datas(int v, int n, String s) {
		this.value = v; // 참조변수 this
		this.num = n;
		this.str = s;
	}
	
	Datas(int v) {
		this(v, 0, null); // 생성자 this()
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
