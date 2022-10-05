package taskrunners;

import java.util.*;
import java.util.logging.Logger;

import file_system.DateTimeRunner;
import operations.HashMapOperations;
import util.KeyException;

public class HashMapTester {
	private static final Logger log = Logger.getLogger(DateTimeRunner.class.getName());
	static Scanner sc = new Scanner(System.in);
	
	String getString(){
		log.info("Enter string:");
		String str = sc.nextLine();
		return str;
	}
	 char getChar(){
		log.info("Enter a character: ");
		return sc.next().charAt(0);
	}
	Integer getInt(){
		int num=0;
		log.info("Enter integer: ");
		try{
		 num= sc.nextInt();
		 }catch(Exception e){
		 log.info("Invalid input");
		 }
		 sc.nextLine();
		return num;
	}
public static void main(String[] args) {
	String runAgain;
	do{
		log.info("Enter between 1 - 20 to execute the HashMap Operation");
		try{
			HashMapTester tester = new HashMapTester();
			HashMapOperations operator = new HashMapOperations();
			Map<Object, Object> hash = operator.getHash();
			Map<Object, Object> hash2 = operator.getHash();
			int questionNumber= tester.getInt();
			switch(questionNumber){
			case 1:
				log.info(hash+" is the hash and length of hash is "+operator.getLength(hash));
				break;
			case 2:
				hash.put(tester.getString(),tester.getString());
				hash.put(tester.getString(),tester.getString());
				hash.put(tester.getString(),tester.getString());
				log.info(hash+" is the hash and length of hash is "+operator.getLength(hash));
				break;
			case 3:
				hash.put(tester.getInt(),tester.getInt());
				hash.put(tester.getInt(),tester.getInt());
				hash.put(tester.getInt(),tester.getInt());
				log.info(hash+" is the hash and length of hash is "+operator.getLength(hash));
				break;
			case 4:
				hash.put(tester.getString(),tester.getInt());
				hash.put(tester.getString(),tester.getInt());
				hash.put(tester.getString(),tester.getInt());
				log.info(hash+" is the hash and length of hash is "+operator.getLength(hash));
				break;
			case 5:
				hash.put(tester.getString(),tester.getInt());
				hash.put(tester.getString(),tester.getInt());
				hash.put(tester.getString(),tester.getInt());
				log.info(hash+" is the hash and length of hash is "+operator.getLength(hash));
				break;
			case 6:
				Map<Object, HashMapOperations> hash1 = operator.getHash();
				hash1.put(tester.getString(),operator);
				hash1.put(tester.getString(),operator);
				hash1.put(tester.getString(),operator);
				log.info(hash1+" is the hash and length of hash is "+operator.getLength(hash1));
				break;
			case 7:
				hash.put(null,tester.getInt());
				log.info(hash+" is the hash and length of hash is "+operator.getLength(hash));
				break;
			case 8:
				hash.put(tester.getString(),tester.getInt());
				hash.put(tester.getString(),tester.getInt());
				log.info(""+operator.keyExist(hash,tester.getString()));
				break;
			case 9:
				hash.put(tester.getString(),tester.getInt());
				hash.put(tester.getString(),tester.getInt());
				log.info(hash+" is the hash and length of hash is "+operator.getLength(hash));
				log.info(""+operator.valueExist(hash,tester.getInt()));
				break;
			case 10:
				hash.put(tester.getString(),tester.getString());
				hash.put(tester.getString(),tester.getString());
				hash.put(tester.getString(),tester.getString());
				log.info(hash+" is the hash and length of hash is "+operator.getLength(hash)+"\n Now enter the string to replace");
				operator.changeAllValue(hash,tester.getString());
				log.info(hash+" is the hash and length of hash is "+operator.getLength(hash));
				break;
			case 11:
				hash.put(tester.getString(),tester.getInt());
				hash.put(tester.getString(),tester.getInt());
				hash.put(tester.getString(),tester.getInt());
				log.info(hash+" is the hash and length of hash is "+operator.getLength(hash)+"\nEnter a key to find the value");
				log.info(""+operator.getValue(hash,tester.getString()));

				break;
			case 12:
				hash.put(tester.getString(),tester.getInt());
				hash.put(tester.getString(),tester.getInt());
				hash.put(tester.getString(),tester.getInt());
				log.info(hash+" is the hash and length of hash is "+operator.getLength(hash)+"\nEnter a key to find the value");
				log.info(""+operator.getValue(hash,tester.getString()));
				break;
			case 13:
				hash.put(tester.getString(),tester.getInt());
				hash.put(tester.getString(),tester.getInt());
				hash.put(tester.getString(),tester.getInt());
				log.info(hash+" is the hash and length of hash is "+operator.getLength(hash)+"\nEnter a key to find the value");
				log.info(""+operator.getValue(hash,tester.getString()));
				break;
			case 14:
				hash.put(tester.getString(),tester.getInt());
				hash.put(tester.getString(),tester.getInt());
				hash.put(tester.getString(),tester.getInt());
				log.info(hash+" is the hash and length of hash is "+operator.getLength(hash)+"\nEnter a key to remove the value");
				operator.deleteKey(hash,tester.getString());
				log.info(hash+" is the hash and length of hash is "+operator.getLength(hash));
				break;
			case 15:
				hash.put(tester.getString(),tester.getInt());
				hash.put(tester.getString(),tester.getInt());
				hash.put(tester.getString(),tester.getInt());
				log.info(hash+" is the hash and length of hash is "+operator.getLength(hash)+"\nEnter a key and value to remove the value");
				operator.deleteKey(hash,tester.getString(),tester.getInt());
				log.info(hash+" is the hash and length of hash is "+operator.getLength(hash));
				break;
			case 16:
				hash.put(tester.getString(),tester.getInt());
				hash.put(tester.getString(),tester.getInt());
				hash.put(tester.getString(),tester.getInt());
				log.info(hash+" is the hash and length of hash is "+operator.getLength(hash)+"\nEnter a key and new value to replace the value");
				operator.replaceValue(hash,tester.getString(),tester.getInt());
				log.info(hash+" is the hash and length of hash is "+operator.getLength(hash));
				break;
			case 17:
				hash.put(tester.getString(),tester.getInt());
				hash.put(tester.getString(),tester.getInt());
				hash.put(tester.getString(),tester.getInt());
				log.info(hash+" is the hash and length of hash is "+operator.getLength(hash)+"\nEnter a key old value and new value to remove the value");
				operator.replaceValue(hash,tester.getString(),tester.getInt(),tester.getInt());
				log.info(hash+" is the hash and length of hash is "+operator.getLength(hash));
				
				break;
			case 18:
				hash.put(tester.getString(),tester.getInt());
				hash.put(tester.getString(),tester.getInt());
				hash.put(tester.getString(),tester.getInt());
				log.info(hash+" is the hash and length of hash is "+operator.getLength(hash));
				hash2.put(tester.getString(),tester.getInt());
				hash2.put(tester.getString(),tester.getInt());
				hash2.put(tester.getString(),tester.getInt());
				log.info(hash+" is the hash and length of hash is "+operator.getLength(hash));
				operator.addHash(hash,hash2);
				log.info(hash+" is the hash and length of hash is "+operator.getLength(hash));
				break;
			case 19:
				hash.put(tester.getString(),tester.getInt());
				hash.put(tester.getString(),tester.getInt());
				hash.put(tester.getString(),tester.getInt());
				hash.forEach((K,V)->log.info(K+" - Key; "+V+" - Value"));
				break;
			case 20:
				hash.put(tester.getString(),tester.getInt());
				hash.put(tester.getString(),tester.getInt());
				hash.put(tester.getString(),tester.getInt());
				log.info(hash+" is the hash and length of hash is "+operator.getLength(hash));
				operator.deleteHash(hash);
				log.info("After Delete entire data \n"+hash+" is the hash and length of hash is "+operator.getLength(hash));
				break;
			default:
				log.info("Enter number b/w 1-10 only");
				break;
			}
		}catch(KeyException e){
				log.info("oops!! " +e.getMessage());
		}
		log.info("do you want to exit Y/N");
		runAgain = sc.next();
	}while(runAgain.equalsIgnoreCase("n"));
	sc.close();
}

}
