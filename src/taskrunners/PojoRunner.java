package taskrunners;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.logging.Logger;

import file_system.DateTimeRunner;



public class PojoRunner {
	private static final Logger log = Logger.getLogger(DateTimeRunner.class.getName());
	public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, InstantiationException {
		Class<?> pojo = Class.forName("file_system.OpertationPojo");
		// default constructor
		Object objectConstructor =pojo.newInstance();
		//Constructor<?>[] cr= pojo.getConstructors();
		log.info(""+objectConstructor); 
		// 2 parameter constructor
		Class<?>[] type = { String.class,Integer.class }; // set type of constructor parameter 
		Constructor<?> cr2= pojo.getConstructor(type);
		Object  objectConstructor2= cr2.newInstance("Balaji",21);
		log.info(""+objectConstructor2); 
		//3 Invoking methods by setting method (with no parameters)
		Method m1 = pojo.getMethod("getterString");
		Method m2 = pojo.getMethod("getterNumber");
		System.out.println(objectConstructor2);
		Object  objectMethod1= m1.invoke(objectConstructor2);
		Object  objectMethod2= m2.invoke(objectConstructor2);
		log.info(objectMethod1+"\n"+objectMethod2);
		
		
	}
}
//file_system.OpertationPojo pojoObj = new file_system.OpertationPojo();
//log.info(pojoObj);

//log.info(cr[1].toString());
//log.info(pojo.getMethods());

//Method m = pojo.getMethod("toString", String.class, boolean.class);
//m.invoke(t,null);