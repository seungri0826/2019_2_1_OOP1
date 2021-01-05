class Animal{
	void eat() {
		System.out.println("∏‘∞Ì ¿÷¿Ω...");
	}
}

class Dog extends Animal{
	void bark() {
		System.out.println("¬¢∞Ì ¿÷¿Ω...");
	}
}

public class DogTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dog d = new Dog();
		d.bark();
		d.eat();
	}
}
