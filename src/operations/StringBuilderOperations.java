package operations;

import util.*;
import util.Check;

public class StringBuilderOperations {
	public int getLength( StringBuilder strBld) throws KeyException{
		Check.nullCheck(strBld); 
		return strBld.length();
	}
	public StringBuilder appendStrings(String str[],String symbol) throws KeyException{
		Check.nullCheck(str); // done
		Check.nullCheck(symbol);
		StringBuilder strBr= new StringBuilder();
		int length=str.length;
		for(int i=0; i<length;i++ ) {
			 strBr.append(str[i]);
			 strBr.append(symbol);
		}
		int len=getLength(strBr);
		if(!symbol.isEmpty()) {
			strBr = strBr.delete(len-symbol.length(),len); // last n char delete done
		}
		return strBr;
	}
	public StringBuilder insertStrings(String str[],String newStr, int index) throws KeyException{ // get index to insert :low priority done done
		Check.nullCheck(str);
		Check.nullCheck(newStr);
		StringBuilder strBr = appendStrings(str," ");
		int n = 0,temp = 0;
		for(int i=0;i<index;i++) {
			n =strBr.indexOf(" ",temp);
			temp=n+1;
		}
		if(index!=0) {
			strBr.insert(n+1,newStr);
			return strBr.insert(n+newStr.length()+1," ");
		}
		strBr.insert(n,newStr);
		return strBr.insert(n+newStr.length()," ");
	}
	public StringBuilder deleteString(String str[],int index) throws KeyException{ //index to delete? done done
		Check.nullCheck(str);
		StringBuilder strBr = appendStrings(str," ");
		int n = 0,temp = 0;
		for(int i=0;i<index;i++) {
			n =strBr.indexOf(" ",temp);
			temp=n+1;
		}
			if (index==str.length) {
				return strBr.delete(n,n+str[index].length()); 
		}
		return strBr.delete(n,n+str[index].length()+1); 
	}
	public StringBuilder replaceString(StringBuilder strBr,char symbol,char newSymbol) throws KeyException{ //which symbol to replace? done
		//null check done
		int n = getLength(strBr);
		for (int index = 0; index < n; index++) {
		    if (strBr.charAt(index) == symbol) {
		        strBr.setCharAt(index, newSymbol);
		    }
		}
		return strBr;
	}
	public StringBuilder reverseString(StringBuilder strBr) throws KeyException{
		Check.nullCheck(strBr);
		return strBr.reverse();
	}
	public StringBuilder deleteChar(StringBuilder strBr,int start, int end) throws KeyException{
		if(start<0 || end<0 || end>getLength(strBr) || start>getLength(strBr)){
			throw new KeyException("Invalid Index");
		}
		return strBr.delete(start,end+1);
	}
	public StringBuilder replaceChar(StringBuilder strBr,int start, int end,String str) throws KeyException{
		if(start<0 || end<0 || end>getLength(strBr) || start>getLength(strBr)){
			throw new KeyException("Invalid Index");
		}
		return strBr.replace(start,end+1,str);
	}
	public int findFirstChar(StringBuilder strBr,String str) throws KeyException{
		Check.nullCheck(strBr);
		return strBr.indexOf(str);
	}
	public int findLastChar(StringBuilder strBr,String str) throws KeyException{
		Check.nullCheck(strBr);
		return strBr.lastIndexOf(str);
	}
}
//	int n=strBr.indexOf(str[index]);