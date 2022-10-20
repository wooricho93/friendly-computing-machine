


public class CarTest2 {

	public static void main(String[] args) {
		Car2 c1 = new Car2();
		Car2 c2 = c1;
		
		System.out.println("c1의 color = " + c1.color + ", gearType = " 
		+ c1.gearType + ", door = " + c1.door);
		System.out.println("c2의 color = " + c2.color + ", gearType = " 
		+ c2.gearType + ", door = " + c2.door);
		
		c1.color = "Blue";
		
		System.out.println();
		
		System.out.println("c1의 color = " + c1.color + ", gearType = " 
		+ c1.gearType + ", door = " + c1.door);
		System.out.println("c2의 color = " + c2.color + ", gearType = " 
		+ c2.gearType + ", door = " + c2.door);
	}

}

class Car2 {
	String color;
	String gearType;
	int door;
	
	Car2() {
		this("White", "auto", 4);
	}
	
	Car2(String color) {
		this(color, "auto", 4);
	}
	
	Car2(String color, String gearType, int door) {
		this.color = color;
		this.gearType = gearType;
		this.door = door;
	}
}
