
public class Account {
	int balance;
	
	Account(){ 
		balance = 0;
		System.out.println("새로운 계좌가 만들어졌습니다.");
		}
	
	void withdraw(int amount) {
		System.out.println(amount +"원 인출");
		balance-=amount;
	}
	
	void deposit(int amount) {
		System.out.println(amount + "원 저축");
		balance+=amount;
	}
	
	int getBalance() { return balance;}
}
