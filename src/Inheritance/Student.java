package Inheritance;

public class Student extends Person{
	int rollNo;
	
	Student(String name, int rollNo){
		super(name);
		this.rollNo = rollNo;
	}
	
	void display() {
		super.display();
		System.out.println("Roll No: " + rollNo);
	}
}
