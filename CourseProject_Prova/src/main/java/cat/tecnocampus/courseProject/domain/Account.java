package cat.tecnocampus.courseProject.domain;

import cat.tecnocampus.courseProject.application.dto.AccountDTO;

public class Account {
	
	private float quantityDollars;
	private float quantityBitcoins;
	private float blockedDollars;
	private float freeDollars;
	private float comissionDollars;
	private String platformUserId;
	
	public Account(float quantityDollars, float quantityBitcoins, //Com s'ingressen diners al account? Venen desde la creació de l'objecte?
			float comissionDollars, String platformUserId) {
		this.quantityDollars = quantityDollars;
		this.quantityBitcoins = quantityBitcoins;
		this.blockedDollars = 0;
		this.freeDollars = quantityDollars;
		this.comissionDollars = comissionDollars;
		this.platformUserId = platformUserId;
	}
	
	public Account(AccountDTO account) {
		this.quantityDollars = account.getQuantityDollars();
		this.quantityBitcoins = account.getQuantityBitcoins();
		this.blockedDollars = account.getBlockedDollars();
		this.freeDollars = account.getFreeDollars();
		this.comissionDollars = account.getComissionDollars();
		this.platformUserId = account.getPlatformUserId();
	}
	
	public void updateBrokerPurchase(float quantityDollars, float quantityBitcoins) {
		this.quantityDollars -= quantityDollars;
		this.quantityBitcoins += quantityBitcoins;
		//Implementar comissions
	}
	
	public void updateBrokerAuctionEnded(float quantityDollars, float quantityBitcoins) {
		this.quantityDollars += quantityDollars;
		this.quantityBitcoins -= quantityBitcoins;
	}
	
	public void updateBidderAccount(float quantityDollars, float quantityBitcoins) {
		this.blockedDollars -= quantityDollars;
		this.quantityBitcoins += quantityBitcoins;
		//Implementar comissions
	}
	
	public void blockDollars(float quantity) {
		this.blockedDollars += quantity;
		this.freeDollars -= quantity;
	}
	
	public void unblockDollars(float quantity) {
		this.blockedDollars -= quantity;
		this.freeDollars += quantity;
	}

	public float getQuantityDollars() {
		return quantityDollars;
	}

	public void setQuantityDollars(float quantityDollars) {
		this.quantityDollars = quantityDollars;
	}

	public float getQuantityBitcoins() {
		return quantityBitcoins;
	}

	public void setQuantityBitcoins(float quantityBitcoins) {
		this.quantityBitcoins = quantityBitcoins;
	}

	public float getBlockedDollars() {
		return blockedDollars;
	}

	public void setBlockedDollars(float blockedDollars) {
		this.blockedDollars = blockedDollars;
	}

	public float getFreeDollars() {
		return freeDollars;
	}

	public void setFreeDollars(float freeDollars) {
		this.freeDollars = freeDollars;
	}

	public float getComissionDollars() {
		return comissionDollars;
	}

	public void setComissionDollars(float comissionDollars) {
		this.comissionDollars = comissionDollars;
	}

	public String getPlatformUserId() {
		return platformUserId;
	}

	public void setPlatformUserId(String platformUserId) {
		this.platformUserId = platformUserId;
	}
}
