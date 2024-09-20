package com.example.Complaint.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.Complaint.dto.ComplaintDetails;
import com.example.Complaint.entities.Complaint;
import com.example.Complaint.service.ComplaintService;

@RestController
@RequestMapping("/complaints")
public class ComplaintController {
	
	@Autowired
	ComplaintService complaintService;
	
	@PostMapping("/raise/{id}")
    public Complaint raiseComplaint(@RequestBody ComplaintDetails complaintDetails,@PathVariable("id") long studentId) {
        return complaintService.raiseComplaint(studentId, complaintDetails);
    }

    @GetMapping
    public List<Complaint> getAllComplaints() {
        return complaintService.getAllComplaints();
    }

    @PutMapping("/{id}/status")
    public void changeComplaintStatus(@PathVariable Long id, @RequestBody Complaint.ComplaintStatus status) {
        complaintService.changeComplaintStatus(id, status);
    }
}
