import java.util.InputMismatchException;
import java.util.Scanner;

public class InputValidation  implements Validaton 
{
	 public double validaton()
		{
			Scanner in = new Scanner(System.in);
			boolean b=true;
			double value=0;
			while(b)
			{
			try{
			in = new Scanner(System.in);
			value = in.nextDouble();
			b=false;
			}
			catch (InputMismatchException e)
			{
				System.out.println("Enter the left valid value");
				System.out.println("try again");
				b=true;
			}
			}
			return value;
		}
		public char SymbolValidation()
		{
			Scanner in = new Scanner(System.in);
			boolean b = true;
			char symbol = 0;
			while(b)
			{
			in = new Scanner(System.in);
			symbol = in.next().charAt(0);
			if(symbol == '+'||symbol == '-'||symbol == '*'|| symbol == '/'|| symbol == '=') 
			{
			b=false;
			}
			else {
			System.out.println("Enter the valid symbol");
			System.out.println("try again");
			b=true;}
			}
			return symbol;
		}
}
