class SoftwareDeveloper extends Employee{
	String designation;
	double salary;
	String role;
	double incentive;

	static String branch;
	static String department;
	static String company;

	static{
		city="Jalandhar";
		state="Punjab";
		country="India";
		branch="Amritsar";
		department="Software Developement";
		company="Capgemini";
	}

	SoftwareDeveloper(int id, String name, String mailId, long contactNumber, String designation, double salary, String role, double incentive){
		super(id,name,mailId,contactNumber);
		this.designation=designation;
		this.salary=salary;
		this.role=role;
		this.incentive=incentive;
	}

	@Override
	public void reverseKT(){
		System.out.println("Explanation about the latest Software Developement Tools");
	}

	@Override
	public void task(){
		System.out.println("S/w Developement");
	}

	@Override
	public void EmployeeInfo(){
		System.out.println("Employee Info---");
		System.out.println("-----------------");
		System.out.println("Id: "+super.id);
		System.out.println("Name: "+super.name);
		System.out.println("Designation: "+designation);
		System.out.println("Salary: "+salary);

	}
}