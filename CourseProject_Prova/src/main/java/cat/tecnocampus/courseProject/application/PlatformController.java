package cat.tecnocampus.courseProject.application;

import java.util.List;

import org.springframework.stereotype.Component;

import cat.tecnocampus.courseProject.application.dto.BidderDTO;
@Component
public class PlatformController {

	private BidderDAO bidder;
	
	public PlatformController(BidderDAO bidder) {
		this.bidder = bidder;
	}
	
	public List<BidderDTO> getBidders() {
		return bidder.getBidders();
	}
}
