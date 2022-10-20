
public class ConstructorTest {

	public static void main(String[] args) {
		Data1 d1 = new Data1(); // 인스턴스(객체)가 생성되어 생성자 요구
//		Data2 d2 = new Data2();
	}

}

class Data1 { // 생성자가 존재하지 않기 때문에 기본 생성자가 자동으로 생성됨
	int value;
}

class Data2 { // 생성자가 이미 있기 때문에 기본 생성자가 생기지 않음
	int value;
	Data2(int x) {
		value = x;
	}
}