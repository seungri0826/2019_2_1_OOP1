import java.util.*;

class Student {
	int number;
	String name;
	
	public Student(int number, String name) {
		this.number = number;
		this.name = name;
	}
	
	public String toString() { return name; }
}

public class SortTest2 {

	public static void main(String[] args) {
		Student array[] = {
				new Student(2, "��ö��"),
				new Student(3, "��ö��"),
				new Student(1, "��ö��"),
		};
		List<Student> list = Arrays.asList(array);
		Collections.sort(list, (Student s1, Student s2) -> { return
				(s1.number - s2.number);});
		System.out.println(list);
	}

}
