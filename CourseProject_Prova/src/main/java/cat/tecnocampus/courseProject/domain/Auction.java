package cat.tecnocampus.courseProject.domain;

import java.util.ArrayList;
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
	
	public void checkBids() {
		if (!active) {
			//UTILITZAR COMPARATOR PEL METODE COLLECTIONS.SORT(LIST, COMPARATOR)
			//this.bidsOfAuction = this.bidsOfAuction.OrderBy().ToList();
			//List<Order> SortedList = objListOrder.OrderBy(o=>o.OrderDate).ToList();
		}
	}
	
	class priceComparator implements Comparator<Bid> {
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
