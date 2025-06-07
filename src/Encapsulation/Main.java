package Encapsulation;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Student student = new Student();
//		
//		student.setName("Alice");
//		student.setAge(20);
//		student.setId("STU12345");
//		
//		System.out.println("Student Name: " + student.getName());
//		System.out.println("Student Age: " + student.getAge());
//		System.out.println("Student ID: " + student.getId());
//		
//		student.setAge(-5);
//		student.setId("123");
//		
//		BankAccount account = new BankAccount("12345678", "John Doe", "secret123");
//		
//		account.deposit(1000, "secret123");
//		account.withdraw(200, "wrongpass");
//		account.withdraw(200, "secret123");
//		
//		System.out.println("Account Holder: " + account.getAccountHolder());
//		System.out.println("Current Balance: " + account.getBalance("secret123"));
		
//		Employee emp1 = new Employee();
//		Employee emp2 = new Employee();
//		
//		
//		emp1.setName("Alice Johnson");
//		emp1.setSalary(50000);
//		emp1.setDepartment("Engineering");
//		
//		emp2.setName("Bob Smith");
//		emp2.setSalary(45000);
//		emp2.setDepartment("Marketing");
//		
//		System.out.println(emp1.getName());
//		System.out.println(emp1.getEmployeeId());
//		System.out.println(emp1.getSalary());
//		System.out.println(emp1.getDepartment());
//		
//		System.out.println(emp2.getName());
//		System.out.println(emp2.getEmployeeId());
//		System.out.println(emp2.getSalary());
//		System.out.println(emp2.getDepartment());
//		
//		
//		emp1.applyRaise(10);
//		emp2.setSalary(-5000);
//		emp2.setDepartment("Sales");
//		
//		System.out.println("Employee 1 Details");
//		System.out.println(emp1);
//		
//		System.out.println("\nEmployee 2 Details");
//		System.out.println(emp2);
		
		Temperature temp1 = new Temperature(25, 'c');
		System.out.println("Initial Temperature (25C):");
		System.out.println(temp1);
		
		temp1.setTemperature(77, 'f');
		System.out.println("\nAfter setting to 77F:");
		System.out.println(temp1);
		
		temp1.setTemperature(300, 'k');
		System.out.println("\nAfter setting to 300K:");
		System.out.println(temp1);
		
		temp1.setTemperature(-500, 'x');
		
	}

}
