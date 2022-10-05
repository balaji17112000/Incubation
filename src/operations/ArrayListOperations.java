package operations;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.Predicate;

import util.Check;
import util.KeyException;

public class ArrayListOperations {
	
	public  ArrayList<Object> getArrList(){
		ArrayList<Object> arrList= new ArrayList<Object>();
		return arrList;
	}
	public int getLength( List<Object> arrList) throws KeyException{
		Check.nullCheck(arrList);
		return arrList.size();
	}
	public List<Object> appendStrings(List arrList ,Object... string) throws KeyException{
		Check.nullCheck(arrList);
		Check.nullCheck(string);
		int length=string.length;
		for(int i=0; i<length;i++ ) {
			 arrList.add(string[i]);
		}
		return arrList;
	}
	public  void appendString(List arrList ,Object str, int index) throws KeyException{
		Check.nullCheck(str);
		arrList.add(index, str);
	}
	public int findIndex(List<Object> arrList ,String str) throws KeyException{
		Check.nullCheck(arrList);
		Check.nullCheck(str);
		return arrList.indexOf(str);
	}
	public Object findString(List<Object> arrList ,int index) throws KeyException{
		Check.nullCheck(arrList);
		if (getLength(arrList)<=index) {
			throw new KeyException("Given Index value is greater than the List size");
		}
		return arrList.get(index);
	}
	public  int[] findDuplicate(List<Object> arrList) throws KeyException{
		Check.nullCheck(arrList);
		String word;
		int n=getLength(arrList); 
		int intarr[]= new int[2];
		for(int i=1;i<n;i++){
			if (!arrList.contains(arrList.get(i))) {
				word = (String) arrList.get(i);
				intarr[0]=arrList.indexOf(word);
				intarr[1]=arrList.lastIndexOf(word);
				break;
				}
			}
		return intarr;
	}
	public Iterator<Object> printArray(List<Object> arrList ) throws KeyException{
		Check.nullCheck(arrList);
		return arrList.iterator();
	}
	public List<Object> subList(List<Object> arrList ,int startIndex, int endIndex) throws KeyException{
		Check.nullCheck(arrList);
		if (endIndex >=getLength(arrList)||startIndex<0 || startIndex>endIndex ) {
			throw new KeyException("Given Index value is greater than the List size");
		}
		return arrList.subList(startIndex,endIndex);
	}
	public ArrayList<Object> mergeList(List<Object> arrList1 ,List<Object> arrList2 ) throws KeyException{
		Check.nullCheck(arrList1);
		ArrayList<Object> arrList= new ArrayList<Object>();
		arrList.addAll(arrList1);
		arrList.addAll(arrList2);
		return arrList;
	}
	public <T> void deleteElement(List<T> arrList, double value ) throws KeyException{
		Check.nullCheck(arrList);
		arrList.remove(value);
	}
	public void deleteElementAtIndex(List<Object> arrList, int index ) throws KeyException{
		Check.nullCheck(arrList);
		if (index>getLength(arrList)) {
			throw new KeyException("Given Index value is greater than the List size");
		}
		arrList.remove(index);
	}
	public void deleteRange(List<Object> arrList, int startIndex ,int endIndex) throws KeyException{
		Check.nullCheck(arrList);
		if (startIndex>endIndex || startIndex<0 || endIndex>getLength(arrList)) {
			throw new KeyException("Given Index value is greater than the List size");
		}
		arrList.removeAll(arrList.subList(startIndex,endIndex));
	}
	public void removePresent(List<Object> arrList ,List<Object> subList) throws KeyException{
		Check.nullCheck(arrList);
		if (!arrList.containsAll(subList) ) {
			throw new KeyException("Given Sublist is not in List");
		}
		arrList.removeAll(subList);
	}
	public void removeType(List<Object> arrList ) throws KeyException{
		Check.nullCheck(arrList);
		arrList.removeAll(arrList);
	}
	public  boolean checkContain(List<Object> arrList, String str ) throws KeyException{
		Check.nullCheck(arrList);
		return arrList.contains(str);
	}
	public  void removeNotPresent(ArrayList<Object> arrList ,List<Object> subList) throws KeyException{
		Check.nullCheck(arrList);
		List<Object> temp = new ArrayList<Object>();
		temp = (List) arrList.clone();
		if (!arrList.containsAll(subList) ) {
			throw new KeyException("Given Sublist is not in List");
		}
		temp.removeAll(subList);
		System.out.println(temp+ " "+ arrList);
		arrList.removeAll(temp);
	}

}

//public int[] findDuplicate(ArrayList arrList) throws KeyException{
//	Check.nullCheck(arrList);
//	Object word=new Object();
//	boolean flag=false;
//	int n=getLength(arrList); 
//	int intarr[]= new int[2];
//	for(int i=0;i<n;i++){
//		for(int j=i;j<n;j++){
//			if (arrList.get(i)==arrList.get(j)){
//				word = arrList.get(i);
//				intarr[0]=arrList.indexOf(word);
//				intarr[1]=arrList.lastIndexOf(word);
//				flag = true;
//				break;
//			}
//		}
//		if (flag == true) {
//			break;
//		}
//	}
//	return intarr;
//}
//for(int i = 0; i<size;i++) {	
//	if(arrList.get(i) instanceof Long) {
//		arrList.remove(arrList.get(i));
//	}
//}
