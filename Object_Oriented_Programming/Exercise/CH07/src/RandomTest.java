import java.util.*;

public class RandomTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random random = new Random();
		random.setSeed(System.currentTimeMillis()); 
		// Seed�� ���� �ð����� �� -> ������ ���� �ٸ� Seed �� ���� -> ������ ������ �ٸ� ������ �� ����
		
		for (int i =0; i<10; i++)
			System.out.print(random.nextInt(100)+",");

	}

}
