package task5;

import java.util.*;

public class CarTestRunner {
	static Scanner sc = new Scanner(System.in);
	static Car carObj = new Car();
	static Swift obj1 = new Swift();
	static SCross obj2 = new SCross();
	static XUV obj3 = new XUV();
	static Car swObj = new Swift();
	String getString(){
		System.out.println("Enter string:");
		String str = sc.nextLine();
		return str;
	}
	 char getChar(){
		System.out.println("Enter a character: ");
		return sc.next().charAt(0);
	}
	void typeCar(Car object) {
		object.setter(getInt(),getString(), getString());
		System.out.println("Year of make: "+object.getYearOfMake()+"\n"+"Engine Number: "+object.getEngineNo()+"\n"+"GetType : "+object.getType());
	}
	void typeSwift(Swift object) {
		object.setter(getInt(),getInt(),getString(), getString());
		System.out.println("Number of seats : "+object.getseats()+"\n"+"Number of airBags : "+object.getairBags()+"\n"+"Model : "+object.getmodel()+"\n"+"colour : "+object.getcolour());
		}
	void typeOfCar(Car object) {
		typeCar(object);
		if(object instanceof Swift) {
			System.out.println("Hatch");
		}
		else if(object instanceof SCross) {
			System.out.println("SUV");
		}
		else if(object instanceof XUV) {
			System.out.println("Sendan");
		}
	}
	int getInt(){
		int num=0;
		System.out.println("Enter integer: ");
		try{
		 num= sc.nextInt();
		 }catch(Exception e){
		 System.out.println("Invalid input");
		 }
		 sc.nextLine();
		return num;
	}
	public static void main(String[] args) {
		String runAgain;
		do{
			CarTestRunner obj = new CarTestRunner();
			System.out.println("Enter between 1 - 20 to execute the Operation \n 1.Set and Get from Swift car \n 2.Set and Get from SCross and from super class car");
			try{
				int questionNumber= obj.getInt();
				switch(questionNumber){
				case 1:
					System.out.println(" Enter the number of seats \n Enter the number of airbags \n Enter the model \n Enter the colour");
					obj1.setter(obj.getInt(),obj.getInt(), obj.getString(), obj.getString());
					System.out.println("Number of seats : "+obj1.getseats()+"\n"+"Number of airBags : "+obj1.getairBags()+"\n"+"Model : "+obj1.getmodel()+"\n"+"colour : "+obj1.getcolour());
					break;
				case 2:
					System.out.println(" Enter the number of seats \n Enter the number of airbags \n Enter the model \n Enter the colour");
					obj2.setter(obj.getInt(),obj.getInt(), obj.getString(), obj.getString());
					System.out.println("Number of seats : "+obj2.getseats()+"\n"+"Number of airBags : "+obj2.getairBags()+"\n"+"Model : "+obj2.getmodel()+"\n"+"colour : "+obj2.getcolour());
					obj2.setter(obj.getInt(),obj.getString(), obj.getString());
					System.out.println("Year of make: "+obj2.getYearOfMake()+"\n"+"Engine Number: "+obj2.getEngineNo()+"\n"+"GetType : "+obj2.getType());
					break;
				case 3:
					obj.typeCar(obj1); 
					obj.typeCar(obj2);
					obj.typeCar(obj3); 
					break;
				case 4:
					obj.typeOfCar(obj1); 
					obj.typeOfCar(obj2);
					obj.typeOfCar(obj3); 
					break;
				case 5:
					obj.typeSwift(obj1);  
				//	obj.typeSwift(swWbj);
				//	obj.typeSwift(obj2); 
				//	obj.typeSwift(obj3); 
					break;
				case 6:
					obj2.maintance();
					swObj.maintance();
					carObj.maintance();
					obj1.maintance();
					break;
				case 7:
					XUV object1 = new XUV();
				//	XUV object2 = new XUV("Test");
					break;
				default:
					System.out.println("Only enter btw 1-10  :_ ) \n");
			}
			}catch(Exception e){
					System.out.println("oops!! " +e.getMessage());
			}
			System.out.println("do you want to exit Y/N");
			runAgain = sc.next();
		}while(runAgain.equalsIgnoreCase("n"));
	sc.close();
	}
}