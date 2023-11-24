package com.Patient.Hospital.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Patient.Hospital.entity.Patientinof;
import com.Patient.Hospital.entity.UserLogin;
import com.Patient.Hospital.repository.PatientRepository;
import com.Patient.Hospital.repository.UserLoginRepository;

@Service
public class HospitalService {

	@Autowired
	PatientRepository patientRepository;

	@Autowired
	UserLoginRepository userloginRepository;

	public String create(UserLogin userLogin) {
		// TODO Auto-generated method stub
		userloginRepository.save(userLogin);
		return "success fully loging in";
	}

	public String savePatient(Patientinof patient) {
		// TODO Auto-generated method stub
		if(patientRepository.save(patient).equals(patient)) {
			return "Successfully loging in";
		}
		else
			return "Bad Request";
	}

	  public String create(UserLogin userlogin) {
		  // TODO Auto-generated methodstub
	  Patientinof patientinof = new Patientinof();
	  patientinof.setName(userlogin.getName());
	  patientinof.setNum(userlogin.getNum());
	  userloginRepository.save(userlogin);
	  patientRepository.save(patientinof);
	  return "seccessfully saved";
	  }
	 

}
