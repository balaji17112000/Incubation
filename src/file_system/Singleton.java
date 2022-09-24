package file_system;

class Singleton {
	private Singleton() {}
	private static Singleton instance =null;
	public static Singleton getInstance() {
		if(instance==null) {
			instance = new Singleton();
		}
		return instance;
	}
	public String toString(){
		System.out.println(instance);
		return null;
	}
}
