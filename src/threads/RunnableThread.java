package threads;

public class RunnableThread implements Runnable{
	private int time,key=3;
	RunnableThread(int time){
		this.time= time;
	}
	@Override
//	public void run(){
//	//2.
//	System.out.println(Thread.currentThread().getName()+"-Name\n"+Thread.currentThread().getState()+"-State\n"+Thread.currentThread().getPriority()+"- Priority\n");
//}
	
//	public void run() {
//		//4.
//		System.out.println("Going to sleep"+Thread.currentThread().getName());
//		while(true) {
//			try {
//				Thread.sleep(5000);
//			} catch (InterruptedException e) {
//				e.printStackTrace();
//			}
//			System.out.println("After sleep "+Thread.currentThread().getName());
//			//2.
//			System.out.println(Thread.currentThread().getName()+"-Name\n"+Thread.currentThread().getState()+"-State\n"+Thread.currentThread().getPriority()+"- Priority\n");
//			break;
//		}
//	}
//	public void run(){
//			//6.
//			while(true) {
//				try {
//					Thread.sleep(time);
//					System.out.println("After "+time/1000+" seconds"+Thread.currentThread().getName());
//					System.out.println(Thread.currentThread().getName()+"-Name\n");
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
				System.out.println("After "+time/1000+" seconds"+Thread.currentThread().getName());
				System.out.println(Thread.currentThread().getName()+"-Name\n");
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
//		System.out.println(thread2.getName()+"-Name\n"+thread2.getState()+"-State\n"+thread2.getPriority()+"- Priority\n");
//		thread2.start();
//		return thread2;
//	}
}