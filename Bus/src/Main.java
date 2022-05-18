import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Main {

	public static void main(String[] args)
	{
		ArrayList<Bus> buses = new ArrayList<Bus>();
		ArrayList<Booking> bookings = new ArrayList<Booking>();
		ArrayList<Passenger> passenger = new ArrayList<Passenger>();
		
		buses.add(new Bus(1,true,2,"salem","madurai"));
		buses.add(new Bus(2,false,2,"salem","chennai"));
		buses.add(new Bus(3,true,2,"chennar","salem"));
		int userIn = 1;
		Scanner in = new Scanner(System.in);
		//for(Bus b: buses)
		//{
			//b.displayInfo();
		//}
		do 
		{
			
			System.out.println("Enter 1 to book");
			System.out.println("Enter 2 to view the ticket ");
			System.out.println("Enter 3 cancle the ticket ");
			System.out.println("Enter 4 see the transcation ");
			userIn = in.nextInt();
			switch(userIn)
			{
			case 1:
			
				Booking b = new Booking();
				System.out.println("------------------------------------------------------------------------------------");
				System.out.println("Avialble Seats in Every buses is");
				b.availableSeat(bookings, buses);
				System.out.println("Bus no :1 salem to madurai");
				System.out.println("Bus no :2 salem to chennai");
				System.out.println("Bus no :3 chennat to salem");
				System.out.println("------------------------------------------------------------------------------------");
				System.out.println("------------------------------------------------------------------------------------");
				System.out.print("Enter your Bus number  ");
				int choice = in.nextInt();
				System.out.println("------------------------------------------------------------------------------------");
				
				Booking booking = new Booking();
				booking.create(passenger);
				switch(choice)
				{
				case 1:
					if(booking.isAvailable(bookings,buses))
						
					{
						bookings.add(booking);
						System.out.println("Booking is confirmed");
						System.out.println("------------------------------------------------------------------------------------");
					}
					else
						System.out.println("Sorry Bus is not avialble Try another date");
					break;
				case 2:
					if(booking.isAvailable(bookings,buses))
						
					{
						bookings.add(booking);
						System.out.println("Booking is confirmed");
						System.out.println("------------------------------------------------------------------------------------");
					}
					else
						System.out.println("Sorry Bus is not avialble Try another date");
					break;
				case 3:
					if(booking.isAvailable(bookings,buses))
						
					{
						bookings.add(booking);
						System.out.println("Booking is confirmed");
						System.out.println("------------------------------------------------------------------------------------");
					}
					else
						System.out.println("Sorry Bus is not avialble Try another date");
					break;
				}
				break;
			
			case 2:
			
				booking = new Booking();
				System.out.println("------------------------------------------------------------------------------------");
				System.out.println("Enter your id ");
				int id = in.nextInt();
				System.out.println("------------------------------------------------------------------------------------");
				booking.view(bookings, id);
				
				break;
				
			
			case 3:

				booking = new Booking();
				System.out.println("------------------------------------------------------------------------------------");
				System.out.println("Enter your id ");
				System.out.println("------------------------------------------------------------------------------------");
				id = in.nextInt();
				booking.cancel(bookings, id,passenger);
				break;
			
			
			case 4:
				for(Passenger p: passenger)
				{
					System.out.println("------------------------------------------------------------------------------------");
					System.out.println("Name           : "+p.name);
					System.out.println("id             : "+p.id);
					System.out.println("Amount paid    : "+p.Amount_paid);
					System.out.println("Booking Status : "+p.process);
					System.out.println("------------------------------------------------------------------------------------");
				}
				
			}
			
				
		}while(userIn!=0);
		

	}

}
	/*if(booking.isAvailable(bookings,buses))
		
	{
		bookings.add(booking);
		System.out.println("Booking is confirmed");
	}
		else
			System.out.println("Sorry Bus is Full");
	
}*/