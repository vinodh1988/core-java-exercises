package com.threads;

public class SameMessageRepeater implements Runnable {
  
	private Thread thread;
	private int sleeptime;
	private int rounds;
	
	public SameMessageRepeater(String name,int sleeptime,int rounds) {
		// TODO Auto-generated constructor stub
		thread = new Thread(this,name);
		this.sleeptime=sleeptime;
		this.rounds=rounds;
		thread.start();
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		int i=1;
		while(i<rounds) {
			System.out.println(thread.getName()+"  is generating message for iteration "+i);
			try {
				thread.sleep(sleeptime);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			i++;
		}
	}

}
