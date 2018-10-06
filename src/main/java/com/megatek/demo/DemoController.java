/**
 * 
 */
package com.megatek.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author viraj
 *
 */
@RestController
public class DemoController {

	@GetMapping("/hello")
	public String hello() {
		// TODO Auto-generated method stub
		return "Hello DEmo App";
	}
}
