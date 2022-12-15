package Members;

public class Main {

	public static void main(String[] args) {
		Employee emp = new Employee("sid",22,"8810529965","New Ashok Nagar",554588.9,"IT");
		// instance of Manager class
		Manager mng = new Manager("Atul",25,"8810529965","New Delhi",887799.99,"Marketing");
		// now print the salary
		emp.printSalary();
		mng.printSalary();

	}

}
