import java.util.ArrayList;

public class Avialble {
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
			System.out.println("Number of Seats avialble in "+i+" Bus no "+(capacity-booked));
		}
		System.out.println("------------------------------------------------------------------------------------");
	}

}
