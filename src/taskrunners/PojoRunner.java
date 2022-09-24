package taskrunners;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;


public class PojoRunner {
	public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, InstantiationException {
		Class<?> pojo = Class.forName("file_system.OpertationPojo");
		// default constructor
		Object objectConstructor =pojo.newInstance();
		Constructor<?>[] cr= pojo.getConstructors();
		System.out.println(objectConstructor); 
		// 2 parameter constructor
		Class<?>[] type = { String.class,Integer.class }; // set type of constructor parameter 
		Constructor<?> cr2= pojo.getConstructor(type);
		Object  objectConstructor2= cr2.newInstance("Balaji",21);
		System.out.println(objectConstructor2); 
		//3 Invoking methods by setting method (with no parameters)
		Method m1 = pojo.getMethod("getterString");
		Method m2 = pojo.getMethod("getterNumber");
		Object  objectMethod1= m1.invoke(objectConstructor2);
		Object  objectMethod2= m2.invoke(objectConstructor2);
		System.out.println(objectMethod1+"\n"+objectMethod2);
	}
}
//file_system.OpertationPojo pojoObj = new file_system.OpertationPojo();
//System.out.println(pojoObj);

//System.out.println(cr[1].toString());
//System.out.println(pojo.getMethods());

//Method m = pojo.getMethod("toString", String.class, boolean.class);
//m.invoke(t,null);