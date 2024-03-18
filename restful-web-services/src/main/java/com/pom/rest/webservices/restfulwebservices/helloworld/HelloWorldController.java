package com.pom.rest.webservices.restfulwebservices.helloworld;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

//REST API
@RestController
public class HelloWorldController {

	// /hello-world
	@GetMapping(path = "/hello-world")
	public String helloWorld() {
		return "Hello world";
	}
	@GetMapping(path = "/hello-world-bean")
	public HelloWorldBean helloWorldBean() {
		return new HelloWorldBean("Hello world");
	}
}
