package com.Patient.Hospital.entity;

import java.util.UUID;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Type;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Table(name = "Patientinof")
public class Patientinof{
	

	@Id
	@GeneratedValue(generator="UUID")
	@GenericGenerator(name="UUID",strategy="org.hibernate.id.UUIDGenerator")
	@Type(type="uuid-char")
	@Column(name = "id")
	private UUID id ;
	
	@Column(name = "Frist_Name")
	private String fristname;
	
	@Column(name = "Last_Name")
	private String lastname;
	
	@Column(name = "Email")
	private String email;
	
	@Column(name = "Address",length = 40)
	private String address;
	
	@Column(name = "Mobile_num")
	private String num;	
	
}
