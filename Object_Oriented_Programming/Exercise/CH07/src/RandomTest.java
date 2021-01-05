import java.util.*;

public class RandomTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random random = new Random();
		random.setSeed(System.currentTimeMillis()); 
		// Seed를 현재 시간으로 줌 -> 실행할 마다 다른 Seed 값 가짐 -> 실행할 때마다 다른 시퀀스 값 가짐
		
		for (int i =0; i<10; i++)
			System.out.print(random.nextInt(100)+",");

	}

}
