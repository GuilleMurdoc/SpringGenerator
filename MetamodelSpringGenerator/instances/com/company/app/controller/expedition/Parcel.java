package com.company.app.controller.expedition;

import org.springframework.web.bind.annotation.*;
import lombok.RequiredArgsConstructor;
import com.company.app.data.expedition.ParcelDTO;
import java.util.List;

// Write your own imports
// START PROTECTED ZONE. This space is free to write your own code.
// Start of user code Controller Custom Imports

// Write your own code here. This line can be deleted.

// End of user code
// END PROTECTED ZONE.

@RestController
@RequestMapping(value = "/expeditions/{expeditionId}/parcels")
@RequiredArgsConstructor
public class Parcel {

	// Write your own attributes. To be injected, it must be written as final attributes
	// ex: private final ExampleService exampleService;
	// START PROTECTED ZONE. This space is free to write your own code.
	// Start of user code Controller Attributes
	
	// Write your own code here. This line can be deleted.
	
	// End of user code
	// END PROTECTED ZONE.


	@GetMapping() 
	public List<ParcelDTO> getParcels(
		@PathVariable(name = "expeditionId") Integer expeditionId
	) {
		// START PROTECTED ZONE. This space is free to write your own code.
		// Start of user code Controller method getParcels implementation
		
		// Write your own code here. This line can be deleted.
		
		// End of user code
		// END PROTECTED ZONE.
	}

	@GetMapping(value = "/{parccelId}") 
	public ParcelDTO getParcel(
		@PathVariable(name = "parccelId") Integer parccelId,
		@PathVariable(name = "expeditionId") Integer expeditionId
	) {
		// START PROTECTED ZONE. This space is free to write your own code.
		// Start of user code Controller method getParcel implementation
		
		// Write your own code here. This line can be deleted.
		
		// End of user code
		// END PROTECTED ZONE.
	}

}
