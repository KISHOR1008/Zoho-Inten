import java.util.Scanner;

public class BankDeatils {
	int acc_no;
	int price;
	void payment()
	{
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the acc no for the payment ");
		acc_no = in.nextInt();
		System.out.println("The amount of one ticket is rs 300");
		price = in.nextInt();
	}
	
	

}
