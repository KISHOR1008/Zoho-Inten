import java.util.ArrayList;
import java.util.Scanner;
import java.util.Iterator;

class OnlinePortal
{
	public static void CustomerBooking()
	{
		ArrayList<Ticket> myTickets= new ArrayList<Ticket>();
		ArrayList<Ticket> myTicketsForShow1= new ArrayList<Ticket>();
		ArrayList<Ticket> myTicketsForShow2= new ArrayList<Ticket>();
		ArrayList<Ticket> myTicketsForShow3= new ArrayList<Ticket>();
		
		boolean control = true;
		Scanner sc = new Scanner(System.in);
		
		while(control)
		{
			Ticket ticket;
			int choice;
			System.out.println("\nPress 1 for Ticket Details");
			System.out.println("Press 2 for Booking Tickets");
			System.out.println("Press 3 for viewing the booked ticket details");
			System.out.println("Press 4 to exit the portal");
			System.out.print("\nEnter your choice of operation:");
			
			choice = sc.nextInt();
			
			switch(choice)
			{
			case 1:
				ShowTicket1.displayShowStats();
				ShowTicket2.displayShowStats();
				ShowTicket3.displayShowStats();
				break;
			case 2:
				int showNumber;
				int numberOfTickets;
				boolean availability;
				
				System.out.println("\npress 1 for 10:00 AM show\npress 2 for 06:00 PM show\npress 3 for 10:00PM show");
				System.out.println("\nEnter the show you for your cinema:");
				showNumber = sc.nextInt();
				
				while(showNumber>3 || showNumber<1)
				{
					System.out.println("Enter a valid show number:");
					showNumber=sc.nextInt();
				}
				
				switch(showNumber)
				{
				case 1:
					ticket = new ShowTicket1();
					System.out.print("Enter the number of tickets needed: ");
					ticket.numberOfSeatsForThisTicket=sc.nextInt();
					
					if(ticket.checkIfNumberOfTicketsAvailable(ticket.numberOfSeatsForThisTicket))
					{
						ticket.reduceTheTotalTickets();
						ticket.increaseSoldTickets();
						System.out.println("Ticket booked");
						myTickets.add(ticket);
					}
					else
						ticket = null;
					break;
					
				case 2:
					ticket = new ShowTicket1();
					
					System.out.print("Enter the number of tickets needed: ");

					ticket.numberOfSeatsForThisTicket=sc.nextInt();
					
					if(ticket.checkIfNumberOfTicketsAvailable(ticket.numberOfSeatsForThisTicket))
					{
						ticket.reduceTheTotalTickets();
						myTickets.add(ticket);
						System.out.println("Ticket booked\n");
					}
					else
						System.out.println("The number of tickets you asked for is not available:");

					break;
					
				case 3:
					ticket = new ShowTicket1();
					System.out.print("Enter the number of tickets needed: ");
					ticket.numberOfSeatsForThisTicket=sc.nextInt();
					
					if(ticket.checkIfNumberOfTicketsAvailable(ticket.numberOfSeatsForThisTicket))
					{
						ticket.reduceTheTotalTickets();
						ShowTicket3.setTicketsForTheShow();
						myTickets.add(ticket);
						System.out.println("Ticket booked");
					}
					else
					{
						System.out.println("The number of tickets you asked for is not available:");
						ticket = null;
					}
					break;
				default:
					ticket = null;
				}
				break;
			case 3:	
				Iterator<Ticket> itr = myTickets.iterator();
				while(itr.hasNext()) 
				{
					System.out.println("Number of seats for this ticket: "+((Ticket)itr.next()).numberOfSeatsForThisTicket);
				}
				break;
			case 4:
				control = false;
				break;
			default:
				System.out.println("Invalid choice!\n");
			}
		}
	}
}