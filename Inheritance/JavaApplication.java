class JavaApplication{
	public static void execution(){
		Oracle oracle =new Oracle();
		oracle.url = "www.oracledb.com";
		oracle.username="raja";
		oracle.password="raja@2234";
		oracle.displayOracleDBInfo();
		oracle.connection();
		oracle.disconnection();
		oracle.crudOperations();

		MySQL mySQL = new MySQL();
		mySQL.url="www.mySQLdb.com";
		mySQL.username="rani";
		mySQL.password="rani@2234";
		mySQL.displayMySQLDBInfo();
		mySQL.connection();
		mySQL.disconnection();
		mySQL.crudOperations();

	}
}