import java.util.*;


public class exercise3 {

	public static void main(String[] args) {
		int in;
		int price;
		double tax;
		int change;
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("���� ��: ");
		in = input.nextInt();
		System.out.print("��ǰ ����: ");
		price = input.nextInt();
		
		tax = (0.1) * price;
		change = in-price;
		
		System.out.println("�ΰ���: " + (int)tax);
		System.out.println("�ܵ�: " + change);
		
		

	}

}
