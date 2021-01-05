import java.util.Scanner;

public class exercise5 {
/*
 / 연산자와 % 연산자를 사용하여 while 문 사용하여 2진수로 변환하여 출력하는 프로그램 만들기
 */
	public static void main(String[] args) {
		String str = "";
		int x,y;
		
		Scanner sc= new Scanner(System.in);
		System.out.print("정수: ");
		y=sc.nextInt();
		x=y;
		
		while(x/2 != 0)
		{
			str = x%2 + str;
			x = x/2;
		}
		str = x+str;
		System.out.println(y + ": " + str);
		System.out.println("내장 함수로 확인: " + Integer.toBinaryString(y)); // 내장 함수로 확인하기
	}

}
