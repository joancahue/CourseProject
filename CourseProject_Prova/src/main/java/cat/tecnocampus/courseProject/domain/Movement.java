package cat.tecnocampus.courseProject.domain;

import cat.tecnocampus.courseProject.application.dto.MovementDTO;

public class Movement {

	private float quantity;
	private String accountId;
	
	public Movement(float quantity, String accountId) {
		this.quantity = quantity;
		this.accountId = accountId;
	}
	
	public Movement(MovementDTO movement) {
		this.quantity = movement.getQuantity();
		this.accountId = movement.getAccountId();
	}
	
	public float getQuantity() {
		return quantity;
	}
	public void setQuantity(float quantity) {
		this.quantity = quantity;
	}

	public String getAccountId() {
		return accountId;
	}

	public void setAccountId(String accountId) {
		this.accountId = accountId;
	}
	
	
	
}
