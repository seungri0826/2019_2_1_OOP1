class Animal1{
	void walk() {
		System.out.println("���� �� ����");
	}
}

class Bird extends Animal1{
	void fly() {
		System.out.println("���� �� ����");
	}
	
	void sing() {
		System.out.println("�뷡 �θ� �� ����");
	}
}

public class exercise2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bird bird = new Bird();	// Animal1 bird = new Animal1(); �̸� bird.walk();�� ���� ��.
								// Bird b = (Bird)bird; �߰��ϸ� ���� ���� ���� Bird ��ü�̹Ƿ� ��. b.walk();~
		
		bird.walk();
		bird.fly();
		bird.sing();
	}

}
