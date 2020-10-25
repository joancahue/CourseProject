package cat.tecnocampus.courseProject.domain;

import java.util.Date;

import cat.tecnocampus.courseProject.application.dto.AdminDTO;

public class Admin extends AbsUser {
	protected Admin(String id, String password) {
		super(id, password);
		this.admin = true;
		this.broker = false;
		this.bidder = false;	
	}
	public Admin (AdminDTO admin) {
		super(admin.getId(), admin.getPassword());
	}
	
	public void createBid(String idBid, float quantity, float price, Date date_creation, boolean winner, String idAuction, String idAuction_Broker) {
		Bid bid = new Bid(idBid, quantity, price, date_creation, winner, idAuction, idAuction_Broker, this.id);
		//blockDollars(quantity*price, this.id);
		//tenir controlador de base de dades --> INSERT BID
	}
	
	public void createAuction(String idAuction, boolean active, float quantity, Date initialDate,Date finalDate, float price) {
		Auction auction = new Auction(this.id, idAuction, active, quantity, initialDate, finalDate, price);
		//tenir controlador de base de dades --> INSERT AUCTION
	}
	
	/*
	
	public void queryBitcoinsPrice(){
	}
	
	public void purchaseBitcoins(){
	}
	
	 */
	
}
