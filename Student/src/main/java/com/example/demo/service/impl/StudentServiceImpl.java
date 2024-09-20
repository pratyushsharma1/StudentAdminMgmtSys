package com.example.demo.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.StudentRepository;
import com.example.demo.dto.ComplaintDetailsDto;
import com.example.demo.dto.ComplaintDto;
import com.example.demo.entities.Student;
import com.example.demo.service.ComplaintFeignClient;
import com.example.demo.service.StudentService;

@Service
public class StudentServiceImpl implements StudentService{
	@Autowired
	StudentRepository studentRepository;
	@Autowired
	ComplaintFeignClient complaintFeignClient;

	@Override
	public Student save(Student student) {
		return studentRepository.save(student);
	}
 
	@Override
	public List<Student> findAll() {
		return studentRepository.findAll();
	}
 
	@Override
	public Student findById(long id) {
		return studentRepository.findById(id).orElseThrow();
	}
 
	@Override
	public Student updateTeacherById(long id, Student student) {
		Student oldStudent = findById(id);
		oldStudent.setName(student.getName());
		oldStudent.setStandard(student.getStandard());
		oldStudent.setPhnNumber(student.getPhnNumber());
		oldStudent.setAddress(student.getAddress());
		return oldStudent;
	}
 
	@Override
	public void deleteById(long id) {
		Student student = findById(id);
		studentRepository.delete(student);
	}
 
	@Override
	public ComplaintDto raiseComplaint(ComplaintDetailsDto complaintdeaDetailsDto, long studentId) {
		return complaintFeignClient.raiseComplaint(complaintdeaDetailsDto, studentId);
	}

	@Override
	public List<Student> findByStandard(String standard) {
		// TODO Auto-generated method stub
		return studentRepository.findByStandard(standard);
	}

}
