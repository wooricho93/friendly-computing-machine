package ex1;

public class ClassEx_3 {

	public static void main(String[] args) {
		SutdaCard card1 = new SutdaCard(3, false);
		SutdaCard card2 = new SutdaCard();
		
		System.out.println(card1.info());
		System.out.println(card2.info());
	}

}

class SutdaCard {
	int num;
	boolean isKwang;
	
	SutdaCard() {
		num = 1;
		isKwang = true;
	}
	
	SutdaCard(int i, boolean k) {
		num = i;
		isKwang = k;
	}
	
	String info() {
		return num + (isKwang ? "K" : "");
	}
}