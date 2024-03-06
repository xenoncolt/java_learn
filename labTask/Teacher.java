public class Teacher {
	private String name;
	private double salary;

	public Teacher() {

	}

	public Teacher(String text, double num) {
		setName(text);
		setSalary(num);
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setSalary(double salary) {
		this.salary = (salary < 0) ? -salary : salary;
	}

	public String getName() {
		return name;
	}
	
	public double getSalary() {
		return salary;
	}

	public void display() {
		System.out.println("Name : " + name);
		System.out.println("Salary : " + salary);
		System.out.println("-----------------------");
	}
}