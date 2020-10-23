package cat.tecnocampus.courseProject.application.dto;

import cat.tecnocampus.courseProject.domain.Movement;

public class MovementDTO {

	private float quantity;
	private String accountId;
	
	public MovementDTO() {
		
	}
	
	public MovementDTO(Movement movement) {
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
