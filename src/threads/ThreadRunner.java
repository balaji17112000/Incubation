package threads;

import java.util.Scanner;

public class ThreadRunner {
	static Scanner sc = new Scanner(System.in);
	private static int getInt() {
		System.out.println("Enter Sleep time");
		int n = sc.nextInt();
		return n;
	}
	public static void main(String[] args) throws InterruptedException {
		// 1. using extend
//		ExtentedThread extendedThread= new ExtentedThread();
//		System.out.println(extendedThread.getName()+"-Name\n"+extendedThread.getState()+"-State\n"+extendedThread.getPriority()+"- Priority\n");
//		extendedThread.start();
//Scanner sc = new Scanner(System.in);		// 2. using runnable
//		Runnable runObj1 = new RunnableThread(getInt());
//		Thread runnableThread = new Thread(runObj);
//		System.out.println(runnableThread.getName()+"-Name\n"+runnableThread.getState()+"-State\n"+runnableThread.getPriority()+"- Priority\n");
//		runnableThread.start();
		//3. set name and execute  also 4th and 5 problems.
		System.out.println("Enter Sleep time for extended thread2 in sec");
		ExtentedThread extendedThread2= new ExtentedThread(getInt()*1000);
		extendedThread2.setName("ExtendedThread1");
		System.out.println(extendedThread2.getName()+"-Name\n");
		
		System.out.println("Enter Sleep time for Runnable thread2 in sec");
		RunnableThread runObj2 = new RunnableThread(getInt()*1000);
		Thread runnableThread2 = new Thread(runObj2);
		runnableThread2.setName("RubnnableThread2");
		System.out.println(runnableThread2.getName()+"-Name\n");
		
		System.out.println("Enter Sleep time for extended thread3 in sec");
		ExtentedThread extendedThread3= new ExtentedThread(getInt()*1000);
		extendedThread3.setName("ExtendedThread3");
		System.out.println(extendedThread3.getName()+"-Name\n");
		
		System.out.println("Enter Sleep time for Runnable thread3 in sec");
		RunnableThread runObj3 = new RunnableThread(getInt()*1000);
		Thread runnableThread3 = new Thread(runObj3);
		runnableThread3.setName("RubnnableThread3");
		System.out.println(runnableThread3.getName()+"-Name\n");
		//5. 6. 7.
		extendedThread2.start();
		try {
			extendedThread2.join();
		}catch(InterruptedException e){
			System.out.println(e);
		}
		runnableThread2.start(); 
		try {
			runnableThread2.join();
			}catch(InterruptedException e){
				System.out.println(e);
			}
		extendedThread3.start();
		try {
			extendedThread3.join();
			}catch(InterruptedException e){
				System.out.println(e);
			}
		runnableThread3.start(); 
		try {
			runnableThread3.join();
			if(!extendedThread2.isAlive() && !extendedThread3.isAlive() && !runnableThread2.isAlive() && !runnableThread3.isAlive()) {
				System.out.println("Task completed \n Program will terminate in 5 sec....");
				Thread.sleep(5000);
			}
			}catch(InterruptedException e){
				System.out.println(e);
			}
		
	}

}
