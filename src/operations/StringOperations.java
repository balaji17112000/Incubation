package operations;
import java.util.Objects;

import util.*;
public class StringOperations { 

	public int getLength(String str) throws KeyException{
		Check.nullCheck(str);
		return str.length();
	}
	public char[] toCharArr(String str) throws KeyException{
		Check.nullCheck(str);
		return str.toCharArray();
	}
	public String[] getStrings(String str) throws KeyException{ 
		Check.nullCheck(str);
		str= str.trim();
		return str.split(" ");
	}
	public char nthPosition(String str,int n) throws KeyException{  
		Check.nullCheck(str);
        return str.charAt(getLength(str)-n);
	}
	public char nthPosition(String str) throws KeyException{
        return nthPosition(str, getLength(str));
	}
	public int greatestPos(String word, char letter) throws KeyException{ 
		Check.nullCheck(word);
	    return word.lastIndexOf(letter);
	 }
	public int occurance(String str, char letter) throws KeyException{ 
		int length = getLength(str);
		int count=0;
			for(int i=0; i<length;i++){
				if (str.charAt(i)==letter){
					count++;
				}
		}
	    return count;
	 }   
	public String subStrings(String str, int start, int end)throws KeyException{
		if (getLength(str)<=end){
			throw new KeyException(" ooops! check string length before entering n");
		} 
		return str.substring(start,end);
	}
	public String replace(String str, String substring) throws KeyException{
		String output;
		int length = getLength(substring); // get length() in common
		if(getLength(str)<length){
			throw new KeyException("oops! check string length before entering substring");
		}
		return str.replace(subStrings(str, 0,length),substring);
		}
	public boolean checkEnd(String str,String subStr) throws KeyException{ //change return type
		Check.nullCheck(str);
		return str.endsWith(subStr);
	}
	public boolean checkStart(String str,String subStr) throws KeyException{
		Check.nullCheck(str);
		return str.startsWith(subStr);
	}
	public String upperCase(String str) throws KeyException{
		Check.nullCheck(str);
		return str.toUpperCase();
	}
	public String lowerCase(String str) throws KeyException{
		Check.nullCheck(str);
		return str.toLowerCase();
	}
	public String reverseString(String str) throws KeyException{
		Check.nullCheck(str); 
		String output="";
		int length = getLength(str)-1;   //no inbuilt method in String.. so use logic
		for(int i=length;i>=0;i--){
			output+=str.charAt(i);
		}
		return output;
	}
	public String concateString(String[] strArr, String symbols) throws KeyException{
		Check.nullCheck(strArr);
		String output="";
		return String.join("-",strArr);
	}
	public boolean caseSensitive(String str1,String str2) throws KeyException{
		Check.nullCheck(str1);
		Check.nullCheck(str2);
		return str1.equals(str2);
	}
	public boolean CaseInSensitive(String str1,String str2) throws KeyException{
		Check.nullCheck(str1);
		Check.nullCheck(str2);
		return str1.equalsIgnoreCase(str2);
	}
	public String customSpacing(String str) throws KeyException{
		return concateString(getStrings(str)," ");
	}
}

/*	private int[] findOccurance(String word, char letter) throws KeyException{  
		nullCheck(word);
		int index = 0,count = 0,n=0;
		int[] output = new int[2];
		while (true)
	    {
	        index = word.indexOf(letter, index);
	        if (index != -1)
	        {
	            count ++;
	            index += 1;
	            n= index;
	        }else {
	            break;
	        }
	    }
	    output[0]=n;
	    output[1]=count;
	    return output;
	}
*/
