class Sub extends Super{
	public String nsv="Sub";
	public void nsm(){
		System.out.println("Nsm () of sub class");
	}

	public void displaySubInfo(){
		System.out.println("sub class");
		System.out.println(this.nsv);
		this.nsm();
	}

	public void displaySuperInfo(){
		System.out.println("Super class");
		System.out.println(super.nsv);
		super.nsm();
	}
}