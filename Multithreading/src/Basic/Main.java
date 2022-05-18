package Basic;

import java.time.Duration;
import java.time.Instant;

public class Main {

	public static void main(String[] args) throws InterruptedException 
	{
		//long startTime = System.currentTimeMillis();  
		//long start = System.currentTimeMillis();
		// Your File Operation Logic
		Instant start = Instant.now();
		// Your File Operation Logic
		
		ChildThread ch = new ChildThread();
		ch.setPriority(1);
		ch.setName("my thread");
		System.out.println(ch.getName());
		System.out.println(ch.getState());
		System.out.println(ch.getPriority());
		ch.start();
		//ch.interrupt();
		
		//ch.join();
		for(int i=0;i<5;i++)
		{
			System.out.println("Im in the Main "+i);
		}
		
		System.out.println("after the threading ");
	   // System.out.println(+(System.currentTimeMillis()-startTime)+"ms");
		 Main.wait();
		Instant end = Instant.now();
		long timeElapsed = Duration.between(start, end).toMillis();
		System.out.println(timeElapsed);
	}

}
