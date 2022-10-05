package threads;

import java.util.logging.Logger;

import taskrunners.RegExRunner;

public class RunnableThread implements Runnable{
	private static final Logger log = Logger.getLogger(RegExRunner.class.getName());
	private int time,key=3;
	RunnableThread(int time){
		this.time= time;
	}
	@Override
//	public void run(){
//	//2.
//	log.info(Thread.currentThread().getName()+"-Name\n"+Thread.currentThread().getState()+"-State\n"+Thread.currentThread().getPriority()+"- Priority\n");
//}
	
//	public void run() {
//		//4.
//		log.info("Going to sleep"+Thread.currentThread().getName());
//		while(true) {
//			try {
//				Thread.sleep(5000);
//			} catch (InterruptedException e) {
//				e.printStackTrace();
//			}
//			log.info("After sleep "+Thread.currentThread().getName());
//			//2.
//			log.info(Thread.currentThread().getName()+"-Name\n"+Thread.currentThread().getState()+"-State\n"+Thread.currentThread().getPriority()+"- Priority\n");
//			break;
//		}
//	}
//	public void run(){
//			//6.
//			while(true) {
//				try {
//					Thread.sleep(time);
//					log.info("After "+time/1000+" seconds"+Thread.currentThread().getName());
//					log.info(Thread.currentThread().getName()+"-Name\n");
//				} catch (InterruptedException e1) {
//					e1.printStackTrace();
//				}
//				
//				}
//			}
	public void run(){
		//7.
		while(key!=0) {
			try {
				Thread.sleep(time);
				log.info("After "+time/1000+" seconds"+Thread.currentThread().getName());
				log.info(Thread.currentThread().getName()+"-Name\n");
			} catch (InterruptedException e1) {
				e1.printStackTrace();
			}
				key--;
			}
		}
//	public Thread inputs() throws InterruptedException {
//		Runnable runObj = new RunnableThread();
//		Thread thread2 = new Thread(runObj);	
//		thread2.setName("program Runnable");
//		thread2.setPriority(1);
//		log.info(thread2.getName()+"-Name\n"+thread2.getState()+"-State\n"+thread2.getPriority()+"- Priority\n");
//		thread2.start();
//		return thread2;
//	}
}