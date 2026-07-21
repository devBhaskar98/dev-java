package concepts.collections;

import java.util.HashMap;
import java.util.Map;

class Book {
	int id;
	String name, author, publisher;
	int quantity;

	public Book(int id, String name, String author, String publisher, int quantity) {
		this.id = id;
		this.name = name;
		this.author = author;
		this.publisher = publisher;
		this.quantity = quantity;
	}
}

class Student {
	int id;
	String name;
	
	public Student(int id, String name) {
		this.id	= id;
		this.name = name;
	}
}

public class DemoHashMap {
	public static void main(String[] args) {
		// Creating map of Books

		Map<Integer, Book> map = new HashMap<>();
		Map<Integer, Student> studentMap = new HashMap<>();

		// Creating Books
		Book b1 = new Book(101, "Let us C", "Yashwant Kanetkar", "BPB", 8);
		Book b2 = new Book(102, "Data Communications & Networking", "Forouzan", "Mc Graw Hill", 4);
		Book b3 = new Book(103, "Operating System", "Galvin", "Wiley", 6);
		
		
		// creating students
		Student s1 = new Student(1,"Alex");
		
		
		// Adding Books to map
		map.put(1, b1);
		map.put(2, b2);
		map.put(3, b3);
		
		// Adding Student to Map
		studentMap.put(1, s1);

		// Traversing Map
		for(Map.Entry<Integer, Book> entry : map.entrySet()) {
			int key = entry.getKey();
			Book b = entry.getValue();
			System.out.println(key + " Details:");
			System.out.println(b.id + " " + b.name + " " + b.author + " " + b.publisher + " " + b.quantity);
		}
		
		
		// Traversing map for Students
		for(Map.Entry<Integer, Student> entry: studentMap.entrySet()) {
			int key = entry.getKey();
			Student s = entry.getValue();
			System.out.println("Student details>>" + key);
			System.out.println("name" + s.name);
		}
	}
}