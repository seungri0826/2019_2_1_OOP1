import java.util.*;

//�Ǽ��ε� �ٲ㺸��
public class exercise8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String ch;
		int a,b;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("������ �Է��ϼ���: ");
		ch = sc.next();
				
		System.out.print("���� 2���� �Է��ϼ���: ");
		a=sc.nextInt();
		b=sc.nextInt();
		
		if(ch.equals("*"))
			System.out.printf("%d * %d = %d\n", a, b, a*b);
		else if(ch.equals("+"))
			System.out.printf("%d + %d = %d\n", a, b, a+b);
		else if(ch.equals("-"))
			System.out.printf("%d - %d = %d\n",  a, b, a-b);
		else if (ch.equals("/")) //else if(ch.equals("/") && b!=0) ~ �� ��� ����
		{
			if(b!=0)
			{
				System.out.printf("%d / %d = %d\n", a, b, a/b);
			}
			else
				System.out.println("�и�� 0�� �� �� �����ϴ�.");
		}

	}

}
