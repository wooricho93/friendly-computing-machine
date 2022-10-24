
public class Ex7_2 {

	public static void main(String[] args) {
		Circle c = new Circle();
		c.p.x = 1;
		c.p.y = 2;
		c.r = 3;
	}

}

class Circle { // Circle class는 Point class를 포함한다.
	Point p = new Point();
	int r;
}

class Point {
	int x;
	int y;
}