package com.company.app.controller;

import org.springframework.web.bind.annotation.*;
import lombok.RequiredArgsConstructor;
import com.company.app.data.expedition.IssueDTO;
import com.company.app.data.expedition.CreationIssueDTO;

// Write your own imports
// START PROTECTED ZONE. This space is free to write your own code.
// Start of user code Controller Custom Imports

// Write your own code here. This line can be deleted.

// End of user code
// END PROTECTED ZONE.

@RestController
@RequestMapping(value = "/expeditions/{expeditionId}/issues")
@RequiredArgsConstructor
public class Issues {

	// Write your own attributes. To be injected, it must be written as final attributes
	// ex: private final ExampleService exampleService;
	// START PROTECTED ZONE. This space is free to write your own code.
	// Start of user code Controller Attributes
	
	// Write your own code here. This line can be deleted.
	
	// End of user code
	// END PROTECTED ZONE.


	@GetMapping(value = "/{issueId}") 
	public IssueDTO getIssue(
		@PathVariable(name = "issueId") Integer issueId,
		@PathVariable(name = "expeditionId") Integer expeditionId
	) {
		// START PROTECTED ZONE. This space is free to write your own code.
		// Start of user code Controller method getIssue implementation
		
		// Write your own code here. This line can be deleted.
		
		// End of user code
		// END PROTECTED ZONE.
	}

		@GetMapping() 
		public IssueDTO postIssue(
			@PathVariable(name = "expeditionId") Integer expeditionId,
			@RequestBody CreationIssueDTO inputBody
		) {
			// START PROTECTED ZONE. This space is free to write your own code.
			// Start of user code Controller method postIssue implementation
			
			// Write your own code here. This line can be deleted.
			
			// End of user code
			// END PROTECTED ZONE.
		}

}
