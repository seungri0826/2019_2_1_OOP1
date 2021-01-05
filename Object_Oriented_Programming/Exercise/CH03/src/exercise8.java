import java.util.*;

//실수로도 바꿔보자
public class exercise8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String ch;
		int a,b;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("연산을 입력하세요: ");
		ch = sc.next();
				
		System.out.print("숫자 2개를 입력하세요: ");
		a=sc.nextInt();
		b=sc.nextInt();
		
		if(ch.equals("*"))
			System.out.printf("%d * %d = %d\n", a, b, a*b);
		else if(ch.equals("+"))
			System.out.printf("%d + %d = %d\n", a, b, a+b);
		else if(ch.equals("-"))
			System.out.printf("%d - %d = %d\n",  a, b, a-b);
		else if (ch.equals("/")) //else if(ch.equals("/") && b!=0) ~ 도 사용 가능
		{
			if(b!=0)
			{
				System.out.printf("%d / %d = %d\n", a, b, a/b);
			}
			else
				System.out.println("분모는 0이 될 수 없습니다.");
		}

	}

}
