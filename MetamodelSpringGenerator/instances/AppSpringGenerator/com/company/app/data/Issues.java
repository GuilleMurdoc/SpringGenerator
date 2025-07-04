package com.company.app.data;

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

}
