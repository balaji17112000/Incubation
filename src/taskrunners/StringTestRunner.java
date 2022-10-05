package taskrunners;
import java.util.*;
import java.util.logging.Logger;

import file_system.DateTimeRunner;
import operations.*;
public class StringTestRunner{ 
	private static final Logger log = Logger.getLogger(DateTimeRunner.class.getName());
	 static Scanner sc = new Scanner(System.in);
	 String getString(){
		log.info("Enter string: ");
		String str = sc.nextLine();
		return str;
	}
	 char getChar(){
		log.info("Enter a character: ");
		char letter = sc.next().charAt(0);
		return letter;
	}
	int getInt(){
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
public static void main (String arg[]){	
		String runAgain;
		do{
			log.info("Enter between 1 - 20 to execute the String Operation");
			try{
				StringOperations obj = new StringOperations();
				StringTestRunner obj2 = new StringTestRunner();
				int questionNumber= obj2.getInt();
				if (questionNumber>=1 && questionNumber<=20){
					switch(questionNumber){
						case 1:
							log.info("Enter a string to find the length");
							if (arg.length!=0)
								log.info(""+obj.getLength(arg[0]));	
							else
								log.info("Oops!!! please enter String in command line");			
							break;
						case 2:
							log.info("Enter a string to convert into character array");
							log.info("type is now converted into"+Arrays.toString(obj.toCharArr(obj2.getString())));
							break;
						case 3:
							log.info("Enter a string to the find character at last position");
							log.info(obj.nthPosition(obj2.getString(),obj2.getInt())+" found at the specified index");
							break;
						case 4:
							log.info("Enter a string to the find occurance of given character");
							log.info("Occured "+obj.occurance(obj2.getString(), obj2.getChar()));
							break;
						case 5:
							log.info("Enter a string to the find greatest position of given character");
							log.info("GreatestPosition "+obj.greatestPos(obj2.getString(), obj2.getChar()));
							break;
						case 6:
							log.info("Enter a string and number to print the last n characters");
							String str1 = obj2.getString();
							int n = obj2.getInt();
							log.info(""+obj.subStrings(str1, str1.length()-n, str1.length()));
							break;
						case 7:
							log.info("Enter a string and number to print the first n character");
							log.info(""+obj.subStrings(obj2.getString(), 0,obj2.getInt()));
							break;
						case 8:
							log.info("Enter a string and number to print the replace first n character");
							log.info("Replaced String"+obj.replace( obj2.getString(), obj2.getString()));
							break;
						case 9:
							log.info("Enter a string and a substring to check whether it starts with the substring ");
							log.info("start with"+obj.checkStart(obj2.getString(),obj2.getString()));
							break;
						case 10:
							log.info("Enter a string and substring to check whether it ends with substring ");
							log.info(" "+obj.checkEnd(obj2.getString(), obj2.getString()));
							break;
						case 11:
							log.info("Enter a string to convert into lowercase  ");
							log.info("Full Lower case"+obj.lowerCase(obj2.getString()));
							break;
						case 12:
							log.info("Enter a string to check whether its ends with le ");
							log.info("Full Upper case "+obj.upperCase(obj2.getString()));
							break;
						case 13:
							log.info("Enter a string to reverse ");
							log.info("Reversed string is  "+obj.reverseString(obj2.getString()));
							break;	
						case 14:
							log.info("Enter multiple strings in single line ");
							for(String s : obj.getStrings(obj2.getString()))
								log.info(s);
							break;	
						case 15:
							log.info("Enter multiple strings in single line ");
							log.info(obj.concateString(obj.getStrings(obj2.getString()),""));
							break;
						case 16:
							log.info("Enter multiple strings in single line ");
							log.info("Converted into : "+Arrays.toString(obj.getStrings(obj2.getString())));
							break;	
						case 17:
							log.info("Enter multiple strings in single line ");
							log.info(obj.concateString(obj.getStrings(obj2.getString()),"-"));
							break;	
						case 18:
							log.info("Enter strings to check whether it is equal(case sensitive) ");
							log.info(""+obj.caseSensitive(obj2.getString(),obj2.getString()));
							break;
						case 19:
							log.info("Enter strings to check whether it is equal(case insensitive)");
							log.info(""+obj.CaseInSensitive(obj2.getString(),obj2.getString()));
							break;
						case 20:
							log.info(" concate without spacing");
							log.info(obj.customSpacing(obj2.getString()));
							break;				
					}
				}else{
					log.info("oops!! You have not entered between 1-20");
				}
			}catch(Exception e){
				log.info("oops!! " +e.getMessage());
			}
				log.info("do you want to exit Y/N");
		
			runAgain = sc.next();
		}while(runAgain.equalsIgnoreCase("n"));
	}
}

