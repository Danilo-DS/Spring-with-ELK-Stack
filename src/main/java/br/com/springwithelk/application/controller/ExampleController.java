package br.com.springwithelk.application.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.extern.slf4j.Slf4j;

@RestController
@RequestMapping(value = "/example")
@Slf4j
public class ExampleController {
	
	@GetMapping
	public ResponseEntity<Void> getSuccess() {
		log.info("[getSuccess] Request success.");
		return ResponseEntity.ok().build();
	}
	
	@GetMapping(value = "/error")
	public ResponseEntity<Void> getError() {
		log.error("[getError] Request error {}.", new RuntimeException("Purposeful Error"));
		return ResponseEntity.internalServerError().build();
	}
}
