package com.ofss;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ServiceBController {

	@GetMapping("/serviceB")
	public String serviceB() {
		return "Service B - response";
	}
}
