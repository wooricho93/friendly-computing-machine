
public class Ex7_18 {

	public static void main(String[] args) {
		SamsungTV sm = new SamsungTV();
		sm.powerOn();
		sm.powerOff();
		sm.volumeUp();
		sm.volumeDown();
		
		LgTV lg = new LgTV();
		lg.turnOn();
		lg.turnOff();
		lg.soundUp();
		lg.soundDown();
		
		XiaomiTV xiaomi = new XiaomiTV();
		xiaomi.on();
		xiaomi.off();
		xiaomi.up();
		xiaomi.down();
	}

}

class SamsungTV {
	public void powerOn() {
		System.out.println("SamsungTV 전원 On.");
	}
	
	public void powerOff() {
		System.out.println("SamsungTV 전원 Off.");
	}
	
	public void volumeUp() {
		System.out.println("SamsungTV 볼륨 Up.");
	}
	
	public void volumeDown() {
		System.out.println("SamsungTV 볼륨 Down.");
	}
}

class LgTV {
	public void turnOn() {
		System.out.println("LgTV 전원 On.");
	}
	
	public void turnOff() {
		System.out.println("LgTV 전원 Off.");
	}
	
	public void soundUp() {
		System.out.println("LgTV 소리 Up.");
	}
	
	public void soundDown() {
		System.out.println("LgTV 소리 Down.");
	}
}

class XiaomiTV {
	void on() {
		System.out.println("Xiaomi 전원 On.");
	}
	
	void off() {
		System.out.println("Xiaomi 전원 Off.");
	}
	
	void up() {
		System.out.println("Xiaomi 볼륨 Up.");
	}
	
	void down() {
		System.out.println("Xiaomi 볼륨 Down.");
	}
}