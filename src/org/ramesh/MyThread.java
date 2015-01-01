package org.ramesh;

public class MyThread implements Runnable{

	private Thread t;
	private String threadName;
	
	public MyThread(String threadName) {
		super();
		this.threadName = threadName;
		System.out.println("Creating thread: "+threadName);
	}

	@Override
	public void run() {
		System.out.println("Running thread: "+threadName);
		for(int i =0;i<5;i++){
			System.out.println("Thread: "+threadName+", "+i);
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				System.out.println("Thread intruppted");
			}
		}
		System.out.println("Exiting Thread: "+threadName);
	}
	
	public void start(){
		if(t==null)
		{
			t= new Thread(this, threadName);
			t.start();
		}
	}
}
