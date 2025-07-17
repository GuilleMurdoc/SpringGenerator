package com.company.app.controller;

import org.springframework.web.bind.annotation.*;
import lombok.RequiredArgsConstructor;

// Write your own imports
// START PROTECTED ZONE. This space is free to write your own code.
// Start of user code Controller Custom Imports

// Write your own code here. This line can be deleted.

// End of user code
// END PROTECTED ZONE.

@RestController
@RequestMapping(value = "/public")
@RequiredArgsConstructor
public class Public {

	// Write your own attributes. To be injected, it must be written as final attributes
	// ex: private final ExampleService exampleService;
	// START PROTECTED ZONE. This space is free to write your own code.
	// Start of user code Controller Attributes
	
	// Write your own code here. This line can be deleted.
	
	// End of user code
	// END PROTECTED ZONE.


	@GetMapping(value = "/health") 
	public void health() {

		// START PROTECTED ZONE. This space is free to write your own code.
		// Start of user code Controller method health implementation
		
		// Write your own code here. This line can be deleted.
		
		// End of user code
		// END PROTECTED ZONE.
	}

}
