package taskrunners;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.logging.Logger;

import operations.RegExOperations;
import util.KeyException;

public class RegExRunner {
	private static final Logger log = Logger.getLogger(RegExRunner.class.getName());
	private static Scanner sc = new Scanner(System.in);
	private static String getString(String logs){
		log.info(logs);
		String str = sc.nextLine();
		return str;
	}
	private static String[] getStrArr(int n){
		String strArr[] = new String[n];
		for(int i=0; i<n;i++) {
			log.info("Enter a String: ");
			strArr[i]=sc.nextLine();
		}
		return strArr;
	}
	private static int getInt(String logs){
		int num=0;
		log.info(logs);
		try{
		 num= sc.nextInt();
		 }catch(InputMismatchException e){
			log.info("Invalid input");
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
					log.info(""+operator.checkString(getString("Enter number to validate mobile number:")));
					break;
				case 2:
					log.info(""+operator.getAlphaNumeric(getString("Enter String to check alphaNumeric:")));
					break;
				case 3:
					String str1 = getString("Enter String");
					String str2 = getString("Enter Matching string");
					String runAgain3="y";
					do{
						int switch3 = getInt("\nMatiching String operations\n\tEnter 1 to check string start matches\n\tEnter 2 to check string conatins\n\tEnter 3 to check string end matches\n\tEnter 4 to check string is a exact match or not\n\tEnter 5 to Exit.");
						switch(switch3) {
							case 1:
								log.info("\t"+operator.startCheck(str1,str2));
								break;
							case 2:
								log.info("\t"+operator.containsCheck(str1,str2));
								break;
							case 3:
								log.info("\t"+operator.endCheck(str1,str2));
								break;
							case 4:
								log.info("\t"+operator.exactCheck(str1,str2));
								break;
							case 5:
								log.info("Terminated Matching operation");
								runAgain3= "n";
								break;
							default:
								log.info("\tEnter only 1-5");
								break;
						}
					}while(runAgain3.equalsIgnoreCase("y"));
					//log.info(operator.());
					break;
				case 4:
					log.info(""+operator.stringMatchCaseIgnore(getString("Enter Check String"),getStrArr(getInt("Enter number of strings"))));
					break;
				case 5:
					log.info(""+operator.emailCheck(getString("Enter email to validate:")));
					break;
				case 6:
					log.info(""+operator.stringLenCheck(getStrArr(getInt("Enter number of strings"))));
					break;
				case 7:
					log.info(""+operator.listContainCheck(getStrArr(getInt("Enter the number of strings")),getStrArr(getInt("Enter the number of strings"))));
					break;
				case 8:
					log.info(""+operator.htmlTagsCheck(getString("Write HTML Code to get tags:")));
					break;
				case 9:
					runAgain = "n";
					log.info("TERMINATED");
					break;
				default:
					log.info("Enter number b/w 1-10 only");
					break;
				}
			}catch(KeyException e){
				log.info("oops!! " +e.getMessage());
			}
		}while(runAgain.equalsIgnoreCase("y"));
		sc.close();
	}
}
