package org.tnsif.multithreading;

public class ChildThreadExecutor {

	public static void main(String[] args) throws InterruptedException{
		
		System.out.println("Is "+Thread.currentThread().getName()+" is Alive? "+Thread.currentThread().isAlive());
		ChildThread threadOne = new ChildThread();
		ChildThread threadTwo = new ChildThread();

		System.out.println("Is "+threadOne.getName()+" is Alive? "+threadOne.isAlive());
		System.out.println("Is "+threadTwo.getName()+" is Alive? "+threadTwo.isAlive());
		
		threadOne.join();
		threadTwo.join();
		
		System.out.println("Is "+threadOne.getName()+" is Alive? "+threadOne.isAlive());
		System.out.println("Is "+threadTwo.getName()+" is Alive? "+threadTwo.isAlive());
		
		
		System.out.println("----------------------------------------------------");
	}

}
