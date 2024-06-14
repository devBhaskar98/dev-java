package Demos;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class StudentC {
	int rollno;
	String name;
	int age;

	StudentC(int rollno, String name, int age) {
		this.rollno = rollno;
		this.name = name;
		this.age = age;
	}

	public StudentC() {
		// TODO Auto-generated constructor stub
	}
}

class AgeComparator implements Comparator<Student> {
	@Override
	public int compare(Student o1, Student o2) {
		if (o1.age == o2.age) {
			return 0;
		} else if (o1.age > o2.age) {
			return 1;
		} else {
			return -1;
		}
	}
}

class NameComparator implements Comparator<Student> {
	@Override
	public int compare(Student s1, Student s2) {
		return s1.name.compareTo(s2.name);
	}
}

public class DemoComparator {

	public static void main(String[] args) {
		// Creating a list of students
		ArrayList<Student> al=new ArrayList<>();
		al.add(new Student(101,"Vijay",23));
		al.add(new Student(106,"Ajay",27));
		al.add(new Student(105,"Jai",21));

		System.out.println("Sorting by Name");
		//Using NameComparator to sort the elements
		Collections.sort(al,new NameComparator());
		//Traversing the elements of list
		for(Student st: al){
		System.out.println(st.rollno+" "+st.name+" "+st.age);
		}

		System.out.println("sorting by Age");
		//Using AgeComparator to sort the elements
		Collections.sort(al,new AgeComparator());
		//Travering the list again
		for(Student st: al){
			System.out.println(st.rollno+" "+st.name+" "+st.age);
		}

	}

}
