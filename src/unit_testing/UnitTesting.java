package unit_testing;

import java.lang.reflect.*;
import java.util.Scanner;


public class UnitTesting {
	static final Scanner sc = new Scanner(System.in);
	public static void main(String[] args) throws InstantiationException, IllegalAccessException, InvocationTargetException, NoSuchMethodException, SecurityException {
		System.out.println("Enter the class name with package");
		String className = sc.nextLine();
		try {
			int total=0,fail=0;
			Class<?> testClass = Class.forName(className);
			Method method[] = testClass.getDeclaredMethods();
			Object objectConstructor =testClass.newInstance();
			for(Method m:method) {
				Parameter arr[]= m.getParameters();
				Class<?>[] parameter_types = m.getParameterTypes();
			//	System.out.println(Arrays.toString(arr));
				Object parameter[] = new Object[m.getParameterCount()];		
				for(int i = 0; i< arr.length ;i++) {
					if (parameter_types[i].equals(int.class)||parameter_types[i].equals(long.class) ||parameter_types[i].equals(double.class) ||parameter_types[i].equals(float.class) ) {
						parameter[i] = 0;
					}
					else if(parameter_types[i].equals(char.class)){
						parameter[i] = '\u0000';
					}
					else {
						parameter[i] = null;
					}
				}
				try {
				//	System.out.println(Arrays.toString(parameter));
					try {
					Object invokedMethod = m.invoke(objectConstructor,parameter);
				//	System.out.println(invokedMethod );
					}catch(Exception e) {
						if(e.getCause().getClass().getName()=="java.lang.NullPointerException"||e.getCause().getClass().getName()== null) {
							System.err.println("-----------------------null pointing check ---------------------------------------------");
							System.err.println(e.getCause()+ " in "+m.getName());
							fail ++;
						}
					}
				} catch ( IllegalArgumentException e) {
					e.printStackTrace();
				}
			}
			total = method.length;
			System.out.println("Total Methods\t: "+total);
			System.out.println("Passed cases \t: "+(total-fail));
			System.err.println("Failed cases \t: "+(fail));
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
}
