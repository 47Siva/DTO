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
@Table(name = "UserLogin")
public class UserLogin {
	
	@Id
	@GeneratedValue(generator="UUID")
	@GenericGenerator(name="UUID",strategy="org.hibernate.id.UUIDGenerator")
	@Type(type="uuid-char")
	@Column(name = "id")
	private UUID id ;
	
	@Column(name = "User_Name")
	private String username;
	
	@Column(name = "Posward")
	private String posward;
	
}
