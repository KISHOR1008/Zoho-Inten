package defalut2;

class  display
{
	int value = 0;
	boolean flag = true;
	synchronized void set(int v) throws InterruptedException
	{
		while(flag!=true)
			wait();
		value = v;
		flag = false;
		notify();
	}
	synchronized int get() throws InterruptedException
	{
		int x = 0;
		while(flag != false)
			wait();
		x = value;
		flag = true;
		notify();
		return x;
	}
	
}
public class Main {
	int count=0;
	public static void main(String[] args) throws InterruptedException 
	{
		display d = new display();
		ChildThread ch = new ChildThread(d);
		abc a = new abc(d);
		//ch.setPriority(1);
		System.out.println(ch.getState());
		//ch.run();
		ch.start();
		a.start();
		ch.join();
		a.join();
		//ch.join();
		for(int i=0;i<5;i++)
		{
			System.out.println("Im in Main "+i);
		}
		System.out.println(ch.getState());
		
	}

}
