package cat.tecnocampus.courseProject.application;

import cat.tecnocampus.courseProject.application.dto.UserDTO;

public interface UserDAO {

	void saveUser(UserDTO user);
}
