
public class exercise7_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		sub();
	}
	
	public static void sub() {
		int[] arr = new int[10];
		try {
			int i = arr[10];
		} catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("ArrayIndexOutOfBoundsException �߻�");
		}
		System.out.println("���α׷� ��� �����մϴ�.");
	}
}
