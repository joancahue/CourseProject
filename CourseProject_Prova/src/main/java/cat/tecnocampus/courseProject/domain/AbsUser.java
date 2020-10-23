package cat.tecnocampus.courseProject.domain;

public class AbsUser {
	
	protected String id;
	protected String password;
	protected boolean admin;
	protected boolean broker;
	protected boolean bidder;
	
	protected AbsUser(String id, String password) {
		super();
		this.id = id;
		this.password = password;
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
