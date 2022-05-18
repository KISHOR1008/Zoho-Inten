package defalut2;

public class abc extends Thread {
	display d;
	abc (display d)
	{
		this.d = d;
	}
	public void run()
	{
		while(true)
		{
			try {
				System.out.println("conusmer "+d.get());
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
