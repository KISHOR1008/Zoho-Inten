
public class MultipleOperation extends Abs_calculator {
	static public double create (double left,double right)
	{
		MultipleOperation  m = new MultipleOperation ();
		double res=0;
		m.set(left,right);
		int a = m.check(left,right);
		if(a==1)
		{
		 res =m.caluction((int)left,(int)right);	
		}
		else if(a==2)
		{
			res = m.caluction(left,right);	
		}
		else if(a==3)
		{
			res=m.caluction((int)left,right);
		}
		else
		{
			res = m.caluction(left,(int)right);
		}
		return res;
	}
	@Override
	double caluction(double left, double right) {
		
		return left * right;
	}
	public double caluction(int value1, double value2)
	{
		return value1 * value2;
		
	}
	public double caluction(double value1, int value2)
	{
		return value1 * value2;
		
	}
	public double caluction(int value1, int value2)
	{
		
		return value1 * value2;
	}


}
