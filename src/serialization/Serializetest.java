package serialization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import db_task.DbPojo;
import util.KeyException;

public class Serializetest {
	private static ObjectOutputStream file(String path) throws IOException {
		return new ObjectOutputStream(new FileOutputStream(path));
	}
	public static void main(String[] args) throws KeyException, IOException {
		DbPojo dbObj = new DbPojo();
		DbToJSON jsonObj =new DbToJSON(dbObj.getFirstNDetails(2));
		ObjectOutputStream file = file("dbToJson.ser");	
		file.writeObject(jsonObj);
		jsonObj = null;
		try(ObjectInputStream inp = new ObjectInputStream(new FileInputStream("dbToJson.ser"))){
			jsonObj = (DbToJSON) inp.readObject();
			System.out.println(jsonObj.mapToJson());
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
}
