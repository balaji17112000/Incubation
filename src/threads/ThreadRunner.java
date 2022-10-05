package threads;

import java.util.Scanner;
import java.util.logging.Logger;

import taskrunners.RegExRunner;

public class ThreadRunner {
	private static final Logger log = Logger.getLogger(RegExRunner.class.getName());
	static Scanner sc = new Scanner(System.in);
	private static int getInt() {
		log.info("Enter Sleep time");
		int n = sc.nextInt();
		return n;
	}
	public static void main(String[] args) throws InterruptedException {
		// 1. using extend
//		ExtentedThread extendedThread= new ExtentedThread();
//		log.info(extendedThread.getName()+"-Name\n"+extendedThread.getState()+"-State\n"+extendedThread.getPriority()+"- Priority\n");
//		extendedThread.start();
//Scanner sc = new Scanner(System.in);		// 2. using runnable
//		Runnable runObj1 = new RunnableThread(getInt());
//		Thread runnableThread = new Thread(runObj);
//		log.info(runnableThread.getName()+"-Name\n"+runnableThread.getState()+"-State\n"+runnableThread.getPriority()+"- Priority\n");
//		runnableThread.start();
		//3. set name and execute  also 4th and 5 problems.
		log.info("Enter Sleep time for extended thread2 in sec");
		ExtentedThread extendedThread2= new ExtentedThread(getInt()*1000);
		extendedThread2.setName("ExtendedThread1");
		log.info(extendedThread2.getName()+"-Name\n");
		
		log.info("Enter Sleep time for Runnable thread2 in sec");
		RunnableThread runObj2 = new RunnableThread(getInt()*1000);
		Thread runnableThread2 = new Thread(runObj2);
		runnableThread2.setName("RubnnableThread2");
		log.info(runnableThread2.getName()+"-Name\n");
		
		log.info("Enter Sleep time for extended thread3 in sec");
		ExtentedThread extendedThread3= new ExtentedThread(getInt()*1000);
		extendedThread3.setName("ExtendedThread3");
		log.info(extendedThread3.getName()+"-Name\n");
		
		log.info("Enter Sleep time for Runnable thread3 in sec");
		RunnableThread runObj3 = new RunnableThread(getInt()*1000);
		Thread runnableThread3 = new Thread(runObj3);
		runnableThread3.setName("RubnnableThread3");
		log.info(runnableThread3.getName()+"-Name\n");
		//5. 6. 7.
		extendedThread2.start();
		try {
			extendedThread2.join();
		}catch(InterruptedException e){
			log.info(""+e);
		}
		runnableThread2.start(); 
		try {
			runnableThread2.join();
			}catch(InterruptedException e){
				log.info(""+e);
			}
		extendedThread3.start();
		try {
			extendedThread3.join();
			}catch(InterruptedException e){
				log.info(""+e);
			}
		runnableThread3.start(); 
		try {
			runnableThread3.join();
			if(!extendedThread2.isAlive() && !extendedThread3.isAlive() && !runnableThread2.isAlive() && !runnableThread3.isAlive()) {
				log.info("Task completed \n Program will terminate in 5 sec....");
				Thread.sleep(5000);
			}
			}catch(InterruptedException e){
				log.info(""+e);
			}
		
	}

}
