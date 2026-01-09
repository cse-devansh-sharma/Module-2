class Employee {
	int id;
	String name;
	String mailId;
	long contactNumber;

	static String city;
	static String state;
	static String country;
	

	public static void entry() {
		System.out.println("Employee entered into the campus");
	}
	public static void login() {
		System.out.println("Employee logged into the office");
	}
	public static void shortBreak() {
		System.out.println("Employee went for tea");
	}
	public static void meeting() {
		System.out.println("Employee is in meeting");
	}
	public static void longBreak() {
		System.out.println("Employee went for lunch");
	}
	public static void logout() {
		System.out.println("Employee logged out from the office");
	}
	public static void exit() {
		System.out.println("Employee exited from the campus");
	}

}