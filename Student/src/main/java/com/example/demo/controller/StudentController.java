package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dto.ComplaintDetailsDto;
import com.example.demo.dto.ComplaintDto;
import com.example.demo.entities.Student;
import com.example.demo.service.StudentService;

@RestController
@RequestMapping("/students")
public class StudentController {
	@Autowired

	StudentService studentService;

	@PostMapping

	public ResponseEntity<Student> save(@RequestBody Student student){

		return new ResponseEntity<Student>(studentService.save(student),HttpStatus.CREATED);

	}

	@GetMapping
	public ResponseEntity<List<Student>> findAll(){

		return new ResponseEntity<List<Student>>(studentService.findAll(),HttpStatus.OK);

	}

	@GetMapping("/{id}")

	public ResponseEntity<Student> findStudentById(@PathVariable("id") long id){

		return new ResponseEntity<Student>(studentService.findById(id),HttpStatus.OK);

	}

	@PutMapping("/update/{id}")

	public ResponseEntity<Student> updateStudentById(@PathVariable("id") long id , @RequestBody Student student){

		return new ResponseEntity<Student>(studentService.updateTeacherById(id,student),HttpStatus.OK);

	}

	@DeleteMapping("/delete/{id}")

	public ResponseEntity<String> deleteStudentById(@PathVariable("id") long id){

		studentService.deleteById(id);

		return new ResponseEntity<String>("Student Deleted Successfully",HttpStatus.OK);

	}

	@PostMapping("/raisecomplaint/{studentid}")

	public ResponseEntity<ComplaintDto> raiseComplaint(@RequestBody ComplaintDetailsDto complaintDetailsDto,@PathVariable("studentid")long id){

		ComplaintDto complaintDto = studentService.raiseComplaint(complaintDetailsDto, id);

		return new ResponseEntity<ComplaintDto>(complaintDto,HttpStatus.CREATED);

	}
	
	@GetMapping("/getstudentbystandard/{standard}")
	public ResponseEntity<List<Student>> findByStandard(@PathVariable("standard") String standard){
		
		List<Student> ls = studentService.findByStandard(standard);
		
		return new ResponseEntity<List<Student>>(ls, HttpStatus.OK);
	}
 

}
