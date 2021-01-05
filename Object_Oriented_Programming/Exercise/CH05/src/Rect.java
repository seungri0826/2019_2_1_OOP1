
public class Rect {
	int width, height;
	
	public Rect(int w, int h) {
		this.width=w;
		this.height=h;
	}
	double calcArea() { return (double)width*height;}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rect[] list;
		list = new Rect[5];
		
		for(int i=0;i<list.length; i++)
			list[i]=new Rect(i,i);
				
		for(int i=0; i<list.length;i++)
			System.out.println(i+"번째 사각형의 면적="+list[i].calcArea());

	}

}
