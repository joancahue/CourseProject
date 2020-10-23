package cat.tecnocampus.courseProject.domain;

import cat.tecnocampus.courseProject.application.dto.BidderDTO;

public class Bidder extends AbsUser {

	public Bidder(String id, String password) {
		super(id, password);
	}

	public Bidder (BidderDTO user) {
		super(user.getId(), user.getPassword());
	}
}
