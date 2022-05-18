import java.util.*;

abstract class Ticket implements Availability,TicketDetailsUpdater
{
	private static int totalNoOfTicketsAvailable;
	private static int totalNoOfTicketsSold;
	int noOfSeatsAvailableforthisTicketShow=3;
	
	String showTiming;
	int showNumber;
	int ticketNumber;
	int numberOfSeatsForThisTicket;

	Scanner sc = new Scanner(System.in);
	
	protected static void includingEachShowTotalTickets(int addTicket)
	{
		totalNoOfTicketsAvailable -= addTicket;
	}
	
	public void displayTicketsSold()
	{
		System.out.println("No of tickets sold for 10:00 AM show: "+ShowTicket1.numberOfSeatsForThisShow);
		System.out.println("No of tickets sold for 06:00 PM show: "+ShowTicket2.numberOfSeatsForThisShow);
		System.out.println("No of tickets sold for 10:00 PM show: "+ShowTicket3.numberOfSeatsForThisShow);
	}
}