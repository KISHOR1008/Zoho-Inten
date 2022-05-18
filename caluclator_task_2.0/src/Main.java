public class Main extends InputValidation {
	
	public static void main(String[] args) 
	{	
		Main m = new Main();
		System.out.println("hi");
		double left = m.validaton();
		char symbol = m.SymbolValidation();
		double right = m.validaton();
		double res=0;
		do
		{
		switch(symbol)
		{
		case '+':
			res = AddOperation.create(left, right);
		break;
		 
		case '-':
			res = SubOperation.create(left, right);
		break;
		
		case '*':
			res = MultipleOperation.create(left, right);
		 break;
		 
		case '/':
			res = DivisionOperation.create(left, right);
		 break;
			
		}
		symbol = m.SymbolValidation();
		
		left = res;
		if(symbol!='=')
		{
			right = m.validaton();
		}
	}while(symbol!='=');
		int temp =(int)res;
		if((res-temp)>0)
			System.out.println(res);
		else
			System.out.println(temp);
		
	}
}
	

	