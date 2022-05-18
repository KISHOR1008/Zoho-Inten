import java.util.Scanner;

class Main
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in); 
		boolean control=true;
		
		ShowTicket1.setTicketsForTheShow();
		ShowTicket2.setTicketsForTheShow();
		ShowTicket3.setTicketsForTheShow();
		
		while(control)
		{
			int choice;
			System.out.print("\nPress 1 for setting ticket values for each show\nPress 2 to let customers book Tickets\nPress 3 to view sold tickets detail \nPress 4 to exit\n\nPress a number:");
			choice = sc.nextInt();
			switch(choice)
			{
			case 1:
				ShowTicket1.setTicketsForTheShow();
				ShowTicket2.setTicketsForTheShow();
				ShowTicket3.setTicketsForTheShow();
				break;
			case 2:
				OnlinePortal.CustomerBooking();
				break;
			case 3:
				System.out.println("No of tickets sold for 1st show:"+ShowTicket1.numberOfSeatsSoldForThisShow);
				System.out.println("No of tickets sold for 2nd show:"+ShowTicket2.numberOfSeatsSoldForThisShow);
				System.out.println("No of tickets sold for 3rd show:"+ShowTicket3.numberOfSeatsSoldForThisShow);
				break;
			case 4:
				control=false;
				break;
			default:
				System.out.println("Enter a valid number!");
				break;
			}
		}
	}
}