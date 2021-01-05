import java.util.*;

public class MiniProject {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int answer = (int) (Math.random() * 100)+1;
		int guess;
		int i=0;
		
		Scanner sc = new Scanner(System.in);
		
		do {
			System.out.print("정답을 추측하여 보시오: ");
			guess = sc.nextInt();
			i++;
			
			if(guess < answer)
				System.out.println("LOW");
			if(guess > answer)
				System.out.println("HIGH");
		}while(guess!=answer);
		
		System.out.printf("축하합니다. 시도횟수=%d", i);

	}

}
