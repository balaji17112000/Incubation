package db_task;

import java.util.Map;

import util.KeyException;

public class DbPojo {
	
	Db_operations dbObj =new Db_operations();
	
	public void setInsert(Object arr[]) throws KeyException {
		dbObj.insertTable(arr);
	}
	public void setUpdate(int id,String colName,Object value ) throws KeyException {
		dbObj.updateDetails(id, colName, value);
	}
	
	public Map getFirstNDetails(int n) throws KeyException {
		return dbObj.GetNDetails(n);
	}
	public Map getFirstNDetailsOrder(int n,String name) throws KeyException {
		return dbObj.GetNDetails(n,name);
	}
}
