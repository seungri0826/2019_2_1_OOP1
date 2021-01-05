// 생성자 넣어보기 (num 넣어서 printInfo() 메소드를 넣어보자)
// 사진 참고

class BankAccount{
	int money=0;
	
	public void transfer(int amount, BankAccount acc2) {
		if (money >= amount) {
			withdraw(amount);
			acc2.deposit(amount);
		}
		else {
			System.out.println("잔액이 부족하여 송금할 수 없습니다.");
		}
	}
	
	public void withdraw(int amount) {
		money -= amount;
	}
	
	public void deposit(int amount) {
		money += amount;
	}
	
	void setMoney(int money) {
		this.money=money;
	}
	
	int getMoney() {
		return money;
	}
}

public class exercise5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BankAccount acc1 = new BankAccount();
		BankAccount acc2 = new BankAccount();
		
		acc1.setMoney(10000);
		acc2.setMoney(0);
		
		System.out.println("myAccount1 : 현재 잔액은 "+ acc1.getMoney() +" 입니다.");
		System.out.println("myAccount2 : 현재 잔액은 "+ acc2.getMoney() +" 입니다.");
		
		//acc1.transfer(1000, acc1, acc2);  acc1의 멤버이므로 acc1은 안넘겨도 ok
		acc1.transfer(1000, acc2);
		
		System.out.println("myAccount1 : 현재 잔액은 "+ acc1.getMoney() +" 입니다.");
		System.out.println("myAccount2 : 현재 잔액은 "+ acc2.getMoney() +" 입니다.");
	}
}
