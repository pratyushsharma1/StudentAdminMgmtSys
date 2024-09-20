package com.example.demo.service;

import java.util.List;

import com.example.demo.entities.Course;

public interface CourseService {
	
	Course save(Course course);
	Course findById(long id);
	List<Course> findAll();
	void delete(long id);

}
