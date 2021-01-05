
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
		System.out.println("½Äº°¹øÈ£: " + Plane.getPlanes() + " Á¦Á¶»ç : " + p1.getBuilder() + " ¸ðµ¨: " + p1.getModel() + " ½Â°´¼ö: " + p1.getPassengers());
		
		p2 = new Plane("Boeing", "B747", 400);
		/*
		System.out.println(p2.getBuilder());
		System.out.println(p2.getModel());
		System.out.println(p2.getPassengers());
		System.out.println(Plane.getPlanes());
		*/
		System.out.println("½Äº°¹øÈ£: " + Plane.getPlanes() + " Á¦Á¶»ç : " + p2.getBuilder() + " ¸ðµ¨: " + p2.getModel() + " ½Â°´¼ö: " + p2.getPassengers());
		
		
		// Plane.getPlanes(), p1.getPlanes(), p2.getPlanes() Â÷ÀÌÁ¡!?
	}
}
