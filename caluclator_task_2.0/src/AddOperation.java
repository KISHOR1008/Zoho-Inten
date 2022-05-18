
public class AddOperation extends Abs_calculator 
{	
	static public double create (double left,double right)
	{
		double res = 0;
		AddOperation add = new AddOperation();
		add.set(left,right);
		int a = add.check(left,right);
		if(a==1)
		{
		 res =add.caluction((int)left,(int)right);	
		}
		else if(a==2)
		{
			res = add.caluction(left,right);	
		}
		else if(a==3)
		{
			res=add.caluction((int)left,right);
		}
		else
		{
			res = add.caluction(left,(int)right);
		}
		return res;
	}
	@Override
	double caluction(double left, double right) {
		
		
		return left + right;
	}
	public double caluction(int value1, double value2)
	{
		return value1 + value2;
		
	}
	public double caluction(double value1, int value2)
	{
		return value1 + value2;
		
	}
	public double caluction(int value1, int value2)
	{
		
		return value1 + value2;
	}

}
