import java.util.*;

public class exercise12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int score, sum=0;
		double avg=0;
		
		Scanner sc = new Scanner(System.in);
		
		for(int i=0;i<5;i++)
		{
			System.out.print("������ �Է��ϼ���: ");
			score=sc.nextInt();
			sum+=score;
		}
		avg=sum/5.0;
		System.out.println("�հ�: "+ sum);
		System.out.println("���: " + avg);
	}

}
