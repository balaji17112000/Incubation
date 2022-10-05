package db_task;


import java.sql.SQLException;
import java.util.InputMismatchException;
import java.util.Scanner;

import util.KeyException;

public class Db_runner {
	
	private static Scanner sc = new Scanner(System.in); // done

	private static String getString(){
		System.out.println("Enter string:");
		String str = sc.nextLine();
		return str;
	}

	private static int getInt(){
		int num=0;
		System.out.println("Enter integer: ");
		try{
		 num= sc.nextInt();
		 }catch(InputMismatchException e){//
		 System.out.println("Invalid input");
		 }
		 sc.nextLine();
		return num;
	}
	private static long getLong(){
		long num=0;
		System.out.println("Enter integer: ");
		try{
		 num= sc.nextLong();
		 }catch(InputMismatchException e){//
		 System.out.println("Invalid input");
		 }
		 sc.nextLine();
		return num;
	}
	private static	Object[] getDetails() {
			Object objArr[]= new Object[5];
			System.out.println("Enter Emp ID to insert");
			objArr[0] = getInt();
			System.out.println("Enter Emp Name to insert");
			objArr[1]= getString();
			System.out.println("Enter Mobile Num to insert");
			objArr[2] = getLong();
			System.out.println("Enter Emp Email to insert");
			objArr[3] = getString();
			System.out.println("Enter Emp Department to insert");
			objArr[4]= getString();
			return objArr;
	}
	private static	Object[] getDepDetails() {
		Object objArr[]= new Object[5];
		System.out.println("Enter Emp ID to insert");
		objArr[0] = getInt();
		System.out.println("Enter Dependent Name to insert");
		objArr[1]= getString();
		System.out.println("Enter Dependent Age to insert");
		objArr[2] = getInt();
		System.out.println("Enter Relationship status to insert");
		objArr[3] = getString();

		return objArr;
}
	public static void main(String[] args) {
		String runAgain="Yes";
		do{ // done runAgain
			System.out.println("Enter between 1 - 13 to execute the Mysql Operation. 13 to Exit");
			Db_operations dbObj =new Db_operations();
			try{
				int questionNumber=getInt();
				switch(questionNumber){
				case 1:
					System.out.println("Enter table name to create");
					String tablename = getString();
					dbObj.createTable(tablename);
					break;
				case 2:
					System.out.println("Enter table Elements to add");
					System.out.println("Enter number of record to insert");
					int n = getInt();
					while(n!=0) {
						dbObj.insertTable(getDetails());
						n--;
					}
					break;
				case 3:
					System.out.println("Enter Emp name to show details of the employee");
					System.out.println(dbObj.nameGetDetails(getString()));
					break;
				case 4:
					System.out.println("Enter Emp id column name and new value to modify ");
					dbObj.updateDetails(getInt(),getString(),getString());
					System.out.println("Modified");
					break;
				case 5:
					System.out.println("Enter Number to show first N number of employee details" );
					System.out.println(dbObj.GetNDetails(getInt()));
					break;
				case 6:
					System.out.println("Enter Number and column name to show first N number of employee details" );
					System.out.println(dbObj.GetNDetails(getInt(),getString()));
					break;
				case 7:
					System.out.println("Enter Emp name to delete details of the employee");
					dbObj.deleteDetails(getString());
					System.out.println("Deleted");
					System.out.println(dbObj.GetNDetails(getInt()));
					break;
				case 8:
					System.out.println("Pojo class");
					break;
				case 9:
					System.out.println("Enter dependent table name to create table ");
					dbObj.createForeignTable(getString());
					System.out.println("Dependent table created");
					break;
				case 10:
					System.out.println("Enter dependent details to insert ");
					System.out.println("Enter number of record to insert");
					int n1 = getInt();
					while(n1!=0) {
						dbObj.insertDepTable(getDepDetails());
						n1--;
					}
					System.out.println("Dependent details inserted");
					break;
				case 11:
					System.out.println("Enter emp Id to display dependent details" );
					System.out.println(dbObj.fetchEmpFamilyDetails(getInt()));
					break;
				case 12:
					System.out.println("Enter Number and column name to show first N number of employee dependent details" );
					System.out.println(dbObj.GetNDetailsDep(getInt(),getString()));
					break;
				case 13:
					System.out.println("terminated");
					runAgain ="No";
					break;
				default:
					System.out.println("Enter number b/w 1-13 only");
					break;
				}
			}catch(KeyException |SQLException e){
				System.out.println(e.getMessage());
		}
	}while(runAgain.equalsIgnoreCase("Yes"));

}
//		Connection connect;
//		try {
//			connect = DriverManager.getConnection("jdbc:mysql://localhost/incubationDB", "root","Root@123");
//			Statement stmt = connect.createStatement();
//			String query1 = "CREATE TABLE EMPLOYEE"+"(EMPLOYEE_ID INTEGER NOT NULL,"+"NAME VARCHAR(30),"+"MOBILE BIGINT,"+"EMAIL VARCHAR(40),"+"DEPARTMENT VARCHAR(20),"+" PRIMARY KEY (EMPLOYEE_ID))";
//			stmt.execute(query1);
//			System.out.println("query executed");
//		} catch (SQLException e) {
//			e.printStackTrace();
//		}
		
}
