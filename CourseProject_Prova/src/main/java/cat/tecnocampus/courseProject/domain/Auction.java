package cat.tecnocampus.courseProject.domain;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;

import cat.tecnocampus.courseProject.application.dto.AuctionDTO;
import cat.tecnocampus.courseProject.application.dto.BidDTO;

public class Auction {
	
	private String idAuction;
	private float quantity;
	private float price;
	private Date initialDate;
	private Date finalDate;
	private boolean active;	
	private String idBroker;
	
	private ArrayList<Bid> bidsOfAuction;
	
	public Auction(String idBroker, String idAuction, boolean active, float quantity, Date initialDate, Date finalDate, float price) {
		super();
		this.idBroker = idBroker; 
		this.idAuction = idAuction;
		this.active = active;
		this.quantity = quantity;
		this.initialDate = initialDate;
		this.finalDate = finalDate;
		this.price = price;
		this.bidsOfAuction = new ArrayList<Bid>();
	}
	
	public Auction(AuctionDTO auction) {
		this.idBroker =auction.getIdBroker(); 
		this.idAuction = auction.getIdAuction();
		this.active = auction.isActive();
		this.quantity = auction.getQuantity();
		this.initialDate = auction.getInitialDate();
		this.finalDate = auction.getFinalDate();
		this.price = auction.getPrice();
		this.bidsOfAuction = new ArrayList<Bid>();	
		for (BidDTO bid: auction.getBidsOfAuction()) {
			bidsOfAuction.add(new Bid(bid));
		}
	}

	public void addBid(Bid bid) {
		if (active && bid.getQuantity() <= quantity) {
			bidsOfAuction.add(bid);
		}
	}
	
	public void checkBids() {//Hauria d'anar a controlador --- Comission està inclòs en el preu que paguen els bidders?
		if (!active) {
			float auctionQuantity = this.quantity;
			float auctionPrice = 0;
			float whatToPay = 0;
			Collections.sort(bidsOfAuction, new PriceComparator());
			
			for (Bid bid :  bidsOfAuction) {
				
				if(auctionQuantity > 0) {
					
					if (auctionQuantity - bid.getQuantity() >= 0) {
						
						auctionQuantity -= bid.getQuantity();
						whatToPay = bid.getQuantity()*bid.getPrice();
						auctionPrice += whatToPay;
						bid.setWinner(true);
						new Movement(-whatToPay, bid.getIdBidder());//Això hauria de ser un store.
						//account.updateBidderAccount(whatToPay, bid.getQuantity()); 
						
					}
					else {
						
						whatToPay = auctionQuantity*bid.getPrice();
						auctionPrice += whatToPay;
						bid.setWinner(true);
						new Movement(-whatToPay, bid.getIdBidder());//Això hauria de ser un store.
						//account.updateBidderAccount(whatToPay, auctionQuantity); 
						auctionQuantity = 0;
						
					}
				}
				else {
					//unblockDollars(bid.getQuantity()*bid.getPrice());
				}
			}
			
			if(auctionQuantity > 0) {
				
				new Movement(auctionPrice, this.idBroker);//Això hauria de ser un store.
				//updateBrokerAuctionEnded(auctionPrice, this.quantity-auctionQuantity);
				
			}
			
			new Movement(auctionPrice, this.idBroker);//Això hauria de ser un store.
			//updateBrokerAuctionEnded(auctionPrice, this.quantity);
			
		}
	}
	
	class PriceComparator implements Comparator<Bid> {
	    public int compare(Bid o1, Bid o2) {
			if (o1.getPrice() > o2.getPrice()) {
				return 1;
			}
			else if (o1.getPrice() < o2.getPrice()) {
				return -1;
			}
			return 0;
		}
	}
	
	
	public boolean correctDate() {
		Date currentDate = new Date();
		return currentDate.before(this.finalDate);
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

	public ArrayList<Bid> getBidsOfAuction() {
		return bidsOfAuction;
	}

	public void setBidsOfAuction(ArrayList<Bid> bidsOfAuction) {
		this.bidsOfAuction = bidsOfAuction;
	}
}
