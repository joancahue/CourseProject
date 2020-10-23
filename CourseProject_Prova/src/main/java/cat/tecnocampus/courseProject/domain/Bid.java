package cat.tecnocampus.courseProject.domain;

import java.util.Date;

import cat.tecnocampus.courseProject.application.dto.BidDTO;

public class Bid {

	private String idBid;
	private float quantity;
	private float price;
	private Date date_creation;
	private boolean winner;
	private String idAuction;
	private String idAuction_Broker;
	private String idBidder;
	
	
	
	
	public Bid(String idBid, float quantity, float price, Date date_creation, boolean winner, String idAuction, String idAuction_Broker, String idBidder) {
		super();
		this.idBid = idBid;
		this.quantity = quantity;
		this.price = price;
		this.date_creation = date_creation;
		this.winner = winner;
		this.idAuction = idAuction;
		this.idAuction_Broker = idAuction_Broker;
		this.idBidder = idBidder;
		
	}
	public Bid(BidDTO bid) {
		this.idBidder =bid.getIdBidder();
		this.idAuction = bid.getIdAuction();
		this.idBid = bid.getIdBid();
		this.quantity = bid.getQuantity();
		this.price = bid.getPrice();
		this.winner = bid.isWinner();
		this.date_creation = bid.getDate_creation();
		this.idAuction_Broker = bid.getIdAuction_Broker();
	}
	
	public Date getDate_creation() {
		return date_creation;
	}
	public void setDate_creation(Date date_creation) {
		this.date_creation = date_creation;
	}
	public String getIdAuction_Broker() {
		return idAuction_Broker;
	}
	public void setIdAuction_Broker(String idAuction_Broker) {
		this.idAuction_Broker = idAuction_Broker;
	}
	public String getIdBidder() {
		return idBidder;
	}
	public void setIdBidder(String idBidder) {
		this.idBidder = idBidder;
	}
	public String getIdAuction() {
		return idAuction;
	}
	public void setIdAuction(String idAuction) {
		this.idAuction = idAuction;
	}
	public String getIdBid() {
		return idBid;
	}
	public void setIdBid(String idBid) {
		this.idBid = idBid;
	}
	public float getQuantity() {
		return quantity;
	}
	public void setQuantity(float quantity) {
		this.quantity = quantity;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	public boolean isWinner() {
		return winner;
	}
	public void setWinner(boolean winner) {
		this.winner = winner;
	}
}
