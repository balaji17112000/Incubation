package db_task;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

import com.mysql.cj.jdbc.result.ResultSetMetaData;

import util.KeyException;
public class Db_operations {
	Statement stmt;	
	Connection connect;
	public PreparedStatement getPreStatement(String query) throws KeyException {
		connectDb("incubationDB");
		try {
			PreparedStatement preparedStmt = connect.prepareStatement(query);
			return preparedStmt;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}
	public void connectDb(String db) throws KeyException {
		try {
			connect = DriverManager.getConnection("jdbc:mysql://localhost:3306/"+db, "root","Root@123");
		//	connect = DriverManager.getConnection("jdbc:mysql://localhost:3306/"+db+"?allowPublicKeyRetrieval=true&useSSL=false", "root","Root@123");
		//	System.out.println("DB connected");
		} catch (SQLException e) {
			throw new KeyException("Cannot able to connect to DB "+db+"\n"+e);
		}
	}
	public void createTable(String tablename) throws KeyException{
			connectDb("incubationDB");
		try {
			String query = "CREATE TABLE "+tablename+"(EMPLOYEE_ID INTEGER NOT NULL,"+"NAME VARCHAR(30),"+"MOBILE BIGINT,"+"EMAIL VARCHAR(40),"+"DEPARTMENT VARCHAR(20),"+" PRIMARY KEY (EMPLOYEE_ID))";
			stmt = connect.createStatement();
			stmt.execute(query);
	//		System.out.println("query executed");
		} catch (SQLException e) {
			throw new KeyException("Cannot create table"+e.getMessage());
		}
	}
	public void insertTable(Object arr[]) throws KeyException{
	//	System.out.println(Arrays.toString(arr));
		try {
				String query ="INSERT INTO EMPLOYEE values(?,?,?,?,?)";
				PreparedStatement preparedStmt = getPreStatement(query);
				//String query ="INSERT INTO EMPLOYEE VALUES ("+(int) arr[0]+",'"+(String) arr[1]+"',"+(long) arr[2]+",'"+(String) arr[3]+"','"+(String) arr[4]+"')";		
				preparedStmt.setInt(1, (int) arr[0]);
				preparedStmt.setString(2, (String) arr[1]);
				preparedStmt.setLong(3, (long) arr[2]);
				preparedStmt.setString(4, (String) arr[3]);
				preparedStmt.setString(5, (String) arr[4]);
				preparedStmt.execute();
				//System.out.println("##########Query: "+query);
				//stmt.execute(query);
		} catch (SQLException e) {
			throw new KeyException("Cannot able to insert values"+e);
		}
	}
	public Map<Object,Object> nameGetDetails(String name) throws KeyException {
		String query= "SELECT * FROM EMPLOYEE WHERE NAME ="+"'"+name+"'";
		return getDetails(query);
	}
	public Map<Object,Object> GetNDetails(int n) throws KeyException {
		String query= String.format("SELECT * FROM EMPLOYEE LIMIT %d",n);
		return getDetails(query);
	}
	public Map<Object,Object> GetNDetails(int n, String name) throws KeyException {
		String query= String.format("SELECT * FROM EMPLOYEE ORDER BY %s LIMIT %d",name,n);
		return getDetails(query);
	}
	public void updateDetails(int id,String colName,Object value) throws KeyException {
		String query= "UPDATE EMPLOYEE SET "+colName+"=? WHERE EMPLOYEE_ID =?";
		PreparedStatement preparedStmt= getPreStatement(query);
		try {
			preparedStmt.setObject(1,(String) value);
			preparedStmt.setInt(2, id);
			preparedStmt.execute();
		} catch (SQLException e) {
			throw new KeyException("Can't delete record"+e);
		}
	}
	public void deleteDetails(String name) throws KeyException {
		String query= "DELETE FROM EMPLOYEE WHERE NAME = '"+name+"'";
		PreparedStatement stmt= getPreStatement(query);
		try {
			stmt.execute();
		} catch (SQLException e) {
			throw new KeyException("Can't delete record"+e);
		}
	}
	public Map<Object,Object> getDetails(String query) throws KeyException {
		try {
			PreparedStatement preparedStmt = getPreStatement(query);
			ResultSet result  = preparedStmt.executeQuery(query);
			return setToMap(result);
		} catch (SQLException e) {
			throw new KeyException("Can't able to select values"+e);
		}
	}
	public Map<Object, Object> setToMap(ResultSet result) throws KeyException {
		Map<Object,Object> map2 = new HashMap<Object,Object>(10);
		try {
			ResultSetMetaData rsmd = (ResultSetMetaData) result.getMetaData();
			int columnsNumber = rsmd.getColumnCount();
			while (result.next()) { // row wise iterate 
				Map<Object,Object> map = new HashMap<Object,Object>(10);
			    for (int i = 1; i <= columnsNumber; i++) {
			        String columnValue = result.getString(i);
			        map.put(rsmd.getColumnLabel(i), columnValue);
			    }
			    map2.put(map.get("EMPLOYEE_ID"),map); // map of map for avoiding key duplication
			}
		}catch(Exception e) {
			throw new KeyException("Cannot change Result set to Map"+e);
		}
		return map2;
	}
	
	public void createForeignTable(String table) throws KeyException, SQLException {
		connectDb("incubationDB");
		String query = "CREATE TABLE "+table+"(EMP_ID INTEGER NOT NULL, NAME VARCHAR(20),AGE INTEGER, RELATIONSHIP VARCHAR(20),FOREIGN KEY(EMP_ID) REFERENCES EMPLOYEE(EMPLOYEE_ID) )";
		PreparedStatement preparedStmt= getPreStatement(query);
		preparedStmt.execute();
	}
	public void insertDepTable(Object arr[]) throws KeyException{
		try {
				String query ="INSERT INTO EMP_DEPENDENT values(?,?,?,?)";
				PreparedStatement preparedStmt = getPreStatement(query);
				preparedStmt.setInt(1, (int) arr[0]);
				preparedStmt.setString(2, (String) arr[1]);
				preparedStmt.setInt(3, (int) arr[2]);
				preparedStmt.setString(4, (String) arr[3]);
				preparedStmt.execute();
		} catch (SQLException e) {
			throw new KeyException("Cannot able to insert values"+e);
		}
	}
	public	Map<Object,Object> fetchEmpFamilyDetails(int id) throws KeyException, SQLException {
		String query = " SELECT emp.EMPLOYEE_ID Employee_ID, emp.Name Employee_Name, dep.NAME Dependent_Name, dep.RELATIONSHIP RELATIONSHIP, dep.AGE Dependent_Age from EMP_DEPENDENT dep join EMPLOYEE emp ON dep.EMP_ID = emp.EMPLOYEE_ID where emp.EMPLOYEE_ID ="+id;
		return getDetails(query);
	}
	public Map<Object,Object> GetNDetailsDep(int n, String name) throws KeyException {
		String query= String.format("SELECT emp.EMPLOYEE_ID Employee_ID, emp.Name Employee_Name, dep.NAME Dependent_Name, dep.RELATIONSHIP RELATIONSHIP, dep.AGE Dependent_Age from EMP_DEPENDENT dep join EMPLOYEE emp ON dep.EMP_ID = emp.EMPLOYEE_ID ORDER BY emp.%s LIMIT %d",name,n);
		return getDetails(query);
	}
}
	
