package cat.tecnocampus.courseProject.application.dto;

import cat.tecnocampus.courseProject.domain.User;

public class UserDTO {

	private String id;
	private String password;
	private boolean admin = false;
	private boolean broker = false;
	private boolean bidder = true;	
	
	
	public UserDTO() {
		super();
	}

	public UserDTO(User user) {
		this.id = user.getId();
		this.password = user.getPassword();
	}

	public String getId() {
		return id;
	}


	public void setId(String id) {
		this.id = id;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}

	public boolean isAdmin() {
		return admin;
	}

	public void setAdmin(boolean admin) {
		this.admin = admin;
	}

	public boolean isBroker() {
		return broker;
	}

	public void setBroker(boolean broker) {
		this.broker = broker;
	}

	public boolean isBidder() {
		return bidder;
	}

	public void setBidder(boolean bidder) {
		this.bidder = bidder;
	}
	
	
}
