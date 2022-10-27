
public class Ex9_8 {

	public static void main(String[] args) {
		Point1 p1 = new Point1(3,5);
		Point1 p2;
		
		try {
			p2 = (Point1)p1.clone();
			p1.showPosition();
			p2.showPosition();
			
			p1.xPos = 10;
			p1.yPos = 20;
			
			p1.showPosition();
			p2.showPosition();
			System.out.println(p2);
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		System.out.println(p1);
		
	}

}
// MarkInterface
class Point1 implements Cloneable {
	int xPos;
	int yPos;
	
	public Point1(int xPos, int yPos) {
		super();
		this.xPos = xPos;
		this.yPos = yPos;
	}
	
	public void showPosition() {
		System.out.printf("[%d, %d]%n", xPos, yPos);
	}
	
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
}

