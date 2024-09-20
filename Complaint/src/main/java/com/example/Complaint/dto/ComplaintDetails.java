package com.example.Complaint.dto;

public class ComplaintDetails {
	private String subject;
    private String description;

    public ComplaintDetails() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ComplaintDetails(String subject, String description) {
		super();
		this.subject = subject;
		this.description = description;
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
