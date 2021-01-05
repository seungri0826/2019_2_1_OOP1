import java.util.*;

class User{
	private String userId, password;
	private static int count=0;
	
	public User(String userId, String password) {
		this.userId = userId;
		this.password = password;
		count++;
	}
	
	public String getId() {
		return userId;
	}
	
	public String getPassword() {
		return password;
	}
	
	public static int getCount() {
		return count;
	}
}

public class MiniProject {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int select;
		Scanner sc = new Scanner(System.in);
		String id, password;
		ArrayList<User> list = new ArrayList<User>();	// ��ü �迭, User�� ������
		
		do {
			System.out.println("===========================");
			System.out.println("1. Sign Up");
			System.out.println("2. Login");
			System.out.println("3. Print All Users");
			System.out.println("4. Exit");
			System.out.println("===========================");
			System.out.print("��ȣ�� �Է��Ͻÿ�: ");
			select=sc.nextInt();
		
			switch(select) {
			case 1:
				System.out.print("ID: ");
				id = sc.next();
				System.out.print("Password: ");
				password = sc.next();
				
				User user = new User(id, password);
				list.add(user);
				break;
			case 2:
				System.out.print("ID: ");
				id = sc.next();
				System.out.print("Password: ");
				password = sc.next();
				
				if(isInList(list, id, password)) {
					System.out.println("�ȳ��Ͻʴϱ�, " + id + "!");
				}
				else
					System.out.println("�ٽ� �� �� �õ����ֽʽÿ�.");
				break;
			case 3:
				for (User obj:list) {
					System.out.println("{" + obj.getId() + ", " +obj.getPassword() + "}");
				}
				break;
			}
		}while(select!=4);
		System.out.println("��ü user ��: " + User.getCount());	
	}
	
	public static boolean isInList(ArrayList<User> list, String ID, String PW) {
		for(User obj : list) {
			if (obj.getId().equals(ID) && obj.getPassword().equals(PW)) {
				return true;
			}
		}
		return false;	
	}
}
