package threads;

public class ExtentedThread extends Thread {
	private int time,key=3;
	public ExtentedThread(int time){
		this.time= time;
	}
	@Override
//	public void run(){
//		//1.
//		System.out.println("Going to sleep"+getName());
//		System.out.println(getName()+"-Name\n"+getState()+"-State\n"+getPriority()+"- Priority\n");
//	}
//	public void run(){
//		//4.
//		System.out.println("Going to sleep"+getName());
//		try {
//			Thread.sleep(10000);
//		} catch (InterruptedException e) {
//			e.printStackTrace();
//		}
//		System.out.println("After sleep "+getName());
//		//1.
//		System.out.println("Worked in thread"+Thread.currentThread());
//		System.out.println(getName()+"-Name\n"+getState()+"-State\n"+getPriority()+"- Priority\n");
//	}
//	public void run(){
//		//6.
//			while(true) {
//				try {
//					Thread.sleep(time);
//					System.out.println("After "+time/1000+" seconds"+getName());
//					System.out.println(getName()+"-Name\n");
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
					System.out.println("After "+time/1000+" seconds"+getName());
					System.out.println(getName()+"-Name\n");
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
//		System.out.println(extendedThread.getName()+"-Name\n"+extendedThread.getState()+"-State\n"+extendedThread.getPriority()+"- Priority\n");
//		extendedThread.start();
//		return extendedThread;
//	}
//try {
//	if(key<3) {
//		this.sleep(60*1000);
////		Thread.dumpStack();
//		System.out.println("Thread Dumped");
//		key--;
//	}
//} catch (InterruptedException e) {
//	e.printStackTrace();
//}
