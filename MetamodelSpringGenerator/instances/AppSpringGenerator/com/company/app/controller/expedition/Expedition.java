package com.company.app.controller;

import org.springframework.web.bind.annotation.*;
import lombok.RequiredArgsConstructor;
import com.company.app.data.expedition.ExpeditionBasicDTO;
import com.company.app.data.expedition.ExpeditionDTO;
import java.util.List;

// Write your own imports
// START PROTECTED ZONE. This space is free to write your own code.
// Start of user code Controller Custom Imports

// Write your own code here. This line can be deleted.

// End of user code
// END PROTECTED ZONE.

@RestController
@RequestMapping(value = "/expeditions")
@RequiredArgsConstructor
public class Expedition {

	// Write your own attributes. To be injected, it must be written as final attributes
	// ex: private final ExampleService exampleService;
	// START PROTECTED ZONE. This space is free to write your own code.
	// Start of user code Controller Attributes
	
	// Write your own code here. This line can be deleted.
	
	// End of user code
	// END PROTECTED ZONE.


	@GetMapping() 
	public List<ExpeditionBasicDTO> getExpeditions() {

		// START PROTECTED ZONE. This space is free to write your own code.
		// Start of user code Controller method getExpeditions implementation
		
		// Write your own code here. This line can be deleted.
		
		// End of user code
		// END PROTECTED ZONE.
	}

		@GetMapping(value = "/{expeditionId}") 
		public ExpeditionDTO getExpedition(
			@PathVariable(name = "expeditionId") Integer expeditionId
		) {
			// START PROTECTED ZONE. This space is free to write your own code.
			// Start of user code Controller method getExpedition implementation
			
			// Write your own code here. This line can be deleted.
			
			// End of user code
			// END PROTECTED ZONE.
		}

}
