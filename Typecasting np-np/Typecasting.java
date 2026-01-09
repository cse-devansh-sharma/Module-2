class Typecasting{
	public static void upcastingDowncasting(){
		Employee employee;
		employee =new SoftwareDeveloper();

		employee.entry();
		employee.login();
		employee.shortBreak();
		employee.meeting();
		employee.longBreak();
		employee.logout();
		employee.exit();

		SoftwareDeveloper softwareDeveloper=(SoftwareDeveloper) employee;
		softwareDeveloper.displaySoftwareDeveloperInfo();

		employee.entry();
		employee.login();

		employee =new SoftwareTester();


		SoftwareTester softwareTester =(SoftwareTester)employee;
		softwareTester.displaySoftwareTesterInfo();
	}
}