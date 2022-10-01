package com.example.ninaction;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Simon Pirko on 1.10.22
 */

@RestController
public class NinController {

	@GetMapping("/nin")
	public String nin() {
		return "Hello World with Action!";
	}
}
