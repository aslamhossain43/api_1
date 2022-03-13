package com.k8.api.hello;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Md. Aslam Hossain
 * @Date Mar 13, 2022
 *
 */
@RestController
public class Hello {
	@RequestMapping(value = "/")
	public ResponseEntity<String> hello() {
		return ResponseEntity.ok("Hello from api 1");
	}
}
