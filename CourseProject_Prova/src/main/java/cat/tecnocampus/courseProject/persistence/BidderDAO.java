package cat.tecnocampus.courseProject.persistence;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import cat.tecnocampus.courseProject.application.dto.BidderDTO;

public class BidderDAO implements cat.tecnocampus.courseProject.application.UserDAO {
	
	
	private JdbcTemplate jdbcTemplate;
	
	private final RowMapper<BidderDTO> studentRowMapper = (resultSet, i) -> { 
		BidderDTO bidder = new BidderDTO(); 
		bidder.setId(resultSet.getString("id"));
		bidder.setPassword(resultSet.getString("password"));
		bidder.setBroker(resultSet.getInt("broker") == 1);
		bidder.setAdmin(resultSet.getInt("admin") == 1);
		bidder.setBidder(resultSet.getInt("bidder") == 1);
		return bidder; 
	};

	public BidderDAO(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	public void saveBidder(BidderDTO bidder) {
		final String insertBidder = "INSERT INTO bidder (id,password,broker,admin,bidder) VALUES (?, ?, ?, ?,?)";
		jdbcTemplate.update(insertBidder, bidder.getId(), bidder.getPassword(),bidder.isBroker(),bidder.isAdmin(),bidder.isBidder());
	}
}
