// ������ �־�� (num �־ printInfo() �޼ҵ带 �־��)
// ���� ����

class BankAccount{
	int money=0;
	
	public void transfer(int amount, BankAccount acc2) {
		if (money >= amount) {
			withdraw(amount);
			acc2.deposit(amount);
		}
		else {
			System.out.println("�ܾ��� �����Ͽ� �۱��� �� �����ϴ�.");
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
		
		System.out.println("myAccount1 : ���� �ܾ��� "+ acc1.getMoney() +" �Դϴ�.");
		System.out.println("myAccount2 : ���� �ܾ��� "+ acc2.getMoney() +" �Դϴ�.");
		
		//acc1.transfer(1000, acc1, acc2);  acc1�� ����̹Ƿ� acc1�� �ȳѰܵ� ok
		acc1.transfer(1000, acc2);
		
		System.out.println("myAccount1 : ���� �ܾ��� "+ acc1.getMoney() +" �Դϴ�.");
		System.out.println("myAccount2 : ���� �ܾ��� "+ acc2.getMoney() +" �Դϴ�.");
	}
}
