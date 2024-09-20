package com.example.demo.dto;

public class ComplaintDetailsDto {
	private String subject;
    private String description;
 
   
 
	public ComplaintDetailsDto(String subject, String description) {
		super();
		this.subject = subject;
		this.description = description;
	}
	

	public ComplaintDetailsDto() {
		super();
		// TODO Auto-generated constructor stub
	}


	public String getSubject() {
        return subject;
    }
 
    public void setSubject(String subject) {
        this.subject = subject;
    }
 
    public String getDescription() {
        return description;
    }
 
    public void setDescription(String description) {
        this.description = description;
    }

}
