package traintravel;

public class Ticket {
	private int wagonNumber;
	private int seatNumber;
	private String seatClass;
	private Passenger passageiro = new Passenger();
	private Travel viagem = new Travel();
	
	public int getWagonNumber() {
		return wagonNumber;
	}
	public void setWagonNumber(int wagonNumber) {
		this.wagonNumber = wagonNumber;
	}
	public int getSeatNumber() {
		return seatNumber;
	}
	public void setSeatNumber(int seatNumber) {
		this.seatNumber = seatNumber;
	}
	public String getSeatClass() {
		return seatClass;
	}
	public void setSeatClass(String seatClass) { 
		this.seatClass = seatClass;
	}
	
	public Passenger getPassageiro() {
		return passageiro;
	}
	public void setPassageiro(Passenger passageiro) {
		this.passageiro = passageiro;
	}
	public Travel getViagem() {
		return viagem;
	}
	public void setViagem(Travel viagem) {
		this.viagem = viagem;
	}
	
	public void setPassengerAndTravelInfo(String passengerName, String identificationDocument, 
			String arriving, String departing, String date, String time, int travelTime) {

		Passenger novoPassageiro = new Passenger();
		Travel novaViagem = new Travel();
		
		novoPassageiro.setPassengerName(passengerName);
		novoPassageiro.setIdentificationDocument(identificationDocument);
		novaViagem.setArriving(arriving);
		novaViagem.setDeparting(departing);
		novaViagem.setDate(date);
		novaViagem.setTime(time);
		novaViagem.setTravelTime(travelTime);
		
		this.passageiro = novoPassageiro;
		this.viagem = novaViagem;
	}
	

	
}

/* A entidade "Bilhete de Trem" deve ser modelada e implementada. 
 * Um bilhete possui nome completo do viajante, algum documento de identificação do viajante, 
 * duração da viagem, destino, origem, data, hora, número do vagão, número do assento e classe (primeira, executiva ou normal)
 */