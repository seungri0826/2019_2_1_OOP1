
public class Account {
	int balance;
	
	Account(){ 
		balance = 0;
		System.out.println("���ο� ���°� ����������ϴ�.");
		}
	
	void withdraw(int amount) {
		System.out.println(amount +"�� ����");
		balance-=amount;
	}
	
	void deposit(int amount) {
		System.out.println(amount + "�� ����");
		balance+=amount;
	}
	
	int getBalance() { return balance;}
}
