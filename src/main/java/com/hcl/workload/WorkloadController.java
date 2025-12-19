package com.hcl.workload;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WorkloadController {

	@GetMapping("message")
	public String getMessage() {
		return "Hello World";
	}
	
}
