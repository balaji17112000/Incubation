package taskrunners;
import java.util.*;
import operations.*;
public class StringTestRunner{ 
	 static Scanner sc = new Scanner(System.in);
	 String getString(){
		System.out.println("Enter string: ");
		String str = sc.nextLine();
		return str;
	}
	 char getChar(){
		System.out.println("Enter a character: ");
		char letter = sc.next().charAt(0);
		return letter;
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
				StringOperations obj = new StringOperations();
				StringTestRunner obj2 = new StringTestRunner();
				int questionNumber= obj2.getInt();
				if (questionNumber>=1 && questionNumber<=20){
					switch(questionNumber){
						case 1:
							System.out.println("Enter a string to find the length");
							if (arg.length!=0)
								System.out.println(obj.getLength(arg[0]));	
							else
								System.out.println("Oops!!! please enter String in command line");			
							break;
						case 2:
							System.out.println("Enter a string to convert into character array");
							System.out.println("type is now converted into"+Arrays.toString(obj.toCharArr(obj2.getString())));
							break;
						case 3:
							System.out.println("Enter a string to the find character at last position");
							System.out.println(obj.nthPosition(obj2.getString(),obj2.getInt())+" found at the specified index");
							break;
						case 4:
							System.out.println("Enter a string to the find occurance of given character");
							System.out.println("Occured "+obj.occurance(obj2.getString(), obj2.getChar()));
							break;
						case 5:
							System.out.println("Enter a string to the find greatest position of given character");
							System.out.println("GreatestPosition "+obj.greatestPos(obj2.getString(), obj2.getChar()));
							break;
						case 6:
							System.out.println("Enter a string and number to print the last n characters");
							String str1 = obj2.getString();
							int n = obj2.getInt();
							System.out.println(""+obj.subStrings(str1, str1.length()-n, str1.length()));
							break;
						case 7:
							System.out.println("Enter a string and number to print the first n character");
							System.out.println(""+obj.subStrings(obj2.getString(), 0,obj2.getInt()));
							break;
						case 8:
							System.out.println("Enter a string and number to print the replace first n character");
							System.out.println("Replaced String"+obj.replace( obj2.getString(), obj2.getString()));
							break;
						case 9:
							System.out.println("Enter a string and a substring to check whether it starts with the substring ");
							System.out.println("start with"+obj.checkStart(obj2.getString(),obj2.getString()));
							break;
						case 10:
							System.out.println("Enter a string and substring to check whether it ends with substring ");
							System.out.println(" "+obj.checkEnd(obj2.getString(), obj2.getString()));
							break;
						case 11:
							System.out.println("Enter a string to convert into lowercase  ");
							System.out.println("Full Lower case"+obj.lowerCase(obj2.getString()));
							break;
						case 12:
							System.out.println("Enter a string to check whether its ends with le ");
							System.out.println("Full Upper case "+obj.upperCase(obj2.getString()));
							break;
						case 13:
							System.out.println("Enter a string to reverse ");
							System.out.println("Reversed string is  "+obj.reverseString(obj2.getString()));
							break;	
						case 14:
							System.out.println("Enter multiple strings in single line ");
							for(String s : obj.getStrings(obj2.getString()))
								System.out.println(s);
							break;	
						case 15:
							System.out.println("Enter multiple strings in single line ");
							System.out.println(obj.concateString(obj.getStrings(obj2.getString()),""));
							break;
						case 16:
							System.out.println("Enter multiple strings in single line ");
							System.out.println("Converted into : "+Arrays.toString(obj.getStrings(obj2.getString())));
							break;	
						case 17:
							System.out.println("Enter multiple strings in single line ");
							System.out.println(obj.concateString(obj.getStrings(obj2.getString()),"-"));
							break;	
						case 18:
							System.out.println("Enter strings to check whether it is equal(case sensitive) ");
							System.out.println(obj.caseSensitive(obj2.getString(),obj2.getString()));
							break;
						case 19:
							System.out.println("Enter strings to check whether it is equal(case insensitive)");
							System.out.println(obj.CaseInSensitive(obj2.getString(),obj2.getString()));
							break;
						case 20:
							System.out.println(" concate without spacing");
							System.out.println(obj.customSpacing(obj2.getString()));
							break;				
					}
				}else{
					System.out.println("oops!! You have not entered between 1-20");
				}
			}catch(Exception e){
				System.out.println("oops!! " +e.getMessage());
			}
				System.out.println("do you want to exit Y/N");
		
			runAgain = sc.next();
		}while(runAgain.equalsIgnoreCase("n"));
	}
}

