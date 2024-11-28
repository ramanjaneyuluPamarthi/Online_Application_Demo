package p1;

public class Learningjavaclass {
	public class Employee {

	    // Instance variables
	    private String name;
	    private int age;
	    private double salary;

	    // Non-parameterized constructor
	    public Employee() {
	        this.name = "Unknown";
	        this.age = 0;
	        this.salary = 0.0;
	    }

	    // Parameterized constructor
	    public Employee(String name, int age, double salary) {
	        this.name = name;
	        this.age = age;
	        this.salary = salary;
	    }

	    // Non-parameterized method with no return type
	    public void printEmployeeDetails() {
	        System.out.println("Employee Name: " + name);
	        System.out.println("Employee Age: " + age);
	        System.out.println("Employee Salary: " + salary);
	    }

	    // Parameterized method with no return type
	    public void setSalary(double salary) {
	        this.salary = salary;
	    }

	    // Non-parameterized method with a return type
	    public String getName() {
	        return name;
	    }

	    // Parameterized method with a return type
	    public double calculateAnnualSalary(double bonus) {
	        return salary * 12 + bonus;
	    }

	    public static void main(String[] args) {
	        // Using non-parameterized constructor
	        Employee emp1 = new Employee();
	        emp1.printEmployeeDetails();

	        // Using parameterized constructor
	        Employee emp2 = new Employee("John Doe", 30, 5000);
	        emp2.printEmployeeDetails();

	        // Using parameterized method with no return type
	        emp2.setSalary(5500);

	        // Using method with a return type and storing the returned value
	        double annualSalary = emp2.calculateAnnualSalary(2000);  // Returns annual salary with bonus
	        System.out.println("Annual Salary with Bonus: " + annualSalary);  // Using the returned value
	    }
	}

}
