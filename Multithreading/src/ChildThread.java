
public class ChildThread extends Thread {
	display d;
	ChildThread (display d)
	{
		this.d = d;
	}
	public void run()
	{
		for(int i=0;i<1000;i++)
			d.inc();
	}

}
