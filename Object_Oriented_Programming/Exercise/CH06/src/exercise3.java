interface Animal2{
	void walk();
	void fly();
	void sing();
}

class Bird2 implements Animal2{
	public void walk() {
		System.out.println("걸을 수 있음");
	}
	public void fly() {
		System.out.println("날을 수 있음");		
	}
	public void sing() {
		System.out.println("노래 부를 수 있음");
	}
}

public class exercise3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bird2 bird = new Bird2();	// Animal2 bird = new Animal2(); 도 가능
		bird.walk();
		bird.fly();
		bird.sing();
		

	}

}
