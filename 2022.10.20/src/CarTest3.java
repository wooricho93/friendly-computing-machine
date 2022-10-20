


public class CarTest3 {

	public static void main(String[] args) {
		Car3 c1 = new Car3();
		Car3 c2 = new Car3(c1);
		
		System.out.println("c1�� color = " + c1.color + ", gearType = " 
		+ c1.gearType + ", door = " + c1.door);
		System.out.println("c2�� color = " + c2.color + ", gearType = " 
		+ c2.gearType + ", door = " + c2.door);
		
		c1.color = "Blue";
		
		System.out.println();
		
		System.out.println("c1�� color = " + c1.color + ", gearType = " 
		+ c1.gearType + ", door = " + c1.door);
		System.out.println("c2�� color = " + c2.color + ", gearType = " 
		+ c2.gearType + ", door = " + c2.door);
	}

}

class Car3 {
	String color;
	String gearType;
	int door;
	
	Car3() {
		this("White", "auto", 4);
	}
	
	Car3(String color) {
		this(color, "auto", 4);
	}
	
	Car3(String color, String gearType, int door) {
		this.color = color;
		this.gearType = gearType;
		this.door = door;
	}
	
	Car3(Car3 c) {
		this(c.color, c.gearType, c.door);
	}
}
