package cat.tecnocampus.courseProject.application;

import java.util.List;

import cat.tecnocampus.courseProject.application.dto.BidderDTO;

public class PlatformController {

	private BidderDAO bidder;
	
	public PlatformController(BidderDAO bidder) {
		this.bidder = bidder;
	}
	
	public List<BidderDTO> getBidders() {
		return bidder.getBidders();
	}
}
