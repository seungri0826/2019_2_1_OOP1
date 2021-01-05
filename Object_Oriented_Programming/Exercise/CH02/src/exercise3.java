import java.util.*;


public class exercise3 {

	public static void main(String[] args) {
		int in;
		int price;
		double tax;
		int change;
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("πﬁ¿∫ µ∑: ");
		in = input.nextInt();
		System.out.print("ªÛ«∞ ∞°∞›: ");
		price = input.nextInt();
		
		tax = (0.1) * price;
		change = in-price;
		
		System.out.println("∫Œ∞°ºº: " + (int)tax);
		System.out.println("¿‹µ∑: " + change);
		
		

	}

}
