package task5;

public class BirdRunner {

	public static void main(String[] args) {
		//BirdAbstract obj = new BirdAbstract(); wont work until bird extended
		Parrot obj1 = new Parrot();
		obj1.speak();
		obj1.fly();
		Duck obj2 = new Duck();
		obj2.speak();
		obj2.fly();
		

	}

}
