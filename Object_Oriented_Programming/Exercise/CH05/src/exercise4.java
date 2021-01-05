
class Plane{
	private String builder;
	private String model;
	private int passengers;
	private static int planes =0;
	
	public Plane() {
		builder ="Airbus";
		model = "A380";
		passengers = 500;
		planes++;
	}
	
	public Plane(String b, String m, int p) {
		builder=b;
		model=m;
		passengers=p;
		planes++;
	}
	
	public String getBuilder() {
		return builder;
	}
	public String getModel() {
		return model;
	}
	public int getPassengers() {
		return passengers;
	}
	public static int getPlanes() {
		return planes;
	}
}

public class exercise4 {
	public static void main(String[] args) {
		Plane p1, p2;
		
		p1= new Plane();
		/*
		System.out.println(p1.getBuilder());
		System.out.println(p1.getModel());
		System.out.println(p1.getPassengers());
		System.out.println(Plane.getPlanes());
		*/
		System.out.println("�ĺ���ȣ: " + Plane.getPlanes() + " ������ : " + p1.getBuilder() + " ��: " + p1.getModel() + " �°���: " + p1.getPassengers());
		
		p2 = new Plane("Boeing", "B747", 400);
		/*
		System.out.println(p2.getBuilder());
		System.out.println(p2.getModel());
		System.out.println(p2.getPassengers());
		System.out.println(Plane.getPlanes());
		*/
		System.out.println("�ĺ���ȣ: " + Plane.getPlanes() + " ������ : " + p2.getBuilder() + " ��: " + p2.getModel() + " �°���: " + p2.getPassengers());
		
		
		// Plane.getPlanes(), p1.getPlanes(), p2.getPlanes() ������!?
	}
}
