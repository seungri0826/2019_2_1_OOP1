class MyMath{
	// 정수값을 제곱하는 메소드
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
		System.out.println("정수 받는 square "+obj.square(10));
		System.out.println("실수 받는 square "+obj.square(3.14));

	}

}
