import java.util.ArrayList;

import org.w3c.dom.NameList;

class Person{
	String name;
	String tel;
	
	public Person(String name, String tel) {
		this.name=name;
		this.tel=tel;
	}
};

public class ArrayListTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Person> list=new ArrayList<Person>();
		list.add(new Person("ȫ�浿", "01012345678"));
		list.add(new Person("������", "01012345679"));
		list.add(new Person("���ڿ�", "01012345670"));
		list.add(new Person("�迵��", "01012345671"));
		
		for(Person obj:list)
			System.out.println("(" + obj.name + "," + obj.tel + ")");

	}

}
