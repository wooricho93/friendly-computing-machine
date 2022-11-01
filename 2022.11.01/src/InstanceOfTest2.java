class Box2 {
	public void simpleWrap() {
		System.out.println("Simple Wrapping");
	}
}

class PaperBox2 extends Box2 {
	public void simpleWrap() {
		System.out.println("Paper Wrapping");
	}
}

class GoldPaperBox2 extends PaperBox2 {
	public void simpleWrap() {
		System.out.println("Gold Wrapping");
	}
}

public class InstanceOfTest2 {

	public static void main(String[] args) {
		Box2 box1 = new Box2();
		PaperBox2 box2 = new PaperBox2();
		GoldPaperBox2 box3 = new GoldPaperBox2();
		
		wrapBox(box1);
		wrapBox(box2);
		wrapBox(box3);
	}
	
	public static void wrapBox(Box2 box) {
		if (box instanceof Box2)
			box.simpleWrap();
	}

}
