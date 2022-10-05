package taskrunners;

import java.util.InputMismatchException;
import java.util.Scanner;
import operations.RegExOperations;
import util.KeyException;

public class RegExRunner {
	private static Scanner sc = new Scanner(System.in);
	private static String getString(String log){
		System.out.println(log);
		String str = sc.nextLine();
		return str;
	}
	private static String[] getStrArr(int n){
		String strArr[] = new String[n];
		for(int i=0; i<n;i++) {
			System.out.println("Enter a String: ");
			strArr[i]=sc.nextLine();
		}
		return strArr;
	}
	private static int getInt(String log){
		int num=0;
		System.out.println(log);
		try{
		 num= sc.nextInt();
		 }catch(InputMismatchException e){
		 System.out.println("Invalid input");
		 }
		 sc.nextLine();
		return num;
	}
	public static void main(String[] args) {
		String runAgain="y";
		do{
 			RegExOperations operator = new RegExOperations();
			try{
				int questionNumber= getInt("Enter number[1-9]to execute the RegEx Operation. 9 to Exit:");
				switch(questionNumber){
				case 1:
					System.out.println(operator.checkString(getString("Enter number to validate mobile number:")));
					break;
				case 2:
					System.out.println(operator.getAlphaNumeric(getString("Enter String to check alphaNumeric:")));
					break;
				case 3:
					String str1 = getString("Enter String");
					String str2 = getString("Enter Matching string");
					String runAgain3="y";
					do{
						int switch3 = getInt("\nMatiching String operations\n\tEnter 1 to check string start matches\n\tEnter 2 to check string conatins\n\tEnter 3 to check string end matches\n\tEnter 4 to check string is a exact match or not\n\tEnter 5 to Exit.");
						switch(switch3) {
							case 1:
								System.out.println("\t"+operator.startCheck(str1,str2));
								break;
							case 2:
								System.out.println("\t"+operator.containsCheck(str1,str2));
								break;
							case 3:
								System.out.println("\t"+operator.endCheck(str1,str2));
								break;
							case 4:
								System.out.println("\t"+operator.exactCheck(str1,str2));
								break;
							case 5:
								System.out.println("Terminated Matching operation");
								runAgain3= "n";
								break;
							default:
								System.out.println("\tEnter only 1-5");
								break;
						}
					}while(runAgain3.equalsIgnoreCase("y"));
					//System.out.println(operator.());
					break;
				case 4:
					System.out.println(operator.stringMatchCaseIgnore(getString("Enter Check String"),getStrArr(getInt("Enter number of strings"))));
					break;
				case 5:
					System.out.println(operator.emailCheck(getString("Enter email to validate:")));
					break;
				case 6:
					System.out.println(operator.stringLenCheck(getStrArr(getInt("Enter number of strings"))));
					break;
				case 7:
					System.out.println(operator.listContainCheck(getStrArr(getInt("Enter the number of strings")),getStrArr(getInt("Enter the number of strings"))));
					break;
				case 8:
					System.out.println(operator.htmlTagsCheck(getString("Write HTML Code to get tags:")));
					break;
				case 9:
					runAgain = "n";
					System.out.println("TERMINATED");
					break;
				default:
					System.out.println("Enter number b/w 1-10 only");
					break;
				}
			}catch(KeyException e){
				System.out.println("oops!! " +e.getMessage());
			}
		}while(runAgain.equalsIgnoreCase("y"));
		sc.close();
	}
}
