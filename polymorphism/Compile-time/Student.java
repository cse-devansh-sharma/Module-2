import java.lang.Object;
class Student extends Object{
	String name;
	char gender;
	String mailId;
	String dob;
	long contactNumber;
	Student(String name, char gender, String dob){
		super();
		this.name = name;
		this.gender = gender;
		this.dob = dob;
	}
	Student(String name, char gender, String dob, String mailId){
		this(name,gender,dob);
		this.mailId = mailId;
	}
	Student(String name, char gender, String dob, String mailId, long contactNumber){
		this(name,gender,dob,mailId);
		this.contactNumber = contactNumber;
	}
	public void displayStudentInfo(){
		System.out.println("Student info");
		System.out.println("-------------");
		System.out.println("Name : "+name);
		System.out.println("gender :  "+gender);
		System.out.println("mailId: "+mailId);
		System.out.println("dob : "+dob);
		System.out.println("contactNumber : "+contactNumber);
	}
}