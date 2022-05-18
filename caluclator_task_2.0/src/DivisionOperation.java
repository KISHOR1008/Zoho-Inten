import java.util.Scanner;

public class DivisionOperation extends Abs_calculator {
	static public double create (double left,double right)
	{
		DivisionOperation d = new DivisionOperation();
		double res=0;
		
		d.set(left,right);
		int a = d.check(left,right);
		if(a==1)
		{
		 res =d.caluction((int)left,(int)right);	
		}
		else if(a==2)
		{
			res = d.caluction(left,right);	
		}
		else if(a==3)
		{
			res=d.caluction((int)left,right);
		}
		else
		{
			res = d.caluction(left,(int)right);
		}
		return res;
	}
	public void set(double left,double right)
	{
		Scanner in = new Scanner(System.in);
		this.left = left;
		boolean b = true;
		while(b)
		{
			if(right==0)
			{
				System.out.println("Right side value can not be Zero");
				System.out.println("Enter Again");
				right = in.nextDouble();
				b = true;
			}
			else
				b=false;
			
		}
		this.right = right;
		
	}
	
	@Override
	double caluction(double left, double right) {
		
		return left / right;
	}
	public double caluction(int value1, double value2)
	{
		return value1 / value2;
		
	}
	public double caluction(double value1, int value2)
	{
		return value1 / value2;
		
	}
	public double caluction(int value1, int value2)
	{
		
		return (double)value1 / (double)value2;
	}



}
