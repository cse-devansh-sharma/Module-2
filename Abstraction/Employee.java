abstract class Employee{
	int id;
	String name;
	String mailId;
	long contactNumber;

	Employee(int id, String name, String mailId, long contactNumber){
		this.id=id;
		this.name=name;
		this.mailId=mailId;
		this.contactNumber=contactNumber;
	}

	static String city;
	static String state;
	static String country;

	public void entry(){
		System.out.println("Employee entered in campus");
	}

	public void login(){
		System.out.println("Employee loggen in the office");
	}

	public void meeting(){
		System.out.println("Employee is in the meeting");
	}

	public abstract void reverseKT();
	public abstract void task();
	public abstract void EmployeeInfo();

	public void logout(){
		System.out.println("Employee logged out from the office");
	}

	public void exit(){
		System.out.println("Employee exited from the campus");
	}
}