
public class Pizza {
	int size;
	String type;
	
	public Pizza() {
		size=12;
		type="½´ÆÛ½´ÇÁ¸²";
	}
	
	public Pizza(int s, String t) {
		size=s;
		type=t;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pizza obj1=new Pizza();
		System.out.println("("+obj1.type+ ", "+obj1.size+",)");
		
		Pizza obj2=new Pizza(24, "Æ÷Å×ÀÌÅä");
		System.out.println("("+obj2.type+ ", "+obj2.size+",)");

	}

}
