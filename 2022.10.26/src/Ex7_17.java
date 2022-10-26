
public class Ex7_17 {

	public static void main(String[] args) {
		Fighter f = new Fighter();
		
		if (f instanceof Unit)
			System.out.println("f는 Unit 클래스의 자손입니다.");
		
		if (f instanceof Fightable)
			System.out.println("f는 Fightable 인터페이스를 구현했습니다.");
		
		if (f instanceof Movable)
			System.out.println("f는 Movable 인터페이스를 구현했습니다.");
		
		if (f instanceof Attackable)
			System.out.println("f는 Attack 인터페이스를 구현했습니다.");
		
		if (f instanceof Object)
			System.out.println("f는 Object 클래스의 자손입니다.");
	}

}

class Fighter extends Unit implements Fightable {
	public void move(int x, int y) {}
	public void attack(Unit u) {}
}

class Unit {
	int currentHP;
	int x;
	int y;
}

// 인터페이스 -> 추상메서드와 상수만을 멤버로 가질 수 있다.
interface Fightable extends Movable, Attackable { }

interface Movable { void move(int x, int y); } 

interface Attackable { void attack(Unit u); }
