package cat.tecnocampus.courseProject.persistence;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import cat.tecnocampus.courseProject.application.dto.UserDTO;

public class UserDAO implements cat.tecnocampus.courseProject.application.UserDAO {
	private JdbcTemplate jdbcTemplate;
	private final RowMapper<UserDTO> studentRowMapper = (resultSet, i) -> { 
	UserDTO user = new UserDTO(); user.setId(resultSet.getString("id")); 
	//user.setPassword(resultSet.getString("password")); user.setBidder(resultSet.get) ;
	return user; 
};

	public void saveUser(UserDTO user) {
		final String insertUser = "insert into student (id, email,name, secondname) VALUES (?, ?, ?, ?)";
		//jdbcTemplate.update(insertUser, student.getId(), student.getEmail(), student.getName(),
				//student.getSecondName());
	}
}
