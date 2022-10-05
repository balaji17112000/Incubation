package threads;

import java.util.logging.Logger;

import taskrunners.RegExRunner;

public class ExtentedThread extends Thread {
	private static final Logger log = Logger.getLogger(RegExRunner.class.getName());
	private int time,key=3;
	public ExtentedThread(int time){
		this.time= time;
	}
	@Override
//	public void run(){
//		//1.
//		log.info("Going to sleep"+getName());
//		log.info(getName()+"-Name\n"+getState()+"-State\n"+getPriority()+"- Priority\n");
//	}
//	public void run(){
//		//4.
//		log.info("Going to sleep"+getName());
//		try {
//			Thread.sleep(10000);
//		} catch (InterruptedException e) {
//			e.printStackTrace();
//		}
//		log.info("After sleep "+getName());
//		//1.
//		log.info("Worked in thread"+Thread.currentThread());
//		log.info(getName()+"-Name\n"+getState()+"-State\n"+getPriority()+"- Priority\n");
//	}
//	public void run(){
//		//6.
//			while(true) {
//				try {
//					Thread.sleep(time);
//					log.info("After "+time/1000+" seconds"+getName());
//					log.info(getName()+"-Name\n");
//				} catch (InterruptedException e1) {
//					e1.printStackTrace();
//				}
//				}
//			}
	public void run(){
		//7.
			while(key!=0) {
				try {
					Thread.sleep(time);
					log.info("After "+time/1000+" seconds"+getName());
					log.info(getName()+"-Name\n");
				} catch (InterruptedException e1) {
					e1.printStackTrace();
				}
				key--;
				}
			}
	}
//	public Thread inputs() throws InterruptedException {
//		ExtentedThread extendedThread= new ExtentedThread();
//		extendedThread.setName("program ExThread");
//		extendedThread.setPriority(2);
//		log.info(extendedThread.getName()+"-Name\n"+extendedThread.getState()+"-State\n"+extendedThread.getPriority()+"- Priority\n");
//		extendedThread.start();
//		return extendedThread;
//	}
//try {
//	if(key<3) {
//		this.sleep(60*1000);
////		Thread.dumpStack();
//		log.info("Thread Dumped");
//		key--;
//	}
//} catch (InterruptedException e) {
//	e.printStackTrace();
//}
