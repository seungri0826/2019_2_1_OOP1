// 좌석이 모두 예약 될 때까지 반복하는 코드로 수정해도 됨. 그때는 좌석이 중복 예약되지 않도록 해야함.
import java.util.*;

class Seats{
	int[] seats= {0,0,0,0,0,0,0,0,0,0};
	int i=0;
	
	void print_seats(){
		System.out.println("--------------------------");
		System.out.println("0 1 2 3 4 5 6 7 8 9");
		System.out.println("--------------------------");
		for(i=0;i<10;i++) {
			System.out.print(seats[i]+" ");
		}
		System.out.println("");
		System.out.println("--------------------------");
	}
	
	void set_seats(int r) {
		seats[r]=1;
	}
}
public class exercise2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int r;
		
		Scanner sc = new Scanner(System.in);
		Seats obj = new Seats();
		
		obj.print_seats();
		
		System.out.print("몇번째 좌석을 예약하시겠습니까?");
		r = sc.nextInt();
		System.out.println("예약되었습니다.");
		
		obj.set_seats(r);
		obj.print_seats();
	}

}
