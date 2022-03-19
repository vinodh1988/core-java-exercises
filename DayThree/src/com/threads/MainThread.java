package com.threads;

public class MainThread {
   public static void main(String[] args) {
	   RandomMessageProducer rm=new RandomMessageProducer(" ThreadFirst ",1000);
	   rm.start();//make the thread ready
	   RandomMessageProducer rm2=new RandomMessageProducer(" ThreadSecond ",200);
	   rm2.start();
	   RandomMessageProducer rm3=new RandomMessageProducer(" ThreadThree ",50);
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