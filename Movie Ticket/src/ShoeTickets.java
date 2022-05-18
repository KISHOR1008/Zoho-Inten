import java.util.Scanner;

class ShowTicket1 extends Ticket 
{
	static int numberOfSeatsForThisShow;
    static int numberOfSeatsSoldForThisShow;
	static Scanner scanner = new Scanner(System.in);
	
	public boolean checkIfNumberOfTicketsAvailable(int requirement)
	{
		if(requirement <= numberOfSeatsForThisShow)
			return true;
		else
			return false;
	}
	
	public void reduceTheTotalTickets()
	{
		numberOfSeatsForThisShow -= this.numberOfSeatsForThisTicket;
	}
	
	public void increaseSoldTickets()
	{
		numberOfSeatsSoldForThisShow +=this.numberOfSeatsForThisTicket;
	}
	
	static void setTicketsForTheShow()
	{
		System.out.println("Enter the number of tickets to be provided for 10:00 AM show: ");
		numberOfSeatsForThisShow = scanner.nextInt();
	}
	
	public static void displayShowStats()
	{
		System.out.println("\nNumber of Seats for 10:00 AM show: "+ numberOfSeatsForThisShow);
	}
	
	ShowTicket1()
	{
		this.showTiming="10:00 AM";
	}
}

class ShowTicket2 extends Ticket
{
	static int numberOfSeatsForThisShow;
	static int numberOfSeatsSoldForThisShow;
	static Scanner scanner = new Scanner(System.in);
	
	public boolean checkIfNumberOfTicketsAvailable(int requirement)
	{
		if(requirement <= ShowTicket2.numberOfSeatsForThisShow)
			return true;
		else
			return false;
	}
	
	public void increaseSoldTickets()
	{
		numberOfSeatsSoldForThisShow+=this.numberOfSeatsForThisTicket;
	}
	
	public void reduceTheTotalTickets()
	{
		numberOfSeatsForThisShow -= this.numberOfSeatsForThisTicket;
	}

	public static void  setTicketsForTheShow()
	{
		System.out.println("Enter the number of tickets to be provided for 06:00 PM show: ");
		numberOfSeatsForThisShow = scanner.nextInt();
	}
	
	public static void displayShowStats()
	{
		System.out.println("Number of Seats for 06:00 PM show: "+ numberOfSeatsForThisShow);
	}
	ShowTicket2()
	{
		this.showTiming="06:00 PM";
	}
}

class ShowTicket3 extends Ticket 
{
	static int numberOfSeatsForThisShow=68;
	static int numberOfSeatsSoldForThisShow;
	static Scanner scanner = new Scanner(System.in);
	
	public void bookTickets()
	{
		this.numberOfSeatsForThisTicket-=1;
		this.showTiming="10:00 PM";
	}
	
	public boolean checkIfNumberOfTicketsAvailable(int requirement)
	{
		if(requirement <= ShowTicket3.numberOfSeatsForThisShow)
			return true;
		else
			return false;
	}
	
	public void reduceTheTotalTickets()
	{
		ShowTicket3.numberOfSeatsForThisShow -= this.numberOfSeatsForThisTicket;
	}
	
	public void increaseSoldTickets()
	{
		numberOfSeatsSoldForThisShow+=this.numberOfSeatsForThisTicket;
	}
	
	public static void setTicketsForTheShow()
	{
		System.out.println("Enter the number of tickets to be provided for 10:00 PM show: ");
		numberOfSeatsForThisShow = scanner.nextInt();
	}
	
	public static void displayShowStats()
	{
		System.out.println("Number of Seats for 10:00 PM show: "+ numberOfSeatsForThisShow + "\n");
	}
	
	ShowTicket3()
	{
		this.showTiming="10:00 PM";
	}
}
