package cat.tecnocampus.courseProject.domain;

import cat.tecnocampus.courseProject.application.dto.AdminDTO;

public class Admin extends AbsUser {
	protected Admin(String id, String password) {
		super(id, password);
		this.admin = true;
		this.broker = false;
		this.bidder = false;	
	}
	public Admin (AdminDTO admin) {
		super(admin.getId(), admin.getPassword());
	}
}
