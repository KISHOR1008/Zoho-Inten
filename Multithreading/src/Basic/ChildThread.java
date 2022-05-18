package Basic;

public class ChildThread extends Thread 
{
	public void run()
	{
		//Thread.yield();
		
		for(int i=0;i<5;i++)
		{
			try {
				Thread.sleep(0);
				System.out.println("Im in the Child "+i);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				//e.printStackTrace();
				System.out.println("Sleep got interpted ");
			}
			
		}
	}
}
