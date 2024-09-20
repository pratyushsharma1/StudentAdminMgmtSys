package com.example.demo.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.example.demo.dto.ComplaintDetailsDto;
import com.example.demo.dto.ComplaintDto;

@FeignClient (url = "http://localhost:8083",name="comp",value="comp")
public interface ComplaintFeignClient {
	@PostMapping("/complaints/raise/{id}")
    ComplaintDto raiseComplaint(@RequestBody ComplaintDetailsDto complaintdeaDetailsDto,@PathVariable("id") long studentId);

}
