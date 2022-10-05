package taskrunners;



import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import java.util.logging.Logger;

import file_system.DateTimeRunner;
import operations.ArrayListOperations;
import util.KeyException;

public class ArrayListTestRunner {
	private static final Logger log = Logger.getLogger(DateTimeRunner.class.getName());
	private static Scanner sc = new Scanner(System.in);
	private String[] getStrArr(int n){
		String str[]= new String[n];
		log.info("Enter string to append: ");
		for(int i=0;i<n;i++) {
			str[i] = sc.nextLine();
		}
		return str;
	}
	private Integer[] getIntArr(int n){
		Integer intArr[]= new Integer[n];
		log.info("Enter value to append: ");
		for(int i=0;i<n;i++) {
			intArr[i] = sc.nextInt();
		}
		return intArr;
	}
	private Long[] getLongArr(int n){
		Long longArr[]= new Long[n];
		log.info("Enter value to append: ");
		for(int i=0;i<n;i++) {
			longArr[i] = sc.nextLong();
		}
		return longArr;
	}
	private Double[] getDoubleArr(int n){
		Double dblArr[]= new Double[n];
		log.info("Enter value to append: ");
		for(int i=0;i<n;i++) {
			dblArr[i] = sc.nextDouble();
		}
		return dblArr;
	}
	private Object[] getObjArr(int n){
		Object obj= new Object();
		Object objArr[]= new Object[n];
		for(int i=0;i<n;i++) {
			objArr[i] = obj;
		}
		return objArr;
	}
	private String getString(){
		log.info("Enter string:");
		String str = sc.nextLine();
		return str;
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
public static void main(String[] args) {
	String runAgain="Yes";
	do{
		log.info("Enter between 1 - 20 to execute the ArrayList Operation. 21 to Exit");
		try{
			ArrayListOperations obj = new ArrayListOperations();
			ArrayListTestRunner obj2 = new ArrayListTestRunner();
			List<Object> arrList= obj.getArrList();
			List<Object> arrList1= obj.getArrList();
			int questionNumber= obj2.getInt();
			switch(questionNumber){
			case 1:
				log.info("The length of empty array list is "+obj.getLength(arrList));
				break;
			case 2:
				log.info("Enter number of strings to append");
				obj.appendStrings(arrList,obj2.getStrArr(obj2.getInt()));
				log.info(arrList+"and the length is "+obj.getLength(arrList));
//				log.info(arrList.get(1).getClass().getSimpleName()+" Type");
				break;
			case 3:
				log.info("Enter number of strings to append");
				obj.appendStrings(arrList,obj2.getIntArr(obj2.getInt()));
				log.info(arrList+"and the length is "+obj.getLength(arrList));
				break;
			case 4:
				log.info("Enter number of strings to append");
				obj.appendStrings(arrList,obj2.getObjArr(obj2.getInt()));
				log.info(arrList+"and the length is "+obj.getLength(arrList));
				break;
			case 5:
				log.info("Enter number of Integer(Int) to append");
				obj.appendStrings(arrList,obj2.getIntArr(obj2.getInt()));
				log.info("Enter number of strings to append");
				obj.appendStrings(arrList,obj2.getStrArr(obj2.getInt()));
				log.info("Enter number of Objects to append");
				obj.appendStrings(arrList,obj2.getObjArr(obj2.getInt()));
				log.info(arrList+"and the length is "+obj.getLength(arrList));
				break;
			case 6:
				log.info("Enter number of strings to append");
				obj.appendStrings(arrList,obj2.getStrArr(obj2.getInt()));
				log.info("Enter string to search");
				log.info("Found at "+obj.findIndex(arrList, obj2.getString())+" Index");
				break;
			case 7:
				log.info("Enter number of strings to append");
				obj.appendStrings(arrList,obj2.getStrArr(obj2.getInt()));
				Iterator itr= obj.printArray(arrList);
				while(itr.hasNext()) {
					log.info(""+itr.next());
				}
				break;
			case 8:
				log.info("Enter number of strings to append");
				obj.appendStrings(arrList,obj2.getStrArr(obj2.getInt()));
				log.info("Enter Index to find");
				log.info("Found "+obj.findString(arrList, obj2.getInt()));
				break;
			case 9:
				log.info("Enter number of strings to append");
				obj.appendStrings(arrList,obj2.getStrArr(obj2.getInt()));
				log.info("Found at");
				int[] a=obj.findDuplicate(arrList);
				log.info("First index and Last Index"+a[0]+a[1]);
				break;
			case 10:
				log.info("Enter number of strings to append");
				obj.appendStrings(arrList,obj2.getStrArr(obj2.getInt()));
				log.info("Enter string and index to insert string at index");
				obj.appendString(arrList,obj2.getString(),obj2.getInt());
				log.info(""+arrList);
				break;
			case 11:
				log.info("Enter number of strings to append");
				obj.appendStrings(arrList,obj2.getStrArr(obj2.getInt()));
				log.info("Enter start index and end index");
				log.info(""+obj.subList(arrList, obj2.getInt(), obj2.getInt()));
				break;
			case 12:
				log.info("Enter number of strings to append");
				obj.appendStrings(arrList,obj2.getStrArr(obj2.getInt()));
				log.info("Enter number of strings to append");
				obj.appendStrings(arrList1,obj2.getStrArr(obj2.getInt()));
				log.info("Merged List\t"+obj.mergeList(arrList,arrList1));
				break;
			case 13:
				log.info("Enter number of strings to append");
				obj.appendStrings(arrList,obj2.getStrArr(obj2.getInt()));
				log.info("Enter number of strings to append");
				obj.appendStrings(arrList1,obj2.getStrArr(obj2.getInt()));
				log.info("Merged List\t"+obj.mergeList(arrList1,arrList));
				break;
			case 14:
				log.info("Enter number of decimal numbers to append");
				obj.appendStrings(arrList,obj2.getDoubleArr(obj2.getInt()));
				log.info("Enter the decimal value to delete:");
				obj.deleteElement(arrList, sc.nextDouble());
				log.info("Update ArrayList\t"+arrList);
				break;
			case 15:
				log.info("Enter number of decimal numbers to append");
				obj.appendStrings(arrList,obj2.getDoubleArr(obj2.getInt()));
				log.info("Enter the decimal value to delete:");
				obj.deleteElement(arrList, sc.nextDouble());
				log.info("Update ArrayList\t"+arrList);
				break;
			case 16:
				log.info("Enter number of decimal numbers to append");
				obj.appendStrings(arrList,obj2.getDoubleArr(obj2.getInt()));
				log.info("Enter the decimal value to delete:");
				obj.deleteRange(arrList,obj2.getInt(),obj2.getInt());
				log.info("Update ArrayList\t"+arrList);
				break;
			case 17:
				log.info("Enter number of decimal numbers to append");
				obj.appendStrings(arrList,obj2.getStrArr(obj2.getInt()));
				log.info("Enter the index to create a sublist of above array list ");
				obj.removePresent(arrList, obj.subList(arrList,obj2.getInt(),obj2.getInt()));
				log.info("Update ArrayList\t"+arrList);
				break;
			case 18:
				log.info("Enter number of decimal numbers to append");
				obj.appendStrings(arrList,obj2.getStrArr(obj2.getInt()));
				log.info("Enter the index to create a sublist of above array list ");
				ArrayList<Object> arrLists = new ArrayList<Object>(arrList);
				obj.removeNotPresent((ArrayList) arrList, obj.subList(arrLists,obj2.getInt(),obj2.getInt()));
				log.info("Update ArrayList\t"+arrList);
				break;
			case 19:
				log.info("Enter number of decimal numbers to append");
				obj.appendStrings(arrList,obj2.getLongArr(obj2.getInt()));
				obj.removeType(arrList);
				log.info(""+arrList);
				break;
			case 20:
				log.info("Enter number of decimal numbers to append");
				obj.appendStrings(arrList,obj2.getStrArr(obj2.getInt()));
				log.info(""+obj.checkContain(arrList,obj2.getString()));
				log.info(arrList+" and lenght is "+obj.getLength(arrList));
				break;
			case 21:
				log.info("terminated");
				runAgain ="No";
				break;
			default:
				log.info("Enter number b/w 1-21 only");
				break;
			}
		}catch(KeyException e){
				log.info("oops!! " +e.getMessage());
		}
	}while(runAgain.equalsIgnoreCase("Yes"));
	sc.close();
}
}