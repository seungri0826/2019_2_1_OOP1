class Circle {
	int radius;
	String color;
	
	void setRadius(int r) {
		radius =  r;
	}
	
	void setColor(String str) {
		color = str;
	}
	
	double calcArea() {
		return 3.14*radius*radius;
	}
}

public class CircleTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circle obj;
		obj=new Circle();
		obj.setRadius(100);
		obj.setColor("blue");
		double area = obj.calcArea();
		System.out.println("원의 면적=" + area);

	}

}
