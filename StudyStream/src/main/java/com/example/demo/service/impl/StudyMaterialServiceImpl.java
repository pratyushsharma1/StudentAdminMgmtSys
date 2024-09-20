package com.example.demo.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.StudyMaterialRepository;
import com.example.demo.entities.StudyMaterial;
import com.example.demo.service.StudyMaterialService;

@Service
public class StudyMaterialServiceImpl implements StudyMaterialService{
	@Autowired
	StudyMaterialRepository studyMaterialRepository;

	@Override
	public StudyMaterial save(StudyMaterial studyMaterial) {
		return studyMaterialRepository.save(studyMaterial);
	}

	@Override
	public StudyMaterial findById(long id) {
		return studyMaterialRepository.findById(id).orElseThrow();
	}

	@Override
	public List<StudyMaterial> findAll() {
		return studyMaterialRepository.findAll();
	}

	@Override
	public void delete(long id) {
		StudyMaterial studyMaterial = findById(id);
		studyMaterialRepository.delete(studyMaterial);
	}
	
}
