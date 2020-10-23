package cat.tecnocampus.courseProject.application.dto;

import java.util.ArrayList;
import java.util.Date;

import cat.tecnocampus.courseProject.domain.Auction;
import cat.tecnocampus.courseProject.domain.Bid;

public class AuctionDTO {

	private String idBroker;
	private String idAuction;
	private boolean active;
	private float quantity;
	private Date initialDate;
	private Date finalDate;
	private float price;
	private ArrayList<BidDTO> bidsOfAuction;
	
	
	public AuctionDTO() {
			
	}
	
	public AuctionDTO(Auction auction) {
		this.idBroker = auction.getIdBroker();
		this.idAuction = auction.getIdAuction();
		this.active = auction.isActive();
		this.quantity = auction.getQuantity();
		this.initialDate = auction.getInitialDate();
		this.finalDate = auction.getFinalDate();
		this.price = auction.getPrice();
		this.bidsOfAuction = new ArrayList<BidDTO>();
		for (Bid bid: auction.getBidsOfAuction()) {
			bidsOfAuction.add(new BidDTO(bid));
		}
	}

	public String getIdBroker() {
		return idBroker;
	}

	public void setIdBroker(String idBroker) {
		this.idBroker = idBroker;
	}

	public String getIdAuction() {
		return idAuction;
	}

	public void setIdAuction(String idAuction) {
		this.idAuction = idAuction;
	}

	public boolean isActive() {
		return active;
	}

	public void setActive(boolean active) {
		this.active = active;
	}

	public float getQuantity() {
		return quantity;
	}

	public void setQuantity(float quantity) {
		this.quantity = quantity;
	}

	public Date getInitialDate() {
		return initialDate;
	}

	public void setInitialDate(Date initialDate) {
		this.initialDate = initialDate;
	}

	public Date getFinalDate() {
		return finalDate;
	}

	public void setFinalDate(Date finalDate) {
		this.finalDate = finalDate;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public ArrayList<BidDTO> getBidsOfAuction() {
		return bidsOfAuction;
	}

	public void setBidsOfAuction(ArrayList<BidDTO> bidsOfAuction) {
		this.bidsOfAuction = bidsOfAuction;
	}
}
