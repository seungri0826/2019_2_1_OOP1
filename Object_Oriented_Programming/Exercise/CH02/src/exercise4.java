import java.util.*;

public class exercise4 {

	public static void main(String[] args) {
		double r;
		double v;
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("구의 반지름: ");
		r=input.nextDouble();
		v=(4.0/3.0)*r*r*r;
		System.out.print("구의 부피: " + v);
	}

}
