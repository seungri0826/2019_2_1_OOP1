interface Animal2{
	void walk();
	void fly();
	void sing();
}

class Bird2 implements Animal2{
	public void walk() {
		System.out.println("���� �� ����");
	}
	public void fly() {
		System.out.println("���� �� ����");		
	}
	public void sing() {
		System.out.println("�뷡 �θ� �� ����");
	}
}

public class exercise3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bird2 bird = new Bird2();	// Animal2 bird = new Animal2(); �� ����
		bird.walk();
		bird.fly();
		bird.sing();
		

	}

}
