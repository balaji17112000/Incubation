package db_task;

import util.KeyException;

public class DbPojo {
	
	Db_operations dbObj =new Db_operations();
	
	public void setInsert(Object arr[]) throws KeyException {
		dbObj.insertTable(arr);
	}
	public void setUpdate(int id,String colName,Object value ) throws KeyException {
		dbObj.updateDetails(id, colName, value);
	}
	
	public void getFirstNDetails(int n) throws KeyException {
		dbObj.GetNDetails(n);
	}
	public void getFirstNDetailsOrder(int n,String name) throws KeyException {
		dbObj.GetNDetails(n,name);
	}
}
