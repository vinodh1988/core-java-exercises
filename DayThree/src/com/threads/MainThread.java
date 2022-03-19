package com.threads;

public class MainThread {
   public static void main(String[] args) {
	   RandomMessageProducer rm=new RandomMessageProducer(" ThreadFirst ",1000,30);
	   rm.start();//make the thread ready
	   RandomMessageProducer rm2=new RandomMessageProducer(" ThreadSecond ",200,200);
	   rm2.start();
	   RandomMessageProducer rm3=new RandomMessageProducer(" ThreadThree ",50,100);
	  SameMessageRepeater rm4=new SameMessageRepeater("Runnable Thread", 100, 300);
	   try {
		rm.join();
		rm2.join();
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	   rm3.start();
    }
}

/*
thread has various states

created
ready
running
stopped
wait
sleep

if state is wait it will always change to ready
if stat is sleep it will always change to ready
only ready threads will given chance to run and made running
*/