package com.zhenz.divvydose.challenge.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Slf4j
@Controller
@RequestMapping("health")
public class HealthCheckController {

	@GetMapping()
	public ResponseEntity<Void> healthCheck() {
		log.info("Application is up!");
		return new ResponseEntity<>(HttpStatus.OK);
	}
}
