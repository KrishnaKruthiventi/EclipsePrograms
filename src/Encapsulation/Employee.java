package Encapsulation;

public class Employee {
	
	private int employeeId;
	private String name;
	private double salary;
	private String department;
	private static int nextId = 1;
	
	public Employee() {
		this.employeeId = nextId++;
	}
	
	public int getEmployeeId() {
		return employeeId;
	}
	
	public String getName() {
		return name;
	}
	
	public double getSalary() {
		return salary;
	}
	
	public String getDepartment() {
		return department;
	}
	
	public void setName(String name) {
		if(name != null && !name.isEmpty()) this.name = name;
	}
	
	public void setSalary(double salary) {
		if(salary >= 0) this.salary = salary;
		else System.out.println("Salary cannot be negative!");
	}
	
	public void setDepartment(String department) {
		if(department != null && !department.isEmpty()) this.department = department;
	}
	
	public void applyRaise(double percentage) {
		if(percentage > 0 && percentage <= 50) salary += salary * (percentage / 100);
		else System.out.println("Raise percentage must be between 0 and 50");
	}
	
	public String toString() {
		return "Employee ID: " + employeeId +
				"\nName: " + name +
				"\nSalary: $" + salary +
				"\nDepartment: " + department;
	}
}
