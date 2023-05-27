package com.example.kinara_capital.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.kinara_capital.dto.Student_details;
import com.example.kinara_capital.repository.Kinara_capital;

@Component
public class Operations {
	@Autowired
	Kinara_capital kinara_capital;

	public void insert(Student_details details) {
		details.setPagenumber(details.getId());
		kinara_capital.save(details);
	}

	public Student_details fetch(Student_details details) {
		Student_details output = kinara_capital.findById(details.getId()).get();
		output.setPagenumber(output.getId());
		return output;
	}

	public void update(Student_details student) {
		Student_details data = kinara_capital.findById(student.getId()).get();

		if (student.getName() != null) {
			data.setName(student.getName());
		}

		if (student.getNumber() != 0) {
			data.setNumber(student.getNumber());
		}

		if (student.getTotalmarks() != null) {
			data.setTotalmarks(student.getTotalmarks());
		}
		kinara_capital.save(data);
	}

}
