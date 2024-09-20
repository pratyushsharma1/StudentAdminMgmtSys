package com.example.demo.service;

import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import com.example.demo.dto.ComplaintDetailsDto;
import com.example.demo.dto.ComplaintDto;
import com.example.demo.entities.Student;

public interface StudentService {
	Student save(Student student);
	List<Student> findAll();
	Student findById(long id);
	Student updateTeacherById(long id,Student student);
	void deleteById(long id);
	ComplaintDto raiseComplaint(@RequestBody ComplaintDetailsDto complaintdeaDetailsDto,@PathVariable("id") long studentId);

	List<Student> findByStandard(String standard);
}
