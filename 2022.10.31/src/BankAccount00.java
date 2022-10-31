
class BankAccount00 {
	public static void main(String[] args) {
		BankAccount yoon = new BankAccount();
		BankAccount park = new BankAccount();
		
		yoon.deposit(5000);
		park.deposit(3000);
		
		yoon.withdraw(2000);
		park.withdraw(2000);
		
		yoon.checkMyBalance();
		park.checkMyBalance();
	}

}

class BankAccount {
	int balance = 0;
	
	public void deposit(int amount) { // 굳이 반환값을 줄 필요가 X
		balance += amount;
//		return balance;
	}
	
	public void withdraw(int amount) {
		balance -= amount;
//		return balance;
	}
	
	public int checkMyBalance() {
		System.out.println("잔액: " + balance);
		return balance;
	}
}