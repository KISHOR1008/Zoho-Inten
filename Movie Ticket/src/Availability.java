interface Availability
{
	boolean checkIfNumberOfTicketsAvailable(int requirement);
}

interface TicketDetailsUpdater
{
	void reduceTheTotalTickets();
	void increaseSoldTickets();
}

interface ShowStats
{
	void displayShowStats();
}
