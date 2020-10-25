package cat.tecnocampus.courseProject.application;

import java.util.List;

import cat.tecnocampus.courseProject.application.dto.BidderDTO;

public interface BidderDAO {
	List<BidderDTO> getBidders();
	void saveBidder(BidderDTO bidder);
}
