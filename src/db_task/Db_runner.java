package db_task;


import java.sql.SQLException;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.logging.Logger;

import taskrunners.RegExRunner;
import util.KeyException;

public class Db_runner {
	private static final Logger log = Logger.getLogger(RegExRunner.class.getName());
	private static Scanner sc = new Scanner(System.in); // done

	private static String getString(){
		log.info("Enter string:");
		String str = sc.nextLine();
		return str;
	}

	private static int getInt(){
		int num=0;
		log.info("Enter integer: ");
		try{
		 num= sc.nextInt();
		 }catch(InputMismatchException e){//
		 log.info("Invalid input");
		 }
		 sc.nextLine();
		return num;
	}
	private static long getLong(){
		long num=0;
		log.info("Enter integer: ");
		try{
		 num= sc.nextLong();
		 }catch(InputMismatchException e){//
		 log.info("Invalid input");
		 }
		 sc.nextLine();
		return num;
	}
	private static	Object[] getDetails() {
			Object objArr[]= new Object[5];
			log.info("Enter Emp ID to insert");
			objArr[0] = getInt();
			log.info("Enter Emp Name to insert");
			objArr[1]= getString();
			log.info("Enter Mobile Num to insert");
			objArr[2] = getLong();
			log.info("Enter Emp Email to insert");
			objArr[3] = getString();
			log.info("Enter Emp Department to insert");
			objArr[4]= getString();
			return objArr;
	}
	private static	Object[] getDepDetails() {
		Object objArr[]= new Object[5];
		log.info("Enter Emp ID to insert");
		objArr[0] = getInt();
		log.info("Enter Dependent Name to insert");
		objArr[1]= getString();
		log.info("Enter Dependent Age to insert");
		objArr[2] = getInt();
		log.info("Enter Relationship status to insert");
		objArr[3] = getString();

		return objArr;
}
	public static void main(String[] args) {
		String runAgain="Yes";
		do{ // done runAgain
			log.info("Enter between 1 - 13 to execute the Mysql Operation. 13 to Exit");
			Db_operations dbObj =new Db_operations();
			try{
				int questionNumber=getInt();
				switch(questionNumber){
				case 1:
					log.info("Enter table name to create");
					String tablename = getString();
					dbObj.createTable(tablename);
					break;
				case 2:
					log.info("Enter table Elements to add");
					log.info("Enter number of record to insert");
					int n = getInt();
					while(n!=0) {
						dbObj.insertTable(getDetails());
						n--;
					}
					break;
				case 3:
					log.info("Enter Emp name to show details of the employee");
					log.info(""+dbObj.nameGetDetails(getString()));
					break;
				case 4:
					log.info("Enter Emp id column name and new value to modify ");
					dbObj.updateDetails(getInt(),getString(),getString());
					log.info("Modified");
					break;
				case 5:
					log.info("Enter Number to show first N number of employee details" );
					log.info(""+dbObj.GetNDetails(getInt()));
					break;
				case 6:
					log.info("Enter Number and column name to show first N number of employee details" );
					log.info(""+dbObj.GetNDetails(getInt(),getString()));
					break;
				case 7:
					log.info("Enter Emp name to delete details of the employee");
					dbObj.deleteDetails(getString());
					log.info("Deleted");
					log.info(""+dbObj.GetNDetails(getInt()));
					break;
				case 8:
					log.info("Pojo class");
					break;
				case 9:
					log.info("Enter dependent table name to create table ");
					dbObj.createForeignTable(getString());
					log.info("Dependent table created");
					break;
				case 10:
					log.info("Enter dependent details to insert ");
					log.info("Enter number of record to insert");
					int n1 = getInt();
					while(n1!=0) {
						dbObj.insertDepTable(getDepDetails());
						n1--;
					}
					log.info("Dependent details inserted");
					break;
				case 11:
					log.info("Enter emp Id to display dependent details" );
					log.info(""+dbObj.fetchEmpFamilyDetails(getInt()));
					break;
				case 12:
					log.info("Enter Number and column name to show first N number of employee dependent details" );
					log.info(""+dbObj.GetNDetailsDep(getInt(),getString()));
					break;
				case 13:
					log.info("terminated");
					runAgain ="No";
					break;
				default:
					log.info("Enter number b/w 1-13 only");
					break;
				}
			}catch(KeyException |SQLException e){
				log.info(e.getMessage());
		}
	}while(runAgain.equalsIgnoreCase("Yes"));

}
//		Connection connect;
//		try {
//			connect = DriverManager.getConnection("jdbc:mysql://localhost/incubationDB", "root","Root@123");
//			Statement stmt = connect.createStatement();
//			String query1 = "CREATE TABLE EMPLOYEE"+"(EMPLOYEE_ID INTEGER NOT NULL,"+"NAME VARCHAR(30),"+"MOBILE BIGINT,"+"EMAIL VARCHAR(40),"+"DEPARTMENT VARCHAR(20),"+" PRIMARY KEY (EMPLOYEE_ID))";
//			stmt.execute(query1);
//			log.info("query executed");
//		} catch (SQLException e) {
//			e.printStackTrace();
//		}
		
}
