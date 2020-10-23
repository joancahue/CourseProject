package cat.tecnocampus.courseProject.domain;

import java.util.Date;

import cat.tecnocampus.courseProject.application.dto.PurchaseDTO;

public class Purchase {
	
	private String purchaseId;
	private float quantity;
	private float price;
	private Date dateCreation;
	private String platformUserId;
	
	public Purchase(String purchaseId, float quantity, float price, Date dateCreation, String platformUserId) {
		this.purchaseId = purchaseId;
		this.quantity = quantity;
		this.price = price;
		this.dateCreation = dateCreation;
		this.platformUserId = platformUserId;
	}
	
	public Purchase (PurchaseDTO purchase) {
		this.purchaseId = purchase.getPurchaseId();
		this.quantity = purchase.getQuantity();
		this.price = purchase.getPrice();
		this.dateCreation = purchase.getDateCreation();
		this.platformUserId = purchase.getPlatformUserId();
	}

	public String getPurchaseId() {
		return purchaseId;
	}

	public void setPurchaseId(String purchaseId) {
		this.purchaseId = purchaseId;
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

	public Date getDateCreation() {
		return dateCreation;
	}

	public void setDateCreation(Date dateCreation) {
		this.dateCreation = dateCreation;
	}

	public String getPlatformUserId() {
		return platformUserId;
	}

	public void setPlatformUserId(String platformUserId) {
		this.platformUserId = platformUserId;
	}

}
