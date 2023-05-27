package com.example.kinara_capital.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.kinara_capital.dto.Student_details;

@Repository
public interface Kinara_capital extends JpaRepository<Student_details, Integer> {

}
