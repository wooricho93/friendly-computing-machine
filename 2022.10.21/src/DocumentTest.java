package wooricho;

public class DocumentTest {

	public static void main(String[] args) {
		Document d1 = new Document();
		Document d2 = new Document("자바.txt");
		Document d3 = new Document();
		Document d4 = new Document();
	}

}

class Document {
	static int count = 0; // 클래스 변수 선언; 객체 생성 없이도 사용 가능
	String name; // 문서 이름 -> 인스턴스 변수 선언; 객체 생성 후 사용 가능
	
	Document() { // 문서명을 지정하지 않았을 때
		this("제목없음" + ++count);
	}
	
	Document(String name) {
		this.name = name;
		System.out.println("문서 " + this.name + "가 생성되었습니다.");
	}
}