package serialization;

import java.io.Serializable;
import java.util.Map;

import org.json.simple.JSONObject;

import db_task.DbPojo;
import util.KeyException;



public class DbToJSON implements Serializable {

	static Map map;
	public DbToJSON(Map map){
		this.map = map;
	}
	public JSONObject mapToJson() {
		JSONObject obj = new JSONObject(map);
		obj.putAll(map);
		System.out.println(obj);
		return obj;
	}
	public static void main(String arg[]) throws KeyException {
		DbPojo dbObj = new DbPojo();
		System.out.println(dbObj.getFirstNDetails(2));
		DbToJSON obj = new DbToJSON(dbObj.getFirstNDetails(2));
		obj.mapToJson();
	}
	}