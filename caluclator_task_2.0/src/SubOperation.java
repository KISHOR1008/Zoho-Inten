
public class SubOperation extends Abs_calculator {
	static public double create (double left,double right)
	{
		double res=0;
		SubOperation s = new SubOperation();
		s.set(left,right);
		int a = s.check(left,right);
		if(a==1)
		{
		 res = s.caluction((int)left,(int)right);	
		}
		else if(a==2)
		{
			res = s.caluction(left,right);	
		}
		else if(a==3)
		{
			res = s.caluction((int)left,right);
		}
		else
		{
			res = s.caluction(left,(int)right);
		}
		return res;
	}
	@Override
	double caluction(double left, double right) {
		
		return left - right;
	}
	public double caluction(int value1, double value2)
	{
		return value1 - value2;
		
	}
	public double caluction(double value1, int value2)
	{
		return value1 - value2;
		
	}
	public double caluction(int value1, int value2)
	{
		
		return value1 - value2;
	}

}
