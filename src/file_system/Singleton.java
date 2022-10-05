package file_system;

import java.util.logging.Logger;

class Singleton {
	private static final Logger log = Logger.getLogger(DateTimeRunner.class.getName());
	private Singleton() {}
	private static Singleton instance =null;
	public static Singleton getInstance() {
		if(instance==null) {
			instance = new Singleton();
		}
		return instance;
	}
	public String toString(){
		log.info(""+instance);
		return null;
	}
}
