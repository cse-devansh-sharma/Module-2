class Employee{
	int id;
	String name;
	long contactNumber;
	String mailId;

	Employee(int id,String name,long contactNumber,String mailId){
		this.id=id;
		this.name=name;
		this.contactNumber=contactNumber;
		this.mailId=mailId;
	}

	public int getId(){
		return id;
	}

	public void setId(int id){
		this.id=id;
	}

	public String getName(){
		return name;
	}

	public void setName(String name){
		this.name=name;
	}

	public long getContactNumber(){
		return contactNumber;
	}
	public void setContactNumber(long contactNumber){
		this.contactNumber=contactNumber;
	}
	public String getMailId(){

		return mailId;
	}
	public void setMailId(String mailId){
		this.mailId=mailId;
	}

	public void displayDetails(){
		System.out.println(name);
		System.out.println(id);
		System.out.println(contactNumber);
		System.out.println(mailId);
	}
}	