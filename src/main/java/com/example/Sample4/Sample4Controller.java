package com.example.Sample4;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.apache.catalina.manager.DummyProxySession;
import org.springframework.http.HttpHeaders;


import java.util.List;

@RestController

public class Sample4Controller {

	@GetMapping("/Sample4Hello")
	public String hello(@RequestHeader HttpHeaders headers) {
		
		System.out.println("Sample 4");
		
		List<String>dummyKey= headers.get("user-agent");
		if(dummyKey !=null) {
		dummyKey.forEach(System.out::println);	}

		System.out.println("recieved request "+ Thread.currentThread().getId());
		return "HelloSample4";
	}
}
