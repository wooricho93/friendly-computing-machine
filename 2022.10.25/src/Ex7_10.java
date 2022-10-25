
public class Ex7_10 {

	public static void main(String[] args) {
		Tv t = new CaptionTv();
		CaptionTv ct = new CaptionTv();
		CaptionTv ct2 = null;
		
		t = ct;
		
		
		ct2 = (CaptionTv)t;
		
		
	}

}

class Tv {
	boolean power;
	int channel;
	
	void power() { power = !power; }
	void channelUp() { ++channel; }
	void channelDown() { --channel; }
}

class CaptionTv extends Tv {
	String text;
	void caption() {}
}