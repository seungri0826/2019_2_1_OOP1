
public class exercise7_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			sub();
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("ArrayIndexOutOfBoundsException 발생");
		}
		System.out.println("프로그램 계속 진행합니다.");
	}

	public static void sub() throws ArrayIndexOutOfBoundsException { 
		// throw~: exception 발생할 수 있다. -> 나를 호출하는 메소드에게 처리 넘김
		int[] arr = new int[10];
		int i = arr[10];
	}
}
