package com.atos.java.multithreading;

class NewThread implements Runnable {
	
	
	String name;
	Thread t;
	
	NewThread(String threadname)
	{
		name=threadname;
		t=new Thread(this,name);
		System.out.println("New Thread :"+t);
		t.start();
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		try
		{
			for(int i=5;i>0;i--)
			{
				System.out.println(name + ":"+i);
				Thread.sleep(2000);
			}
		}catch(InterruptedException e)
		{
			
			System.out.println(name +" Interrupted");
			
		}
		System.out.println(name+" Exisitng");
	}

}


public class MultiThreadDemo
{
	public static void main(String[] args)
	{
		new NewThread("One");
		new NewThread("Two");
		new NewThread("Three");
		try{
			Thread.sleep(1000);
		}catch(InterruptedException e)
		{
			System.out.println("main thread interrupted");
		}
		System.out.println("Mian Thread Exisitng");
	}
}