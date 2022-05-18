abstract public class Abs_calculator  
{
	public double left;
	public double right;
	
	public void set(double left,double right)
	{
		this.left = left;
		this.right = right;
	}
	public int check(double left,double right)
	{
		int temp1 = (int)left;
		int temp2 = (int)right;
		if((left-temp1)==0&&(right-temp2)==0)
		{
			return 1;
		}
		else if((left-temp1)>0&&(right-temp2)>0)
		{
			return 2;
		}
		else if((left-temp1)==0&&(right-temp2)>0)
		{
			return 3;
		}
		else
		{
			return 4;
		}
	}
	abstract double caluction(double left,double right);
	
}
