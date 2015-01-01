package org.ramesh.apps;
import org.ramesh.MyThread;


public class Apps {

	public static void main(String[] args) {
		MyThread t1 = new MyThread("first");
		t1.start();
		MyThread t2 = new MyThread("second");
		t2.start();
		

	}

}
