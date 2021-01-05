class Circle{
	int radius;
	public Circle(int radius) {
		this.radius = radius;
	}
	public String toString() {
		return "Circle(r=" + radius + ")";
	}
}
public class CircleTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circle obj1 = new Circle(10);
		Circle obj2 = new Circle(20);
		System.out.println(obj1);
		System.out.println(obj2);

	}

}
