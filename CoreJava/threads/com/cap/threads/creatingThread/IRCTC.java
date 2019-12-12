package com.cap.threads.creatingThread;

public class IRCTC {
	synchronized void confirmTicket()
	{
		for(int i=0;i<4;i++)
		{
			System.out.println(i);
			
			try {
				wait();
			} catch (InterruptedException e1) {
				// TODO Auto-generated catch block
				System.out.println(e1.getMessage());
			}
			
//			try {
//				Thread.sleep(1000);
//			} catch (InterruptedException e) {
//				e.printStackTrace();
//			}
			
			
		}
		
	}
	synchronized void leaveMe()
	{
		System.out.println("notify called");
		//notify();
		notifyAll();
	}
}
