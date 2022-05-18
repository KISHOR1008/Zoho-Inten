
import java.text.SimpleDateFormat;
import java.util.*;
public class Booking extends MainBooking 
{
	
	
	void view(ArrayList<Booking> bookings,int j)
	{
		for(Booking b: bookings)
		{
				if(b.id ==j)
				{
					System.out.println("------------------------------------------------------------------------------------");
					System.out.println("Bus no         :"+b.busNo);
					System.out.println("passenger id   :"+b.id);
					System.out.println("passanger name :"+b.passengerName);
					SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
					System.out.println("Date           :"+dateFormat.format(b.date));
					System.out.println("OTP            :"+b.otp);
					System.out.println("------------------------------------------------------------------------------------");
					
				}
				
			
		}
	}
	public boolean isAvailable(ArrayList<Booking> bookings, ArrayList<Bus> buses) 
	{
		
		int capacity = 0;
		for(Bus bus : buses)
		{
			if(bus.getBusno() == busNo)
			{
				capacity = bus.getCapacity();
			}
		}
		int booked = 0;
		for(Booking b: bookings)
		{
			if(b.busNo == busNo && b.date.equals(date))
			{
				
				booked++;
			}
		}
		return booked<capacity?true:false;
	}
	public void availableSeat(ArrayList<Booking> bookings, ArrayList<Bus> buses)
	{
		System.out.println("------------------------------------------------------------------------------------");
		for(int i=1;i<=3;i++)
		{
			int capacity = 0;
			for(Bus bus : buses)
			{
				if(bus.getBusno() == i)
				{
					capacity = bus.getCapacity();
				}
			}
			int booked = 0;
			for(Booking b: bookings)
			{
				if(b.busNo == i)
				{
					
					booked++;
				}
			}
			System.out.println("Number of Seats avialble in Bus no "+i+" is "+(capacity-booked));
		}
		System.out.println("------------------------------------------------------------------------------------");
	}
	public void cancel(ArrayList<Booking> bookings, int j,ArrayList<Passenger> passenger)
	{
		int count=-1;
		String name1="";
		int id1=0;
		boolean k = false;
		for(Booking b: bookings)
		{
			count++;
				if(b.id ==j)
				{
		
					System.out.println("------------------------------------------------------------------------------------");
					System.out.println("Bus no         :"+b.busNo);
					System.out.println("passenger id   :"+b.id);
					System.out.println("passanger name :"+b.passengerName);
					SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
					System.out.println("Date           :"+dateFormat.format(b.date));
					System.out.println("Your ticket is cancelled Successfully");
					System.out.println("------------------------------------------------------------------------------------");
					Passenger pass =new Passenger();
					 String status = "Cancled";
					id1=b.id;
					name1=b.passengerName;
					pass.update(id1, name1, 15, status);
					passenger.add(pass);
					k = true;
				}
				
			
		}
		if(k)
		bookings.remove(count);
		else
			System.out.println("Not found");
		System.out.println("id is "+id1);
		System.out.println("Name is "+name1);
		
		
	}

}

