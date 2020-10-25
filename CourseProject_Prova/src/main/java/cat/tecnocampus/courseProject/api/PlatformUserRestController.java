package cat.tecnocampus.courseProject.api;

import org.springframework.web.bind.annotation.RestController;

import cat.tecnocampus.courseProject.application.PlatformController;

@RestController
public class PlatformUserRestController {

	
	private PlatformController PlatformController;

	public PlatformUserRestController(PlatformController PlatformController) {
		this.PlatformController = PlatformController;
	}
	
	
	
	

}
