class Math1{
	int add(int x, int y) {
		return x+y;
	}
}
public class MathTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum;
		Math1 obj = new Math1();
		sum = obj.add(2, 3);
		System.out.println("2�� 3�� ���� "+sum);
		sum = obj.add(7, 8);
		System.out.println("7�� 8�� ���� "+sum);

	}

}
