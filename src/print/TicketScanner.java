package print;

import java.util.Scanner;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

import traintravel.Ticket;

public class TicketScanner {
	private static Scanner scan = new Scanner(System.in);
	
	/* metodo para realizar a leitura dos dados do bilhete
	 * static para n�o precisar instanciar a classe ao cham�-lo
	 * public para poder ser visto por outras classes
	 */
	public static void readTicketInfo(Ticket ticket){
		String passengerName, identificationDocument, arriving, departing, date, time, seatClass;
		int travelTime, wagonNumber, seatNumber;
		
		System.out.println("Entre com o nome completo do viajante: ");
		passengerName = scan.nextLine();
		
		System.out.println("Entre com o n�mero do documento do viajante: ");
		identificationDocument = scan.nextLine();
		
		System.out.println("Entre com a cidade de partida da viagem: ");
		departing = scan.nextLine();
		
		System.out.println("Entre com o destino da viagem: ");
		arriving = scan.nextLine();
		
		System.out.println("Entre com a data da viagem: ");
		date = scan.nextLine();
		
		System.out.println("Entre com a hora de partida: ");
		time = scan.nextLine();
		
		System.out.println("Entre com o tempo de dura��o desejado: ");
		travelTime = scan.nextInt();
		
		System.out.println("Entre com o n�mero do vag�o desejado: ");
		wagonNumber = scan.nextInt();
		
		System.out.println("Entre com o n�mero do assento desejado: ");
		seatNumber = scan.nextInt();
		
		System.out.println("Entre com a classe desejada: (1 - Normal, 2 - Executiva, 3 - Primeira)");
		seatClass = checkSeatClass(scan.nextInt());
		
		ticket.setWagonNumber(wagonNumber);
		ticket.setSeatNumber(seatNumber);
		ticket.setSeatClass(seatClass);
		ticket.setPassengerAndTravelInfo(passengerName, identificationDocument, arriving, departing, date, time, travelTime);
	}
	
	// confere se a entrada dos numeros das classes � v�lida.
	private static String checkSeatClass(int seatClassNumber){ // private pois s� ser� usado nessa classe
		String seatClass = null;
		do {
			switch (seatClassNumber){
				case 1:
					seatClass = "Normal";
					break;
				case 2:
					seatClass = "Executiva";
					break;
				case 3:
					seatClass = "Primeira";
					break;
				default:
					System.out.println("Error: Not a valid Seat Class Number. Please try again.");
			}
		} while (seatClass == null);
		System.out.println(seatClass + " selecionada.");
		return seatClass;
	}
	
	public static void lerBilhete(File file){
		try {
			FileReader fileReader = new FileReader(file);
			BufferedReader reader = new BufferedReader(fileReader);
			
			String line = null;
			while ((line = reader.readLine()) != null){
				System.out.println(line);
			}
			reader.close();
			
		} catch(Exception ex) {
			System.out.println("Error trying to read the file.");
		}
	}

}
