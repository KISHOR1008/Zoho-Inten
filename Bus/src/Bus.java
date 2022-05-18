

public class Bus extends BankDeatils {

	private int busNo;
	private boolean ac;
	private int capacity;
	private String from;
	private String to;
	private int earnings;
	
	
	public Bus(int busNo, boolean ac, int capacity,String from,String to)
	{
	this.busNo = busNo;
	this.ac = ac;
	this.capacity = capacity;
	this.from = from;
	this.to = to;
	}
	public int getCapacity()
	{
		return capacity;
	}
	public void setCapacity(int cap)
	{
		capacity = cap; 
	}
	public boolean isAc()
	{
		return ac;
	}
	public void setAc(boolean val)
	{
		ac = val; 
	}
	public int getBusno()
	{
		return busNo;
	}
	public void displayInfo()
	{
		System.out.println("Bus no: "+busNo+" Ac: "+ac+" "+from+"to "+to+" Total Capacity " +capacity);
	}
	//public void add_earnings(int )
		
	
}
