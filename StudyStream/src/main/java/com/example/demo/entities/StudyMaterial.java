package com.example.demo.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "studymaterials")
public class StudyMaterial {
	
	@Id
	private Long id;
	
	private String materialname;
	private Long courseid;
	private String standard;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getMaterialname() {
		return materialname;
	}
	public void setMaterialname(String materialname) {
		this.materialname = materialname;
	}
	public Long getCourseid() {
		return courseid;
	}
	public void setCourseid(Long courseid) {
		this.courseid = courseid;
	}
	public String getStandard() {
		return standard;
	}
	public void setStandard(String standard) {
		this.standard = standard;
	}
	public StudyMaterial(Long id, String materialname, Long courseid, String standard) {
		super();
		this.id = id;
		this.materialname = materialname;
		this.courseid = courseid;
		this.standard = standard;
	}
	public StudyMaterial() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

}
