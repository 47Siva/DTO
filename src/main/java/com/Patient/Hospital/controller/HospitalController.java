package com.Patient.Hospital.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Patient.Hospital.entity.Patientinof;
import com.Patient.Hospital.entity.UserLogin;
import com.Patient.Hospital.service.HospitalService;

@RestController
@RequestMapping("/api/hospital")
public class HospitalController {

	@Autowired
	HospitalService hospitalService;

	@PostMapping("/post")
	public String Create(@RequestBody UserLogin userLogin) {
		return hospitalService.create(userLogin);
	}

	@PostMapping("/patientpost")
	public String savePatient(@RequestBody Patientinof patient) {
		hospitalService.savePatient(patient);
		return "Seccessfully Saved";
	}

	
	  @PostMapping("/posthospital") 
	  public String create(@RequestBody UserLogin userlogin) {
		  hospitalService.create(userlogin);
		  return "seccessfully saved";
	  }
	 
}
