class MyMath{
	// �������� �����ϴ� �޼ҵ�
	int square(int i) {
		return i*i;
	}
	
	double square(double i) {
		return i*i;
	}
}
public class MyMathTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyMath obj = new MyMath();
		System.out.println("���� �޴� square "+obj.square(10));
		System.out.println("�Ǽ� �޴� square "+obj.square(3.14));

	}

}
