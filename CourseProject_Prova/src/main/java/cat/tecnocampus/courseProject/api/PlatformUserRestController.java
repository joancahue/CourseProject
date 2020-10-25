package cat.tecnocampus.courseProject.api;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import cat.tecnocampus.courseProject.application.PlatformController;
import cat.tecnocampus.courseProject.application.dto.BidderDTO;

@RestController
public class PlatformUserRestController {

	
	private PlatformController platformController;

	public PlatformUserRestController(PlatformController platformController) {
		this.platformController = platformController;
	}
	
	@GetMapping("/bidders")
	public List<BidderDTO> getBidders() {
		return platformController.getBidders();
	}
}
