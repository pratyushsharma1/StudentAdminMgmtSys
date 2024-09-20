package com.example.demo.service;

import java.util.List;

import com.example.demo.entities.StudyMaterial;



public interface StudyMaterialService {
	StudyMaterial save(StudyMaterial studyMaterial);
	StudyMaterial findById(long id);
	List<StudyMaterial> findAll();
	void delete(long id);
}
