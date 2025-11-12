package com.SoftwareTools.RestAPI_Server.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
@SpringBootApplication(scanBasePackages = "com.SoftwareTools.RestAPI_Server")
public class Controller {
    @GetMapping("/")
    public String home() {
        return "Welcome to the REST API Server!";
    }


	// GET
	@GetMapping("/hello")
	public String hello() {
		return "Hello from Spring Boot!";
	}

	@GetMapping("/status")
	public String status() {
		return "Server is running.";
	}

	// POST
	@PostMapping("/data")
	public String postData(@RequestBody String data) {
		return "Received data: " + data;
	}

	@PostMapping("/submit")
	public String submitForm(@RequestBody String form) {
		return "Form submitted: " + form;
	}

	// PUT
	@PutMapping("/update")
	public String updateData(@RequestBody String data) {
		return "Updated data: " + data;
	}

	@PutMapping("/modify")
	public String modifyData(@RequestBody String data) {
		return "Modified data: " + data;
	}

	// PATCH
	@PatchMapping("/patch")
	public String patchData(@RequestBody String data) {
		return "Patched data: " + data;
	}

	@PatchMapping("/adjust")
	public String adjustData(@RequestBody String data) {
		return "Adjusted data: " + data;
	}

	// DELETE
	@DeleteMapping("/delete")
	public String deleteData(@RequestBody String data) {
		return "Deleted data: " + data;
	}

	@DeleteMapping("/remove")
	public String removeData(@RequestBody String data) {
		return "Removed data: " + data;
	}

}
