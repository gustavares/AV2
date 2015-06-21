package print;

import traintravel.*;
import java.io.*;

public class TicketPrinter {
	// são static para não precisar instanciar a classe ao chamá-lo
	// formata os dados do bilhete
	private static String parseTicketInfo(Ticket ticket){
		String parsedTicketInfo = "Teste";
		Passenger passenger = ticket.getPassageiro();
		Travel travel = ticket.getViagem();
		
		// utilizando "\r\n" para pular a linha na hora de escrever no .txt 
		parsedTicketInfo = 
			"======================================================================" + "\r\n" +
			"PASSENGER INFO: " + "\r\n" +
			" Name: "     + passenger.getPassengerName()          + "\r\n" +
			" Document: " + passenger.getIdentificationDocument() + "\r\n" +
			"---------------------------------------------------------" + "\r\n" +
			"TRAVEL INFO: " + "\r\n" +
			" From: "               + travel.getDeparting()                                + "\r\n" + 
			" To: "                 + travel.getArriving()                                 + "\r\n" +
			" Date: "               + travel.getDate()       + " - Time: " + travel.getTime() + "\r\n" +
			" Travel time lenght: " + travel.getTravelTime()                               + "\r\n" +
			"---------------------------------------------------------" + "\r\n" +
			"TRAIN PLACEMENT INFO: " + "\r\n" +
			" Wagon number: " + ticket.getWagonNumber() + "\r\n" +
			" Seat number: "  + ticket.getSeatNumber()  + "\r\n" +
			" Seat class: "   + ticket.getSeatClass()   + "\r\n" +
			"======================================================================"
			;
		return parsedTicketInfo;
	}
	
	// salva o bilhete como .txt
	public static File imprimirBilhete(Ticket ticket){
		String parsedTicketInfo = parseTicketInfo(ticket);
		String name = ticket.getPassageiro().getPassengerName();
		String fileName = "Bilhete - " + name + ".txt";
		
		System.out.println("Imprimindo bilhete...");
		try{
			FileWriter writer = new FileWriter(fileName);
			
			writer.write(parsedTicketInfo);
			
			writer.close();
			System.out.println("Bilhete impresso com sucesso.");
		} catch(IOException ex) {
			System.out.println("Error writing to file: " + fileName);
		}
		File file = new File(fileName);
		return file;
	}
	

	
}
