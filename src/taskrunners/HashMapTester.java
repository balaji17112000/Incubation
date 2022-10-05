package taskrunners;

import java.util.*;
import operations.HashMapOperations;
import util.KeyException;

public class HashMapTester {

	static Scanner sc = new Scanner(System.in);
	
	String getString(){
		System.out.println("Enter string:");
		String str = sc.nextLine();
		return str;
	}
	 char getChar(){
		System.out.println("Enter a character: ");
		return sc.next().charAt(0);
	}
	Integer getInt(){
		int num=0;
		System.out.println("Enter integer: ");
		try{
		 num= sc.nextInt();
		 }catch(Exception e){
		 System.out.println("Invalid input");
		 }
		 sc.nextLine();
		return num;
	}
public static void main(String[] args) {
	String runAgain;
	do{
		System.out.println("Enter between 1 - 20 to execute the HashMap Operation");
		try{
			HashMapTester tester = new HashMapTester();
			HashMapOperations operator = new HashMapOperations();
			Map<Object, Object> hash = operator.getHash();
			Map<Object, Object> hash2 = operator.getHash();
			int questionNumber= tester.getInt();
			switch(questionNumber){
			case 1:
				System.out.println(hash+" is the hash and length of hash is "+operator.getLength(hash));
				break;
			case 2:
				hash.put(tester.getString(),tester.getString());
				hash.put(tester.getString(),tester.getString());
				hash.put(tester.getString(),tester.getString());
				System.out.println(hash+" is the hash and length of hash is "+operator.getLength(hash));
				break;
			case 3:
				hash.put(tester.getInt(),tester.getInt());
				hash.put(tester.getInt(),tester.getInt());
				hash.put(tester.getInt(),tester.getInt());
				System.out.println(hash+" is the hash and length of hash is "+operator.getLength(hash));
				break;
			case 4:
				hash.put(tester.getString(),tester.getInt());
				hash.put(tester.getString(),tester.getInt());
				hash.put(tester.getString(),tester.getInt());
				System.out.println(hash+" is the hash and length of hash is "+operator.getLength(hash));
				break;
			case 5:
				hash.put(tester.getString(),tester.getInt());
				hash.put(tester.getString(),tester.getInt());
				hash.put(tester.getString(),tester.getInt());
				System.out.println(hash+" is the hash and length of hash is "+operator.getLength(hash));
				break;
			case 6:
				Map<Object, HashMapOperations> hash1 = operator.getHash();
				hash1.put(tester.getString(),operator);
				hash1.put(tester.getString(),operator);
				hash1.put(tester.getString(),operator);
				System.out.println(hash1+" is the hash and length of hash is "+operator.getLength(hash1));
				break;
			case 7:
				hash.put(null,tester.getInt());
				System.out.println(hash+" is the hash and length of hash is "+operator.getLength(hash));
				break;
			case 8:
				hash.put(tester.getString(),tester.getInt());
				hash.put(tester.getString(),tester.getInt());
				System.out.println(operator.keyExist(hash,tester.getString()));
				break;
			case 9:
				hash.put(tester.getString(),tester.getInt());
				hash.put(tester.getString(),tester.getInt());
				System.out.println(hash+" is the hash and length of hash is "+operator.getLength(hash));
				System.out.println(operator.valueExist(hash,tester.getInt()));
				break;
			case 10:
				hash.put(tester.getString(),tester.getString());
				hash.put(tester.getString(),tester.getString());
				hash.put(tester.getString(),tester.getString());
				System.out.println(hash+" is the hash and length of hash is "+operator.getLength(hash)+"\n Now enter the string to replace");
				operator.changeAllValue(hash,tester.getString());
				System.out.println(hash+" is the hash and length of hash is "+operator.getLength(hash));
				break;
			case 11:
				hash.put(tester.getString(),tester.getInt());
				hash.put(tester.getString(),tester.getInt());
				hash.put(tester.getString(),tester.getInt());
				System.out.println(hash+" is the hash and length of hash is "+operator.getLength(hash)+"\nEnter a key to find the value");
				System.out.println(operator.getValue(hash,tester.getString()));

				break;
			case 12:
				hash.put(tester.getString(),tester.getInt());
				hash.put(tester.getString(),tester.getInt());
				hash.put(tester.getString(),tester.getInt());
				System.out.println(hash+" is the hash and length of hash is "+operator.getLength(hash)+"\nEnter a key to find the value");
				System.out.println(operator.getValue(hash,tester.getString()));
				break;
			case 13:
				hash.put(tester.getString(),tester.getInt());
				hash.put(tester.getString(),tester.getInt());
				hash.put(tester.getString(),tester.getInt());
				System.out.println(hash+" is the hash and length of hash is "+operator.getLength(hash)+"\nEnter a key to find the value");
				System.out.println(operator.getValue(hash,tester.getString()));
				break;
			case 14:
				hash.put(tester.getString(),tester.getInt());
				hash.put(tester.getString(),tester.getInt());
				hash.put(tester.getString(),tester.getInt());
				System.out.println(hash+" is the hash and length of hash is "+operator.getLength(hash)+"\nEnter a key to remove the value");
				operator.deleteKey(hash,tester.getString());
				System.out.println(hash+" is the hash and length of hash is "+operator.getLength(hash));
				break;
			case 15:
				hash.put(tester.getString(),tester.getInt());
				hash.put(tester.getString(),tester.getInt());
				hash.put(tester.getString(),tester.getInt());
				System.out.println(hash+" is the hash and length of hash is "+operator.getLength(hash)+"\nEnter a key and value to remove the value");
				operator.deleteKey(hash,tester.getString(),tester.getInt());
				System.out.println(hash+" is the hash and length of hash is "+operator.getLength(hash));
				break;
			case 16:
				hash.put(tester.getString(),tester.getInt());
				hash.put(tester.getString(),tester.getInt());
				hash.put(tester.getString(),tester.getInt());
				System.out.println(hash+" is the hash and length of hash is "+operator.getLength(hash)+"\nEnter a key and new value to replace the value");
				operator.replaceValue(hash,tester.getString(),tester.getInt());
				System.out.println(hash+" is the hash and length of hash is "+operator.getLength(hash));
				break;
			case 17:
				hash.put(tester.getString(),tester.getInt());
				hash.put(tester.getString(),tester.getInt());
				hash.put(tester.getString(),tester.getInt());
				System.out.println(hash+" is the hash and length of hash is "+operator.getLength(hash)+"\nEnter a key old value and new value to remove the value");
				operator.replaceValue(hash,tester.getString(),tester.getInt(),tester.getInt());
				System.out.println(hash+" is the hash and length of hash is "+operator.getLength(hash));
				
				break;
			case 18:
				hash.put(tester.getString(),tester.getInt());
				hash.put(tester.getString(),tester.getInt());
				hash.put(tester.getString(),tester.getInt());
				System.out.println(hash+" is the hash and length of hash is "+operator.getLength(hash));
				hash2.put(tester.getString(),tester.getInt());
				hash2.put(tester.getString(),tester.getInt());
				hash2.put(tester.getString(),tester.getInt());
				System.out.println(hash+" is the hash and length of hash is "+operator.getLength(hash));
				operator.addHash(hash,hash2);
				System.out.println(hash+" is the hash and length of hash is "+operator.getLength(hash));
				break;
			case 19:
				hash.put(tester.getString(),tester.getInt());
				hash.put(tester.getString(),tester.getInt());
				hash.put(tester.getString(),tester.getInt());
				hash.forEach((K,V)->System.out.println(K+" - Key; "+V+" - Value"));
				break;
			case 20:
				hash.put(tester.getString(),tester.getInt());
				hash.put(tester.getString(),tester.getInt());
				hash.put(tester.getString(),tester.getInt());
				System.out.println(hash+" is the hash and length of hash is "+operator.getLength(hash));
				operator.deleteHash(hash);
				System.out.println("After Delete entire data \n"+hash+" is the hash and length of hash is "+operator.getLength(hash));
				break;
			default:
				System.out.println("Enter number b/w 1-10 only");
				break;
			}
		}catch(KeyException e){
				System.out.println("oops!! " +e.getMessage());
		}
		System.out.println("do you want to exit Y/N");
		runAgain = sc.next();
	}while(runAgain.equalsIgnoreCase("n"));
	sc.close();
}

}
