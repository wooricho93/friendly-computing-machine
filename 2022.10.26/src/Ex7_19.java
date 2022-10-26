
public class Ex7_19 {

	public static void main(String[] args) {
		Xiaomi tv = new Xiaomi();
		tv.powerOn();
		tv.powerOff();
		tv.volumeUp();
		tv.volumeDown();
	}

}

interface TV {
	void powerOn();
	void powerOff();
	void volumeUp();
	void volumeDown();
}

class Samsung implements TV {
	@Override
	public void powerOn() {
		System.out.println("SamsungTv 전원 On.");
	}

	@Override
	public void powerOff() {
		System.out.println("SamsungTv 전원 Off.");
	}

	@Override
	public void volumeUp() {
		System.out.println("SamsungTv 볼륨 Up.");
	}

	@Override
	public void volumeDown() {
		System.out.println("SamsungTv 볼륨 Up.");
	}
}

class Lg implements TV {
	@Override
	public void powerOn() {
		System.out.println("LgTv 전원 On.");
	}

	@Override
	public void powerOff() {
		System.out.println("LgTv 전원 Off.");
	}

	@Override
	public void volumeUp() {
		System.out.println("LgTv 볼륨 Up.");
	}

	@Override
	public void volumeDown() {
		System.out.println("LgTv 볼륨 Down.");
	}
}

class Xiaomi implements TV {
	@Override
	public void powerOn() {
		System.out.println("XiaomiTv 전원 On.");
	}

	@Override
	public void powerOff() {
		System.out.println("XiaomiTv 전원 Off.");
	}

	@Override
	public void volumeUp() {
		System.out.println("XiaomiTv 볼륨 Up.");
	}

	@Override
	public void volumeDown() {
		System.out.println("XiaomiTv 볼륨 Down.");
	}
	
}
