import java.util.*;

abstract class Person {
	private String name;	// 이름
	private Department department;	// 학부
	private ArrayList<Lecture> lectureList = new ArrayList<Lecture>();	// 강의 리스트
	
	// Person 객체 생성자
	public Person (String name, Department department) {
		this.name = name;
		this.department = department;
	}	
	
	// 이름을 반환하는 메소드
	public String getName() { return name; }
	
	// 학부를 반환하는 메소드
	public Department getDepartment() { return department; }
	
	// 강의 리스트를 반환하는 메소드
	public ArrayList<Lecture> getLectureList(){ return lectureList; }
	
	// Student와 Professor의 강의 리스트를 관리하는 추상 메소드
	public abstract void putLecture(Lecture lecture);	
}

class Student extends Person {
	private int studentID;	// 학번
	
	// Student 객체 생성자
	public Student(String name, Department department, int studentID) {
		super(name, department);
		this.studentID = studentID;
	}	
	
	// 강의 리스트를 관리하는 추상 메소드 재정의
	@Override
	public void putLecture(Lecture lecture) {
		getLectureList().add(lecture);
		getDepartment().getStudentList().add(this);
	}	
	
	// 강의 리스트에서 해당 index의 강의명을 반환하는 메소드
	public String getLectureName(int index) { return getLectureList().get(index).getLectureName(); }	
	
	// 학번을 반환하는 메소드
	public int getStudentID() { return studentID; }
	
	// 해당 학생이 수강하는 강의 리스트를 출력하는 메소드
	public void printLectureList() {
		int i;
		System.out.print(getName() + "의 수강 목록 : ");
		
		for(i = 0; i < getLectureList().size()-1; i++)
			System.out.print(getLectureName(i) + ", ");
		System.out.println(getLectureName(i));
	}
}

class Professor extends Person {
	private int professor_id;	// 교수번호
	
	// Professor 객체 생성자
	public Professor(String name, Department department, int professor_id) {
		super(name, department);
		this.professor_id = professor_id;
	}	
	
	// 지도하는 강의 리스트를 관리하는 추상 메소드 재정의
	@Override
	public void putLecture(Lecture lecture) { getLectureList().add(lecture); }	
}

class College {
	private ArrayList<Department> departmentList = new ArrayList<Department>();	// 소속 학과 리스트
	
	// 단과대학 별 소속 학과 리스트에 학과를 추가하는 메소드
	public void addDepartment(Department department) { departmentList.add(department); }
}

class Engineering extends College {}
class NaturalScience extends College {}
class Humanities extends College {}

class Department {
	private String name;	// 학과명
	private ArrayList<Student> studentList = new ArrayList<Student>();	// 소속 학생 리스트
	private ArrayList<Lecture> lectureList = new ArrayList<Lecture>();	// 소속 강의 리스트
	
	// Department 객체 생성자
	public Department(String name) { this.name = name; }

	// 소속 학생 리스트를 반환하는 메소드
	public ArrayList<Student> getStudentList() { return studentList; }
	
	// 소속 학생 리스트에서 해당 index의 이름을 반환하는 메소드
	public String getStudentListName(int index) { return studentList.get(index).getName(); }
	
	// 소속 학생 리스트에서 해당 index의 학번을 반환하는 메소드
	public int getStudentListID(int index) { return studentList.get(index).getStudentID(); }
	
	// 해당 학과에 소속된 학생의 이름과 학번을 출력하는 메소드
	public void printStudentList() {
		int i;
		System.out.print(name + "의 소속 학생 목록 : ");
		
		for(i = 0; i < studentList.size()-1; i++)
			System.out.print("(이름=" + getStudentListName(i) + ", studentID=" + getStudentListID(i) + "), ");
		System.out.println("(이름=" + getStudentListName(i) + ", studentID=" + getStudentListID(i) + ")");
	}
}

class Lecture {
	private String name;	// 강의명
	private int lectureID;	// 강의 번호
	private Department department;	// 소속 학과
	private ArrayList<Student> studentList = new ArrayList<Student>();	// 수강 학생 리스트
	
	// Lecture 객체 생성자
	public Lecture(String name, int lectureID, Department department) {
		this.name = name;
		this.lectureID = lectureID;
		this.department = department;
	}
	
	// 강의명을 반환하는 메소드
	public String getLectureName() { return name; }
	
	// 수강 학생 리스트에서 해당 index의 이름을 반환하는 메소드
	public String getStudentListName(int index) { return studentList.get(index).getName(); }
	
	// 수강 학생 리스트에서 해당 index의 학번을 반환하는 메소드
	public int getStudentListID(int index) { return studentList.get(index).getStudentID(); }
	
	// 학생이 강의를 신청하는 메소드 (수강 신청 기간, 수강 정정 기간)
	public void register(int status, Student student) {
		if(status == 0 || status == 1) {
			studentList.add(student);
			student.putLecture(this);
		}
	}
	
	// 학생이 강의를 취소하는 메소드 (수강 정정 기간, 수강 취소 기간)
	public void drop(int status, Student student) {
		if(status == 1 || status == 2) {
			for(int i = 0; i < studentList.size(); i++)
				if (studentList.get(i).equals(student)) {
					studentList.remove(i);
					break;
				}
		}
	}
	
	// 해당 강의를 수강하는 학생의 이름과 학번을 출력하는 메소드
	public void printStudentList() {
		int i;
		System.out.print(name + "의 수강 학생 목록 : ");
		
		for(i = 0; i < studentList.size()-1; i++)
			System.out.print("(이름=" + getStudentListName(i) + ", studentID=" + getStudentListID(i) + "), ");
		System.out.println("(이름=" + getStudentListName(i) + ", studentID=" + getStudentListID(i) + ")");
	}
}

public class Test {

	public static void main(String[] args) {
		// 대학 클래스 초기화
		Engineering engineering = new Engineering();
		NaturalScience naturalScience = new NaturalScience();
		Humanities humanities = new Humanities();
		
		// 전공 객체 생성 및 등록
		Department cs = new Department("ComputerScience");
		Department math = new Department("Mathematics");
		Department statistics = new Department("Statistics");
		Department korean = new Department("Korean");
		engineering.addDepartment(cs);
		naturalScience.addDepartment(math);
		naturalScience.addDepartment(statistics);
		humanities.addDepartment(korean);
		
		// 학생, 교수 객체 생성
		Student kim = new Student("김민수", cs, 1);
		Student lee = new Student("이지영", math, 2);
		Student min = new Student("민병언", statistics, 3);
		Student koo = new Student("구자철", math, 4);
		Professor profKim = new Professor("김동욱", cs, 1);
		Professor profPark = new Professor("박표주", math, 2);
		
		// 강의 객체 생성
		Lecture basicMath = new Lecture("basicMath", 1, math);
		Lecture basicCS = new Lecture("basicCS", 2, cs);
		
		int status = 0;	// 수강 신청 기간 : 0, 정정 기간 : 1, 취소 기간 : 2 
		basicMath.register(status, lee);
		basicMath.register(status, koo);
		basicMath.register(status, min);
		basicCS.register(status, kim);
		basicCS.register(status, min);
		
		status = 1;
		basicMath.drop(status, min);
		basicMath.register(status, kim);
		
		status = 2;
		basicMath.register(status, min); // 취소기간에는 수강신청이 불가능해야 한다.(작동 x)
		basicMath.drop(status, koo);
		
		kim.printLectureList();
		basicMath.printStudentList();
		math.printStudentList();
	}
}