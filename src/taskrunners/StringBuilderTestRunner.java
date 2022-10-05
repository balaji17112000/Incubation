package taskrunners;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.logging.Logger;

import file_system.DateTimeRunner;
import operations.StringBuilderOperations;
import util.KeyException;

public class StringBuilderTestRunner {
	private static final Logger log = Logger.getLogger(DateTimeRunner.class.getName());
	private static Scanner sc = new Scanner(System.in); // done
	private String[] getStrings(int n){
		String str[]= new String[n];
		log.info("Enter string to append: ");
		for(int i=0;i<n;i++) {
			str[i] = sc.nextLine();
		}
		return str;
	}
	private String getString(){
		log.info("Enter string:");
		String str = sc.nextLine();
		return str;
	}
	private char getChar(){
		log.info("Enter symbol:");
		char symbol = sc.nextLine().charAt(0);
		return symbol;
	}
	private int getInt(){
		int num=0;
		log.info("Enter integer: ");
		try{
		 num= sc.nextInt();
		 }catch(InputMismatchException e){
		 log.info("Invalid input");
		 }
		 sc.nextLine();
		return num;
	}
public static void main (String arg[]){	
		String runAgain="Yes";
		do{ // done runAgain
			log.info("Enter between 1 - 10 to execute the StringBuilder Operation. 11 to Exit");
			try{
				StringBuilderOperations obj = new StringBuilderOperations(); //
				StringBuilderTestRunner obj2 = new StringBuilderTestRunner();
				int questionNumber= obj2.getInt();
				switch(questionNumber){
				case 1:
					log.info("Enter a string to find the length");
					String str[] = obj2.getStrings(1);
					log.info(""+obj.getLength(obj.appendStrings(str,"")));
					log.info("Enter number of strings to append");
					String str1[] = obj2.getStrings(obj2.getInt());
					StringBuilder strBr = obj.appendStrings(str1,"");
					log.info(strBr+" and the length is "+obj.getLength(strBr));
					break;
				case 2:
					log.info("Enter number of strings to append");
					String str2[] = obj2.getStrings(obj2.getInt());
					StringBuilder strBr2 = obj.appendStrings(str2,obj2.getString());
					log.info(strBr2+" and the length is "+obj.getLength(strBr2));
					break;
				case 3: 
					log.info("Enter number of strings to append");
					String str3[] = obj2.getStrings(obj2.getInt());
					log.info("Enter new String and index to insert");
					StringBuilder strBr3 = obj.insertStrings(str3,obj2.getString(),obj2.getInt());
					log.info(strBr3+" and the length is "+obj.getLength(strBr3));
					break;
				case 4: 
					log.info("Enter number of strings to append");
					String str4[] = obj2.getStrings(obj2.getInt());
					log.info("Enter index to delete");
					StringBuilder strBr4 = obj.deleteString(str4,obj2.getInt());
					log.info(strBr4+" and the length is "+obj.getLength(strBr4));
					break;
				case 5:
					String str5[] = obj2.getStrings(obj2.getInt());
					StringBuilder strBul = obj.appendStrings(str5," ");
					log.info(strBul+" and the length is "+obj.getLength(strBul));
					log.info("Enter symbols to replace");
					StringBuilder strBr5 = obj.replaceString(strBul,obj2.getChar(),obj2.getChar());
					log.info(strBr5+" and the length is "+obj.getLength(strBr5));
					break;
				case 6:
					String str6[] = obj2.getStrings(obj2.getInt());
					StringBuilder strBul6 = obj.appendStrings(str6," ");
					log.info(strBul6+" and the length is "+obj.getLength(strBul6));
					StringBuilder strBr6 = obj.reverseString(strBul6);
					log.info("Reversed string is");
					log.info(strBr6+" and the length is "+obj.getLength(strBr6));
					break;
				case 7:
					String str7[] = obj2.getStrings(1);
					StringBuilder strBul7 = obj.appendStrings(str7,"");
					log.info(strBul7+" and the length is "+obj.getLength(strBul7));
					log.info("Enter from and to index to delete");
					StringBuilder strBr7 = obj.deleteChar(strBul7,obj2.getInt(),obj2.getInt());
					log.info(strBr7+" and the length is "+obj.getLength(strBr7));
					break;
				case 8:
					String str8[] = obj2.getStrings(1);
					StringBuilder strBul8= obj.appendStrings(str8,"");
					log.info(strBul8+" and the length is "+obj.getLength(strBul8));
					log.info("Enter from and to index and a string to replace ");
					StringBuilder strBr8= obj.replaceChar(strBul8,obj2.getInt(),obj2.getInt(),obj2.getString());
					log.info(strBr8+" and the length is "+obj.getLength(strBr8));
					break;
				case 9:
					String str9[] = obj2.getStrings(obj2.getInt());
					StringBuilder strBul9 = obj.appendStrings(str9,obj2.getString());
					log.info(strBul9+" and the length is "+obj.getLength(strBul9));
					log.info("Enter a string to find the first position");
					log.info("symbol found at "+obj.findFirstChar(strBul9,obj2.getString()));
					break;
				case 10:
					String str10[] = obj2.getStrings(obj2.getInt());
					StringBuilder strBul10 = obj.appendStrings(str10,obj2.getString());
					log.info(strBul10+" and the length is "+obj.getLength(strBul10));
					log.info("Enter a string to find the last position");
					log.info("symbol found at "+obj.findLastChar(strBul10,obj2.getString()));
					break;
				case 11:
					log.info("terminated");
					runAgain ="NO";
					break;
				default:
					log.info("Enter number b/w 1-11 only");
					break;
				}
			}catch(KeyException e){
					log.info("oops!! " +e.getMessage());
			}
		}while(runAgain.equalsIgnoreCase("Yes"));
	sc.close();
	}
}
