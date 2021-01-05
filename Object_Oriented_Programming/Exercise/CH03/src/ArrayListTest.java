import java.util.*;
public class ArrayListTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> list=new ArrayList<>();
		list.add("Ã¶¼ö");
		list.add("¿µÈñ");
		list.add("¼ø½Å");
		list.add("ÀÚ¿µ");
		for(String obj: list)
			System.out.print(obj+" ");

	}

}
