package com.example.demo.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "courses")
public class Course {
	
	@Id
	private Long id;
	
	private String coursename;
	private String teachername;
	private String standard;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getCoursename() {
		return coursename;
	}
	public void setCoursename(String coursename) {
		this.coursename = coursename;
	}
	public String getTeachername() {
		return teachername;
	}
	public void setTeachername(String teachername) {
		this.teachername = teachername;
	}
	public String getStandard() {
		return standard;
	}
	public void setStandard(String standard) {
		this.standard = standard;
	}
	public Course(Long id, String coursename, String teachername, String standard) {
		super();
		this.id = id;
		this.coursename = coursename;
		this.teachername = teachername;
		this.standard = standard;
	}
	public Course() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

}
