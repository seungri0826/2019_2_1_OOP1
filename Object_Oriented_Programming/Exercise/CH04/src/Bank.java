
public class Bank {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Account a1, a2;
		a1 = new Account();
		a1.deposit(50000);
		
		a2 = new Account();
		a2.deposit(100000);
		
		System.out.println("�� #1 ���� �ܰ�="+a1.getBalance());
		System.out.println("�� #2 ���� �ܰ�="+a2.getBalance());
	}
}
