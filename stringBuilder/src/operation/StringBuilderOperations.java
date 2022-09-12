package operation;

import util.*;
import util.Check;

public class StringBuilderOperations {
	public int getLength( StringBuilder strBld) throws KeyException{
		return strBld.length();
	}
	public StringBuilder appendStrings(String str[],String symbol) throws KeyException{
		Check.nullCheck(str);
		StringBuilder strBr= new StringBuilder();
		int length=str.length;
		for(int i=0; i<length;i++ ) {
			 strBr.append(str[i]);
			 strBr.append(symbol);
		}
		if(!symbol.isEmpty()) {
			strBr = strBr.deleteCharAt(getLength(strBr)-symbol.length());
		}
		return strBr;
	}
	public StringBuilder insertStrings(String str[],String newStr) throws KeyException{
		Check.nullCheck(str);
		StringBuilder strBr = appendStrings(str," ");
		strBr.insert(str[0].length(),newStr );
		return strBr.insert(str[0].length()," ");
	}
	public StringBuilder deleteString(String str[]) throws KeyException{
		Check.nullCheck(str);
		StringBuilder strBr = appendStrings(str," ");
		return strBr.delete(0,str[0].length());
	}
	public StringBuilder replaceString(StringBuilder strBr,String symbol) throws KeyException{
		int n = strBr.length();
		for (int index = 0; index < n; index++) {
		    if (strBr.charAt(index) == ' ') {
		        strBr.setCharAt(index, '-');
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
		return strBr.delete(start,end);
	}
	public StringBuilder replaceChar(StringBuilder strBr,int start, int end,String str) throws KeyException{
		if(start<0 || end<0 || end>getLength(strBr) || start>getLength(strBr)){
			throw new KeyException("Invalid Index");
		}
		return strBr.replace(start,end,str);
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