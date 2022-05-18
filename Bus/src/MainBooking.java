import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class MainBooking extends BankDeatils {
	static int count =0;
	static int b = 1232;
	static int c = 312;
	int id;
	String passengerName;
	int busNo;
	Date date;
	String otp;
	
	void create(ArrayList<Passenger> passenger )
	{
		System.out.println("------------------------------------------------------------------------------------");
		Scanner in = new Scanner(System.in);
		count++;
		id = count;
		System.out.println("Ennter name of passenger:");
		passengerName = in.next();
		System.out.println("Ennter bus no:");
		busNo = in.nextInt();
		boolean k =true;
		while(k)
		{
		Date current = new Date();
		System.out.println("Enter the date dd-mm-yyyy");
		String dateInput = in.next();
		SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
		try {
			date = dateFormat.parse(dateInput);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		if(current.compareTo(date)<0)
		{
			k = false;
		}
		else
		{
			k =true;
			System.out.println("Enter the valid date ");
			System.out.println("Dates available are 25-04-2022");
		}
		}
		payment();
		otp=generateOTP(id,passengerName,busNo,date);
		Passenger pass =new Passenger();
		String status = "Booked";
		pass.update(id, passengerName, price, status);
		passenger.add(pass);
		System.out.println("------------------------------------------------------------------------------------");
		
		
	}

	 String generateOTP(int id2, String passengerName2, int busNo2, Date date2)
	 {
			System.out.println("------------------------------------------------------------------------------------");
			System.out.println("**ENJOY YOUR RIDE**" );
			System.out.println("Customer Id      : " + id2 );
			System.out.println("Customer name    : "+passengerName2);
			System.out.println("Customer BusNO   : "+busNo2);
			SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
			System.out.println("Date             : "+dateFormat.format(date2));
			String OTP =""+id2 +b+c;
			b++;
			c++;
			System.out.println("Amount paid      :"+price);
			System.out.println("OTP              : " + OTP );
			System.out.println("------------------------------------------------------------------------------------");
			return OTP;
	}
	 
}
