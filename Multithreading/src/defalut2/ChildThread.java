package defalut2;

public class ChildThread extends Thread {
	display d;
	ChildThread (display d)
	{
		this.d = d;
	}
	public void run()
	{
		int i=1;
		while(true)
		{
			try {
				d.set(i);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("Producer "+i);
			i++;
		}
	}

}
