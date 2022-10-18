package ex1;

public class TvTest {

	public static void main(String[] args) {
//		TV t; // TV 인스턴스를 참조하기 위한 변수 t 선언
//		t = new TV(); // TV 인스턴스 생성
		TV t = new TV(); // TV 인스턴스 선언과 동시에 초기화
		t.channel = 7; // TV 인스턴스의 멤버변수 channel의 값을 7로 지정
		t.channelDown(); // TV 인스턴스의 메서드 channelDown() 호출
		System.out.println("현재 채널은 " + t.channel + "입니다.");
	}

}

class TV {
	String color;
	boolean power;
	int channel;
	
	void power() {power = !power;}
	void channelUp() {++channel;}
	void channelDown() {--channel;}
	
}


