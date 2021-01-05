class Animal1{
	void walk() {
		System.out.println("걸을 수 있음");
	}
}

class Bird extends Animal1{
	void fly() {
		System.out.println("날을 수 있음");
	}
	
	void sing() {
		System.out.println("노래 부를 수 있음");
	}
}

public class exercise2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bird bird = new Bird();	// Animal1 bird = new Animal1(); 이면 bird.walk();만 실행 됨.
								// Bird b = (Bird)bird; 추가하면 실제 만든 것이 Bird 객체이므로 됨. b.walk();~
		
		bird.walk();
		bird.fly();
		bird.sing();
	}

}
