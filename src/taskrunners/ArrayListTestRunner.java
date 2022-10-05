package taskrunners;



import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import operations.ArrayListOperations;
import util.KeyException;

public class ArrayListTestRunner {
	private static Scanner sc = new Scanner(System.in);
	private String[] getStrArr(int n){
		String str[]= new String[n];
		System.out.println("Enter string to append: ");
		for(int i=0;i<n;i++) {
			str[i] = sc.nextLine();
		}
		return str;
	}
	private Integer[] getIntArr(int n){
		Integer intArr[]= new Integer[n];
		System.out.println("Enter value to append: ");
		for(int i=0;i<n;i++) {
			intArr[i] = sc.nextInt();
		}
		return intArr;
	}
	private Long[] getLongArr(int n){
		Long longArr[]= new Long[n];
		System.out.println("Enter value to append: ");
		for(int i=0;i<n;i++) {
			longArr[i] = sc.nextLong();
		}
		return longArr;
	}
	private Double[] getDoubleArr(int n){
		Double dblArr[]= new Double[n];
		System.out.println("Enter value to append: ");
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
		System.out.println("Enter string:");
		String str = sc.nextLine();
		return str;
	}
	private char getChar(){
		System.out.println("Enter a character: ");
		return sc.next().charAt(0);
	}
	private int getInt(){
		int num=0;
		System.out.println("Enter integer: ");
		try{
		 num= sc.nextInt();
		 }catch(InputMismatchException e){
		 System.out.println("Invalid input");
		 }
		 sc.nextLine();
		return num;
	}
public static void main(String[] args) {
	String runAgain="Yes";
	do{
		System.out.println("Enter between 1 - 20 to execute the ArrayList Operation. 21 to Exit");
		try{
			ArrayListOperations obj = new ArrayListOperations();
			ArrayListTestRunner obj2 = new ArrayListTestRunner();
			List<Object> arrList= obj.getArrList();
			List<Object> arrList1= obj.getArrList();
			int questionNumber= obj2.getInt();
			switch(questionNumber){
			case 1:
				System.out.println("The length of empty array list is "+obj.getLength(arrList));
				break;
			case 2:
				System.out.println("Enter number of strings to append");
				obj.appendStrings(arrList,obj2.getStrArr(obj2.getInt()));
				System.out.println(arrList+"and the length is "+obj.getLength(arrList));
//				System.out.println(arrList.get(1).getClass().getSimpleName()+" Type");
				break;
			case 3:
				System.out.println("Enter number of strings to append");
				obj.appendStrings(arrList,obj2.getIntArr(obj2.getInt()));
				System.out.println(arrList+"and the length is "+obj.getLength(arrList));
				break;
			case 4:
				System.out.println("Enter number of strings to append");
				obj.appendStrings(arrList,obj2.getObjArr(obj2.getInt()));
				System.out.println(arrList+"and the length is "+obj.getLength(arrList));
				break;
			case 5:
				System.out.println("Enter number of Integer(Int) to append");
				obj.appendStrings(arrList,obj2.getIntArr(obj2.getInt()));
				System.out.println("Enter number of strings to append");
				obj.appendStrings(arrList,obj2.getStrArr(obj2.getInt()));
				System.out.println("Enter number of Objects to append");
				obj.appendStrings(arrList,obj2.getObjArr(obj2.getInt()));
				System.out.println(arrList+"and the length is "+obj.getLength(arrList));
				break;
			case 6:
				System.out.println("Enter number of strings to append");
				obj.appendStrings(arrList,obj2.getStrArr(obj2.getInt()));
				System.out.println("Enter string to search");
				System.out.println("Found at "+obj.findIndex(arrList, obj2.getString())+" Index");
				break;
			case 7:
				System.out.println("Enter number of strings to append");
				obj.appendStrings(arrList,obj2.getStrArr(obj2.getInt()));
				Iterator itr= obj.printArray(arrList);
				while(itr.hasNext()) {
					System.out.println(itr.next());
				}
				break;
			case 8:
				System.out.println("Enter number of strings to append");
				obj.appendStrings(arrList,obj2.getStrArr(obj2.getInt()));
				System.out.println("Enter Index to find");
				System.out.println("Found "+obj.findString(arrList, obj2.getInt()));
				break;
			case 9:
				System.out.println("Enter number of strings to append");
				obj.appendStrings(arrList,obj2.getStrArr(obj2.getInt()));
				System.out.println("Found at");
				int[] a=obj.findDuplicate(arrList);
				System.out.println("First index and Last Index"+a[0]+a[1]);
				break;
			case 10:
				System.out.println("Enter number of strings to append");
				obj.appendStrings(arrList,obj2.getStrArr(obj2.getInt()));
				System.out.println("Enter string and index to insert string at index");
				obj.appendString(arrList,obj2.getString(),obj2.getInt());
				System.out.println(arrList);
				break;
			case 11:
				System.out.println("Enter number of strings to append");
				obj.appendStrings(arrList,obj2.getStrArr(obj2.getInt()));
				System.out.println("Enter start index and end index");
				System.out.println(obj.subList(arrList, obj2.getInt(), obj2.getInt()));
				break;
			case 12:
				System.out.println("Enter number of strings to append");
				obj.appendStrings(arrList,obj2.getStrArr(obj2.getInt()));
				System.out.println("Enter number of strings to append");
				obj.appendStrings(arrList1,obj2.getStrArr(obj2.getInt()));
				System.out.println("Merged List\t"+obj.mergeList(arrList,arrList1));
				break;
			case 13:
				System.out.println("Enter number of strings to append");
				obj.appendStrings(arrList,obj2.getStrArr(obj2.getInt()));
				System.out.println("Enter number of strings to append");
				obj.appendStrings(arrList1,obj2.getStrArr(obj2.getInt()));
				System.out.println("Merged List\t"+obj.mergeList(arrList1,arrList));
				break;
			case 14:
				System.out.println("Enter number of decimal numbers to append");
				obj.appendStrings(arrList,obj2.getDoubleArr(obj2.getInt()));
				System.out.println("Enter the decimal value to delete:");
				obj.deleteElement(arrList, sc.nextDouble());
				System.out.println("Update ArrayList\t"+arrList);
				break;
			case 15:
				System.out.println("Enter number of decimal numbers to append");
				obj.appendStrings(arrList,obj2.getDoubleArr(obj2.getInt()));
				System.out.println("Enter the decimal value to delete:");
				obj.deleteElement(arrList, sc.nextDouble());
				System.out.println("Update ArrayList\t"+arrList);
				break;
			case 16:
				System.out.println("Enter number of decimal numbers to append");
				obj.appendStrings(arrList,obj2.getDoubleArr(obj2.getInt()));
				System.out.println("Enter the decimal value to delete:");
				obj.deleteRange(arrList,obj2.getInt(),obj2.getInt());
				System.out.println("Update ArrayList\t"+arrList);
				break;
			case 17:
				System.out.println("Enter number of decimal numbers to append");
				obj.appendStrings(arrList,obj2.getStrArr(obj2.getInt()));
				System.out.println("Enter the index to create a sublist of above array list ");
				obj.removePresent(arrList, obj.subList(arrList,obj2.getInt(),obj2.getInt()));
				System.out.println("Update ArrayList\t"+arrList);
				break;
			case 18:
				System.out.println("Enter number of decimal numbers to append");
				obj.appendStrings(arrList,obj2.getStrArr(obj2.getInt()));
				System.out.println("Enter the index to create a sublist of above array list ");
				ArrayList<Object> arrLists = new ArrayList<Object>(arrList);
				obj.removeNotPresent((ArrayList) arrList, obj.subList(arrLists,obj2.getInt(),obj2.getInt()));
				System.out.println("Update ArrayList\t"+arrList);
				break;
			case 19:
				System.out.println("Enter number of decimal numbers to append");
				obj.appendStrings(arrList,obj2.getLongArr(obj2.getInt()));
				obj.removeType(arrList);
				System.out.println(arrList);
				break;
			case 20:
				System.out.println("Enter number of decimal numbers to append");
				obj.appendStrings(arrList,obj2.getStrArr(obj2.getInt()));
				System.out.println(obj.checkContain(arrList,obj2.getString()));
				System.out.println(arrList+" and lenght is "+obj.getLength(arrList));
				break;
			case 21:
				System.out.println("terminated");
				runAgain ="No";
				break;
			default:
				System.out.println("Enter number b/w 1-21 only");
				break;
			}
		}catch(KeyException e){
				System.out.println("oops!! " +e.getMessage());
		}
	}while(runAgain.equalsIgnoreCase("Yes"));
	sc.close();
}
}