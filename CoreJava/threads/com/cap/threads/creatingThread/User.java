package com.cap.threads.creatingThread;

public class User extends Thread{
	PVR p;

	public User(PVR p) {
		super();
		this.p = p;
	}

	@Override
	public void run() {
		p.confirmTicket();
	}
	
}
