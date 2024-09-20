package com.example.demo.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.CourseRepository;
import com.example.demo.entities.Course;
import com.example.demo.service.CourseService;

@Service
public class CourseServiceImpl implements CourseService{

	@Autowired
	CourseRepository courseRepository;
	
	
	@Override
	public Course save(Course course) {
		// TODO Auto-generated method stub
		return courseRepository.save(course);
	}


	@Override
	public List<Course> findAll() {
		return courseRepository.findAll();
	}
	
	


	@Override
	public void delete(long id) {
		Course course = findById(id);
		courseRepository.delete(course);
	}


	@Override
	public Course findById(long id) {
		return courseRepository.findById(id).orElseThrow();
	}
	
	

}
