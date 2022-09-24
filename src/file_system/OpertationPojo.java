package file_system;

public class OpertationPojo {
	int number;
	String str;
	public OpertationPojo() {}
	public OpertationPojo(String str, Integer number) {
		this.number=number;
		this.str=str;
	}
	public int getterNumber(){
		return number;
	}
	public String getterString(){
		return str;
	}
	public String toString() {
		return getterString()+"|"+getterNumber();
	}
}
