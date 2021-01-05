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
		ArrayList<User> list = new ArrayList<User>();	// 객체 배열, User를 저장함
		
		do {
			System.out.println("===========================");
			System.out.println("1. Sign Up");
			System.out.println("2. Login");
			System.out.println("3. Print All Users");
			System.out.println("4. Exit");
			System.out.println("===========================");
			System.out.print("번호를 입력하시오: ");
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
					System.out.println("안녕하십니까, " + id + "!");
				}
				else
					System.out.println("다시 한 번 시도해주십시오.");
				break;
			case 3:
				for (User obj:list) {
					System.out.println("{" + obj.getId() + ", " +obj.getPassword() + "}");
				}
				break;
			}
		}while(select!=4);
		System.out.println("전체 user 수: " + User.getCount());	
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
