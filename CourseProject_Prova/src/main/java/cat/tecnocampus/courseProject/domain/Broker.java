package cat.tecnocampus.courseProject.domain;

import java.util.Date;

import cat.tecnocampus.courseProject.application.dto.BrokerDTO;

public class Broker extends AbsUser {
	public Broker(String id, String password) {
		super(id, password);
		// TODO Auto-generated constructor stub
	}
	
	public Broker (BrokerDTO broker) {
		super(broker.getId(), broker.getPassword());
	}
	
	public void createAuction(String idAuction, boolean active, float quantity, Date initialDate,Date finalDate, float price) {
		Auction auction = new Auction(this.id, idAuction, active, quantity, initialDate, finalDate, price);
		//tenir controlador de base de dades --> INSERT AUCTION
	}
}
