
public class Ex7_3 {

	public static void main(String[] args) {
		Point2 p = new Point3D();
		System.out.println(p.getLocation());
	}

}

class Point2 {
	int x;
	int y;
	
	String getLocation() {
		return "x = " + x + ", y = " + y;
	}
}

class Point3D extends Point2 {
	int z;
	
	String getLocation() {
		return "x = " + x + ", y = " + y + ", z = " + z;
	}
}