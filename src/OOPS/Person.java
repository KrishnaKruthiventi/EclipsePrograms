package OOPS;

public class Person {
	
	String name;
	int age;
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public Person(Person original) {
		this.name = original.name;
		this.age = original.age;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person person1 = new Person("Bob", 25);
		Person person2 = new Person(person1);
		
		System.out.println("Person 1: " + person1.name + ", " + person1.age);
		System.out.println("Person 2: " + person2.name + ", " + person2.age);
		
		person1.name = "Robert";
		System.out.println("\nAfter Modification:");
		System.out.println("Person 1: " + person1.name + ", " + person1.age);
		System.out.println("Person 2: " + person2.name + ", " + person2.age);
	}

}
