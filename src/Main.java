import traintravel.Ticket;
import print.TicketPrinter;
import print.TicketScanner;
import java.io.File;

public class Main {
	
	//Criei esse método para não ter que ficar entrando com os dados pelo teclado sempre que quisesse testar
	public static void ticketTestInput(Ticket ticket) {
		ticket.setWagonNumber(02);
		ticket.setSeatNumber(25);
		ticket.setSeatClass("Primeira");
		ticket.setPassengerAndTravelInfo("Luiz Paulo Maia", "666.666.666-66", 
		"Oxford, OH", "Rio de Janeiro, RJ", "10/08/2015", "23:00:00", 8);
	}
	
	public static void main(String[] args) {
		Ticket ticket = new Ticket();
		File file;
		
		//ticketTestInput(ticket);
		TicketScanner.readTicketInfo(ticket);
		file = TicketPrinter.imprimirBilhete(ticket);
		TicketScanner.lerBilhete(file);
	}

}
