package com.hello.resource;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rest/billingservice")
public class BillingServiceResource {
	
	
	@GetMapping
	public String Welcome()
	{
		return "Programming billing services";
	}

}
