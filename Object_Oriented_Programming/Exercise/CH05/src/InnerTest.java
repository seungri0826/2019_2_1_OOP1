class Outer{
	private int num;
	
	class Inner{
		public void print() {
			System.out.println("����� ���� Ŭ�����Դϴ�. ");
			System.out.println("num="+num);
		}
	}
	
	void display() {
		Inner obj = new Inner();
		obj.print();
	}
}
public class InnerTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Outer obj=new Outer();
		obj.display();

	}

}
