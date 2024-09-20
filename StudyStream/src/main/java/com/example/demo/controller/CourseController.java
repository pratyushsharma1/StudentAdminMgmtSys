package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entities.Course;
import com.example.demo.service.CourseService;

@RestController
@RequestMapping("/courses")
public class CourseController {
	
	@Autowired
	CourseService courseService;
	
	@PostMapping
	public ResponseEntity<Course> save(Course course){
		return new ResponseEntity<Course>(courseService.save(course),HttpStatus.CREATED);
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<Course> findByCourseId(@PathVariable ("id") long id){
		return new ResponseEntity<Course>(courseService.findById(id),HttpStatus.OK);
	}
	
	@GetMapping
	public ResponseEntity<List<Course>> getAllCourses(){
		return new ResponseEntity<List<Course>>(courseService.findAll(),HttpStatus.OK);
	}
	
	@DeleteMapping("/delete/{courseid}")
	public ResponseEntity<String> deleteCourseById(@PathVariable("courseid") long id){
		courseService.delete(id);
		return new ResponseEntity<String>("Course deleted successfully",HttpStatus.OK);
	}

}
