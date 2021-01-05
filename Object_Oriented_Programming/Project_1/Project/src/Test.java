import java.util.*;

abstract class Person {
	private String name;	// �̸�
	private Department department;	// �к�
	private ArrayList<Lecture> lectureList = new ArrayList<Lecture>();	// ���� ����Ʈ
	
	// Person ��ü ������
	public Person (String name, Department department) {
		this.name = name;
		this.department = department;
	}	
	
	// �̸��� ��ȯ�ϴ� �޼ҵ�
	public String getName() { return name; }
	
	// �кθ� ��ȯ�ϴ� �޼ҵ�
	public Department getDepartment() { return department; }
	
	// ���� ����Ʈ�� ��ȯ�ϴ� �޼ҵ�
	public ArrayList<Lecture> getLectureList(){ return lectureList; }
	
	// Student�� Professor�� ���� ����Ʈ�� �����ϴ� �߻� �޼ҵ�
	public abstract void putLecture(Lecture lecture);	
}

class Student extends Person {
	private int studentID;	// �й�
	
	// Student ��ü ������
	public Student(String name, Department department, int studentID) {
		super(name, department);
		this.studentID = studentID;
	}	
	
	// ���� ����Ʈ�� �����ϴ� �߻� �޼ҵ� ������
	@Override
	public void putLecture(Lecture lecture) {
		getLectureList().add(lecture);
		getDepartment().getStudentList().add(this);
	}	
	
	// ���� ����Ʈ���� �ش� index�� ���Ǹ��� ��ȯ�ϴ� �޼ҵ�
	public String getLectureName(int index) { return getLectureList().get(index).getLectureName(); }	
	
	// �й��� ��ȯ�ϴ� �޼ҵ�
	public int getStudentID() { return studentID; }
	
	// �ش� �л��� �����ϴ� ���� ����Ʈ�� ����ϴ� �޼ҵ�
	public void printLectureList() {
		int i;
		System.out.print(getName() + "�� ���� ��� : ");
		
		for(i = 0; i < getLectureList().size()-1; i++)
			System.out.print(getLectureName(i) + ", ");
		System.out.println(getLectureName(i));
	}
}

class Professor extends Person {
	private int professor_id;	// ������ȣ
	
	// Professor ��ü ������
	public Professor(String name, Department department, int professor_id) {
		super(name, department);
		this.professor_id = professor_id;
	}	
	
	// �����ϴ� ���� ����Ʈ�� �����ϴ� �߻� �޼ҵ� ������
	@Override
	public void putLecture(Lecture lecture) { getLectureList().add(lecture); }	
}

class College {
	private ArrayList<Department> departmentList = new ArrayList<Department>();	// �Ҽ� �а� ����Ʈ
	
	// �ܰ����� �� �Ҽ� �а� ����Ʈ�� �а��� �߰��ϴ� �޼ҵ�
	public void addDepartment(Department department) { departmentList.add(department); }
}

class Engineering extends College {}
class NaturalScience extends College {}
class Humanities extends College {}

class Department {
	private String name;	// �а���
	private ArrayList<Student> studentList = new ArrayList<Student>();	// �Ҽ� �л� ����Ʈ
	private ArrayList<Lecture> lectureList = new ArrayList<Lecture>();	// �Ҽ� ���� ����Ʈ
	
	// Department ��ü ������
	public Department(String name) { this.name = name; }

	// �Ҽ� �л� ����Ʈ�� ��ȯ�ϴ� �޼ҵ�
	public ArrayList<Student> getStudentList() { return studentList; }
	
	// �Ҽ� �л� ����Ʈ���� �ش� index�� �̸��� ��ȯ�ϴ� �޼ҵ�
	public String getStudentListName(int index) { return studentList.get(index).getName(); }
	
	// �Ҽ� �л� ����Ʈ���� �ش� index�� �й��� ��ȯ�ϴ� �޼ҵ�
	public int getStudentListID(int index) { return studentList.get(index).getStudentID(); }
	
	// �ش� �а��� �Ҽӵ� �л��� �̸��� �й��� ����ϴ� �޼ҵ�
	public void printStudentList() {
		int i;
		System.out.print(name + "�� �Ҽ� �л� ��� : ");
		
		for(i = 0; i < studentList.size()-1; i++)
			System.out.print("(�̸�=" + getStudentListName(i) + ", studentID=" + getStudentListID(i) + "), ");
		System.out.println("(�̸�=" + getStudentListName(i) + ", studentID=" + getStudentListID(i) + ")");
	}
}

