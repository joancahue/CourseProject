package cat.tecnocampus.courseProject.domain;

import cat.tecnocampus.courseProject.application.dto.UserDTO;

public class User extends AbsUser {

	public User(String id, String password) {
		super(id, password);
	}

	public User (UserDTO user) {
		super(user.getId(), user.getPassword());
	}
}
