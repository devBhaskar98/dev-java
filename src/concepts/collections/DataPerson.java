package concepts.collections;

import java.util.ArrayList;
import java.util.List;

public class DataPerson {

	private int id;
	private String name;
	private String email;
	
	public DataPerson() {
		
	}
	
	public DataPerson(int id, String name, String email) {
		this.id = id;
		this.name = name;
		this.email = email;
	}
	
	
	public List<DataPerson> getPersonList(){
		
		List<DataPerson> dp = new ArrayList<DataPerson>();
		dp.add(new DataPerson(1, "Alex", "Alex@devProject.com"));
		dp.add(new DataPerson(2, "Bob", "Bob@devProject.com"));
		dp.add(new DataPerson(3, "Charles", "Charles@devProject.com"));
		
		return dp;
		
		
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	
	@Override
	public String toString() {
		return "DataPerson [id=" + id + ", name=" + name + ", email=" + email + "]";
	}
	
	
	
	
	
	
	
	
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//
//	}

}
