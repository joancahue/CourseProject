package cat.tecnocampus.courseProject.domain;

import java.util.Date;

import cat.tecnocampus.courseProject.application.dto.BidderDTO;

public class Bidder extends AbsUser {

	public Bidder(String id, String password) {
		super(id, password);
	}

	public Bidder (BidderDTO user) {
		super(user.getId(), user.getPassword());
	}
	
	public void createBid(String idBid, float quantity, float price, Date date_creation, boolean winner, String idAuction, String idAuction_Broker) {
		Bid bid = new Bid(idBid, quantity, price, date_creation, winner, idAuction, idAuction_Broker, this.id);
		//blockDollars(quantity*price); va al controlador
		//tenir controlador de base de dades --> INSERT BID
	}
}
