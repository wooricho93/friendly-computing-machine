package ex1;

public class ClassEx_2 {

	public static void main(String[] args) {
		Info i = new Info();
		i.setN("조우리");
		i.setA("경기도 화성");
		i.setT("버스+전철");
		i.setH(0.5);
		i.show();
	}
	
}

class Info {
	String name;
	String address;
	String transfer;
	double hour;
	
//	Info (String n, String a, String t, double h) {
//		name = n;
//		address = a;
//		transfer = t;
//		hour = h;
//	}
	
	void setN(String n) {
		n = name;
	}
	
	void setA(String a) {
		a = address;
	}
	
	void setT(String t) {
		t = transfer;
	}
	
	void setH(double h) {
		h = hour;
	}
	
	
	void show() {
		System.out.println("이름: " + name);
		System.out.println("주소: " + address);
		System.out.println("교통편: " + transfer);
		System.out.println("소요 시간: " + hour + "시간");
	}
}