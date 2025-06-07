package Encapsulation;

public class Student {
	
	private String name;
	private int age;
	private String id;
	
	public String getName() {
		return name;
	}
	
	public int getAge() {
		return age;
	}
	
	public String getId() {
		return id;
	}
	
	public void setName(String name) {
		if(name != null && !name.isEmpty()) this.name = name; 
		else System.out.println("Invalid name");
	}
	
	public void setAge(int age) {
		if(age > 0 && age < 120) this.age = age;
		else System.out.println("Invalid age!");
	}
	
	public void setId(String id) {
		if(id != null && id.length() == 8) this.id = id;
		else System.out.println("ID must be 8 characters long");
	}
}
