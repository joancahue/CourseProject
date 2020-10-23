package cat.tecnocampus.courseProject.persistence;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import cat.tecnocampus.courseProject.application.dto.BidderDTO;

public class UserDAO implements cat.tecnocampus.courseProject.application.UserDAO {
	private JdbcTemplate jdbcTemplate;
	private final RowMapper<BidderDTO> studentRowMapper = (resultSet, i) -> { 
	BidderDTO user = new BidderDTO(); user.setId(resultSet.getString("id")); 
	//user.setPassword(resultSet.getString("password")); user.setBidder(resultSet.get) ;
	return user; 
};

	public void saveUser(BidderDTO user) {
		final String insertUser = "insert into student (id, email,name, secondname) VALUES (?, ?, ?, ?)";
		//jdbcTemplate.update(insertUser, student.getId(), student.getEmail(), student.getName(),
				//student.getSecondName());
	}
}
