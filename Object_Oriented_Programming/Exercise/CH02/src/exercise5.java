import java.util.Scanner;

public class exercise5 {
/*
 / �����ڿ� % �����ڸ� ����Ͽ� while �� ����Ͽ� 2������ ��ȯ�Ͽ� ����ϴ� ���α׷� �����
 */
	public static void main(String[] args) {
		String str = "";
		int x,y;
		
		Scanner sc= new Scanner(System.in);
		System.out.print("����: ");
		y=sc.nextInt();
		x=y;
		
		while(x/2 != 0)
		{
			str = x%2 + str;
			x = x/2;
		}
		str = x+str;
		System.out.println(y + ": " + str);
		System.out.println("���� �Լ��� Ȯ��: " + Integer.toBinaryString(y)); // ���� �Լ��� Ȯ���ϱ�
	}

}
