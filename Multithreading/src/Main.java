class  display
{
	static int count=0;
	public void inc()
	{
		
			count++;
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
		//ch.join();
		//a.join();
		//ch.join();
		for(int i=0;i<5;i++)
		{
			System.out.println("Im in Main "+i);
		}
		System.out.println(ch.getState());
		System.out.println(d.count);
	}

}
