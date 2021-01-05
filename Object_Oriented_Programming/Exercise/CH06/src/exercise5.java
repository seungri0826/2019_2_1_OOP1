class Rectangle{
	int width, height;
	
	public Rectangle(int width, int height) {
		this.width=width;
		this.height=height;
	}
}

class ColorRectangle extends Rectangle{
	String color;
	
	public ColorRectangle(int width, int height, String color) {
		super(width, height);
		// this.width=width;
		// this.height=height;  -> 추가하거나, 14행 없이 하려면 Rectangle 클래스에 인수 없는 생성자 추가하기!!
		this.color=color;
	}
	
}

public class exercise5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ColorRectangle obj = new ColorRectangle(100, 100, "blue");
		System.out.println("가로: " + obj.width);
		System.out.println("세로: " + obj.height);
		System.out.println("색상: " + obj.color);
	}
}
