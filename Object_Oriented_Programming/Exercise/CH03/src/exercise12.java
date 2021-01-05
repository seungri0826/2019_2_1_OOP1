import java.util.*;

public class exercise12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int score, sum=0;
		double avg=0;
		
		Scanner sc = new Scanner(System.in);
		
		for(int i=0;i<5;i++)
		{
			System.out.print("성적을 입력하세요: ");
			score=sc.nextInt();
			sum+=score;
		}
		avg=sum/5.0;
		System.out.println("합계: "+ sum);
		System.out.println("평균: " + avg);
	}

}
