package cat.tecnocampus.courseProject.application.dto;

import cat.tecnocampus.courseProject.domain.Admin;

public class AdminDTO {
	private String id;
	private String password;
	
	public AdminDTO() {
		super();
	}

	public AdminDTO(Admin admin) {
		this.id = admin.getId();
		this.password = admin.getPassword();
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