class Lecture {
	private String name;	// ���Ǹ�
	private int lectureID;	// ���� ��ȣ
	private Department department;	// �Ҽ� �а�
	private ArrayList<Student> studentList = new ArrayList<Student>();	// ���� �л� ����Ʈ
	
	// Lecture ��ü ������
	public Lecture(String name, int lectureID, Department department) {
		this.name = name;
		this.lectureID = lectureID;
		this.department = department;
	}
	
	// ���Ǹ��� ��ȯ�ϴ� �޼ҵ�
	public String getLectureName() { return name; }
	
	// ���� �л� ����Ʈ���� �ش� index�� �̸��� ��ȯ�ϴ� �޼ҵ�
	public String getStudentListName(int index) { return studentList.get(index).getName(); }
	
	// ���� �л� ����Ʈ���� �ش� index�� �й��� ��ȯ�ϴ� �޼ҵ�
	public int getStudentListID(int index) { return studentList.get(index).getStudentID(); }
	
	// �л��� ���Ǹ� ��û�ϴ� �޼ҵ� (���� ��û �Ⱓ, ���� ���� �Ⱓ)
	public void register(int status, Student student) {
		if(status == 0 || status == 1) {
			studentList.add(student);
			student.putLecture(this);
		}
	}
	
	// �л��� ���Ǹ� ����ϴ� �޼ҵ� (���� ���� �Ⱓ, ���� ��� �Ⱓ)
	public void drop(int status, Student student) {
		if(status == 1 || status == 2) {
			for(int i = 0; i < studentList.size(); i++)
				if (studentList.get(i).equals(student)) {
					studentList.remove(i);
					break;
				}
		}
	}
	
	// �ش� ���Ǹ� �����ϴ� �л��� �̸��� �й��� ����ϴ� �޼ҵ�
	public void printStudentList() {
		int i;
		System.out.print(name + "�� ���� �л� ��� : ");
		
		for(i = 0; i < studentList.size()-1; i++)
			System.out.print("(�̸�=" + getStudentListName(i) + ", studentID=" + getStudentListID(i) + "), ");
		System.out.println("(�̸�=" + getStudentListName(i) + ", studentID=" + getStudentListID(i) + ")");
	}
}

public class Test {

	public static void main(String[] args) {
		// ���� Ŭ���� �ʱ�ȭ
		Engineering engineering = new Engineering();
		NaturalScience naturalScience = new NaturalScience();
		Humanities humanities = new Humanities();
		
		// ���� ��ü ���� �� ���
		Department cs = new Department("ComputerScience");
		Department math = new Department("Mathematics");
		Department statistics = new Department("Statistics");
		Department korean = new Department("Korean");
		engineering.addDepartment(cs);
		naturalScience.addDepartment(math);
		naturalScience.addDepartment(statistics);
		humanities.addDepartment(korean);
		
		// �л�, ���� ��ü ����
		Student kim = new Student("��μ�", cs, 1);
		Student lee = new Student("������", math, 2);
		Student min = new Student("�κ���", statistics, 3);
		Student koo = new Student("����ö", math, 4);
		Professor profKim = new Professor("�赿��", cs, 1);
		Professor profPark = new Professor("��ǥ��", math, 2);
		
		// ���� ��ü ����
		Lecture basicMath = new Lecture("basicMath", 1, math);
		Lecture basicCS = new Lecture("basicCS", 2, cs);
		
		int status = 0;	// ���� ��û �Ⱓ : 0, ���� �Ⱓ : 1, ��� �Ⱓ : 2 
		basicMath.register(status, lee);
		basicMath.register(status, koo);
		basicMath.register(status, min);
		basicCS.register(status, kim);
		basicCS.register(status, min);
		
		status = 1;
		basicMath.drop(status, min);
		basicMath.register(status, kim);
		
		status = 2;
		basicMath.register(status, min); // ��ұⰣ���� ������û�� �Ұ����ؾ� �Ѵ�.(�۵� x)
		basicMath.drop(status, koo);
		
		kim.printLectureList();
		basicMath.printStudentList();
		math.printStudentList();
	}
}