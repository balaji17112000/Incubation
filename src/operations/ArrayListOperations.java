package operations;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.Predicate;

import util.Check;
import util.KeyException;

public class ArrayListOperations<T> {
	public ArrayList<T> getArrList() {
		ArrayList<T> arrList= new ArrayList<T>();
		return arrList;
	}
	public int getLength( List<T> arrList) throws KeyException{
		Check.nullCheck(arrList);
		return arrList.size();
	}
	public List<T> appendStrings(List<T> arrList ,T... string) throws KeyException{
		Check.nullCheck(arrList);
		Check.nullCheck(string);
		int length=string.length;
		for(int i=0; i<length;i++ ) {
			 arrList.add(string[i]);
		}
		return arrList;
	}
	public void appendString(List<T> arrList ,T str, int index) throws KeyException{
		Check.nullCheck(str);
		arrList.add(index, str);
	}
	public int findIndex(List<T> arrList ,String str) throws KeyException{
		Check.nullCheck(arrList);
		Check.nullCheck(str);
		return arrList.indexOf(str);
	}
	public Object findString(List<T> arrList ,int index) throws KeyException{
		Check.nullCheck(arrList);
		if (getLength(arrList)<=index) {
			throw new KeyException("Given Index value is greater than the List size");
		}
		return arrList.get(index);
	}
	public int[] findDuplicate(List<T> arrList) throws KeyException{
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
	public Iterator<T> printArray(List<T> arrList ) throws KeyException{
		Check.nullCheck(arrList);
		return arrList.iterator();
	}
	public List<T> subList(List<T> arrList ,int startIndex, int endIndex) throws KeyException{
		Check.nullCheck(arrList);
		if (endIndex >=getLength(arrList)||startIndex<0 || startIndex>endIndex ) {
			throw new KeyException("Given Index value is greater than the List size");
		}
		return arrList.subList(startIndex,endIndex);
	}
	public ArrayList<T> mergeList(List<T> arrList1 ,List<T> arrList2 ) throws KeyException{
		Check.nullCheck(arrList1);
		ArrayList<T> arrList= new ArrayList<T>();
		arrList.addAll(arrList1);
		arrList.addAll(arrList2);
		return arrList;
	}
	public void deleteElement(List<T> arrList, double value ) throws KeyException{
		Check.nullCheck(arrList);
		arrList.remove(value);
	}
	public void deleteElementAtIndex(List<T> arrList, int index ) throws KeyException{
		Check.nullCheck(arrList);
		if (index>getLength(arrList)) {
			throw new KeyException("Given Index value is greater than the List size");
		}
		arrList.remove(index);
	}
	public void deleteRange(List<T> arrList, int startIndex ,int endIndex) throws KeyException{
		Check.nullCheck(arrList);
		if (startIndex>endIndex || startIndex<0 || endIndex>getLength(arrList)) {
			throw new KeyException("Given Index value is greater than the List size");
		}
		arrList.removeAll(arrList.subList(startIndex,endIndex));
	}
	public void removePresent(List<T> arrList ,List<T> subList) throws KeyException{
		Check.nullCheck(arrList);
		if (!arrList.containsAll(subList) ) {
			throw new KeyException("Given Sublist is not in List");
		}
		arrList.removeAll(subList);
	}
	public void removeType(List<T> arrList ) throws KeyException{
		Check.nullCheck(arrList);
		arrList.removeAll(arrList);
	}
	public boolean checkContain(List<T> arrList, String str ) throws KeyException{
		Check.nullCheck(arrList);
		return arrList.contains(str);
	}
	public void removeNotPresent(ArrayList<T> arrList ,List<T> subList) throws KeyException{
		Check.nullCheck(arrList);
		List<T> temp = new ArrayList<T>();
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
