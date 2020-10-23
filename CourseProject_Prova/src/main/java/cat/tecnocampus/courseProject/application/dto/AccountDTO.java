package cat.tecnocampus.courseProject.application.dto;

import cat.tecnocampus.courseProject.domain.Account;

public class AccountDTO {

	private float quantityDollars;
	private float quantityBitcoins;
	private float blockedDollars;
	private float freeDollars;
	private float comissionDollars;
	private String platformUserId;
	
	public AccountDTO() {
		
	}
	
	public AccountDTO(Account account) {
		this.quantityDollars = account.getQuantityDollars();
		this.quantityBitcoins = account.getQuantityBitcoins();
		this.blockedDollars = account.getBlockedDollars();
		this.freeDollars = account.getFreeDollars();
		this.comissionDollars = account.getComissionDollars();
		this.platformUserId = account.getPlatformUserId();
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
