class Point implements Cloneable {
	int x, y;

	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public void showPosition() {
		System.out.printf("[%d, %d]", x, y);
		System.out.println();
	}
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
}


public class Ex9_9 {

	public static void main(String[] args) {
		Point p1 = new Point(5, 10);
		Point p2;
		
		try {
			// 깊은 복사 -> 원본과 복사본이 서로 다른 객체를 참조; 원본의 변경이 복사본에 영향을 미치지 X
			p2 = (Point)p1.clone(); // 참조타입인 Point 클래스가 Cloneable 인터페이스를 구현해야 clone() 메서드 사용 가능
			p1.x = 100;
			p1.y = 200;
			p1.showPosition();
			p2.showPosition();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
				
	}

}
