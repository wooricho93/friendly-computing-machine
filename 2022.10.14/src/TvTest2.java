package ex1;

public class TvTest2 {

	public static void main(String[] args) {
		TV t1 = new TV();
		TV t2 = new TV();
		
		System.out.println("t1의 channel 값은 " + t1.channel + "입니다.");
		System.out.println("t2의 channel 값은 " + t2.channel + "입니다.");
		
		t1.channel = 7;
		
		System.out.println("t1의 channel 값을 7로 변경하였습니다.");
		
		System.out.println("t1의 channel 값은 " + t1.channel + "입니다.");
		System.out.println("t2의 channel 값은 " + t2.channel + "입니다.");
	}

}

//class TV {
//	String color;
//	boolean power;
//	int channel;
//	
//	void power() {power = !power;}
//	void channelUp() {++channel;}
//	void channelDown() {--channel;}
//	
//}


