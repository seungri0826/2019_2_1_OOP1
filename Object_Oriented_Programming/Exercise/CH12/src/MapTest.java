import java.util.*;

class Student {
	int number;
	String name;
	
	public Student(int number, String name) {
		this.number = number;
		this.name = name;
	}
	
	public String toString() {
		return name;
	}
}

public class MapTest {

	public static void main(String[] args) {
		Map<String, Student> st = new HashMap<String, Student>();
		st.put("100", new Student(100, "È«±æµ¿"));
		st.put("200", new Student(200, "±èÀ¯½Å"));
		st.put("300", new Student(300, "±èÃ¶¼ö"));
		
		System.out.println(st);
		
		st.remove("200");
		st.put("300", new Student(300, "ÃÖÀÚ¿µ"));
		System.out.println(st.get("300"));
		for(Map.Entry<String, Student> s : st.entrySet()) {
			String key = s.getKey();
			Student value = s.getValue();
			System.out.println("key=" + key + ", value=" + value);
		}
	}

}
