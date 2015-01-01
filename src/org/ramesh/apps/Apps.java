package org.ramesh.apps;
import org.ramesh.ExtendedThread;
import org.ramesh.RunnableThread;


public class Apps {

	public static void main(String[] args) {
		
		
		//Threading using Runnable
//		RunnableThread t1 = new RunnableThread("first");
//		t1.start();
//		RunnableThread t2 = new RunnableThread("second");
//		t2.start();
		
		//Threadin using Thread
		ExtendedThread t1 = new ExtendedThread("first");
		t1.start();
		ExtendedThread t2 = new ExtendedThread("second");
		t2.start();

	}

}
