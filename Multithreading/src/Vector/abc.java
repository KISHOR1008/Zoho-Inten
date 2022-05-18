package Vector;

import java.util.ArrayList;
import java.util.Vector;

public class abc  extends Thread  {
	Vector d;
	abc (Vector d)
	{
		this.d = d;
	}
	public void run()
	{
		
			System.out.println(d.contains(1));
	}

}
