package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entities.StudyMaterial;
import com.example.demo.service.StudyMaterialService;


@RestController
@RequestMapping("/studymaterials")
public class StudyMaterialController {
	@Autowired
	StudyMaterialService studyMaterialService;
	
	@PostMapping
	public ResponseEntity<StudyMaterial> save(@RequestBody StudyMaterial studyMaterial){
		return new ResponseEntity<StudyMaterial>(studyMaterialService.save(studyMaterial),HttpStatus.CREATED);
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<StudyMaterial> findByStudyMaterialById(@PathVariable ("id") long id){
		return new ResponseEntity<StudyMaterial>(studyMaterialService.findById(id),HttpStatus.OK);
	}
	
	@GetMapping
	public ResponseEntity<List<StudyMaterial>> getAllCourses(){
		return new ResponseEntity<List<StudyMaterial>>(studyMaterialService.findAll(),HttpStatus.OK);
	}
	
	@DeleteMapping("/delete/{studymaterialid}")
	public ResponseEntity<String> deleteStudyMaterialById(@PathVariable("courseid") long id){
		studyMaterialService.delete(id);
		return new ResponseEntity<String>("Course deleted successfully",HttpStatus.OK);
	}

}
