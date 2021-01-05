import java.util.*;

public class exercise9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x0=0;
		int x1=1;
		int temp=0;
		
		Scanner sc=new Scanner(System.in);
		System.out.print("출력할 항의 개수: ");
		int num = sc.nextInt();
		
		System.out.print(x0+" ");
		System.out.print(x1+" ");
		
		for(int i=0; i<num-2; i++)
		{
			temp = x0;
			x0 = x1;
			x1 = x1+temp;
			System.out.print(x1+" ");
		}

	}

}
