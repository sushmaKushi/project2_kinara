package com.example.kinara_capital.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.kinara_capital.dao.Operations;
import com.example.kinara_capital.dto.Student_details;

@RestController
public class Controls {
	@Autowired
	Operations operations;

	@PostMapping("/insert/studentdetails")
	public String insert(@RequestBody Student_details details) {
		operations.insert(details);
		return "Student Details Saved.";
	}

	@GetMapping("/fetch/studentdetails")
	public Student_details fetch(@RequestBody Student_details details) {
		Student_details output = operations.fetch(details);
		System.out.println(output);
		return output;
	}

	@PutMapping("/update/studentdetails")
	public String updatev(@RequestBody Student_details details) {
		operations.update(details);
		return "Student Details Updated.";
	}
}
