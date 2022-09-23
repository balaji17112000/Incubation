package taskrunners;

import java.util.*;
import operations.StringBuilderOperations;
import util.KeyException;

public class StringBuilderTestRunner {
	static Scanner sc = new Scanner(System.in);
	String[] getStrings(int n){
		String str[]= new String[n];
		System.out.println("Enter string to append: ");
		for(int i=0;i<n;i++) {
			str[i] = sc.nextLine();
		}
		return str;
	}
	String getString(){
		System.out.println("Enter string:");
		String str = sc.nextLine();
		return str;
	}
	 char getChar(){
		System.out.println("Enter a character: ");
		return sc.next().charAt(0);
	}
	int getInt(){
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
public static void main (String arg[]){	
		String runAgain;
		do{
			System.out.println("Enter between 1 - 20 to execute the String Operation");
			try{
				StringBuilderOperations obj = new StringBuilderOperations();
				StringBuilderTestRunner obj2 = new StringBuilderTestRunner();
				int questionNumber= obj2.getInt();
				switch(questionNumber){
				case 1:
					System.out.println("Enter a string to find the length");
					String str[] = obj2.getStrings(1);
					System.out.println(obj.getLength(obj.appendStrings(str,"")));
					System.out.println("Enter number of strings to append");
					String str1[] = obj2.getStrings(obj2.getInt());
					StringBuilder strBr = obj.appendStrings(str1,"");
					System.out.println(strBr+" and the length is "+obj.getLength(strBr));
					break;
				case 2:
					System.out.println("Enter number of strings to append");
					String str2[] = obj2.getStrings(obj2.getInt());
					StringBuilder strBr2 = obj.appendStrings(str2,obj2.getString());
					System.out.println(strBr2+" and the length is "+obj.getLength(strBr2));
					break;
				case 3:
					System.out.println("Enter number of strings to append");
					String str3[] = obj2.getStrings(obj2.getInt());
					StringBuilder strBr3 = obj.insertStrings(str3,obj2.getString());
					System.out.println(strBr3+" and the length is "+obj.getLength(strBr3));
					break;
				case 4:
					System.out.println("Enter number of strings to append");
					String str4[] = obj2.getStrings(obj2.getInt());
					StringBuilder strBr4 = obj.deleteString(str4);
					System.out.println(strBr4+" and the length is "+obj.getLength(strBr4));
					break;
				case 5:
					String str5[] = obj2.getStrings(obj2.getInt());
					StringBuilder strBul = obj.appendStrings(str5," ");
					System.out.println(strBul+" and the length is "+obj.getLength(strBul));
					StringBuilder strBr5 = obj.replaceString(strBul,obj2.getString());
					System.out.println(strBr5+" and the length is "+obj.getLength(strBr5));
					break;
				case 6:
					String str6[] = obj2.getStrings(obj2.getInt());
					StringBuilder strBul6 = obj.appendStrings(str6," ");
					System.out.println(strBul6+" and the length is "+obj.getLength(strBul6));
					StringBuilder strBr6 = obj.reverseString(strBul6);
					System.out.println(strBr6+" and the length is "+obj.getLength(strBr6));
					break;
				case 7:
					String str7[] = obj2.getStrings(1);
					StringBuilder strBul7 = obj.appendStrings(str7,"");
					System.out.println(strBul7+" and the length is "+obj.getLength(strBul7));
					StringBuilder strBr7 = obj.deleteChar(strBul7,obj2.getInt(),obj2.getInt());
					System.out.println(strBr7+" and the length is "+obj.getLength(strBr7));
					break;
				case 8:
					String str8[] = obj2.getStrings(1);
					StringBuilder strBul8= obj.appendStrings(str8,"");
					System.out.println(strBul8+" and the length is "+obj.getLength(strBul8));
					StringBuilder strBr8= obj.replaceChar(strBul8,obj2.getInt(),obj2.getInt(),obj2.getString());
					System.out.println(strBr8+" and the length is "+obj.getLength(strBr8));
					break;
				case 9:
					String str9[] = obj2.getStrings(obj2.getInt());
					StringBuilder strBul9 = obj.appendStrings(str9,obj2.getString());
					System.out.println(strBul9+" and the length is "+obj.getLength(strBul9));
					System.out.println("symbol found at "+obj.findFirstChar(strBul9,obj2.getString()));
					break;
				case 10:
					String str10[] = obj2.getStrings(obj2.getInt());
					StringBuilder strBul10 = obj.appendStrings(str10,obj2.getString());
					System.out.println(strBul10+" and the length is "+obj.getLength(strBul10));
					System.out.println("symbol found at "+obj.findLastChar(strBul10,obj2.getString()));
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
