
public class exercise7_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			sub();
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("ArrayIndexOutOfBoundsException �߻�");
		}
		System.out.println("���α׷� ��� �����մϴ�.");
	}

	public static void sub() throws ArrayIndexOutOfBoundsException { 
		// throw~: exception �߻��� �� �ִ�. -> ���� ȣ���ϴ� �޼ҵ忡�� ó�� �ѱ�
		int[] arr = new int[10];
		int i = arr[10];
	}
}
