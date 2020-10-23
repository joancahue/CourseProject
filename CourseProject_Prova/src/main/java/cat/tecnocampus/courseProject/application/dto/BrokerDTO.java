package cat.tecnocampus.courseProject.application.dto;

import cat.tecnocampus.courseProject.domain.Broker;

public class BrokerDTO {
	private String id;
	private String password;
	
	public BrokerDTO() {
		super();
	}

	public BrokerDTO (Broker broker) {
		this.id = broker.getId();
		this.password = broker.getPassword();
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
}
