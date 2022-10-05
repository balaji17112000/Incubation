package operations;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.*;

import util.Check;
import util.KeyException;

public class RegExOperations {
	
	public int getLength(String str) throws KeyException{
		Check.nullCheck(str);
		return str.length();
	}
	public boolean patternCheck(String str, String expression) {
		return Pattern.matches(expression, str);
	}
	public boolean checkString(String str) throws KeyException{	
		Check.emptyCheck(str);
		int n= getLength(str);
		if( n!=10) {
			throw new KeyException("Enter only 10 digit to validate");
		}
		return patternCheck(str,"^[7-9]\\d{9}");
	}
	public boolean getAlphaNumeric(String str) throws KeyException {
		Check.emptyCheck(str);
		return patternCheck(str,"[0-9[a-z][A-Z]]+");
	}
	public boolean startCheck(String str, String subStr) throws KeyException {
		Check.emptyCheck(str);
		Check.emptyCheck(subStr);
		return patternCheck(str,subStr+"+.*");
	}
	public boolean containsCheck(String str, String subStr) throws KeyException {
		Check.emptyCheck(str);
		Check.emptyCheck(subStr);
		return patternCheck(str,"^.*"+subStr+"+.*");
	}
	public boolean endCheck(String str, String subStr) throws KeyException{
		Check.emptyCheck(subStr);
		Check.emptyCheck(str);
		return patternCheck(str,"^.*"+subStr);
	}
	public boolean exactCheck(String str, String subStr) throws KeyException{
		Check.emptyCheck(subStr);
		Check.emptyCheck(str);
		return patternCheck(str,subStr);
	}
	public List<String> stringMatchCaseIgnore(String checkStr,String ... str) throws KeyException {
		Check.nullCheck(str);
		int len = str.length;
		List<String> words = new ArrayList<String>(len);
		Boolean check;
		for(String word: str) {
			check = patternCheck(word,"(?i)"+checkStr); // (?i) ignore case
			words.add(String.valueOf(check));
		}
		return words;
	}
	public boolean emailCheck(String email) throws KeyException {
		Check.emptyCheck(email);
		return patternCheck(email,"^\\w+@{1}?.\\w+\\.{1}+.\\w+"); //@{1}? exactly @ 1 time
//		^\w+@{1}?.\w+\.{1}.\w+  --> ^word + @ +word+ . + word -------------  ^.+@.+\.+.+
	}public List<String> stringLenCheck(String str[]) throws KeyException{
		Check.nullCheck(str);
		int len = str.length;
		List<String> words = new ArrayList<String>(len);
		Boolean check; 
		for(String word:str) {
			check = patternCheck(word,"[a-zA-Z]{1,6}");
			words.add(String.valueOf(check));
		}
		return words;
	}
	public Map<String,Integer> listContainCheck( String list[],String ...subList) throws KeyException{
		Check.nullCheck(subList);
		Check.nullCheck(list);
		int len = subList.length;
		List<String> wordList = Arrays.asList(list); // for index 
		Map<String,Integer> words = new HashMap<String,Integer>(len);
		String str = String.join(",", list); // string arr to string str
		Boolean check; 
		for(String word:subList) {
			check = patternCheck(str,"^.*"+word+"+.*"); // check word contains in string str
			if(check==false) {	// break if even one value fails match
				words = null;
				break;
			}
			words.put(word,wordList.indexOf(word));
		}
		return words;
	}
	public List<String> htmlTagsCheck(String html) throws KeyException {
		Check.emptyCheck(html);
		List<String> list = new ArrayList<String>();
		Pattern pattern = Pattern.compile("<\\w*.>|</\\w*.>");
		Matcher matcher = pattern.matcher(html); // matcher has {<word> and </word> elements}
		while(matcher.find()) {	//	will search for the next matching word
		   list.add(matcher.group()); // matcher.group will hold the current 
		}
		return list; 
	}
}
//8. String regEx = "<\\w*.>|</\\w*.>";
//String str[] =html.split(regEx);
//System.out.println(Arrays.toString(str));
//list = Arrays.asList(html.split(str[1]));
