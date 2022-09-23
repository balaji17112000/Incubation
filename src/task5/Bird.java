package task5;

public  abstract class Bird {
	abstract void fly();
	 void speak(){
		System.out.println("I can speak");
	}
}
class Duck extends Bird {
	 void fly(){
		System.out.println("I can't fly");
	}
}
